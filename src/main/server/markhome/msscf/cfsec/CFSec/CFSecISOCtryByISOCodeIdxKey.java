// Description: Java 11 implementation of a ISOCtry by ISOCodeIdx index key object.

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

public class CFSecISOCtryByISOCodeIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected String requiredISOCode;
	public CFSecISOCtryByISOCodeIdxKey() {
		requiredISOCode = new String( CFSecISOCtryBuff.ISOCODE_INIT_VALUE );
	}

	public String getRequiredISOCode() {
		return( requiredISOCode );
	}

	public void setRequiredISOCode( String value ) {
		if( value == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"setRequiredISOCode",
				1,
				"value" );
		}
		if( value.length() > 2 ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setRequiredISOCode",
				1,
				"value.length()",
				value.length(),
				2 );
		}
		requiredISOCode = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFSecISOCtryByISOCodeIdxKey ) {
			CFSecISOCtryByISOCodeIdxKey rhs = (CFSecISOCtryByISOCodeIdxKey)obj;
			if( ! getRequiredISOCode().equals( rhs.getRequiredISOCode() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFSecISOCtryBuff ) {
			CFSecISOCtryBuff rhs = (CFSecISOCtryBuff)obj;
			if( ! getRequiredISOCode().equals( rhs.getRequiredISOCode() ) ) {
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
		if( getRequiredISOCode() != null ) {
			hashCode = hashCode + getRequiredISOCode().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFSecISOCtryByISOCodeIdxKey ) {
			CFSecISOCtryByISOCodeIdxKey rhs = (CFSecISOCtryByISOCodeIdxKey)obj;
			{
				int cmp = getRequiredISOCode().compareTo( rhs.getRequiredISOCode() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			return( 0 );
		}
		else if( obj instanceof CFSecISOCtryBuff ) {
			CFSecISOCtryBuff rhs = (CFSecISOCtryBuff)obj;
			{
				int cmp = getRequiredISOCode().compareTo( rhs.getRequiredISOCode() );
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
		String ret = "<CFSecISOCtryByISOCodeIdx"
			+ " RequiredISOCode=" + "\"" + CFSecSchema.xmlEncodeString( getRequiredISOCode() ) + "\""
			+ "/>";
		return( ret );
	}
}
