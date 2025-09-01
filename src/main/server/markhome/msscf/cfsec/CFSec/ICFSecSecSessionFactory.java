
// Description: Java 11 Factory interface for SecSession.

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
 *	CFSecSecSessionFactory interface for SecSession
 */
public interface ICFSecSecSessionFactory
{

	/**
	 *	Allocate a primary key for SecSession instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecSessionPKey newPKey();

	/**
	 *	Allocate a primary history key for SecSession instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecSessionHPKey newHPKey();

	/**
	 *	Allocate a SecUserIdx key over SecSession instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecSessionBySecUserIdxKey newSecUserIdxKey();

	/**
	 *	Allocate a SecDevIdx key over SecSession instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecSessionBySecDevIdxKey newSecDevIdxKey();

	/**
	 *	Allocate a StartIdx key over SecSession instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecSessionByStartIdxKey newStartIdxKey();

	/**
	 *	Allocate a FinishIdx key over SecSession instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecSessionByFinishIdxKey newFinishIdxKey();

	/**
	 *	Allocate a SecProxyIdx key over SecSession instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecSessionBySecProxyIdxKey newSecProxyIdxKey();

	/**
	 *	Allocate a SecSession instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecSessionBuff newBuff();

	/**
	 *	Allocate a SecSession history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecSessionHBuff newHBuff();

}
