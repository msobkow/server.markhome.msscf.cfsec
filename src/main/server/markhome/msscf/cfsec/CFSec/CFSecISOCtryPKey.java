// Description: Java 11 implementation of a ISOCtry primary key object.

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
import org.apache.commons.codec.binary.Base64;

/*
 *	CFSecISOCtryPKey Primary Key for ISOCtry

 *		requiredISOCtryId	Required object attribute ISOCtryId. */
public class CFSecISOCtryPKey
	implements Comparable<Object>,
		Serializable
{

	protected short requiredISOCtryId;
	public CFSecISOCtryPKey() {
		requiredISOCtryId = CFSecISOCtryBuff.ISOCTRYID_INIT_VALUE;
	}

	public short getRequiredISOCtryId() {
		return( requiredISOCtryId );
	}

	public void setRequiredISOCtryId( short value ) {
		if( value < CFSecISOCtryBuff.ISOCTRYID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredISOCtryId",
				1,
				"value",
				value,
				CFSecISOCtryBuff.ISOCTRYID_MIN_VALUE );
		}
		requiredISOCtryId = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFSecISOCtryHPKey ) {
			CFSecISOCtryHPKey rhs = (CFSecISOCtryHPKey)obj;
			if( getRequiredISOCtryId() != rhs.getRequiredISOCtryId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFSecISOCtryPKey ) {
			CFSecISOCtryPKey rhs = (CFSecISOCtryPKey)obj;
			if( getRequiredISOCtryId() != rhs.getRequiredISOCtryId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFSecISOCtryHBuff ) {
			CFSecISOCtryHBuff rhs = (CFSecISOCtryHBuff)obj;
			if( getRequiredISOCtryId() != rhs.getRequiredISOCtryId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFSecISOCtryBuff ) {
			CFSecISOCtryBuff rhs = (CFSecISOCtryBuff)obj;
			if( getRequiredISOCtryId() != rhs.getRequiredISOCtryId() ) {
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
		hashCode = ( hashCode * 0x10000 ) + getRequiredISOCtryId();
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof CFSecISOCtryHPKey ) {
			CFSecISOCtryHPKey rhs = (CFSecISOCtryHPKey)obj;
			if( getRequiredISOCtryId() < rhs.getRequiredISOCtryId() ) {
				return( -1 );
			}
			else if( getRequiredISOCtryId() > rhs.getRequiredISOCtryId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFSecISOCtryPKey ) {
			CFSecISOCtryPKey rhs = (CFSecISOCtryPKey)obj;
			if( getRequiredISOCtryId() < rhs.getRequiredISOCtryId() ) {
				return( -1 );
			}
			else if( getRequiredISOCtryId() > rhs.getRequiredISOCtryId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFSecISOCtryBuff ) {
			CFSecISOCtryBuff rhs = (CFSecISOCtryBuff)obj;
			if( getRequiredISOCtryId() < rhs.getRequiredISOCtryId() ) {
				return( -1 );
			}
			else if( getRequiredISOCtryId() > rhs.getRequiredISOCtryId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFSecISOCtryHBuff ) {
			CFSecISOCtryHBuff rhs = (CFSecISOCtryHBuff)obj;
			if( getRequiredISOCtryId() < rhs.getRequiredISOCtryId() ) {
				return( -1 );
			}
			else if( getRequiredISOCtryId() > rhs.getRequiredISOCtryId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				"CFSecISOCtryPKey, CFSecISOCtryBuff" );
		}
	}

	public String toString() {
		String ret = "<CFSecISOCtryPKey"
			+ " RequiredISOCtryId=" + "\"" + Short.toString( getRequiredISOCtryId() ) + "\""
			+ "/>";
		return( ret );
	}
}
