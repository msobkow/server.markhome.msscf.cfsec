
// Description: Java 11 Default Factory implementation for ISOCtry.

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
	 *	CFSecISOCtryFactory implementation for ISOCtry
	 */
public class CFSecISOCtryDefaultFactory
	implements ICFSecISOCtryFactory
{
	public CFSecISOCtryDefaultFactory() {
	}

	public CFSecISOCtryPKey newPKey() {
		CFSecISOCtryPKey pkey =
			new CFSecISOCtryPKey();
		return( pkey );
	}

	public CFSecISOCtryHPKey newHPKey() {
		CFSecISOCtryHPKey hpkey =
			new CFSecISOCtryHPKey();
		return( hpkey );
	}

	public CFSecISOCtryByISOCodeIdxKey newISOCodeIdxKey() {
		CFSecISOCtryByISOCodeIdxKey key =
			new CFSecISOCtryByISOCodeIdxKey();
		return( key );
	}

	public CFSecISOCtryByNameIdxKey newNameIdxKey() {
		CFSecISOCtryByNameIdxKey key =
			new CFSecISOCtryByNameIdxKey();
		return( key );
	}

	public CFSecISOCtryBuff newBuff() {
		CFSecISOCtryBuff buff =
			new CFSecISOCtryBuff();
		return( buff );
	}

	public CFSecISOCtryHBuff newHBuff() {
		CFSecISOCtryHBuff hbuff =
			new CFSecISOCtryHBuff();
		return( hbuff );
	}
}
