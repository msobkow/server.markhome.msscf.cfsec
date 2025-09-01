
// Description: Java 11 Default Factory implementation for SecApp.

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
	 *	CFSecSecAppFactory implementation for SecApp
	 */
public class CFSecSecAppDefaultFactory
	implements ICFSecSecAppFactory
{
	public CFSecSecAppDefaultFactory() {
	}

	public CFSecSecAppPKey newPKey() {
		CFSecSecAppPKey pkey =
			new CFSecSecAppPKey();
		return( pkey );
	}

	public CFSecSecAppHPKey newHPKey() {
		CFSecSecAppHPKey hpkey =
			new CFSecSecAppHPKey();
		return( hpkey );
	}

	public CFSecSecAppByClusterIdxKey newClusterIdxKey() {
		CFSecSecAppByClusterIdxKey key =
			new CFSecSecAppByClusterIdxKey();
		return( key );
	}

	public CFSecSecAppByUJEEMountIdxKey newUJEEMountIdxKey() {
		CFSecSecAppByUJEEMountIdxKey key =
			new CFSecSecAppByUJEEMountIdxKey();
		return( key );
	}

	public CFSecSecAppBuff newBuff() {
		CFSecSecAppBuff buff =
			new CFSecSecAppBuff();
		return( buff );
	}

	public CFSecSecAppHBuff newHBuff() {
		CFSecSecAppHBuff hbuff =
			new CFSecSecAppHBuff();
		return( hbuff );
	}
}
