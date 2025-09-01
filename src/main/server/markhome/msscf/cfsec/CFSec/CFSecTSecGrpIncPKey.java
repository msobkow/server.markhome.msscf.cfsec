// Description: Java 11 implementation of a TSecGrpInc primary key object.

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
 *	CFSecTSecGrpIncPKey Primary Key for TSecGrpInc

 *		requiredTenantId	Required object attribute TenantId.
 *		requiredTSecGrpIncId	Required object attribute TSecGrpIncId. */
public class CFSecTSecGrpIncPKey
	implements Comparable<Object>,
		Serializable
{

	protected long requiredTenantId;
	protected long requiredTSecGrpIncId;
	public CFSecTSecGrpIncPKey() {
		requiredTenantId = CFSecTSecGrpIncBuff.TENANTID_INIT_VALUE;
		requiredTSecGrpIncId = CFSecTSecGrpIncBuff.TSECGRPINCID_INIT_VALUE;
	}

	public long getRequiredTenantId() {
		return( requiredTenantId );
	}

	public void setRequiredTenantId( long value ) {
		if( value < CFSecTSecGrpIncBuff.TENANTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredTenantId",
				1,
				"value",
				value,
				CFSecTSecGrpIncBuff.TENANTID_MIN_VALUE );
		}
		requiredTenantId = value;
	}

	public long getRequiredTSecGrpIncId() {
		return( requiredTSecGrpIncId );
	}

	public void setRequiredTSecGrpIncId( long value ) {
		if( value < CFSecTSecGrpIncBuff.TSECGRPINCID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredTSecGrpIncId",
				1,
				"value",
				value,
				CFSecTSecGrpIncBuff.TSECGRPINCID_MIN_VALUE );
		}
		requiredTSecGrpIncId = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFSecTSecGrpIncHPKey ) {
			CFSecTSecGrpIncHPKey rhs = (CFSecTSecGrpIncHPKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredTSecGrpIncId() != rhs.getRequiredTSecGrpIncId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFSecTSecGrpIncPKey ) {
			CFSecTSecGrpIncPKey rhs = (CFSecTSecGrpIncPKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredTSecGrpIncId() != rhs.getRequiredTSecGrpIncId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFSecTSecGrpIncHBuff ) {
			CFSecTSecGrpIncHBuff rhs = (CFSecTSecGrpIncHBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredTSecGrpIncId() != rhs.getRequiredTSecGrpIncId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFSecTSecGrpIncBuff ) {
			CFSecTSecGrpIncBuff rhs = (CFSecTSecGrpIncBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredTSecGrpIncId() != rhs.getRequiredTSecGrpIncId() ) {
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
		hashCode = hashCode + (int)( getRequiredTenantId() );
		hashCode = hashCode + (int)( getRequiredTSecGrpIncId() );
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof CFSecTSecGrpIncHPKey ) {
			CFSecTSecGrpIncHPKey rhs = (CFSecTSecGrpIncHPKey)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredTSecGrpIncId() < rhs.getRequiredTSecGrpIncId() ) {
				return( -1 );
			}
			else if( getRequiredTSecGrpIncId() > rhs.getRequiredTSecGrpIncId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFSecTSecGrpIncPKey ) {
			CFSecTSecGrpIncPKey rhs = (CFSecTSecGrpIncPKey)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredTSecGrpIncId() < rhs.getRequiredTSecGrpIncId() ) {
				return( -1 );
			}
			else if( getRequiredTSecGrpIncId() > rhs.getRequiredTSecGrpIncId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFSecTSecGrpIncBuff ) {
			CFSecTSecGrpIncBuff rhs = (CFSecTSecGrpIncBuff)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredTSecGrpIncId() < rhs.getRequiredTSecGrpIncId() ) {
				return( -1 );
			}
			else if( getRequiredTSecGrpIncId() > rhs.getRequiredTSecGrpIncId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFSecTSecGrpIncHBuff ) {
			CFSecTSecGrpIncHBuff rhs = (CFSecTSecGrpIncHBuff)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredTSecGrpIncId() < rhs.getRequiredTSecGrpIncId() ) {
				return( -1 );
			}
			else if( getRequiredTSecGrpIncId() > rhs.getRequiredTSecGrpIncId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				"CFSecTSecGrpIncPKey, CFSecTSecGrpIncBuff" );
		}
	}

	public String toString() {
		String ret = "<CFSecTSecGrpIncPKey"
			+ " RequiredTenantId=" + "\"" + Long.toString( getRequiredTenantId() ) + "\""
			+ " RequiredTSecGrpIncId=" + "\"" + Long.toString( getRequiredTSecGrpIncId() ) + "\""
			+ "/>";
		return( ret );
	}
}
