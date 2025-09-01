
// Description: Java 11 Default Factory implementation for SecGrpMemb.

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
	 *	CFSecSecGrpMembFactory implementation for SecGrpMemb
	 */
public class CFSecSecGrpMembDefaultFactory
	implements ICFSecSecGrpMembFactory
{
	public CFSecSecGrpMembDefaultFactory() {
	}

	public CFSecSecGrpMembPKey newPKey() {
		CFSecSecGrpMembPKey pkey =
			new CFSecSecGrpMembPKey();
		return( pkey );
	}

	public CFSecSecGrpMembHPKey newHPKey() {
		CFSecSecGrpMembHPKey hpkey =
			new CFSecSecGrpMembHPKey();
		return( hpkey );
	}

	public CFSecSecGrpMembByClusterIdxKey newClusterIdxKey() {
		CFSecSecGrpMembByClusterIdxKey key =
			new CFSecSecGrpMembByClusterIdxKey();
		return( key );
	}

	public CFSecSecGrpMembByGroupIdxKey newGroupIdxKey() {
		CFSecSecGrpMembByGroupIdxKey key =
			new CFSecSecGrpMembByGroupIdxKey();
		return( key );
	}

	public CFSecSecGrpMembByUserIdxKey newUserIdxKey() {
		CFSecSecGrpMembByUserIdxKey key =
			new CFSecSecGrpMembByUserIdxKey();
		return( key );
	}

	public CFSecSecGrpMembByUUserIdxKey newUUserIdxKey() {
		CFSecSecGrpMembByUUserIdxKey key =
			new CFSecSecGrpMembByUUserIdxKey();
		return( key );
	}

	public CFSecSecGrpMembBuff newBuff() {
		CFSecSecGrpMembBuff buff =
			new CFSecSecGrpMembBuff();
		return( buff );
	}

	public CFSecSecGrpMembHBuff newHBuff() {
		CFSecSecGrpMembHBuff hbuff =
			new CFSecSecGrpMembHBuff();
		return( hbuff );
	}
}
