
// Description: Java 11 Default Factory implementation for SecGroupForm.

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
	 *	CFSecSecGroupFormFactory implementation for SecGroupForm
	 */
public class CFSecSecGroupFormDefaultFactory
	implements ICFSecSecGroupFormFactory
{
	public CFSecSecGroupFormDefaultFactory() {
	}

	public CFSecSecGroupFormPKey newPKey() {
		CFSecSecGroupFormPKey pkey =
			new CFSecSecGroupFormPKey();
		return( pkey );
	}

	public CFSecSecGroupFormHPKey newHPKey() {
		CFSecSecGroupFormHPKey hpkey =
			new CFSecSecGroupFormHPKey();
		return( hpkey );
	}

	public CFSecSecGroupFormByClusterIdxKey newClusterIdxKey() {
		CFSecSecGroupFormByClusterIdxKey key =
			new CFSecSecGroupFormByClusterIdxKey();
		return( key );
	}

	public CFSecSecGroupFormByGroupIdxKey newGroupIdxKey() {
		CFSecSecGroupFormByGroupIdxKey key =
			new CFSecSecGroupFormByGroupIdxKey();
		return( key );
	}

	public CFSecSecGroupFormByAppIdxKey newAppIdxKey() {
		CFSecSecGroupFormByAppIdxKey key =
			new CFSecSecGroupFormByAppIdxKey();
		return( key );
	}

	public CFSecSecGroupFormByFormIdxKey newFormIdxKey() {
		CFSecSecGroupFormByFormIdxKey key =
			new CFSecSecGroupFormByFormIdxKey();
		return( key );
	}

	public CFSecSecGroupFormByUFormIdxKey newUFormIdxKey() {
		CFSecSecGroupFormByUFormIdxKey key =
			new CFSecSecGroupFormByUFormIdxKey();
		return( key );
	}

	public CFSecSecGroupFormBuff newBuff() {
		CFSecSecGroupFormBuff buff =
			new CFSecSecGroupFormBuff();
		return( buff );
	}

	public CFSecSecGroupFormHBuff newHBuff() {
		CFSecSecGroupFormHBuff hbuff =
			new CFSecSecGroupFormHBuff();
		return( hbuff );
	}
}
