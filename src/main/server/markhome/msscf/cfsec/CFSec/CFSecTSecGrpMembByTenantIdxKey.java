// Description: Java 11 implementation of a TSecGrpMemb by TenantIdx index key object.

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

public class CFSecTSecGrpMembByTenantIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected long requiredTenantId;
	public CFSecTSecGrpMembByTenantIdxKey() {
		requiredTenantId = CFSecTSecGrpMembBuff.TENANTID_INIT_VALUE;
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

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFSecTSecGrpMembByTenantIdxKey ) {
			CFSecTSecGrpMembByTenantIdxKey rhs = (CFSecTSecGrpMembByTenantIdxKey)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFSecTSecGrpMembBuff ) {
			CFSecTSecGrpMembBuff rhs = (CFSecTSecGrpMembBuff)obj;
			if( getRequiredTenantId() != rhs.getRequiredTenantId() ) {
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
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFSecTSecGrpMembByTenantIdxKey ) {
			CFSecTSecGrpMembByTenantIdxKey rhs = (CFSecTSecGrpMembByTenantIdxKey)obj;
			if( getRequiredTenantId() < rhs.getRequiredTenantId() ) {
				return( -1 );
			}
			else if( getRequiredTenantId() > rhs.getRequiredTenantId() ) {
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
		String ret = "<CFSecTSecGrpMembByTenantIdx"
			+ " RequiredTenantId=" + "\"" + Long.toString( getRequiredTenantId() ) + "\""
			+ "/>";
		return( ret );
	}
}
