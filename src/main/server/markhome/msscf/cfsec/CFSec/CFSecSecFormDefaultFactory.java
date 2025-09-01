
// Description: Java 11 Default Factory implementation for SecForm.

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
	 *	CFSecSecFormFactory implementation for SecForm
	 */
public class CFSecSecFormDefaultFactory
	implements ICFSecSecFormFactory
{
	public CFSecSecFormDefaultFactory() {
	}

	public CFSecSecFormPKey newPKey() {
		CFSecSecFormPKey pkey =
			new CFSecSecFormPKey();
		return( pkey );
	}

	public CFSecSecFormHPKey newHPKey() {
		CFSecSecFormHPKey hpkey =
			new CFSecSecFormHPKey();
		return( hpkey );
	}

	public CFSecSecFormByClusterIdxKey newClusterIdxKey() {
		CFSecSecFormByClusterIdxKey key =
			new CFSecSecFormByClusterIdxKey();
		return( key );
	}

	public CFSecSecFormBySecAppIdxKey newSecAppIdxKey() {
		CFSecSecFormBySecAppIdxKey key =
			new CFSecSecFormBySecAppIdxKey();
		return( key );
	}

	public CFSecSecFormByUJEEServletIdxKey newUJEEServletIdxKey() {
		CFSecSecFormByUJEEServletIdxKey key =
			new CFSecSecFormByUJEEServletIdxKey();
		return( key );
	}

	public CFSecSecFormBuff newBuff() {
		CFSecSecFormBuff buff =
			new CFSecSecFormBuff();
		return( buff );
	}

	public CFSecSecFormHBuff newHBuff() {
		CFSecSecFormHBuff hbuff =
			new CFSecSecFormHBuff();
		return( hbuff );
	}
}
