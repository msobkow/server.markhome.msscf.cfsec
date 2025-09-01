// Description: Java 11 implementation of a HostNode primary key object.

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
 *	CFSecHostNodePKey Primary Key for HostNode

 *		requiredClusterId	Required object attribute ClusterId.
 *		requiredHostNodeId	Required object attribute HostNodeId. */
public class CFSecHostNodePKey
	implements Comparable<Object>,
		Serializable
{

	protected long requiredClusterId;
	protected long requiredHostNodeId;
	public CFSecHostNodePKey() {
		requiredClusterId = CFSecHostNodeBuff.CLUSTERID_INIT_VALUE;
		requiredHostNodeId = CFSecHostNodeBuff.HOSTNODEID_INIT_VALUE;
	}

	public long getRequiredClusterId() {
		return( requiredClusterId );
	}

	public void setRequiredClusterId( long value ) {
		if( value < CFSecHostNodeBuff.CLUSTERID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredClusterId",
				1,
				"value",
				value,
				CFSecHostNodeBuff.CLUSTERID_MIN_VALUE );
		}
		requiredClusterId = value;
	}

	public long getRequiredHostNodeId() {
		return( requiredHostNodeId );
	}

	public void setRequiredHostNodeId( long value ) {
		if( value < CFSecHostNodeBuff.HOSTNODEID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredHostNodeId",
				1,
				"value",
				value,
				CFSecHostNodeBuff.HOSTNODEID_MIN_VALUE );
		}
		requiredHostNodeId = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFSecHostNodeHPKey ) {
			CFSecHostNodeHPKey rhs = (CFSecHostNodeHPKey)obj;
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			if( getRequiredHostNodeId() != rhs.getRequiredHostNodeId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFSecHostNodePKey ) {
			CFSecHostNodePKey rhs = (CFSecHostNodePKey)obj;
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			if( getRequiredHostNodeId() != rhs.getRequiredHostNodeId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFSecHostNodeHBuff ) {
			CFSecHostNodeHBuff rhs = (CFSecHostNodeHBuff)obj;
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			if( getRequiredHostNodeId() != rhs.getRequiredHostNodeId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFSecHostNodeBuff ) {
			CFSecHostNodeBuff rhs = (CFSecHostNodeBuff)obj;
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			if( getRequiredHostNodeId() != rhs.getRequiredHostNodeId() ) {
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
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof CFSecHostNodeHPKey ) {
			CFSecHostNodeHPKey rhs = (CFSecHostNodeHPKey)obj;
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
			return( 0 );
		}
		else if( obj instanceof CFSecHostNodePKey ) {
			CFSecHostNodePKey rhs = (CFSecHostNodePKey)obj;
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
			return( 0 );
		}
		else if( obj instanceof CFSecHostNodeBuff ) {
			CFSecHostNodeBuff rhs = (CFSecHostNodeBuff)obj;
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
			return( 0 );
		}
		else if( obj instanceof CFSecHostNodeHBuff ) {
			CFSecHostNodeHBuff rhs = (CFSecHostNodeHBuff)obj;
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
			return( 0 );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				"CFSecHostNodePKey, CFSecHostNodeBuff" );
		}
	}

	public String toString() {
		String ret = "<CFSecHostNodePKey"
			+ " RequiredClusterId=" + "\"" + Long.toString( getRequiredClusterId() ) + "\""
			+ " RequiredHostNodeId=" + "\"" + Long.toString( getRequiredHostNodeId() ) + "\""
			+ "/>";
		return( ret );
	}
}
