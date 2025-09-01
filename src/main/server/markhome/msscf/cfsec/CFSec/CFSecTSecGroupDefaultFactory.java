
// Description: Java 11 Default Factory implementation for TSecGroup.

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
	 *	CFSecTSecGroupFactory implementation for TSecGroup
	 */
public class CFSecTSecGroupDefaultFactory
	implements ICFSecTSecGroupFactory
{
	public CFSecTSecGroupDefaultFactory() {
	}

	public CFSecTSecGroupPKey newPKey() {
		CFSecTSecGroupPKey pkey =
			new CFSecTSecGroupPKey();
		return( pkey );
	}

	public CFSecTSecGroupHPKey newHPKey() {
		CFSecTSecGroupHPKey hpkey =
			new CFSecTSecGroupHPKey();
		return( hpkey );
	}

	public CFSecTSecGroupByTenantIdxKey newTenantIdxKey() {
		CFSecTSecGroupByTenantIdxKey key =
			new CFSecTSecGroupByTenantIdxKey();
		return( key );
	}

	public CFSecTSecGroupByTenantVisIdxKey newTenantVisIdxKey() {
		CFSecTSecGroupByTenantVisIdxKey key =
			new CFSecTSecGroupByTenantVisIdxKey();
		return( key );
	}

	public CFSecTSecGroupByUNameIdxKey newUNameIdxKey() {
		CFSecTSecGroupByUNameIdxKey key =
			new CFSecTSecGroupByUNameIdxKey();
		return( key );
	}

	public CFSecTSecGroupBuff newBuff() {
		CFSecTSecGroupBuff buff =
			new CFSecTSecGroupBuff();
		return( buff );
	}

	public CFSecTSecGroupHBuff newHBuff() {
		CFSecTSecGroupHBuff hbuff =
			new CFSecTSecGroupHBuff();
		return( hbuff );
	}
}
