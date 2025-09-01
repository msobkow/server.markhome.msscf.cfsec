
// Description: Java 11 DbIO interface for SecUser.

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
 *	CFSecSecUserTable database interface for SecUser
 */
public interface ICFSecSecUserTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createSecUser( CFSecAuthorization Authorization,
		CFSecSecUserBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateSecUser( CFSecAuthorization Authorization,
		CFSecSecUserBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteSecUser( CFSecAuthorization Authorization,
		CFSecSecUserBuff Buff );
	/**
	 *	Delete the SecUser instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The SecUser key attribute of the instance generating the id.
	 */
	void deleteSecUserByIdIdx( CFSecAuthorization Authorization,
		UUID argSecUserId );

	/**
	 *	Delete the SecUser instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteSecUserByIdIdx( CFSecAuthorization Authorization,
		CFSecSecUserPKey argKey );
	/**
	 *	Delete the SecUser instances identified by the key ULoginIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argLoginId	The SecUser key attribute of the instance generating the id.
	 */
	void deleteSecUserByULoginIdx( CFSecAuthorization Authorization,
		String argLoginId );

	/**
	 *	Delete the SecUser instances identified by the key ULoginIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecUserByULoginIdx( CFSecAuthorization Authorization,
		CFSecSecUserByULoginIdxKey argKey );
	/**
	 *	Delete the SecUser instances identified by the key EMConfIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argEMailConfirmUuid	The SecUser key attribute of the instance generating the id.
	 */
	void deleteSecUserByEMConfIdx( CFSecAuthorization Authorization,
		UUID argEMailConfirmUuid );

	/**
	 *	Delete the SecUser instances identified by the key EMConfIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecUserByEMConfIdx( CFSecAuthorization Authorization,
		CFSecSecUserByEMConfIdxKey argKey );
	/**
	 *	Delete the SecUser instances identified by the key PwdResetIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPasswordResetUuid	The SecUser key attribute of the instance generating the id.
	 */
	void deleteSecUserByPwdResetIdx( CFSecAuthorization Authorization,
		UUID argPasswordResetUuid );

	/**
	 *	Delete the SecUser instances identified by the key PwdResetIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecUserByPwdResetIdx( CFSecAuthorization Authorization,
		CFSecSecUserByPwdResetIdxKey argKey );
	/**
	 *	Delete the SecUser instances identified by the key DefDevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDfltDevUserId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@param	argDfltDevName	The SecUser key attribute of the instance generating the id.
	 */
	void deleteSecUserByDefDevIdx( CFSecAuthorization Authorization,
		UUID argDfltDevUserId,
		String argDfltDevName );

	/**
	 *	Delete the SecUser instances identified by the key DefDevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecUserByDefDevIdx( CFSecAuthorization Authorization,
		CFSecSecUserByDefDevIdxKey argKey );


	/**
	 *	Read the derived SecUser buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecUser instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	CFSecSecUserBuff readDerived( CFSecAuthorization Authorization,
		CFSecSecUserPKey PKey );

	/**
	 *	Lock the derived SecUser buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecUser instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	CFSecSecUserBuff lockDerived( CFSecAuthorization Authorization,
		CFSecSecUserPKey PKey );

	/**
	 *	Read all SecUser instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	CFSecSecUserBuff[] readAllDerived( CFSecAuthorization Authorization );

	/**
	 *	Read the derived SecUser buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	CFSecSecUserBuff readDerivedByIdIdx( CFSecAuthorization Authorization,
		UUID SecUserId );

	/**
	 *	Read the derived SecUser buffer instance identified by the unique key ULoginIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argLoginId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	CFSecSecUserBuff readDerivedByULoginIdx( CFSecAuthorization Authorization,
		String LoginId );

	/**
	 *	Read an array of the derived SecUser buffer instances identified by the duplicate key EMConfIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argEMailConfirmUuid	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFSecSecUserBuff[] readDerivedByEMConfIdx( CFSecAuthorization Authorization,
		UUID EMailConfirmUuid );

	/**
	 *	Read an array of the derived SecUser buffer instances identified by the duplicate key PwdResetIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPasswordResetUuid	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFSecSecUserBuff[] readDerivedByPwdResetIdx( CFSecAuthorization Authorization,
		UUID PasswordResetUuid );

	/**
	 *	Read an array of the derived SecUser buffer instances identified by the duplicate key DefDevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDfltDevUserId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@param	argDfltDevName	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFSecSecUserBuff[] readDerivedByDefDevIdx( CFSecAuthorization Authorization,
		UUID DfltDevUserId,
		String DfltDevName );

	/**
	 *	Read the specific SecUser buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecUser instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFSecSecUserBuff readBuff( CFSecAuthorization Authorization,
		CFSecSecUserPKey PKey );

	/**
	 *	Lock the specific SecUser buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecUser instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFSecSecUserBuff lockBuff( CFSecAuthorization Authorization,
		CFSecSecUserPKey PKey );

	/**
	 *	Read all the specific SecUser buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecUser instances in the database accessible for the Authorization.
	 */
	CFSecSecUserBuff[] readAllBuff( CFSecAuthorization Authorization );

	/**
	 *	Read a page of all the specific SecUser buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecUser instances in the database accessible for the Authorization.
	 */
	CFSecSecUserBuff[] pageAllBuff( CFSecAuthorization Authorization,
		UUID priorSecUserId );

	/**
	 *	Read the specific SecUser buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFSecSecUserBuff readBuffByIdIdx( CFSecAuthorization Authorization,
		UUID SecUserId );

	/**
	 *	Read the specific SecUser buffer instance identified by the unique key ULoginIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argLoginId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFSecSecUserBuff readBuffByULoginIdx( CFSecAuthorization Authorization,
		String LoginId );

	/**
	 *	Read an array of the specific SecUser buffer instances identified by the duplicate key EMConfIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argEMailConfirmUuid	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFSecSecUserBuff[] readBuffByEMConfIdx( CFSecAuthorization Authorization,
		UUID EMailConfirmUuid );

	/**
	 *	Read an array of the specific SecUser buffer instances identified by the duplicate key PwdResetIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPasswordResetUuid	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFSecSecUserBuff[] readBuffByPwdResetIdx( CFSecAuthorization Authorization,
		UUID PasswordResetUuid );

	/**
	 *	Read an array of the specific SecUser buffer instances identified by the duplicate key DefDevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDfltDevUserId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@param	argDfltDevName	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFSecSecUserBuff[] readBuffByDefDevIdx( CFSecAuthorization Authorization,
		UUID DfltDevUserId,
		String DfltDevName );

	/**
	 *	Read a page array of the specific SecUser buffer instances identified by the duplicate key EMConfIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argEMailConfirmUuid	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFSecSecUserBuff[] pageBuffByEMConfIdx( CFSecAuthorization Authorization,
		UUID EMailConfirmUuid,
		UUID priorSecUserId );

	/**
	 *	Read a page array of the specific SecUser buffer instances identified by the duplicate key PwdResetIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPasswordResetUuid	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFSecSecUserBuff[] pageBuffByPwdResetIdx( CFSecAuthorization Authorization,
		UUID PasswordResetUuid,
		UUID priorSecUserId );

	/**
	 *	Read a page array of the specific SecUser buffer instances identified by the duplicate key DefDevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDfltDevUserId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@param	argDfltDevName	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFSecSecUserBuff[] pageBuffByDefDevIdx( CFSecAuthorization Authorization,
		UUID DfltDevUserId,
		String DfltDevName,
		UUID priorSecUserId );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
