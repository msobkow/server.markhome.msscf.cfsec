
// Description: Java 11 Factory interface for SecGroup.

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
 *	CFSecSecGroupFactory interface for SecGroup
 */
public interface ICFSecSecGroupFactory
{

	/**
	 *	Allocate a primary key for SecGroup instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecGroupPKey newPKey();

	/**
	 *	Allocate a primary history key for SecGroup instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecGroupHPKey newHPKey();

	/**
	 *	Allocate a ClusterIdx key over SecGroup instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecGroupByClusterIdxKey newClusterIdxKey();

	/**
	 *	Allocate a ClusterVisIdx key over SecGroup instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecGroupByClusterVisIdxKey newClusterVisIdxKey();

	/**
	 *	Allocate a UNameIdx key over SecGroup instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecGroupByUNameIdxKey newUNameIdxKey();

	/**
	 *	Allocate a SecGroup instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecGroupBuff newBuff();

	/**
	 *	Allocate a SecGroup history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecGroupHBuff newHBuff();

}
