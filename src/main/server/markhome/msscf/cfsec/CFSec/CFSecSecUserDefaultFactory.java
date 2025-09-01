
// Description: Java 11 Default Factory implementation for SecUser.

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
	 *	CFSecSecUserFactory implementation for SecUser
	 */
public class CFSecSecUserDefaultFactory
	implements ICFSecSecUserFactory
{
	public CFSecSecUserDefaultFactory() {
	}

	public CFSecSecUserPKey newPKey() {
		CFSecSecUserPKey pkey =
			new CFSecSecUserPKey();
		return( pkey );
	}

	public CFSecSecUserHPKey newHPKey() {
		CFSecSecUserHPKey hpkey =
			new CFSecSecUserHPKey();
		return( hpkey );
	}

	public CFSecSecUserByULoginIdxKey newULoginIdxKey() {
		CFSecSecUserByULoginIdxKey key =
			new CFSecSecUserByULoginIdxKey();
		return( key );
	}

	public CFSecSecUserByEMConfIdxKey newEMConfIdxKey() {
		CFSecSecUserByEMConfIdxKey key =
			new CFSecSecUserByEMConfIdxKey();
		return( key );
	}

	public CFSecSecUserByPwdResetIdxKey newPwdResetIdxKey() {
		CFSecSecUserByPwdResetIdxKey key =
			new CFSecSecUserByPwdResetIdxKey();
		return( key );
	}

	public CFSecSecUserByDefDevIdxKey newDefDevIdxKey() {
		CFSecSecUserByDefDevIdxKey key =
			new CFSecSecUserByDefDevIdxKey();
		return( key );
	}

	public CFSecSecUserBuff newBuff() {
		CFSecSecUserBuff buff =
			new CFSecSecUserBuff();
		return( buff );
	}

	public CFSecSecUserHBuff newHBuff() {
		CFSecSecUserHBuff hbuff =
			new CFSecSecUserHBuff();
		return( hbuff );
	}
}
