// Description: Java 11 implementation of a Service by UTypeIdx index key object.

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

public class CFSecServiceByUTypeIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected long requiredClusterId;
	protected long requiredHostNodeId;
	protected int requiredServiceTypeId;
	public CFSecServiceByUTypeIdxKey() {
		requiredClusterId = CFSecServiceBuff.CLUSTERID_INIT_VALUE;
		requiredHostNodeId = CFSecServiceBuff.HOSTNODEID_INIT_VALUE;
		requiredServiceTypeId = CFSecServiceBuff.SERVICETYPEID_INIT_VALUE;
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

	public long getRequiredHostNodeId() {
		return( requiredHostNodeId );
	}

	public void setRequiredHostNodeId( long value ) {
		if( value < CFSecServiceBuff.HOSTNODEID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredHostNodeId",
				1,
				"value",
				value,
				CFSecServiceBuff.HOSTNODEID_MIN_VALUE );
		}
		requiredHostNodeId = value;
	}

	public int getRequiredServiceTypeId() {
		return( requiredServiceTypeId );
	}

	public void setRequiredServiceTypeId( int value ) {
		if( value < CFSecServiceBuff.SERVICETYPEID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredServiceTypeId",
				1,
				"value",
				value,
				CFSecServiceBuff.SERVICETYPEID_MIN_VALUE );
		}
		requiredServiceTypeId = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFSecServiceByUTypeIdxKey ) {
			CFSecServiceByUTypeIdxKey rhs = (CFSecServiceByUTypeIdxKey)obj;
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			if( getRequiredHostNodeId() != rhs.getRequiredHostNodeId() ) {
				return( false );
			}
			if( getRequiredServiceTypeId() != rhs.getRequiredServiceTypeId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFSecServiceBuff ) {
			CFSecServiceBuff rhs = (CFSecServiceBuff)obj;
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			if( getRequiredHostNodeId() != rhs.getRequiredHostNodeId() ) {
				return( false );
			}
			if( getRequiredServiceTypeId() != rhs.getRequiredServiceTypeId() ) {
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
		hashCode = hashCode + (int)( getRequiredHostNodeId() );
		hashCode = hashCode + getRequiredServiceTypeId();
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFSecServiceByUTypeIdxKey ) {
			CFSecServiceByUTypeIdxKey rhs = (CFSecServiceByUTypeIdxKey)obj;
			if( getRequiredClusterId() < rhs.getRequiredClusterId() ) {
				return( -1 );
			}
			else if( getRequiredClusterId() > rhs.getRequiredClusterId() ) {
				return( 1 );
			}
			if( getRequiredHostNodeId() < rhs.getRequiredHostNodeId() ) {
				return( -1 );
			}
			else if( getRequiredHostNodeId() > rhs.getRequiredHostNodeId() ) {
				return( 1 );
			}
			if( getRequiredServiceTypeId() < rhs.getRequiredServiceTypeId() ) {
				return( -1 );
			}
			else if( getRequiredServiceTypeId() > rhs.getRequiredServiceTypeId() ) {
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
			if( getRequiredHostNodeId() < rhs.getRequiredHostNodeId() ) {
				return( -1 );
			}
			else if( getRequiredHostNodeId() > rhs.getRequiredHostNodeId() ) {
				return( 1 );
			}
			if( getRequiredServiceTypeId() < rhs.getRequiredServiceTypeId() ) {
				return( -1 );
			}
			else if( getRequiredServiceTypeId() > rhs.getRequiredServiceTypeId() ) {
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
		String ret = "<CFSecServiceByUTypeIdx"
			+ " RequiredClusterId=" + "\"" + Long.toString( getRequiredClusterId() ) + "\""
			+ " RequiredHostNodeId=" + "\"" + Long.toString( getRequiredHostNodeId() ) + "\""
			+ " RequiredServiceTypeId=" + "\"" + Integer.toString( getRequiredServiceTypeId() ) + "\""
			+ "/>";
		return( ret );
	}
}
