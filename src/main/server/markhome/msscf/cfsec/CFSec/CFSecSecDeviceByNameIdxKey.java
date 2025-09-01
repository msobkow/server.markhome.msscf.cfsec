// Description: Java 11 implementation of a SecDevice by NameIdx index key object.

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

public class CFSecSecDeviceByNameIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected UUID requiredSecUserId;
	protected String requiredDevName;
	public CFSecSecDeviceByNameIdxKey() {
		requiredSecUserId = UUID.fromString( CFSecSecDeviceBuff.SECUSERID_INIT_VALUE.toString() );
		requiredDevName = new String( CFSecSecDeviceBuff.DEVNAME_INIT_VALUE );
	}

	public UUID getRequiredSecUserId() {
		return( requiredSecUserId );
	}

	public void setRequiredSecUserId( UUID value ) {
		if( value == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"setRequiredSecUserId",
				1,
				"value" );
		}
		requiredSecUserId = value;
	}

	public String getRequiredDevName() {
		return( requiredDevName );
	}

	public void setRequiredDevName( String value ) {
		if( value == null ) {
			throw new CFLibNullArgumentException( getClass(),
				"setRequiredDevName",
				1,
				"value" );
		}
		if( value.length() > 127 ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setRequiredDevName",
				1,
				"value.length()",
				value.length(),
				127 );
		}
		requiredDevName = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFSecSecDeviceByNameIdxKey ) {
			CFSecSecDeviceByNameIdxKey rhs = (CFSecSecDeviceByNameIdxKey)obj;
			if( ! getRequiredSecUserId().equals( rhs.getRequiredSecUserId() ) ) {
				return( false );
			}
			if( ! getRequiredDevName().equals( rhs.getRequiredDevName() ) ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFSecSecDeviceBuff ) {
			CFSecSecDeviceBuff rhs = (CFSecSecDeviceBuff)obj;
			if( ! getRequiredSecUserId().equals( rhs.getRequiredSecUserId() ) ) {
				return( false );
			}
			if( ! getRequiredDevName().equals( rhs.getRequiredDevName() ) ) {
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
		hashCode = hashCode + getRequiredSecUserId().hashCode();
		if( getRequiredDevName() != null ) {
			hashCode = hashCode + getRequiredDevName().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFSecSecDeviceByNameIdxKey ) {
			CFSecSecDeviceByNameIdxKey rhs = (CFSecSecDeviceByNameIdxKey)obj;
			{
				int cmp = getRequiredSecUserId().compareTo( rhs.getRequiredSecUserId() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			{
				int cmp = getRequiredDevName().compareTo( rhs.getRequiredDevName() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			return( 0 );
		}
		else if( obj instanceof CFSecSecDeviceBuff ) {
			CFSecSecDeviceBuff rhs = (CFSecSecDeviceBuff)obj;
			{
				int cmp = getRequiredSecUserId().compareTo( rhs.getRequiredSecUserId() );
				if( cmp != 0 ) {
					return( cmp );
				}
			}
			{
				int cmp = getRequiredDevName().compareTo( rhs.getRequiredDevName() );
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
		String ret = "<CFSecSecDeviceByNameIdx"
			+ " RequiredSecUserId=" + "\"" + getRequiredSecUserId().toString() + "\""
			+ " RequiredDevName=" + "\"" + CFSecSchema.xmlEncodeString( getRequiredDevName() ) + "\""
			+ "/>";
		return( ret );
	}
}
