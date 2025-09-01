// Description: Java 11 implementation of a SecUser by PwdResetIdx index key object.

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

public class CFSecSecUserByPwdResetIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected UUID optionalPasswordResetUuid;
	public CFSecSecUserByPwdResetIdxKey() {
		optionalPasswordResetUuid = null;
	}

	public UUID getOptionalPasswordResetUuid() {
		return( optionalPasswordResetUuid );
	}

	public void setOptionalPasswordResetUuid( UUID value ) {
		if( value == null ) {
			optionalPasswordResetUuid = null;
		}
		else {
			optionalPasswordResetUuid = value;
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFSecSecUserByPwdResetIdxKey ) {
			CFSecSecUserByPwdResetIdxKey rhs = (CFSecSecUserByPwdResetIdxKey)obj;
			if( getOptionalPasswordResetUuid() != null ) {
				if( rhs.getOptionalPasswordResetUuid() != null ) {
					if( ! getOptionalPasswordResetUuid().equals( rhs.getOptionalPasswordResetUuid() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalPasswordResetUuid() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof CFSecSecUserBuff ) {
			CFSecSecUserBuff rhs = (CFSecSecUserBuff)obj;
			if( getOptionalPasswordResetUuid() != null ) {
				if( rhs.getOptionalPasswordResetUuid() != null ) {
					if( ! getOptionalPasswordResetUuid().equals( rhs.getOptionalPasswordResetUuid() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalPasswordResetUuid() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else {
			return( false );
		}
	}

	public int hashCode() {
		int hashCode = 0;
		if( getOptionalPasswordResetUuid() != null ) {
			hashCode = hashCode + getOptionalPasswordResetUuid().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFSecSecUserByPwdResetIdxKey ) {
			CFSecSecUserByPwdResetIdxKey rhs = (CFSecSecUserByPwdResetIdxKey)obj;
			if( getOptionalPasswordResetUuid() != null ) {
				if( rhs.getOptionalPasswordResetUuid() != null ) {
					int cmp = getOptionalPasswordResetUuid().compareTo( rhs.getOptionalPasswordResetUuid() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalPasswordResetUuid() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof CFSecSecUserBuff ) {
			CFSecSecUserBuff rhs = (CFSecSecUserBuff)obj;
			if( getOptionalPasswordResetUuid() != null ) {
				if( rhs.getOptionalPasswordResetUuid() != null ) {
					int cmp = getOptionalPasswordResetUuid().compareTo( rhs.getOptionalPasswordResetUuid() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalPasswordResetUuid() != null ) {
					return( -1 );
				}
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
		String ret = "<CFSecSecUserByPwdResetIdx"
			+ " OptionalPasswordResetUuid=" + ( ( getOptionalPasswordResetUuid() == null ) ? "null" : "\"" + getOptionalPasswordResetUuid().toString() + "\"" )
			+ "/>";
		return( ret );
	}
}
