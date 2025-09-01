
// Description: Java 11 DbIO interface for TSecGroup.

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
 *	CFSecTSecGroupTable database interface for TSecGroup
 */
public interface ICFSecTSecGroupTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createTSecGroup( CFSecAuthorization Authorization,
		CFSecTSecGroupBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateTSecGroup( CFSecAuthorization Authorization,
		CFSecTSecGroupBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteTSecGroup( CFSecAuthorization Authorization,
		CFSecTSecGroupBuff Buff );
	/**
	 *	Delete the TSecGroup instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGroup key attribute of the instance generating the id.
	 */
	void deleteTSecGroupByIdIdx( CFSecAuthorization Authorization,
		long argTenantId,
		int argTSecGroupId );

	/**
	 *	Delete the TSecGroup instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteTSecGroupByIdIdx( CFSecAuthorization Authorization,
		CFSecTSecGroupPKey argKey );
	/**
	 *	Delete the TSecGroup instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 */
	void deleteTSecGroupByTenantIdx( CFSecAuthorization Authorization,
		long argTenantId );

	/**
	 *	Delete the TSecGroup instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTSecGroupByTenantIdx( CFSecAuthorization Authorization,
		CFSecTSecGroupByTenantIdxKey argKey );
	/**
	 *	Delete the TSecGroup instances identified by the key TenantVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argIsVisible	The TSecGroup key attribute of the instance generating the id.
	 */
	void deleteTSecGroupByTenantVisIdx( CFSecAuthorization Authorization,
		long argTenantId,
		boolean argIsVisible );

	/**
	 *	Delete the TSecGroup instances identified by the key TenantVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTSecGroupByTenantVisIdx( CFSecAuthorization Authorization,
		CFSecTSecGroupByTenantVisIdxKey argKey );
	/**
	 *	Delete the TSecGroup instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TSecGroup key attribute of the instance generating the id.
	 */
	void deleteTSecGroupByUNameIdx( CFSecAuthorization Authorization,
		long argTenantId,
		String argName );

	/**
	 *	Delete the TSecGroup instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTSecGroupByUNameIdx( CFSecAuthorization Authorization,
		CFSecTSecGroupByUNameIdxKey argKey );


	/**
	 *	Read the derived TSecGroup buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TSecGroup instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	CFSecTSecGroupBuff readDerived( CFSecAuthorization Authorization,
		CFSecTSecGroupPKey PKey );

	/**
	 *	Lock the derived TSecGroup buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TSecGroup instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	CFSecTSecGroupBuff lockDerived( CFSecAuthorization Authorization,
		CFSecTSecGroupPKey PKey );

	/**
	 *	Read all TSecGroup instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	CFSecTSecGroupBuff[] readAllDerived( CFSecAuthorization Authorization );

	/**
	 *	Read the derived TSecGroup buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	CFSecTSecGroupBuff readDerivedByIdIdx( CFSecAuthorization Authorization,
		long TenantId,
		int TSecGroupId );

	/**
	 *	Read an array of the derived TSecGroup buffer instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFSecTSecGroupBuff[] readDerivedByTenantIdx( CFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the derived TSecGroup buffer instances identified by the duplicate key TenantVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argIsVisible	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	CFSecTSecGroupBuff[] readDerivedByTenantVisIdx( CFSecAuthorization Authorization,
		long TenantId,
		boolean IsVisible );

	/**
	 *	Read the derived TSecGroup buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	CFSecTSecGroupBuff readDerivedByUNameIdx( CFSecAuthorization Authorization,
		long TenantId,
		String Name );

	/**
	 *	Read the specific TSecGroup buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TSecGroup instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFSecTSecGroupBuff readBuff( CFSecAuthorization Authorization,
		CFSecTSecGroupPKey PKey );

	/**
	 *	Lock the specific TSecGroup buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TSecGroup instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFSecTSecGroupBuff lockBuff( CFSecAuthorization Authorization,
		CFSecTSecGroupPKey PKey );

	/**
	 *	Read all the specific TSecGroup buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific TSecGroup instances in the database accessible for the Authorization.
	 */
	CFSecTSecGroupBuff[] readAllBuff( CFSecAuthorization Authorization );

	/**
	 *	Read the specific TSecGroup buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFSecTSecGroupBuff readBuffByIdIdx( CFSecAuthorization Authorization,
		long TenantId,
		int TSecGroupId );

	/**
	 *	Read an array of the specific TSecGroup buffer instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFSecTSecGroupBuff[] readBuffByTenantIdx( CFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the specific TSecGroup buffer instances identified by the duplicate key TenantVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argIsVisible	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFSecTSecGroupBuff[] readBuffByTenantVisIdx( CFSecAuthorization Authorization,
		long TenantId,
		boolean IsVisible );

	/**
	 *	Read the specific TSecGroup buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFLibNotSupportedException thrown by client-side implementations.
	 */
	CFSecTSecGroupBuff readBuffByUNameIdx( CFSecAuthorization Authorization,
		long TenantId,
		String Name );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws CFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
