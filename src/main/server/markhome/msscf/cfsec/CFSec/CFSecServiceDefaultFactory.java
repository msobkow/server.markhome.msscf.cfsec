
// Description: Java 11 Default Factory implementation for Service.

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
	 *	CFSecServiceFactory implementation for Service
	 */
public class CFSecServiceDefaultFactory
	implements ICFSecServiceFactory
{
	public CFSecServiceDefaultFactory() {
	}

	public CFSecServicePKey newPKey() {
		CFSecServicePKey pkey =
			new CFSecServicePKey();
		return( pkey );
	}

	public CFSecServiceHPKey newHPKey() {
		CFSecServiceHPKey hpkey =
			new CFSecServiceHPKey();
		return( hpkey );
	}

	public CFSecServiceByClusterIdxKey newClusterIdxKey() {
		CFSecServiceByClusterIdxKey key =
			new CFSecServiceByClusterIdxKey();
		return( key );
	}

	public CFSecServiceByHostIdxKey newHostIdxKey() {
		CFSecServiceByHostIdxKey key =
			new CFSecServiceByHostIdxKey();
		return( key );
	}

	public CFSecServiceByTypeIdxKey newTypeIdxKey() {
		CFSecServiceByTypeIdxKey key =
			new CFSecServiceByTypeIdxKey();
		return( key );
	}

	public CFSecServiceByUTypeIdxKey newUTypeIdxKey() {
		CFSecServiceByUTypeIdxKey key =
			new CFSecServiceByUTypeIdxKey();
		return( key );
	}

	public CFSecServiceByUHostPortIdxKey newUHostPortIdxKey() {
		CFSecServiceByUHostPortIdxKey key =
			new CFSecServiceByUHostPortIdxKey();
		return( key );
	}

	public CFSecServiceBuff newBuff() {
		CFSecServiceBuff buff =
			new CFSecServiceBuff();
		return( buff );
	}

	public CFSecServiceHBuff newHBuff() {
		CFSecServiceHBuff hbuff =
			new CFSecServiceHBuff();
		return( hbuff );
	}
}
