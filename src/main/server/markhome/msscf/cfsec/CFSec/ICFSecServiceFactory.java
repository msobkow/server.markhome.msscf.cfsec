
// Description: Java 11 Factory interface for Service.

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
 *	CFSecServiceFactory interface for Service
 */
public interface ICFSecServiceFactory
{

	/**
	 *	Allocate a primary key for Service instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecServicePKey newPKey();

	/**
	 *	Allocate a primary history key for Service instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecServiceHPKey newHPKey();

	/**
	 *	Allocate a ClusterIdx key over Service instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecServiceByClusterIdxKey newClusterIdxKey();

	/**
	 *	Allocate a HostIdx key over Service instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecServiceByHostIdxKey newHostIdxKey();

	/**
	 *	Allocate a TypeIdx key over Service instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecServiceByTypeIdxKey newTypeIdxKey();

	/**
	 *	Allocate a UTypeIdx key over Service instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecServiceByUTypeIdxKey newUTypeIdxKey();

	/**
	 *	Allocate a UHostPortIdx key over Service instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecServiceByUHostPortIdxKey newUHostPortIdxKey();

	/**
	 *	Allocate a Service instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecServiceBuff newBuff();

	/**
	 *	Allocate a Service history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecServiceHBuff newHBuff();

}
