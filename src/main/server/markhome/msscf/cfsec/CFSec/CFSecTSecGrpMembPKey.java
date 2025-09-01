// Description: Java 11 implementation of a TSecGrpMemb primary key object.

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
 *	CFSecTSecGrpMembPKey Primary Key for TSecGrpMemb

 *		requiredTenantId	Required object attribute TenantId.
 *		requiredTSecGrpMembId	Required object attribute TSecGrpMembId. */
public class CFSecTSecGrpMembPKey
	implements Comparable<Object>,
		Serializable
{

	protected long requiredTenantId;
	protected long requiredTSecGrpMembId;
	public CFSecTSecGrpMembPKey() {
		requiredTenantId = CFSecTSecGrpMembBuff.TENANTID_INIT_VALUE;
		requiredTSecGrpMembId = CFSecTSecGrpMembBuff.TSECGRPMEMBID_INIT_VALUE;
	}

	public long getRequiredTenantId() {
		return( requiredTenantId );
	}

	public void setRequiredTenantId( long value ) {
		if( value < CFSecTSecGrpMembBuff.TENANTID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredTenantId",
				1,
				"value",
				value,
				CFSecTSecGrpMembBuff.TENANTID_MIN_VALUE );
		}
		requiredTenantId = value;
	}

	public long getRequiredTSecGrpMembId() {
		return( requiredTSecGrpMembId );
	}

	public void setRequiredTSecGrpMembId( long value ) {
		if( value < CFSecTSecGrpMembBuff.TSECGRPMEMBID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredTSecGrpMembId",
				1,
				"value",
				value,
				CFSecTSecGrpMembBuff.TSECGRPMEMBID_MIN_VALUE );
		}
		requiredTSecGrpMembId = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFSecTSecGrpMembHPKey ) {
			CFSecTSecGrpMembHPKey rhs = (CFSecTSecGrpMembHPKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredTSecGrpMembId() != rhs.getRequiredTSecGrpMembId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFSecTSecGrpMembPKey ) {
			CFSecTSecGrpMembPKey rhs = (CFSecTSecGrpMembPKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredTSecGrpMembId() != rhs.getRequiredTSecGrpMembId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFSecTSecGrpMembHBuff ) {
			CFSecTSecGrpMembHBuff rhs = (CFSecTSecGrpMembHBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredTSecGrpMembId() != rhs.getRequiredTSecGrpMembId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFSecTSecGrpMembBuff ) {
			CFSecTSecGrpMembBuff rhs = (CFSecTSecGrpMembBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			if( getRequiredTSecGrpMembId() != rhs.getRequiredTSecGrpMembId() ) {
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
		hashCode = hashCode + (int)( getRequiredTSecGrpMembId() );
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof CFSecTSecGrpMembHPKey ) {
			CFSecTSecGrpMembHPKey rhs = (CFSecTSecGrpMembHPKey)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredTSecGrpMembId() < rhs.getRequiredTSecGrpMembId() ) {
				return( -1 );
			}
			else if( getRequiredTSecGrpMembId() > rhs.getRequiredTSecGrpMembId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFSecTSecGrpMembPKey ) {
			CFSecTSecGrpMembPKey rhs = (CFSecTSecGrpMembPKey)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredTSecGrpMembId() < rhs.getRequiredTSecGrpMembId() ) {
				return( -1 );
			}
			else if( getRequiredTSecGrpMembId() > rhs.getRequiredTSecGrpMembId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFSecTSecGrpMembBuff ) {
			CFSecTSecGrpMembBuff rhs = (CFSecTSecGrpMembBuff)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredTSecGrpMembId() < rhs.getRequiredTSecGrpMembId() ) {
				return( -1 );
			}
			else if( getRequiredTSecGrpMembId() > rhs.getRequiredTSecGrpMembId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFSecTSecGrpMembHBuff ) {
			CFSecTSecGrpMembHBuff rhs = (CFSecTSecGrpMembHBuff)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
				return( 1 );
			}
			if( getRequiredTSecGrpMembId() < rhs.getRequiredTSecGrpMembId() ) {
				return( -1 );
			}
			else if( getRequiredTSecGrpMembId() > rhs.getRequiredTSecGrpMembId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				"CFSecTSecGrpMembPKey, CFSecTSecGrpMembBuff" );
		}
	}

	public String toString() {
		String ret = "<CFSecTSecGrpMembPKey"
			+ " RequiredTenantId=" + "\"" + Long.toString( getRequiredTenantId() ) + "\""
			+ " RequiredTSecGrpMembId=" + "\"" + Long.toString( getRequiredTSecGrpMembId() ) + "\""
			+ "/>";
		return( ret );
	}
}
