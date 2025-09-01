
// Description: Java 11 Factory interface for SecUser.

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
 *	CFSecSecUserFactory interface for SecUser
 */
public interface ICFSecSecUserFactory
{

	/**
	 *	Allocate a primary key for SecUser instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecUserPKey newPKey();

	/**
	 *	Allocate a primary history key for SecUser instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecUserHPKey newHPKey();

	/**
	 *	Allocate a ULoginIdx key over SecUser instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecUserByULoginIdxKey newULoginIdxKey();

	/**
	 *	Allocate a EMConfIdx key over SecUser instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecUserByEMConfIdxKey newEMConfIdxKey();

	/**
	 *	Allocate a PwdResetIdx key over SecUser instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecUserByPwdResetIdxKey newPwdResetIdxKey();

	/**
	 *	Allocate a DefDevIdx key over SecUser instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecUserByDefDevIdxKey newDefDevIdxKey();

	/**
	 *	Allocate a SecUser instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecUserBuff newBuff();

	/**
	 *	Allocate a SecUser history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecUserHBuff newHBuff();

}
