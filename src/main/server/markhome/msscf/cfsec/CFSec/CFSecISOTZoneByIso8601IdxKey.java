// Description: Java 11 implementation of a ISOTZone by Iso8601Idx index key object.

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

public class CFSecISOTZoneByIso8601IdxKey
	implements Comparable<Object>,
		Serializable
{
	protected String requiredIso8601;
	public CFSecISOTZoneByIso8601IdxKey() {
		requiredIso8601 = new String( CFSecISOTZoneBuff.ISO8601_INIT_VALUE );
	}

	public String getRequiredIso8601() {
		return( requiredIso8601 );
	}

	public void setRequiredIso8601( String value ) {
		if( value == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"setRequiredIso8601",
				1,
				"value" );
		}
		if( value.length() > 6 ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setRequiredIso8601",
				1,
				"value.length()",
				value.length(),
				6 );
		}
		requiredIso8601 = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFSecISOTZoneByIso8601IdxKey ) {
			CFSecISOTZoneByIso8601IdxKey rhs = (CFSecISOTZoneByIso8601IdxKey)obj;
			if( ! getRequiredIso8601().equals( rhs.getRequiredIso8601() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFSecISOTZoneBuff ) {
			CFSecISOTZoneBuff rhs = (CFSecISOTZoneBuff)obj;
			if( ! getRequiredIso8601().equals( rhs.getRequiredIso8601() ) ) {
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
		if( getRequiredIso8601() != null ) {
			hashCode = hashCode + getRequiredIso8601().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFSecISOTZoneByIso8601IdxKey ) {
			CFSecISOTZoneByIso8601IdxKey rhs = (CFSecISOTZoneByIso8601IdxKey)obj;
			{
				int cmp = getRequiredIso8601().compareTo( rhs.getRequiredIso8601() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			return( 0 );
		}
		else if( obj instanceof CFSecISOTZoneBuff ) {
			CFSecISOTZoneBuff rhs = (CFSecISOTZoneBuff)obj;
			{
				int cmp = getRequiredIso8601().compareTo( rhs.getRequiredIso8601() );
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
		String ret = "<CFSecISOTZoneByIso8601Idx"
			+ " RequiredIso8601=" + "\"" + CFSecSchema.xmlEncodeString( getRequiredIso8601() ) + "\""
			+ "/>";
		return( ret );
	}
}
