// Description: Java 11 implementation of a SecGrpMemb primary key object.

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
 *	CFSecSecGrpMembPKey Primary Key for SecGrpMemb

 *		requiredClusterId	Required object attribute ClusterId.
 *		requiredSecGrpMembId	Required object attribute SecGrpMembId. */
public class CFSecSecGrpMembPKey
	implements Comparable<Object>,
		Serializable
{

	protected long requiredClusterId;
	protected long requiredSecGrpMembId;
	public CFSecSecGrpMembPKey() {
		requiredClusterId = CFSecSecGrpMembBuff.CLUSTERID_INIT_VALUE;
		requiredSecGrpMembId = CFSecSecGrpMembBuff.SECGRPMEMBID_INIT_VALUE;
	}

	public long getRequiredClusterId() {
		return( requiredClusterId );
	}

	public void setRequiredClusterId( long value ) {
		if( value < CFSecSecGrpMembBuff.CLUSTERID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredClusterId",
				1,
				"value",
				value,
				CFSecSecGrpMembBuff.CLUSTERID_MIN_VALUE );
		}
		requiredClusterId = value;
	}

	public long getRequiredSecGrpMembId() {
		return( requiredSecGrpMembId );
	}

	public void setRequiredSecGrpMembId( long value ) {
		if( value < CFSecSecGrpMembBuff.SECGRPMEMBID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredSecGrpMembId",
				1,
				"value",
				value,
				CFSecSecGrpMembBuff.SECGRPMEMBID_MIN_VALUE );
		}
		requiredSecGrpMembId = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFSecSecGrpMembHPKey ) {
			CFSecSecGrpMembHPKey rhs = (CFSecSecGrpMembHPKey)obj;
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			if( getRequiredSecGrpMembId() != rhs.getRequiredSecGrpMembId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFSecSecGrpMembPKey ) {
			CFSecSecGrpMembPKey rhs = (CFSecSecGrpMembPKey)obj;
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			if( getRequiredSecGrpMembId() != rhs.getRequiredSecGrpMembId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFSecSecGrpMembHBuff ) {
			CFSecSecGrpMembHBuff rhs = (CFSecSecGrpMembHBuff)obj;
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			if( getRequiredSecGrpMembId() != rhs.getRequiredSecGrpMembId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFSecSecGrpMembBuff ) {
			CFSecSecGrpMembBuff rhs = (CFSecSecGrpMembBuff)obj;
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			if( getRequiredSecGrpMembId() != rhs.getRequiredSecGrpMembId() ) {
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
		hashCode = hashCode + (int)( getRequiredSecGrpMembId() );
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof CFSecSecGrpMembHPKey ) {
			CFSecSecGrpMembHPKey rhs = (CFSecSecGrpMembHPKey)obj;
			if( getRequiredClusterId() < rhs.getRequiredClusterId() ) {
				return( -1 );
			}
			else if( getRequiredClusterId() > rhs.getRequiredClusterId() ) {
				return( 1 );
			}
			if( getRequiredSecGrpMembId() < rhs.getRequiredSecGrpMembId() ) {
				return( -1 );
			}
			else if( getRequiredSecGrpMembId() > rhs.getRequiredSecGrpMembId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFSecSecGrpMembPKey ) {
			CFSecSecGrpMembPKey rhs = (CFSecSecGrpMembPKey)obj;
			if( getRequiredClusterId() < rhs.getRequiredClusterId() ) {
				return( -1 );
			}
			else if( getRequiredClusterId() > rhs.getRequiredClusterId() ) {
				return( 1 );
			}
			if( getRequiredSecGrpMembId() < rhs.getRequiredSecGrpMembId() ) {
				return( -1 );
			}
			else if( getRequiredSecGrpMembId() > rhs.getRequiredSecGrpMembId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFSecSecGrpMembBuff ) {
			CFSecSecGrpMembBuff rhs = (CFSecSecGrpMembBuff)obj;
			if( getRequiredClusterId() < rhs.getRequiredClusterId() ) {
				return( -1 );
			}
			else if( getRequiredClusterId() > rhs.getRequiredClusterId() ) {
				return( 1 );
			}
			if( getRequiredSecGrpMembId() < rhs.getRequiredSecGrpMembId() ) {
				return( -1 );
			}
			else if( getRequiredSecGrpMembId() > rhs.getRequiredSecGrpMembId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFSecSecGrpMembHBuff ) {
			CFSecSecGrpMembHBuff rhs = (CFSecSecGrpMembHBuff)obj;
			if( getRequiredClusterId() < rhs.getRequiredClusterId() ) {
				return( -1 );
			}
			else if( getRequiredClusterId() > rhs.getRequiredClusterId() ) {
				return( 1 );
			}
			if( getRequiredSecGrpMembId() < rhs.getRequiredSecGrpMembId() ) {
				return( -1 );
			}
			else if( getRequiredSecGrpMembId() > rhs.getRequiredSecGrpMembId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				"CFSecSecGrpMembPKey, CFSecSecGrpMembBuff" );
		}
	}

	public String toString() {
		String ret = "<CFSecSecGrpMembPKey"
			+ " RequiredClusterId=" + "\"" + Long.toString( getRequiredClusterId() ) + "\""
			+ " RequiredSecGrpMembId=" + "\"" + Long.toString( getRequiredSecGrpMembId() ) + "\""
			+ "/>";
		return( ret );
	}
}
