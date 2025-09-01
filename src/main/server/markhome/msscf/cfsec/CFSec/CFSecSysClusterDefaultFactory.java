
// Description: Java 11 Default Factory implementation for SysCluster.

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
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;

	/*
	 *	CFSecSysClusterFactory implementation for SysCluster
	 */
public class CFSecSysClusterDefaultFactory
	implements ICFSecSysClusterFactory
{
	public CFSecSysClusterDefaultFactory() {
	}

	public CFSecSysClusterPKey newPKey() {
		CFSecSysClusterPKey pkey =
			new CFSecSysClusterPKey();
		return( pkey );
	}

	public CFSecSysClusterHPKey newHPKey() {
		CFSecSysClusterHPKey hpkey =
			new CFSecSysClusterHPKey();
		return( hpkey );
	}

	public CFSecSysClusterByClusterIdxKey newClusterIdxKey() {
		CFSecSysClusterByClusterIdxKey key =
			new CFSecSysClusterByClusterIdxKey();
		return( key );
	}

	public CFSecSysClusterBuff newBuff() {
		CFSecSysClusterBuff buff =
			new CFSecSysClusterBuff();
		return( buff );
	}

	public CFSecSysClusterHBuff newHBuff() {
		CFSecSysClusterHBuff hbuff =
			new CFSecSysClusterHBuff();
		return( hbuff );
	}
}
