
// Description: Java 11 Factory interface for SecGroupForm.

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
 *	CFSecSecGroupFormFactory interface for SecGroupForm
 */
public interface ICFSecSecGroupFormFactory
{

	/**
	 *	Allocate a primary key for SecGroupForm instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecGroupFormPKey newPKey();

	/**
	 *	Allocate a primary history key for SecGroupForm instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecGroupFormHPKey newHPKey();

	/**
	 *	Allocate a ClusterIdx key over SecGroupForm instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecGroupFormByClusterIdxKey newClusterIdxKey();

	/**
	 *	Allocate a GroupIdx key over SecGroupForm instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecGroupFormByGroupIdxKey newGroupIdxKey();

	/**
	 *	Allocate a AppIdx key over SecGroupForm instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecGroupFormByAppIdxKey newAppIdxKey();

	/**
	 *	Allocate a FormIdx key over SecGroupForm instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecGroupFormByFormIdxKey newFormIdxKey();

	/**
	 *	Allocate a UFormIdx key over SecGroupForm instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecGroupFormByUFormIdxKey newUFormIdxKey();

	/**
	 *	Allocate a SecGroupForm instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecGroupFormBuff newBuff();

	/**
	 *	Allocate a SecGroupForm history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecGroupFormHBuff newHBuff();

}
