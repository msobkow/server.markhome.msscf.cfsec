// Description: Java 11 Schema Pooled Object implementation for CFSec.

/*
 *	server.markhome.msscf.CFSec
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfsec.CFSecObj;

import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;

/**
 *	A pooled schema object does not disconnect the backing
 *	store when a logout is performed, because the backing store
 *	comes from a connection pool that is reused across requests,
 *	rather than being owned by the SchemaPooledObj.
 */
public class CFSecSchemaPooledObj
	extends CFSecSchemaObj
{
	public CFSecSchemaPooledObj() {
		super();
	}

	public boolean isConnected() {
		if( backingStore == null ) {
			return( false );
		}
		else {
			return( true );
		}
	}

	public void disconnect( boolean doCommit ) {
		final String S_ProcName = "disconnect";
		throw new CFLibUsageException( getClass(),
			S_ProcName,
			"Schema objects over pooled storage cannot be explicitly disconnected" );
	}

	public void logout() {
		if( ( authorization == null ) || ( backingStore == null ) ) {
			return;
		}
		try {
			boolean transactionStarted = beginTransaction();
			if( ! transactionStarted ) {
				rollback();
				transactionStarted = beginTransaction();
				if( ! transactionStarted ) {
					setAuthorization( null );
					return;
				}
			}
			UUID secSessionId = authorization.getSecSessionId();
			if( secSessionId != null ) {
				ICFSecSecSessionObj secSession = getSecSessionTableObj().readSecSessionByIdIdx( secSessionId );
				if( secSession != null ) {
					if( secSession.getOptionalFinish() == null ) {
						ICFSecSecSessionEditObj editSecSession = secSession.beginEdit();
						editSecSession.setOptionalFinish( Calendar.getInstance() );
						editSecSession.update();
						editSecSession = null;
					}
				}
			}
			commit();
		}
		finally {
			setAuthorization( null );
			minimizeMemory();
		}
	}
}
