// Description: Java 11 implementation of a SecGrpInc by IncludeIdx index key object.

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

public class CFSecSecGrpIncByIncludeIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected long requiredClusterId;
	protected int requiredIncludeGroupId;
	public CFSecSecGrpIncByIncludeIdxKey() {
		requiredClusterId = CFSecSecGrpIncBuff.CLUSTERID_INIT_VALUE;
		requiredIncludeGroupId = CFSecSecGrpIncBuff.INCLUDEGROUPID_INIT_VALUE;
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

	public int getRequiredIncludeGroupId() {
		return( requiredIncludeGroupId );
	}

	public void setRequiredIncludeGroupId( int value ) {
		if( value < CFSecSecGrpIncBuff.INCLUDEGROUPID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredIncludeGroupId",
				1,
				"value",
				value,
				CFSecSecGrpIncBuff.INCLUDEGROUPID_MIN_VALUE );
		}
		requiredIncludeGroupId = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFSecSecGrpIncByIncludeIdxKey ) {
			CFSecSecGrpIncByIncludeIdxKey rhs = (CFSecSecGrpIncByIncludeIdxKey)obj;
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			if( getRequiredIncludeGroupId() != rhs.getRequiredIncludeGroupId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFSecSecGrpIncBuff ) {
			CFSecSecGrpIncBuff rhs = (CFSecSecGrpIncBuff)obj;
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			if( getRequiredIncludeGroupId() != rhs.getRequiredIncludeGroupId() ) {
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
		hashCode = hashCode + getRequiredIncludeGroupId();
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFSecSecGrpIncByIncludeIdxKey ) {
			CFSecSecGrpIncByIncludeIdxKey rhs = (CFSecSecGrpIncByIncludeIdxKey)obj;
			if( getRequiredClusterId() < rhs.getRequiredClusterId() ) {
				return( -1 );
			}
			else if( getRequiredClusterId() > rhs.getRequiredClusterId() ) {
				return( 1 );
			}
			if( getRequiredIncludeGroupId() < rhs.getRequiredIncludeGroupId() ) {
				return( -1 );
			}
			else if( getRequiredIncludeGroupId() > rhs.getRequiredIncludeGroupId() ) {
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
			if( getRequiredIncludeGroupId() < rhs.getRequiredIncludeGroupId() ) {
				return( -1 );
			}
			else if( getRequiredIncludeGroupId() > rhs.getRequiredIncludeGroupId() ) {
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
		String ret = "<CFSecSecGrpIncByIncludeIdx"
			+ " RequiredClusterId=" + "\"" + Long.toString( getRequiredClusterId() ) + "\""
			+ " RequiredIncludeGroupId=" + "\"" + Integer.toString( getRequiredIncludeGroupId() ) + "\""
			+ "/>";
		return( ret );
	}
}
