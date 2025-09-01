
// Description: Java 11 DbIO interface for ISOCcy.

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
import server.markhome.msscf.cfsec.CFSecObj.*;

/*
 *	CFSecISOCcyTable database interface for ISOCcy
 */
public interface ICFSecISOCcyTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createISOCcy( CFSecAuthorization Authorization,
		CFSecISOCcyBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateISOCcy( CFSecAuthorization Authorization,
		CFSecISOCcyBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteISOCcy( CFSecAuthorization Authorization,
		CFSecISOCcyBuff Buff );
	/**
	 *	Delete the ISOCcy instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISOCcyId	The ISOCcy key attribute of the instance generating the id.
	 */
	void deleteISOCcyByIdIdx( CFSecAuthorization Authorization,
		short argISOCcyId );

	/**
	 *	Delete the ISOCcy instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteISOCcyByIdIdx( CFSecAuthorization Authorization,
		CFSecISOCcyPKey argKey );
	/**
	 *	Delete the ISOCcy instances identified by the key CcyCdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISOCode	The ISOCcy key attribute of the instance generating the id.
	 */
	void deleteISOCcyByCcyCdIdx( CFSecAuthorization Authorization,
		String argISOCode );

	/**
	 *	Delete the ISOCcy instances identified by the key CcyCdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteISOCcyByCcyCdIdx( CFSecAuthorization Authorization,
		CFSecISOCcyByCcyCdIdxKey argKey );
	/**
	 *	Delete the ISOCcy instances identified by the key CcyNmIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argName	The ISOCcy key attribute of the instance generating the id.
	 */
	void deleteISOCcyByCcyNmIdx( CFSecAuthorization Authorization,
		String argName );

	/**
	 *	Delete the ISOCcy instances identified by the key CcyNmIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteISOCcyByCcyNmIdx( CFSecAuthorization Authorization,
		CFSecISOCcyByCcyNmIdxKey argKey );


	/**
	 *	Read the derived ISOCcy buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCcy instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	CFSecISOCcyBuff readDerived( CFSecAuthorization Authorization,
		CFSecISOCcyPKey PKey );

	/**
	 *	Lock the derived ISOCcy buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCcy instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	CFSecISOCcyBuff lockDerived( CFSecAuthorization Authorization,
		CFSecISOCcyPKey PKey );

	/**
	 *	Read all ISOCcy instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	CFSecISOCcyBuff[] readAllDerived( CFSecAuthorization Authorization );

	/**
	 *	Read the derived ISOCcy buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISOCcyId	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	CFSecISOCcyBuff readDerivedByIdIdx( CFSecAuthorization Authorization,
		short ISOCcyId );

	/**
	 *	Read the derived ISOCcy buffer instance identified by the unique key CcyCdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISOCode	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	CFSecISOCcyBuff readDerivedByCcyCdIdx( CFSecAuthorization Authorization,
		String ISOCode );

	/**
	 *	Read the derived ISOCcy buffer instance identified by the unique key CcyNmIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argName	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	CFSecISOCcyBuff readDerivedByCcyNmIdx( CFSecAuthorization Authorization,
		String Name );

	/**
	 *	Read the specific ISOCcy buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCcy instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFSecISOCcyBuff readBuff( CFSecAuthorization Authorization,
		CFSecISOCcyPKey PKey );

	/**
	 *	Lock the specific ISOCcy buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCcy instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFSecISOCcyBuff lockBuff( CFSecAuthorization Authorization,
		CFSecISOCcyPKey PKey );

	/**
	 *	Read all the specific ISOCcy buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific ISOCcy instances in the database accessible for the Authorization.
	 */
	CFSecISOCcyBuff[] readAllBuff( CFSecAuthorization Authorization );

	/**
	 *	Read the specific ISOCcy buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISOCcyId	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFSecISOCcyBuff readBuffByIdIdx( CFSecAuthorization Authorization,
		short ISOCcyId );

	/**
	 *	Read the specific ISOCcy buffer instance identified by the unique key CcyCdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISOCode	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFSecISOCcyBuff readBuffByCcyCdIdx( CFSecAuthorization Authorization,
		String ISOCode );

	/**
	 *	Read the specific ISOCcy buffer instance identified by the unique key CcyNmIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argName	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFSecISOCcyBuff readBuffByCcyNmIdx( CFSecAuthorization Authorization,
		String Name );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
