// Description: Java 11 implementation of a SecSession by SecProxyIdx index key object.

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

public class CFSecSecSessionBySecProxyIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected UUID optionalSecProxyId;
	public CFSecSecSessionBySecProxyIdxKey() {
		optionalSecProxyId = null;
	}

	public UUID getOptionalSecProxyId() {
		return( optionalSecProxyId );
	}

	public void setOptionalSecProxyId( UUID value ) {
		if( value == null ) {
			optionalSecProxyId = null;
		}
		else {
			optionalSecProxyId = value;
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFSecSecSessionBySecProxyIdxKey ) {
			CFSecSecSessionBySecProxyIdxKey rhs = (CFSecSecSessionBySecProxyIdxKey)obj;
			if( getOptionalSecProxyId() != null ) {
				if( rhs.getOptionalSecProxyId() != null ) {
					if( ! getOptionalSecProxyId().equals( rhs.getOptionalSecProxyId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalSecProxyId() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof CFSecSecSessionBuff ) {
			CFSecSecSessionBuff rhs = (CFSecSecSessionBuff)obj;
			if( getOptionalSecProxyId() != null ) {
				if( rhs.getOptionalSecProxyId() != null ) {
					if( ! getOptionalSecProxyId().equals( rhs.getOptionalSecProxyId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalSecProxyId() != null ) {
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
		if( getOptionalSecProxyId() != null ) {
			hashCode = hashCode + getOptionalSecProxyId().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFSecSecSessionBySecProxyIdxKey ) {
			CFSecSecSessionBySecProxyIdxKey rhs = (CFSecSecSessionBySecProxyIdxKey)obj;
			if( getOptionalSecProxyId() != null ) {
				if( rhs.getOptionalSecProxyId() != null ) {
					int cmp = getOptionalSecProxyId().compareTo( rhs.getOptionalSecProxyId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalSecProxyId() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof CFSecSecSessionBuff ) {
			CFSecSecSessionBuff rhs = (CFSecSecSessionBuff)obj;
			if( getOptionalSecProxyId() != null ) {
				if( rhs.getOptionalSecProxyId() != null ) {
					int cmp = getOptionalSecProxyId().compareTo( rhs.getOptionalSecProxyId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalSecProxyId() != null ) {
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
		String ret = "<CFSecSecSessionBySecProxyIdx"
			+ " OptionalSecProxyId=" + ( ( getOptionalSecProxyId() == null ) ? "null" : "\"" + getOptionalSecProxyId().toString() + "\"" )
			+ "/>";
		return( ret );
	}
}
