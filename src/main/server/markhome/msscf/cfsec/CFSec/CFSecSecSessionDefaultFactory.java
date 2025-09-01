
// Description: Java 11 Default Factory implementation for SecSession.

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
	 *	CFSecSecSessionFactory implementation for SecSession
	 */
public class CFSecSecSessionDefaultFactory
	implements ICFSecSecSessionFactory
{
	public CFSecSecSessionDefaultFactory() {
	}

	public CFSecSecSessionPKey newPKey() {
		CFSecSecSessionPKey pkey =
			new CFSecSecSessionPKey();
		return( pkey );
	}

	public CFSecSecSessionHPKey newHPKey() {
		CFSecSecSessionHPKey hpkey =
			new CFSecSecSessionHPKey();
		return( hpkey );
	}

	public CFSecSecSessionBySecUserIdxKey newSecUserIdxKey() {
		CFSecSecSessionBySecUserIdxKey key =
			new CFSecSecSessionBySecUserIdxKey();
		return( key );
	}

	public CFSecSecSessionBySecDevIdxKey newSecDevIdxKey() {
		CFSecSecSessionBySecDevIdxKey key =
			new CFSecSecSessionBySecDevIdxKey();
		return( key );
	}

	public CFSecSecSessionByStartIdxKey newStartIdxKey() {
		CFSecSecSessionByStartIdxKey key =
			new CFSecSecSessionByStartIdxKey();
		return( key );
	}

	public CFSecSecSessionByFinishIdxKey newFinishIdxKey() {
		CFSecSecSessionByFinishIdxKey key =
			new CFSecSecSessionByFinishIdxKey();
		return( key );
	}

	public CFSecSecSessionBySecProxyIdxKey newSecProxyIdxKey() {
		CFSecSecSessionBySecProxyIdxKey key =
			new CFSecSecSessionBySecProxyIdxKey();
		return( key );
	}

	public CFSecSecSessionBuff newBuff() {
		CFSecSecSessionBuff buff =
			new CFSecSecSessionBuff();
		return( buff );
	}

	public CFSecSecSessionHBuff newHBuff() {
		CFSecSecSessionHBuff hbuff =
			new CFSecSecSessionHBuff();
		return( hbuff );
	}
}
