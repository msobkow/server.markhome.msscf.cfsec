
// Description: Java 11 Default Factory implementation for Cluster.

/*
 *	server.markhome.msscf.CFSec
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfsec.CFSec;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;

	/*
	 *	CFSecClusterFactory implementation for Cluster
	 */
public class CFSecClusterDefaultFactory
	implements ICFSecClusterFactory
{
	public CFSecClusterDefaultFactory() {
	}

	public CFSecClusterPKey newPKey() {
		CFSecClusterPKey pkey =
			new CFSecClusterPKey();
		return( pkey );
	}

	public CFSecClusterHPKey newHPKey() {
		CFSecClusterHPKey hpkey =
			new CFSecClusterHPKey();
		return( hpkey );
	}

	public CFSecClusterByUDomNameIdxKey newUDomNameIdxKey() {
		CFSecClusterByUDomNameIdxKey key =
			new CFSecClusterByUDomNameIdxKey();
		return( key );
	}

	public CFSecClusterByUDescrIdxKey newUDescrIdxKey() {
		CFSecClusterByUDescrIdxKey key =
			new CFSecClusterByUDescrIdxKey();
		return( key );
	}

	public CFSecClusterBuff newBuff() {
		CFSecClusterBuff buff =
			new CFSecClusterBuff();
		return( buff );
	}

	public CFSecClusterHBuff newHBuff() {
		CFSecClusterHBuff hbuff =
			new CFSecClusterHBuff();
		return( hbuff );
	}
}
