
// Description: Java 11 Factory interface for SecGrpMemb.

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
 *	CFSecSecGrpMembFactory interface for SecGrpMemb
 */
public interface ICFSecSecGrpMembFactory
{

	/**
	 *	Allocate a primary key for SecGrpMemb instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecGrpMembPKey newPKey();

	/**
	 *	Allocate a primary history key for SecGrpMemb instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecGrpMembHPKey newHPKey();

	/**
	 *	Allocate a ClusterIdx key over SecGrpMemb instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecGrpMembByClusterIdxKey newClusterIdxKey();

	/**
	 *	Allocate a GroupIdx key over SecGrpMemb instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecGrpMembByGroupIdxKey newGroupIdxKey();

	/**
	 *	Allocate a UserIdx key over SecGrpMemb instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecGrpMembByUserIdxKey newUserIdxKey();

	/**
	 *	Allocate a UUserIdx key over SecGrpMemb instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecGrpMembByUUserIdxKey newUUserIdxKey();

	/**
	 *	Allocate a SecGrpMemb instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecGrpMembBuff newBuff();

	/**
	 *	Allocate a SecGrpMemb history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecGrpMembHBuff newHBuff();

}
