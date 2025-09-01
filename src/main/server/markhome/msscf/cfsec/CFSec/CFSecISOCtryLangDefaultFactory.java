
// Description: Java 11 Default Factory implementation for ISOCtryLang.

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
	 *	CFSecISOCtryLangFactory implementation for ISOCtryLang
	 */
public class CFSecISOCtryLangDefaultFactory
	implements ICFSecISOCtryLangFactory
{
	public CFSecISOCtryLangDefaultFactory() {
	}

	public CFSecISOCtryLangPKey newPKey() {
		CFSecISOCtryLangPKey pkey =
			new CFSecISOCtryLangPKey();
		return( pkey );
	}

	public CFSecISOCtryLangHPKey newHPKey() {
		CFSecISOCtryLangHPKey hpkey =
			new CFSecISOCtryLangHPKey();
		return( hpkey );
	}

	public CFSecISOCtryLangByCtryIdxKey newCtryIdxKey() {
		CFSecISOCtryLangByCtryIdxKey key =
			new CFSecISOCtryLangByCtryIdxKey();
		return( key );
	}

	public CFSecISOCtryLangByLangIdxKey newLangIdxKey() {
		CFSecISOCtryLangByLangIdxKey key =
			new CFSecISOCtryLangByLangIdxKey();
		return( key );
	}

	public CFSecISOCtryLangBuff newBuff() {
		CFSecISOCtryLangBuff buff =
			new CFSecISOCtryLangBuff();
		return( buff );
	}

	public CFSecISOCtryLangHBuff newHBuff() {
		CFSecISOCtryLangHBuff hbuff =
			new CFSecISOCtryLangHBuff();
		return( hbuff );
	}
}
