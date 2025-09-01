// Description: Java 11 implementation of a SecGrpInc primary key object.

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
 *	CFSecSecGrpIncPKey Primary Key for SecGrpInc

 *		requiredClusterId	Required object attribute ClusterId.
 *		requiredSecGrpIncId	Required object attribute SecGrpIncId. */
public class CFSecSecGrpIncPKey
	implements Comparable<Object>,
		Serializable
{

	protected long requiredClusterId;
	protected long requiredSecGrpIncId;
	public CFSecSecGrpIncPKey() {
		requiredClusterId = CFSecSecGrpIncBuff.CLUSTERID_INIT_VALUE;
		requiredSecGrpIncId = CFSecSecGrpIncBuff.SECGRPINCID_INIT_VALUE;
	}

	public long getRequiredClusterId() {
		return( requiredClusterId );
	}

	public void setRequiredClusterId( long value ) {
		if( value < CFSecSecGrpIncBuff.CLUSTERID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredClusterId",
				1,
				"value",
				value,
				CFSecSecGrpIncBuff.CLUSTERID_MIN_VALUE );
		}
		requiredClusterId = value;
	}

	public long getRequiredSecGrpIncId() {
		return( requiredSecGrpIncId );
	}

	public void setRequiredSecGrpIncId( long value ) {
		if( value < CFSecSecGrpIncBuff.SECGRPINCID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredSecGrpIncId",
				1,
				"value",
				value,
				CFSecSecGrpIncBuff.SECGRPINCID_MIN_VALUE );
		}
		requiredSecGrpIncId = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFSecSecGrpIncHPKey ) {
			CFSecSecGrpIncHPKey rhs = (CFSecSecGrpIncHPKey)obj;
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			if( getRequiredSecGrpIncId() != rhs.getRequiredSecGrpIncId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFSecSecGrpIncPKey ) {
			CFSecSecGrpIncPKey rhs = (CFSecSecGrpIncPKey)obj;
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			if( getRequiredSecGrpIncId() != rhs.getRequiredSecGrpIncId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFSecSecGrpIncHBuff ) {
			CFSecSecGrpIncHBuff rhs = (CFSecSecGrpIncHBuff)obj;
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			if( getRequiredSecGrpIncId() != rhs.getRequiredSecGrpIncId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFSecSecGrpIncBuff ) {
			CFSecSecGrpIncBuff rhs = (CFSecSecGrpIncBuff)obj;
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			if( getRequiredSecGrpIncId() != rhs.getRequiredSecGrpIncId() ) {
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
		hashCode = hashCode + (int)( getRequiredSecGrpIncId() );
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof CFSecSecGrpIncHPKey ) {
			CFSecSecGrpIncHPKey rhs = (CFSecSecGrpIncHPKey)obj;
			if( getRequiredClusterId() < rhs.getRequiredClusterId() ) {
				return( -1 );
			}
			else if( getRequiredClusterId() > rhs.getRequiredClusterId() ) {
				return( 1 );
			}
			if( getRequiredSecGrpIncId() < rhs.getRequiredSecGrpIncId() ) {
				return( -1 );
			}
			else if( getRequiredSecGrpIncId() > rhs.getRequiredSecGrpIncId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFSecSecGrpIncPKey ) {
			CFSecSecGrpIncPKey rhs = (CFSecSecGrpIncPKey)obj;
			if( getRequiredClusterId() < rhs.getRequiredClusterId() ) {
				return( -1 );
			}
			else if( getRequiredClusterId() > rhs.getRequiredClusterId() ) {
				return( 1 );
			}
			if( getRequiredSecGrpIncId() < rhs.getRequiredSecGrpIncId() ) {
				return( -1 );
			}
			else if( getRequiredSecGrpIncId() > rhs.getRequiredSecGrpIncId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFSecSecGrpIncBuff ) {
			CFSecSecGrpIncBuff rhs = (CFSecSecGrpIncBuff)obj;
			if( getRequiredClusterId() < rhs.getRequiredClusterId() ) {
				return( -1 );
			}
			else if( getRequiredClusterId() > rhs.getRequiredClusterId() ) {
				return( 1 );
			}
			if( getRequiredSecGrpIncId() < rhs.getRequiredSecGrpIncId() ) {
				return( -1 );
			}
			else if( getRequiredSecGrpIncId() > rhs.getRequiredSecGrpIncId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFSecSecGrpIncHBuff ) {
			CFSecSecGrpIncHBuff rhs = (CFSecSecGrpIncHBuff)obj;
			if( getRequiredClusterId() < rhs.getRequiredClusterId() ) {
				return( -1 );
			}
			else if( getRequiredClusterId() > rhs.getRequiredClusterId() ) {
				return( 1 );
			}
			if( getRequiredSecGrpIncId() < rhs.getRequiredSecGrpIncId() ) {
				return( -1 );
			}
			else if( getRequiredSecGrpIncId() > rhs.getRequiredSecGrpIncId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				"CFSecSecGrpIncPKey, CFSecSecGrpIncBuff" );
		}
	}

	public String toString() {
		String ret = "<CFSecSecGrpIncPKey"
			+ " RequiredClusterId=" + "\"" + Long.toString( getRequiredClusterId() ) + "\""
			+ " RequiredSecGrpIncId=" + "\"" + Long.toString( getRequiredSecGrpIncId() ) + "\""
			+ "/>";
		return( ret );
	}
}
