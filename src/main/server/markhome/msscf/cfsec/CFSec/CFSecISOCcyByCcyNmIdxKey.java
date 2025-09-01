// Description: Java 11 implementation of a ISOCcy by CcyNmIdx index key object.

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
import java.io.*;
import java.math.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;

public class CFSecISOCcyByCcyNmIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected String requiredName;
	public CFSecISOCcyByCcyNmIdxKey() {
		requiredName = new String( CFSecISOCcyBuff.NAME_INIT_VALUE );
	}

	public String getRequiredName() {
		return( requiredName );
	}

	public void setRequiredName( String value ) {
		if( value == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"setRequiredName",
				1,
				"value" );
		}
		if( value.length() > 64 ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setRequiredName",
				1,
				"value.length()",
				value.length(),
				64 );
		}
		requiredName = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFSecISOCcyByCcyNmIdxKey ) {
			CFSecISOCcyByCcyNmIdxKey rhs = (CFSecISOCcyByCcyNmIdxKey)obj;
			if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFSecISOCcyBuff ) {
			CFSecISOCcyBuff rhs = (CFSecISOCcyBuff)obj;
			if( ! getRequiredName().equals( rhs.getRequiredName() ) ) {
				return( false );
			}
			return( true );
		}
		else {
			return( false );
		}
	}

	public int hashCode() {
		int hashCode = 0;
		if( getRequiredName() != null ) {
			hashCode = hashCode + getRequiredName().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFSecISOCcyByCcyNmIdxKey ) {
			CFSecISOCcyByCcyNmIdxKey rhs = (CFSecISOCcyByCcyNmIdxKey)obj;
			{
				int cmp = getRequiredName().compareTo( rhs.getRequiredName() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			return( 0 );
		}
		else if( obj instanceof CFSecISOCcyBuff ) {
			CFSecISOCcyBuff rhs = (CFSecISOCcyBuff)obj;
			{
				int cmp = getRequiredName().compareTo( rhs.getRequiredName() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			return( 0 );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				null );
		}
	}

	public String toString() {
		String ret = "<CFSecISOCcyByCcyNmIdx"
			+ " RequiredName=" + "\"" + CFSecSchema.xmlEncodeString( getRequiredName() ) + "\""
			+ "/>";
		return( ret );
	}
}
