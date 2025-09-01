// Description: Java 11 implementation of a SecUser by DefDevIdx index key object.

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

public class CFSecSecUserByDefDevIdxKey
	implements Comparable<Object>,
		Serializable
{
	protected UUID optionalDfltDevUserId;
	protected String optionalDfltDevName;
	public CFSecSecUserByDefDevIdxKey() {
		optionalDfltDevUserId = null;
		optionalDfltDevName = null;
	}

	public UUID getOptionalDfltDevUserId() {
		return( optionalDfltDevUserId );
	}

	public void setOptionalDfltDevUserId( UUID value ) {
		if( value == null ) {
			optionalDfltDevUserId = null;
		}
		else {
			optionalDfltDevUserId = value;
		}
	}

	public String getOptionalDfltDevName() {
		return( optionalDfltDevName );
	}

	public void setOptionalDfltDevName( String value ) {
		if( value == null ) {
			optionalDfltDevName = null;
		}
		else if( value.length() > 127 ) {
			throw new CFLibArgumentOverflowException( getClass(),
				"setOptionalDfltDevName",
				1,
				"value.length()",
				value.length(),
				127 );
		}
		else {
			optionalDfltDevName = value;
		}
	}

	public boolean equals( Object obj ) {
		if( obj == null ) {
			return( false );
		}
		else if( obj instanceof CFSecSecUserByDefDevIdxKey ) {
			CFSecSecUserByDefDevIdxKey rhs = (CFSecSecUserByDefDevIdxKey)obj;
			if( getOptionalDfltDevUserId() != null ) {
				if( rhs.getOptionalDfltDevUserId() != null ) {
					if( ! getOptionalDfltDevUserId().equals( rhs.getOptionalDfltDevUserId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalDfltDevUserId() != null ) {
					return( false );
				}
			}
			if( getOptionalDfltDevName() != null ) {
				if( rhs.getOptionalDfltDevName() != null ) {
					if( ! getOptionalDfltDevName().equals( rhs.getOptionalDfltDevName() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalDfltDevName() != null ) {
					return( false );
				}
			}
			return( true );
		}
		else if( obj instanceof CFSecSecUserBuff ) {
			CFSecSecUserBuff rhs = (CFSecSecUserBuff)obj;
			if( getOptionalDfltDevUserId() != null ) {
				if( rhs.getOptionalDfltDevUserId() != null ) {
					if( ! getOptionalDfltDevUserId().equals( rhs.getOptionalDfltDevUserId() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalDfltDevUserId() != null ) {
					return( false );
				}
			}
			if( getOptionalDfltDevName() != null ) {
				if( rhs.getOptionalDfltDevName() != null ) {
					if( ! getOptionalDfltDevName().equals( rhs.getOptionalDfltDevName() ) ) {
						return( false );
					}
				}
			}
			else {
				if( rhs.getOptionalDfltDevName() != null ) {
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
		if( getOptionalDfltDevUserId() != null ) {
			hashCode = hashCode + getOptionalDfltDevUserId().hashCode();
		}
		if( getOptionalDfltDevName() != null ) {
			hashCode = hashCode + getOptionalDfltDevName().hashCode();
		}
		return( hashCode & 0x7fffffff );
	}

	public int compareTo( Object obj ) {
		if( obj == null ) {
			return( 1 );
		}
		else if( obj instanceof CFSecSecUserByDefDevIdxKey ) {
			CFSecSecUserByDefDevIdxKey rhs = (CFSecSecUserByDefDevIdxKey)obj;
			if( getOptionalDfltDevUserId() != null ) {
				if( rhs.getOptionalDfltDevUserId() != null ) {
					int cmp = getOptionalDfltDevUserId().compareTo( rhs.getOptionalDfltDevUserId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDfltDevUserId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalDfltDevName() != null ) {
				if( rhs.getOptionalDfltDevName() != null ) {
					int cmp = getOptionalDfltDevName().compareTo( rhs.getOptionalDfltDevName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDfltDevName() != null ) {
					return( -1 );
				}
			}
			return( 0 );
		}
		else if( obj instanceof CFSecSecUserBuff ) {
			CFSecSecUserBuff rhs = (CFSecSecUserBuff)obj;
			if( getOptionalDfltDevUserId() != null ) {
				if( rhs.getOptionalDfltDevUserId() != null ) {
					int cmp = getOptionalDfltDevUserId().compareTo( rhs.getOptionalDfltDevUserId() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDfltDevUserId() != null ) {
					return( -1 );
				}
			}
			if( getOptionalDfltDevName() != null ) {
				if( rhs.getOptionalDfltDevName() != null ) {
					int cmp = getOptionalDfltDevName().compareTo( rhs.getOptionalDfltDevName() );
					if( cmp != 0 ) {
						return( cmp );
					}
				}
				else {
					return( 1 );
				}
			}
			else {
				if( rhs.getOptionalDfltDevName() != null ) {
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
		String ret = "<CFSecSecUserByDefDevIdx"
			+ " OptionalDfltDevUserId=" + ( ( getOptionalDfltDevUserId() == null ) ? "null" : "\"" + getOptionalDfltDevUserId().toString() + "\"" )
			+ " OptionalDfltDevName=" + ( ( getOptionalDfltDevName() == null ) ? "null" : "\"" + CFSecSchema.xmlEncodeString( getOptionalDfltDevName() ) + "\"" )
			+ "/>";
		return( ret );
	}
}
