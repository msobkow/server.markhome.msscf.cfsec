
// Description: Java 11 Default Factory implementation for SecGrpInc.

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
	 *	CFSecSecGrpIncFactory implementation for SecGrpInc
	 */
public class CFSecSecGrpIncDefaultFactory
	implements ICFSecSecGrpIncFactory
{
	public CFSecSecGrpIncDefaultFactory() {
	}

	public CFSecSecGrpIncPKey newPKey() {
		CFSecSecGrpIncPKey pkey =
			new CFSecSecGrpIncPKey();
		return( pkey );
	}

	public CFSecSecGrpIncHPKey newHPKey() {
		CFSecSecGrpIncHPKey hpkey =
			new CFSecSecGrpIncHPKey();
		return( hpkey );
	}

	public CFSecSecGrpIncByClusterIdxKey newClusterIdxKey() {
		CFSecSecGrpIncByClusterIdxKey key =
			new CFSecSecGrpIncByClusterIdxKey();
		return( key );
	}

	public CFSecSecGrpIncByGroupIdxKey newGroupIdxKey() {
		CFSecSecGrpIncByGroupIdxKey key =
			new CFSecSecGrpIncByGroupIdxKey();
		return( key );
	}

	public CFSecSecGrpIncByIncludeIdxKey newIncludeIdxKey() {
		CFSecSecGrpIncByIncludeIdxKey key =
			new CFSecSecGrpIncByIncludeIdxKey();
		return( key );
	}

	public CFSecSecGrpIncByUIncludeIdxKey newUIncludeIdxKey() {
		CFSecSecGrpIncByUIncludeIdxKey key =
			new CFSecSecGrpIncByUIncludeIdxKey();
		return( key );
	}

	public CFSecSecGrpIncBuff newBuff() {
		CFSecSecGrpIncBuff buff =
			new CFSecSecGrpIncBuff();
		return( buff );
	}

	public CFSecSecGrpIncHBuff newHBuff() {
		CFSecSecGrpIncHBuff hbuff =
			new CFSecSecGrpIncHBuff();
		return( hbuff );
	}
}
