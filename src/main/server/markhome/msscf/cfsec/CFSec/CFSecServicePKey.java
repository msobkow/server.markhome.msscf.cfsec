// Description: Java 11 implementation of a Service primary key object.

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
 *	CFSecServicePKey Primary Key for Service

 *		requiredClusterId	Required object attribute ClusterId.
 *		requiredServiceId	Required object attribute ServiceId. */
public class CFSecServicePKey
	implements Comparable<Object>,
		Serializable
{

	protected long requiredClusterId;
	protected long requiredServiceId;
	public CFSecServicePKey() {
		requiredClusterId = CFSecServiceBuff.CLUSTERID_INIT_VALUE;
		requiredServiceId = CFSecServiceBuff.SERVICEID_INIT_VALUE;
	}

	public long getRequiredClusterId() {
		return( requiredClusterId );
	}

	public void setRequiredClusterId( long value ) {
		if( value < CFSecServiceBuff.CLUSTERID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredClusterId",
				1,
				"value",
				value,
				CFSecServiceBuff.CLUSTERID_MIN_VALUE );
		}
		requiredClusterId = value;
	}

	public long getRequiredServiceId() {
		return( requiredServiceId );
	}

	public void setRequiredServiceId( long value ) {
		if( value < CFSecServiceBuff.SERVICEID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredServiceId",
				1,
				"value",
				value,
				CFSecServiceBuff.SERVICEID_MIN_VALUE );
		}
		requiredServiceId = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFSecServiceHPKey ) {
			CFSecServiceHPKey rhs = (CFSecServiceHPKey)obj;
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			if( getRequiredServiceId() != rhs.getRequiredServiceId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFSecServicePKey ) {
			CFSecServicePKey rhs = (CFSecServicePKey)obj;
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			if( getRequiredServiceId() != rhs.getRequiredServiceId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFSecServiceHBuff ) {
			CFSecServiceHBuff rhs = (CFSecServiceHBuff)obj;
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			if( getRequiredServiceId() != rhs.getRequiredServiceId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFSecServiceBuff ) {
			CFSecServiceBuff rhs = (CFSecServiceBuff)obj;
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			if( getRequiredServiceId() != rhs.getRequiredServiceId() ) {
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
		hashCode = hashCode + (int)( getRequiredClusterId() );
		hashCode = hashCode + (int)( getRequiredServiceId() );
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof CFSecServiceHPKey ) {
			CFSecServiceHPKey rhs = (CFSecServiceHPKey)obj;
			if( getRequiredClusterId() < rhs.getRequiredClusterId() ) {
				return( -1 );
			}
			else if( getRequiredClusterId() > rhs.getRequiredClusterId() ) {
				return( 1 );
			}
			if( getRequiredServiceId() < rhs.getRequiredServiceId() ) {
				return( -1 );
			}
			else if( getRequiredServiceId() > rhs.getRequiredServiceId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFSecServicePKey ) {
			CFSecServicePKey rhs = (CFSecServicePKey)obj;
			if( getRequiredClusterId() < rhs.getRequiredClusterId() ) {
				return( -1 );
			}
			else if( getRequiredClusterId() > rhs.getRequiredClusterId() ) {
				return( 1 );
			}
			if( getRequiredServiceId() < rhs.getRequiredServiceId() ) {
				return( -1 );
			}
			else if( getRequiredServiceId() > rhs.getRequiredServiceId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFSecServiceBuff ) {
			CFSecServiceBuff rhs = (CFSecServiceBuff)obj;
			if( getRequiredClusterId() < rhs.getRequiredClusterId() ) {
				return( -1 );
			}
			else if( getRequiredClusterId() > rhs.getRequiredClusterId() ) {
				return( 1 );
			}
			if( getRequiredServiceId() < rhs.getRequiredServiceId() ) {
				return( -1 );
			}
			else if( getRequiredServiceId() > rhs.getRequiredServiceId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFSecServiceHBuff ) {
			CFSecServiceHBuff rhs = (CFSecServiceHBuff)obj;
			if( getRequiredClusterId() < rhs.getRequiredClusterId() ) {
				return( -1 );
			}
			else if( getRequiredClusterId() > rhs.getRequiredClusterId() ) {
				return( 1 );
			}
			if( getRequiredServiceId() < rhs.getRequiredServiceId() ) {
				return( -1 );
			}
			else if( getRequiredServiceId() > rhs.getRequiredServiceId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				"CFSecServicePKey, CFSecServiceBuff" );
		}
	}

	public String toString() {
		String ret = "<CFSecServicePKey"
			+ " RequiredClusterId=" + "\"" + Long.toString( getRequiredClusterId() ) + "\""
			+ " RequiredServiceId=" + "\"" + Long.toString( getRequiredServiceId() ) + "\""
			+ "/>";
		return( ret );
	}
}
