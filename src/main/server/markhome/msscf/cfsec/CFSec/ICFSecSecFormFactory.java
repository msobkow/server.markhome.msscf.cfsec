
// Description: Java 11 Factory interface for SecForm.

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
 *	CFSecSecFormFactory interface for SecForm
 */
public interface ICFSecSecFormFactory
{

	/**
	 *	Allocate a primary key for SecForm instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecFormPKey newPKey();

	/**
	 *	Allocate a primary history key for SecForm instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecFormHPKey newHPKey();

	/**
	 *	Allocate a ClusterIdx key over SecForm instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecFormByClusterIdxKey newClusterIdxKey();

	/**
	 *	Allocate a SecAppIdx key over SecForm instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecFormBySecAppIdxKey newSecAppIdxKey();

	/**
	 *	Allocate a UJEEServletIdx key over SecForm instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecFormByUJEEServletIdxKey newUJEEServletIdxKey();

	/**
	 *	Allocate a SecForm instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecFormBuff newBuff();

	/**
	 *	Allocate a SecForm history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecFormHBuff newHBuff();

}
