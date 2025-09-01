
// Description: Java 11 Default Factory implementation for TSecGrpMemb.

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
	 *	CFSecTSecGrpMembFactory implementation for TSecGrpMemb
	 */
public class CFSecTSecGrpMembDefaultFactory
	implements ICFSecTSecGrpMembFactory
{
	public CFSecTSecGrpMembDefaultFactory() {
	}

	public CFSecTSecGrpMembPKey newPKey() {
		CFSecTSecGrpMembPKey pkey =
			new CFSecTSecGrpMembPKey();
		return( pkey );
	}

	public CFSecTSecGrpMembHPKey newHPKey() {
		CFSecTSecGrpMembHPKey hpkey =
			new CFSecTSecGrpMembHPKey();
		return( hpkey );
	}

	public CFSecTSecGrpMembByTenantIdxKey newTenantIdxKey() {
		CFSecTSecGrpMembByTenantIdxKey key =
			new CFSecTSecGrpMembByTenantIdxKey();
		return( key );
	}

	public CFSecTSecGrpMembByGroupIdxKey newGroupIdxKey() {
		CFSecTSecGrpMembByGroupIdxKey key =
			new CFSecTSecGrpMembByGroupIdxKey();
		return( key );
	}

	public CFSecTSecGrpMembByUserIdxKey newUserIdxKey() {
		CFSecTSecGrpMembByUserIdxKey key =
			new CFSecTSecGrpMembByUserIdxKey();
		return( key );
	}

	public CFSecTSecGrpMembByUUserIdxKey newUUserIdxKey() {
		CFSecTSecGrpMembByUUserIdxKey key =
			new CFSecTSecGrpMembByUUserIdxKey();
		return( key );
	}

	public CFSecTSecGrpMembBuff newBuff() {
		CFSecTSecGrpMembBuff buff =
			new CFSecTSecGrpMembBuff();
		return( buff );
	}

	public CFSecTSecGrpMembHBuff newHBuff() {
		CFSecTSecGrpMembHBuff hbuff =
			new CFSecTSecGrpMembHBuff();
		return( hbuff );
	}
}
