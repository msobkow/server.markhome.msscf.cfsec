
// Description: Java 11 Factory interface for Tenant.

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
 *	CFSecTenantFactory interface for Tenant
 */
public interface ICFSecTenantFactory
{

	/**
	 *	Allocate a primary key for Tenant instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecTenantPKey newPKey();

	/**
	 *	Allocate a primary history key for Tenant instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecTenantHPKey newHPKey();

	/**
	 *	Allocate a ClusterIdx key over Tenant instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecTenantByClusterIdxKey newClusterIdxKey();

	/**
	 *	Allocate a UNameIdx key over Tenant instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecTenantByUNameIdxKey newUNameIdxKey();

	/**
	 *	Allocate a Tenant instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecTenantBuff newBuff();

	/**
	 *	Allocate a Tenant history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecTenantHBuff newHBuff();

}
