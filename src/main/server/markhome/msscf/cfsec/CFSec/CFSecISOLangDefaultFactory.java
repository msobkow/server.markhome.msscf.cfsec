
// Description: Java 11 Default Factory implementation for ISOLang.

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
	 *	CFSecISOLangFactory implementation for ISOLang
	 */
public class CFSecISOLangDefaultFactory
	implements ICFSecISOLangFactory
{
	public CFSecISOLangDefaultFactory() {
	}

	public CFSecISOLangPKey newPKey() {
		CFSecISOLangPKey pkey =
			new CFSecISOLangPKey();
		return( pkey );
	}

	public CFSecISOLangHPKey newHPKey() {
		CFSecISOLangHPKey hpkey =
			new CFSecISOLangHPKey();
		return( hpkey );
	}

	public CFSecISOLangByCode3IdxKey newCode3IdxKey() {
		CFSecISOLangByCode3IdxKey key =
			new CFSecISOLangByCode3IdxKey();
		return( key );
	}

	public CFSecISOLangByCode2IdxKey newCode2IdxKey() {
		CFSecISOLangByCode2IdxKey key =
			new CFSecISOLangByCode2IdxKey();
		return( key );
	}

	public CFSecISOLangBuff newBuff() {
		CFSecISOLangBuff buff =
			new CFSecISOLangBuff();
		return( buff );
	}

	public CFSecISOLangHBuff newHBuff() {
		CFSecISOLangHBuff hbuff =
			new CFSecISOLangHBuff();
		return( hbuff );
	}
}
