// Description: Java 11 implementation of a SysCluster buffer object.

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

public class CFSecSysClusterBuff
{
	public final static String CLASS_CODE = "a014";
	public static final int SINGLETONID_INIT_VALUE = 1;
	public static final long CLUSTERID_INIT_VALUE = 0L;
	public static final int SINGLETONID_MIN_VALUE = 1;
	public static final long CLUSTERID_MIN_VALUE = 0L;
	public static final int SINGLETONID_MAX_VALUE = 1;
	protected int requiredSingletonId;
	protected long requiredClusterId;
	protected int requiredRevision;
	public CFSecSysClusterBuff() {
		requiredSingletonId = CFSecSysClusterBuff.SINGLETONID_INIT_VALUE;
		requiredClusterId = CFSecSysClusterBuff.CLUSTERID_INIT_VALUE;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public int getRequiredSingletonId() {
		return( requiredSingletonId );
	}

	public void setRequiredSingletonId( int value ) {
		if( value < CFSecSysClusterBuff.SINGLETONID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredSingletonId",
				1,
				"value",
				value,
				CFSecSysClusterBuff.SINGLETONID_MIN_VALUE );
		}
		if( value > CFSecSysClusterBuff.SINGLETONID_MAX_VALUE ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setRequiredSingletonId",
				1,
				"value",
				value,
				CFSecSysClusterBuff.SINGLETONID_MAX_VALUE );
		}
		requiredSingletonId = value;
	}

	public long getRequiredClusterId() {
		return( requiredClusterId );
	}

	public void setRequiredClusterId( long value ) {
		if( value < CFSecSysClusterBuff.CLUSTERID_MIN_VALUE ) {
			throw new CFLibArgumentUnderflowException( getClass(),
				"setRequiredClusterId",
				1,
				"value",
				value,
				CFSecSysClusterBuff.CLUSTERID_MIN_VALUE );
		}
		requiredClusterId = value;
	}

	public int getRequiredRevision() {
		return( requiredRevision );
	}

	public void setRequiredRevision( int value ) {
		requiredRevision = value;
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFSecSysClusterBuff ) {
			CFSecSysClusterBuff rhs = (CFSecSysClusterBuff)obj;
			if( getRequiredSingletonId() != rhs.getRequiredSingletonId() ) {
				return( false );
			}
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFSecSysClusterPKey ) {
			CFSecSysClusterPKey rhs = (CFSecSysClusterPKey)obj;
			if( getRequiredSingletonId() != rhs.getRequiredSingletonId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFSecSysClusterHBuff ) {
			CFSecSysClusterHBuff rhs = (CFSecSysClusterHBuff)obj;
			if( getRequiredSingletonId() != rhs.getRequiredSingletonId() ) {
				return( false );
			}
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFSecSysClusterHPKey ) {
			CFSecSysClusterHPKey rhs = (CFSecSysClusterHPKey)obj;
			if( getRequiredSingletonId() != rhs.getRequiredSingletonId() ) {
				return( false );
			}
			return( true );
		}
		else if( obj instanceof CFSecSysClusterByClusterIdxKey ) {
			CFSecSysClusterByClusterIdxKey rhs = (CFSecSysClusterByClusterIdxKey)obj;
			if( getRequiredClusterId() != rhs.getRequiredClusterId() ) {
				return( false );
			}
			return( true );
		}
		else {
			boolean retval = super.equals( obj );
			return( retval );
		}
	}

	public int hashCode() {
		int hashCode = 0;
		hashCode = hashCode + getRequiredSingletonId();
		hashCode = hashCode + (int)( getRequiredClusterId() );
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( -1 );
		}
		else if( obj instanceof CFSecSysClusterBuff ) {
			CFSecSysClusterBuff rhs = (CFSecSysClusterBuff)obj;
			int retval = 0;
			if( getRequiredSingletonId() < rhs.getRequiredSingletonId() ) {
				return( -1 );
			}
			else if( getRequiredSingletonId() > rhs.getRequiredSingletonId() ) {
				return( 1 );
			}
			if( getRequiredClusterId() < rhs.getRequiredClusterId() ) {
				return( -1 );
			}
			else if( getRequiredClusterId() > rhs.getRequiredClusterId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFSecSysClusterPKey ) {
			CFSecSysClusterPKey rhs = (CFSecSysClusterPKey)obj;
			if( getRequiredSingletonId() < rhs.getRequiredSingletonId() ) {
				return( -1 );
			}
			else if( getRequiredSingletonId() > rhs.getRequiredSingletonId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFSecSysClusterHPKey ) {
			CFSecSysClusterHPKey rhs = (CFSecSysClusterHPKey)obj;
			{
				int lhsRequiredRevision = getRequiredRevision();
				int rhsRequiredRevision = rhs.getRequiredRevision();
				if( lhsRequiredRevision < rhsRequiredRevision ) {
					return( -1 );
				}
				else if( lhsRequiredRevision > rhsRequiredRevision ) {
					return( 1 );
				}
			}
			if( getRequiredSingletonId() < rhs.getRequiredSingletonId() ) {
				return( -1 );
			}
			else if( getRequiredSingletonId() > rhs.getRequiredSingletonId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFSecSysClusterHBuff ) {
			CFSecSysClusterHBuff rhs = (CFSecSysClusterHBuff)obj;
			int retval = 0;
			if( getRequiredSingletonId() < rhs.getRequiredSingletonId() ) {
				return( -1 );
			}
			else if( getRequiredSingletonId() > rhs.getRequiredSingletonId() ) {
				return( 1 );
			}
			if( getRequiredClusterId() < rhs.getRequiredClusterId() ) {
				return( -1 );
			}
			else if( getRequiredClusterId() > rhs.getRequiredClusterId() ) {
				return( 1 );
			}
			return( 0 );
		}
		else if( obj instanceof CFSecSysClusterByClusterIdxKey ) {
			CFSecSysClusterByClusterIdxKey rhs = (CFSecSysClusterByClusterIdxKey)obj;

			if( getRequiredClusterId() < rhs.getRequiredClusterId() ) {
				return( -1 );
			}
			else if( getRequiredClusterId() > rhs.getRequiredClusterId() ) {
				return( 1 );
			}			return( 0 );
		}
		else {
			throw new CFLibUnsupportedClassException( getClass(),
				"compareTo",
				"obj",
				obj,
				null );
		}
	}

	public void set( CFSecSysClusterBuff src ) {
		setSysClusterBuff( src );
	}

	public void setSysClusterBuff( CFSecSysClusterBuff src ) {
		setRequiredSingletonId( src.getRequiredSingletonId() );
		setRequiredClusterId( src.getRequiredClusterId() );
		setRequiredRevision( src.getRequiredRevision() );
	}

	public void set( CFSecSysClusterHBuff src ) {
		setSysClusterBuff( src );
	}

	public void setSysClusterBuff( CFSecSysClusterHBuff src ) {
		setRequiredSingletonId( src.getRequiredSingletonId() );
		setRequiredClusterId( src.getRequiredClusterId() );
	}
}
