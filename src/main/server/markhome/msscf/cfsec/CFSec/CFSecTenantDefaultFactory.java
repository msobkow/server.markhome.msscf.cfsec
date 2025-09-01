
// Description: Java 11 Default Factory implementation for Tenant.

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
	 *	CFSecTenantFactory implementation for Tenant
	 */
public class CFSecTenantDefaultFactory
	implements ICFSecTenantFactory
{
	public CFSecTenantDefaultFactory() {
	}

	public CFSecTenantPKey newPKey() {
		CFSecTenantPKey pkey =
			new CFSecTenantPKey();
		return( pkey );
	}

	public CFSecTenantHPKey newHPKey() {
		CFSecTenantHPKey hpkey =
			new CFSecTenantHPKey();
		return( hpkey );
	}

	public CFSecTenantByClusterIdxKey newClusterIdxKey() {
		CFSecTenantByClusterIdxKey key =
			new CFSecTenantByClusterIdxKey();
		return( key );
	}

	public CFSecTenantByUNameIdxKey newUNameIdxKey() {
		CFSecTenantByUNameIdxKey key =
			new CFSecTenantByUNameIdxKey();
		return( key );
	}

	public CFSecTenantBuff newBuff() {
		CFSecTenantBuff buff =
			new CFSecTenantBuff();
		return( buff );
	}

	public CFSecTenantHBuff newHBuff() {
		CFSecTenantHBuff hbuff =
			new CFSecTenantHBuff();
		return( hbuff );
	}
}
