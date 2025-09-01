// Description: Java 11 implementation of a CFSec schema pool.

/*
 *	server.markhome.msscf.CFSec
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfsec.CFSec;

import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;

public class CFSecSchemaPool
{

	protected volatile static CFSecSchemaPool schemaPool = null;
	protected String jndiName = null;
	protected CFSecConfigurationFile configFile = null;
	protected LinkedList<ICFSecSchema> instances = new LinkedList<ICFSecSchema>();
	public CFSecSchemaPool() {
	}

	public static CFSecSchemaPool getSchemaPool() {
		return( schemaPool );
	}

	public static void setSchemaPool( CFSecSchemaPool pool ) {
		if( schemaPool == null ) {
			schemaPool = pool;
		}

	}

	public CFSecConfigurationFile getConfigurationFile() {
		return( configFile );
	}

	public void setConfigurationFile( CFSecConfigurationFile value ) {
		
		configFile = value;
	}


	/**
	 *	Retrieve an entry from the pool with a previously
	 *	established database connection.
	 */
	public synchronized ICFSecSchema getInstance() {
		ICFSecSchema retInst = null;
		if( instances != null ) {
			if( instances.isEmpty() ) {
				retInst = newInstance();
				retInst.setConfigurationFile( (CFSecConfigurationFile)getConfigurationFile() );
				retInst.setJndiName( getJndiName() );
				retInst.connect();
			}
			else {
				retInst = instances.removeFirst();
			}
		}
		else {
			retInst = null;
		}
		return( retInst );
	}

	/**
	 *	Return an entry to the pool.
	 */
	public synchronized void releaseInstance( ICFSecSchema inst ) {
		if( inst == null ) {
			return;
		}
		inst.rollback();
		if( instances != null ) {
			if( ! instances.contains( inst ) ) {
				instances.addFirst( inst );
			}
		}
	}

	/**
	 *	You need to overload the implementation of newInstance() to return
	 *	connected instances of your backing store.
	 */
	public ICFSecSchema newInstance() {
		ICFSecSchema retInst = new CFSecSchema();
		return( retInst );
	}

	/**
	 *	Overload disposeInstance().
	 */
	public void disposeInstance( ICFSecSchema inst ) {
		try {
			inst.disconnect( false );
		}
		catch( RuntimeException e ) {
		}
		if( instances != null ) {
			if( ! instances.contains( inst ) ) {
				instances.addFirst( inst );
			}
		}
	}

	public String getJndiName() {
		return( jndiName );
	}

	public void setJndiName( String value ) {
		jndiName = value;
		if( ( jndiName != null ) && ( jndiName.length() > 0 ) ) {
			configFile = null;
		}
	}

}
