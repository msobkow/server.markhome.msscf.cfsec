// Description: Java 11 implementation of a ISOCtryCcy primary key object.

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
 *	CFSecISOCtryCcyPKey Primary Key for ISOCtryCcy

 *		requiredISOCtryId	Required object attribute ISOCtryId.
 *		requiredISOCcyId	Required object attribute ISOCcyId. */
public class CFSecISOCtryCcyPKey
	implements Comparable<Object>,
		Serializable
{

	protected short requiredISOCtryId;
	protected short requiredISOCcyId;
	public CFSecISOCtryCcyPKey() {
		requiredISOCtryId = CFSecISOCtryCcyBuff.ISOCTRYID_INIT_VALUE;
		requiredISOCcyId = CFSecISOCtryCcyBuff.ISOCCYID_INIT_VALUE;
	}

	public short getRequiredISOCtryId() {
		return( requiredISOCtryId );
	}

	public void setRequiredISOCtryId( short value ) {
		if( value < CFSecISOCtryCcyBuff.ISOCTRYID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredISOCtryId",
				1,
				"value",
				value,
				CFSecISOCtryCcyBuff.ISOCTRYID_MIN_VALUE );
		}
		requiredISOCtryId = value;
	}

	public short getRequiredISOCcyId() {
		return( requiredISOCcyId );
	}

	public void setRequiredISOCcyId( short value ) {
		if( value < CFSecISOCtryCcyBuff.ISOCCYID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredISOCcyId",
				1,
				"value",
				value,
				CFSecISOCtryCcyBuff.ISOCCYID_MIN_VALUE );
		}
		requiredISOCcyId = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFSecISOCtryCcyHPKey ) {
			CFSecISOCtryCcyHPKey rhs = (CFSecISOCtryCcyHPKey)obj;
			if( getRequiredISOCtryId() != rhs.getRequiredISOCtryId() ) {
				return( false );
			}
			if( getRequiredISOCcyId() != rhs.getRequiredISOCcyId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFSecISOCtryCcyPKey ) {
			CFSecISOCtryCcyPKey rhs = (CFSecISOCtryCcyPKey)obj;
			if( getRequiredISOCtryId() != rhs.getRequiredISOCtryId() ) {
				return( false );
			}
			if( getRequiredISOCcyId() != rhs.getRequiredISOCcyId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFSecISOCtryCcyHBuff ) {
			CFSecISOCtryCcyHBuff rhs = (CFSecISOCtryCcyHBuff)obj;
			if( getRequiredISOCtryId() != rhs.getRequiredISOCtryId() ) {
				return( false );
			}
			if( getRequiredISOCcyId() != rhs.getRequiredISOCcyId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFSecISOCtryCcyBuff ) {
			CFSecISOCtryCcyBuff rhs = (CFSecISOCtryCcyBuff)obj;
			if( getRequiredISOCtryId() != rhs.getRequiredISOCtryId() ) {
				return( false );
			}
			if( getRequiredISOCcyId() != rhs.getRequiredISOCcyId() ) {
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
		hashCode = ( hashCode * 0x10000 ) + getRequiredISOCcyId();
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof CFSecISOCtryCcyHPKey ) {
			CFSecISOCtryCcyHPKey rhs = (CFSecISOCtryCcyHPKey)obj;
			if( getRequiredISOCtryId() < rhs.getRequiredISOCtryId() ) {
				return( -1 );
			}
			else if( getRequiredISOCtryId() > rhs.getRequiredISOCtryId() ) {
				return( 1 );
			}
			if( getRequiredISOCcyId() < rhs.getRequiredISOCcyId() ) {
				return( -1 );
			}
			else if( getRequiredISOCcyId() > rhs.getRequiredISOCcyId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFSecISOCtryCcyPKey ) {
			CFSecISOCtryCcyPKey rhs = (CFSecISOCtryCcyPKey)obj;
			if( getRequiredISOCtryId() < rhs.getRequiredISOCtryId() ) {
				return( -1 );
			}
			else if( getRequiredISOCtryId() > rhs.getRequiredISOCtryId() ) {
				return( 1 );
			}
			if( getRequiredISOCcyId() < rhs.getRequiredISOCcyId() ) {
				return( -1 );
			}
			else if( getRequiredISOCcyId() > rhs.getRequiredISOCcyId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFSecISOCtryCcyBuff ) {
			CFSecISOCtryCcyBuff rhs = (CFSecISOCtryCcyBuff)obj;
			if( getRequiredISOCtryId() < rhs.getRequiredISOCtryId() ) {
				return( -1 );
			}
			else if( getRequiredISOCtryId() > rhs.getRequiredISOCtryId() ) {
				return( 1 );
			}
			if( getRequiredISOCcyId() < rhs.getRequiredISOCcyId() ) {
				return( -1 );
			}
			else if( getRequiredISOCcyId() > rhs.getRequiredISOCcyId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFSecISOCtryCcyHBuff ) {
			CFSecISOCtryCcyHBuff rhs = (CFSecISOCtryCcyHBuff)obj;
			if( getRequiredISOCtryId() < rhs.getRequiredISOCtryId() ) {
				return( -1 );
			}
			else if( getRequiredISOCtryId() > rhs.getRequiredISOCtryId() ) {
				return( 1 );
			}
			if( getRequiredISOCcyId() < rhs.getRequiredISOCcyId() ) {
				return( -1 );
			}
			else if( getRequiredISOCcyId() > rhs.getRequiredISOCcyId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				"CFSecISOCtryCcyPKey, CFSecISOCtryCcyBuff" );
		}
	}

	public String toString() {
		String ret = "<CFSecISOCtryCcyPKey"
			+ " RequiredISOCtryId=" + "\"" + Short.toString( getRequiredISOCtryId() ) + "\""
			+ " RequiredISOCcyId=" + "\"" + Short.toString( getRequiredISOCcyId() ) + "\""
			+ "/>";
		return( ret );
	}
}
