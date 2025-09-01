
// Description: Java 11 Default Factory implementation for ISOCtryCcy.

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
	 *	CFSecISOCtryCcyFactory implementation for ISOCtryCcy
	 */
public class CFSecISOCtryCcyDefaultFactory
	implements ICFSecISOCtryCcyFactory
{
	public CFSecISOCtryCcyDefaultFactory() {
	}

	public CFSecISOCtryCcyPKey newPKey() {
		CFSecISOCtryCcyPKey pkey =
			new CFSecISOCtryCcyPKey();
		return( pkey );
	}

	public CFSecISOCtryCcyHPKey newHPKey() {
		CFSecISOCtryCcyHPKey hpkey =
			new CFSecISOCtryCcyHPKey();
		return( hpkey );
	}

	public CFSecISOCtryCcyByCtryIdxKey newCtryIdxKey() {
		CFSecISOCtryCcyByCtryIdxKey key =
			new CFSecISOCtryCcyByCtryIdxKey();
		return( key );
	}

	public CFSecISOCtryCcyByCcyIdxKey newCcyIdxKey() {
		CFSecISOCtryCcyByCcyIdxKey key =
			new CFSecISOCtryCcyByCcyIdxKey();
		return( key );
	}

	public CFSecISOCtryCcyBuff newBuff() {
		CFSecISOCtryCcyBuff buff =
			new CFSecISOCtryCcyBuff();
		return( buff );
	}

	public CFSecISOCtryCcyHBuff newHBuff() {
		CFSecISOCtryCcyHBuff hbuff =
			new CFSecISOCtryCcyHBuff();
		return( hbuff );
	}
}
