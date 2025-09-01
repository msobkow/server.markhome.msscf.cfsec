
// Description: Java 11 Factory interface for TSecGroup.

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
 *	CFSecTSecGroupFactory interface for TSecGroup
 */
public interface ICFSecTSecGroupFactory
{

	/**
	 *	Allocate a primary key for TSecGroup instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecTSecGroupPKey newPKey();

	/**
	 *	Allocate a primary history key for TSecGroup instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecTSecGroupHPKey newHPKey();

	/**
	 *	Allocate a TenantIdx key over TSecGroup instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecTSecGroupByTenantIdxKey newTenantIdxKey();

	/**
	 *	Allocate a TenantVisIdx key over TSecGroup instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecTSecGroupByTenantVisIdxKey newTenantVisIdxKey();

	/**
	 *	Allocate a UNameIdx key over TSecGroup instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecTSecGroupByUNameIdxKey newUNameIdxKey();

	/**
	 *	Allocate a TSecGroup instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecTSecGroupBuff newBuff();

	/**
	 *	Allocate a TSecGroup history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecTSecGroupHBuff newHBuff();

}
