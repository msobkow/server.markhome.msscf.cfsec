
// Description: Java 11 Default Factory implementation for ISOCcy.

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
	 *	CFSecISOCcyFactory implementation for ISOCcy
	 */
public class CFSecISOCcyDefaultFactory
	implements ICFSecISOCcyFactory
{
	public CFSecISOCcyDefaultFactory() {
	}

	public CFSecISOCcyPKey newPKey() {
		CFSecISOCcyPKey pkey =
			new CFSecISOCcyPKey();
		return( pkey );
	}

	public CFSecISOCcyHPKey newHPKey() {
		CFSecISOCcyHPKey hpkey =
			new CFSecISOCcyHPKey();
		return( hpkey );
	}

	public CFSecISOCcyByCcyCdIdxKey newCcyCdIdxKey() {
		CFSecISOCcyByCcyCdIdxKey key =
			new CFSecISOCcyByCcyCdIdxKey();
		return( key );
	}

	public CFSecISOCcyByCcyNmIdxKey newCcyNmIdxKey() {
		CFSecISOCcyByCcyNmIdxKey key =
			new CFSecISOCcyByCcyNmIdxKey();
		return( key );
	}

	public CFSecISOCcyBuff newBuff() {
		CFSecISOCcyBuff buff =
			new CFSecISOCcyBuff();
		return( buff );
	}

	public CFSecISOCcyHBuff newHBuff() {
		CFSecISOCcyHBuff hbuff =
			new CFSecISOCcyHBuff();
		return( hbuff );
	}
}
