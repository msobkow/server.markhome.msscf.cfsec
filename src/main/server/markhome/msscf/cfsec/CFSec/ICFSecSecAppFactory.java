
// Description: Java 11 Factory interface for SecApp.

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
 *	CFSecSecAppFactory interface for SecApp
 */
public interface ICFSecSecAppFactory
{

	/**
	 *	Allocate a primary key for SecApp instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecAppPKey newPKey();

	/**
	 *	Allocate a primary history key for SecApp instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecAppHPKey newHPKey();

	/**
	 *	Allocate a ClusterIdx key over SecApp instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecAppByClusterIdxKey newClusterIdxKey();

	/**
	 *	Allocate a UJEEMountIdx key over SecApp instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecAppByUJEEMountIdxKey newUJEEMountIdxKey();

	/**
	 *	Allocate a SecApp instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecAppBuff newBuff();

	/**
	 *	Allocate a SecApp history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecAppHBuff newHBuff();

}
