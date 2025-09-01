
// Description: Java 11 DbIO interface for ISOLang.

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
 *	CFSecISOLangTable database interface for ISOLang
 */
public interface ICFSecISOLangTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createISOLang( CFSecAuthorization Authorization,
		CFSecISOLangBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateISOLang( CFSecAuthorization Authorization,
		CFSecISOLangBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteISOLang( CFSecAuthorization Authorization,
		CFSecISOLangBuff Buff );
	/**
	 *	Delete the ISOLang instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISOLangId	The ISOLang key attribute of the instance generating the id.
	 */
	void deleteISOLangByIdIdx( CFSecAuthorization Authorization,
		short argISOLangId );

	/**
	 *	Delete the ISOLang instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteISOLangByIdIdx( CFSecAuthorization Authorization,
		CFSecISOLangPKey argKey );
	/**
	 *	Delete the ISOLang instances identified by the key Code3Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISO6392Code	The ISOLang key attribute of the instance generating the id.
	 */
	void deleteISOLangByCode3Idx( CFSecAuthorization Authorization,
		String argISO6392Code );

	/**
	 *	Delete the ISOLang instances identified by the key Code3Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteISOLangByCode3Idx( CFSecAuthorization Authorization,
		CFSecISOLangByCode3IdxKey argKey );
	/**
	 *	Delete the ISOLang instances identified by the key Code2Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISO6391Code	The ISOLang key attribute of the instance generating the id.
	 */
	void deleteISOLangByCode2Idx( CFSecAuthorization Authorization,
		String argISO6391Code );

	/**
	 *	Delete the ISOLang instances identified by the key Code2Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteISOLangByCode2Idx( CFSecAuthorization Authorization,
		CFSecISOLangByCode2IdxKey argKey );


	/**
	 *	Read the derived ISOLang buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOLang instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	CFSecISOLangBuff readDerived( CFSecAuthorization Authorization,
		CFSecISOLangPKey PKey );

	/**
	 *	Lock the derived ISOLang buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOLang instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	CFSecISOLangBuff lockDerived( CFSecAuthorization Authorization,
		CFSecISOLangPKey PKey );

	/**
	 *	Read all ISOLang instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	CFSecISOLangBuff[] readAllDerived( CFSecAuthorization Authorization );

	/**
	 *	Read the derived ISOLang buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISOLangId	The ISOLang key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	CFSecISOLangBuff readDerivedByIdIdx( CFSecAuthorization Authorization,
		short ISOLangId );

	/**
	 *	Read the derived ISOLang buffer instance identified by the unique key Code3Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISO6392Code	The ISOLang key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	CFSecISOLangBuff readDerivedByCode3Idx( CFSecAuthorization Authorization,
		String ISO6392Code );

	/**
	 *	Read an array of the derived ISOLang buffer instances identified by the duplicate key Code2Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISO6391Code	The ISOLang key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFSecISOLangBuff[] readDerivedByCode2Idx( CFSecAuthorization Authorization,
		String ISO6391Code );

	/**
	 *	Read the specific ISOLang buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOLang instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFSecISOLangBuff readBuff( CFSecAuthorization Authorization,
		CFSecISOLangPKey PKey );

	/**
	 *	Lock the specific ISOLang buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOLang instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFSecISOLangBuff lockBuff( CFSecAuthorization Authorization,
		CFSecISOLangPKey PKey );

	/**
	 *	Read all the specific ISOLang buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific ISOLang instances in the database accessible for the Authorization.
	 */
	CFSecISOLangBuff[] readAllBuff( CFSecAuthorization Authorization );

	/**
	 *	Read the specific ISOLang buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISOLangId	The ISOLang key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFSecISOLangBuff readBuffByIdIdx( CFSecAuthorization Authorization,
		short ISOLangId );

	/**
	 *	Read the specific ISOLang buffer instance identified by the unique key Code3Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISO6392Code	The ISOLang key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFSecISOLangBuff readBuffByCode3Idx( CFSecAuthorization Authorization,
		String ISO6392Code );

	/**
	 *	Read an array of the specific ISOLang buffer instances identified by the duplicate key Code2Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISO6391Code	The ISOLang key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFSecISOLangBuff[] readBuffByCode2Idx( CFSecAuthorization Authorization,
		String ISO6391Code );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
