
// Description: Java 11 Factory interface for HostNode.

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
 *	CFSecHostNodeFactory interface for HostNode
 */
public interface ICFSecHostNodeFactory
{

	/**
	 *	Allocate a primary key for HostNode instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecHostNodePKey newPKey();

	/**
	 *	Allocate a primary history key for HostNode instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecHostNodeHPKey newHPKey();

	/**
	 *	Allocate a ClusterIdx key over HostNode instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecHostNodeByClusterIdxKey newClusterIdxKey();

	/**
	 *	Allocate a UDescrIdx key over HostNode instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecHostNodeByUDescrIdxKey newUDescrIdxKey();

	/**
	 *	Allocate a HostNameIdx key over HostNode instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecHostNodeByHostNameIdxKey newHostNameIdxKey();

	/**
	 *	Allocate a HostNode instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecHostNodeBuff newBuff();

	/**
	 *	Allocate a HostNode history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecHostNodeHBuff newHBuff();

}
