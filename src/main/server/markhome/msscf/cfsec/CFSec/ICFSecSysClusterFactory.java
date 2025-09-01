
// Description: Java 11 Factory interface for SysCluster.

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
 *	CFSecSysClusterFactory interface for SysCluster
 */
public interface ICFSecSysClusterFactory
{

	/**
	 *	Allocate a primary key for SysCluster instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSysClusterPKey newPKey();

	/**
	 *	Allocate a primary history key for SysCluster instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSysClusterHPKey newHPKey();

	/**
	 *	Allocate a ClusterIdx key over SysCluster instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSysClusterByClusterIdxKey newClusterIdxKey();

	/**
	 *	Allocate a SysCluster instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecSysClusterBuff newBuff();

	/**
	 *	Allocate a SysCluster history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecSysClusterHBuff newHBuff();

}
