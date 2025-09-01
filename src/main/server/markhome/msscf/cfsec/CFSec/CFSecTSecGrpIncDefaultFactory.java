
// Description: Java 11 Default Factory implementation for TSecGrpInc.

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
	 *	CFSecTSecGrpIncFactory implementation for TSecGrpInc
	 */
public class CFSecTSecGrpIncDefaultFactory
	implements ICFSecTSecGrpIncFactory
{
	public CFSecTSecGrpIncDefaultFactory() {
	}

	public CFSecTSecGrpIncPKey newPKey() {
		CFSecTSecGrpIncPKey pkey =
			new CFSecTSecGrpIncPKey();
		return( pkey );
	}

	public CFSecTSecGrpIncHPKey newHPKey() {
		CFSecTSecGrpIncHPKey hpkey =
			new CFSecTSecGrpIncHPKey();
		return( hpkey );
	}

	public CFSecTSecGrpIncByTenantIdxKey newTenantIdxKey() {
		CFSecTSecGrpIncByTenantIdxKey key =
			new CFSecTSecGrpIncByTenantIdxKey();
		return( key );
	}

	public CFSecTSecGrpIncByGroupIdxKey newGroupIdxKey() {
		CFSecTSecGrpIncByGroupIdxKey key =
			new CFSecTSecGrpIncByGroupIdxKey();
		return( key );
	}

	public CFSecTSecGrpIncByIncludeIdxKey newIncludeIdxKey() {
		CFSecTSecGrpIncByIncludeIdxKey key =
			new CFSecTSecGrpIncByIncludeIdxKey();
		return( key );
	}

	public CFSecTSecGrpIncByUIncludeIdxKey newUIncludeIdxKey() {
		CFSecTSecGrpIncByUIncludeIdxKey key =
			new CFSecTSecGrpIncByUIncludeIdxKey();
		return( key );
	}

	public CFSecTSecGrpIncBuff newBuff() {
		CFSecTSecGrpIncBuff buff =
			new CFSecTSecGrpIncBuff();
		return( buff );
	}

	public CFSecTSecGrpIncHBuff newHBuff() {
		CFSecTSecGrpIncHBuff hbuff =
			new CFSecTSecGrpIncHBuff();
		return( hbuff );
	}
}
