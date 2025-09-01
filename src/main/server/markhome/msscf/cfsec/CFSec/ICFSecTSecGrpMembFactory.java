
// Description: Java 11 Factory interface for TSecGrpMemb.

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
 *	CFSecTSecGrpMembFactory interface for TSecGrpMemb
 */
public interface ICFSecTSecGrpMembFactory
{

	/**
	 *	Allocate a primary key for TSecGrpMemb instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecTSecGrpMembPKey newPKey();

	/**
	 *	Allocate a primary history key for TSecGrpMemb instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecTSecGrpMembHPKey newHPKey();

	/**
	 *	Allocate a TenantIdx key over TSecGrpMemb instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecTSecGrpMembByTenantIdxKey newTenantIdxKey();

	/**
	 *	Allocate a GroupIdx key over TSecGrpMemb instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecTSecGrpMembByGroupIdxKey newGroupIdxKey();

	/**
	 *	Allocate a UserIdx key over TSecGrpMemb instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecTSecGrpMembByUserIdxKey newUserIdxKey();

	/**
	 *	Allocate a UUserIdx key over TSecGrpMemb instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecTSecGrpMembByUUserIdxKey newUUserIdxKey();

	/**
	 *	Allocate a TSecGrpMemb instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecTSecGrpMembBuff newBuff();

	/**
	 *	Allocate a TSecGrpMemb history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecTSecGrpMembHBuff newHBuff();

}
