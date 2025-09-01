
// Description: Java 11 DbIO interface for ISOCtryLang.

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
 *	CFSecISOCtryLangTable database interface for ISOCtryLang
 */
public interface ICFSecISOCtryLangTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createISOCtryLang( CFSecAuthorization Authorization,
		CFSecISOCtryLangBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateISOCtryLang( CFSecAuthorization Authorization,
		CFSecISOCtryLangBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteISOCtryLang( CFSecAuthorization Authorization,
		CFSecISOCtryLangBuff Buff );
	/**
	 *	Delete the ISOCtryLang instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISOCtryId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@param	argISOLangId	The ISOCtryLang key attribute of the instance generating the id.
	 */
	void deleteISOCtryLangByIdIdx( CFSecAuthorization Authorization,
		short argISOCtryId,
		short argISOLangId );

	/**
	 *	Delete the ISOCtryLang instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteISOCtryLangByIdIdx( CFSecAuthorization Authorization,
		CFSecISOCtryLangPKey argKey );
	/**
	 *	Delete the ISOCtryLang instances identified by the key CtryIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISOCtryId	The ISOCtryLang key attribute of the instance generating the id.
	 */
	void deleteISOCtryLangByCtryIdx( CFSecAuthorization Authorization,
		short argISOCtryId );

	/**
	 *	Delete the ISOCtryLang instances identified by the key CtryIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteISOCtryLangByCtryIdx( CFSecAuthorization Authorization,
		CFSecISOCtryLangByCtryIdxKey argKey );
	/**
	 *	Delete the ISOCtryLang instances identified by the key LangIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISOLangId	The ISOCtryLang key attribute of the instance generating the id.
	 */
	void deleteISOCtryLangByLangIdx( CFSecAuthorization Authorization,
		short argISOLangId );

	/**
	 *	Delete the ISOCtryLang instances identified by the key LangIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteISOCtryLangByLangIdx( CFSecAuthorization Authorization,
		CFSecISOCtryLangByLangIdxKey argKey );


	/**
	 *	Read the derived ISOCtryLang buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCtryLang instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	CFSecISOCtryLangBuff readDerived( CFSecAuthorization Authorization,
		CFSecISOCtryLangPKey PKey );

	/**
	 *	Lock the derived ISOCtryLang buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCtryLang instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	CFSecISOCtryLangBuff lockDerived( CFSecAuthorization Authorization,
		CFSecISOCtryLangPKey PKey );

	/**
	 *	Read all ISOCtryLang instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	CFSecISOCtryLangBuff[] readAllDerived( CFSecAuthorization Authorization );

	/**
	 *	Read the derived ISOCtryLang buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISOCtryId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@param	argISOLangId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	CFSecISOCtryLangBuff readDerivedByIdIdx( CFSecAuthorization Authorization,
		short ISOCtryId,
		short ISOLangId );

	/**
	 *	Read an array of the derived ISOCtryLang buffer instances identified by the duplicate key CtryIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISOCtryId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFSecISOCtryLangBuff[] readDerivedByCtryIdx( CFSecAuthorization Authorization,
		short ISOCtryId );

	/**
	 *	Read an array of the derived ISOCtryLang buffer instances identified by the duplicate key LangIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISOLangId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFSecISOCtryLangBuff[] readDerivedByLangIdx( CFSecAuthorization Authorization,
		short ISOLangId );

	/**
	 *	Read the specific ISOCtryLang buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCtryLang instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFSecISOCtryLangBuff readBuff( CFSecAuthorization Authorization,
		CFSecISOCtryLangPKey PKey );

	/**
	 *	Lock the specific ISOCtryLang buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCtryLang instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFSecISOCtryLangBuff lockBuff( CFSecAuthorization Authorization,
		CFSecISOCtryLangPKey PKey );

	/**
	 *	Read all the specific ISOCtryLang buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific ISOCtryLang instances in the database accessible for the Authorization.
	 */
	CFSecISOCtryLangBuff[] readAllBuff( CFSecAuthorization Authorization );

	/**
	 *	Read the specific ISOCtryLang buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISOCtryId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@param	argISOLangId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFSecISOCtryLangBuff readBuffByIdIdx( CFSecAuthorization Authorization,
		short ISOCtryId,
		short ISOLangId );

	/**
	 *	Read an array of the specific ISOCtryLang buffer instances identified by the duplicate key CtryIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISOCtryId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFSecISOCtryLangBuff[] readBuffByCtryIdx( CFSecAuthorization Authorization,
		short ISOCtryId );

	/**
	 *	Read an array of the specific ISOCtryLang buffer instances identified by the duplicate key LangIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISOLangId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFSecISOCtryLangBuff[] readBuffByLangIdx( CFSecAuthorization Authorization,
		short ISOLangId );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
