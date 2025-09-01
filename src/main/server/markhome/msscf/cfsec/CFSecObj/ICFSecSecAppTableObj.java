// Description: Java 11 Table Object interface for CFSec.

/*
 *	server.markhome.msscf.CFSec
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfsec.CFSecObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;

public interface ICFSecSecAppTableObj
{
	ICFSecSchemaObj getSchema();
	void setSchema( ICFSecSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new SecApp instance.
	 *
	 *	@return	A new instance.
	 */
	ICFSecSecAppObj newInstance();

	/**
	 *	Instantiate a new SecApp edition of the specified SecApp instance.
	 *
	 *	@return	A new edition.
	 */
	ICFSecSecAppEditObj newEditInstance( ICFSecSecAppObj orig );

	/**
	 *	Internal use only.
	 */
	ICFSecSecAppObj realiseSecApp( ICFSecSecAppObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFSecSecAppObj createSecApp( ICFSecSecAppObj Obj );

	/**
	 *	Read a SecApp-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecApp-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFSecSecAppObj readSecApp( CFSecSecAppPKey pkey );

	/**
	 *	Read a SecApp-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecApp-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFSecSecAppObj readSecApp( CFSecSecAppPKey pkey,
		boolean forceRead );

	ICFSecSecAppObj readCachedSecApp( CFSecSecAppPKey pkey );

	public void reallyDeepDisposeSecApp( ICFSecSecAppObj obj );

	void deepDisposeSecApp( CFSecSecAppPKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFSecSecAppObj lockSecApp( CFSecSecAppPKey pkey );

	/**
	 *	Return a sorted list of all the SecApp-derived instances in the database.
	 *
	 *	@return	List of ICFSecSecAppObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFSecSecAppObj> readAllSecApp();

	/**
	 *	Return a sorted map of all the SecApp-derived instances in the database.
	 *
	 *	@return	List of ICFSecSecAppObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFSecSecAppObj> readAllSecApp( boolean forceRead );

	List<ICFSecSecAppObj> readCachedAllSecApp();

	/**
	 *	Return a sorted map of a page of the SecApp-derived instances in the database.
	 *
	 *	@return	List of ICFSecSecAppObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFSecSecAppObj> pageAllSecApp(Long priorClusterId,
		Integer priorSecAppId );

	/**
	 *	Get the CFSecSecAppObj instance for the primary key attributes.
	 *
	 *	@param	argClusterId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@return	CFSecSecAppObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFSecSecAppObj readSecAppByIdIdx( long ClusterId,
		int SecAppId );

	/**
	 *	Get the CFSecSecAppObj instance for the primary key attributes.
	 *
	 *	@param	argClusterId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@return	CFSecSecAppObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFSecSecAppObj readSecAppByIdIdx( long ClusterId,
		int SecAppId,
		boolean forceRead );

	/**
	 *	Get the map of CFSecSecAppObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@return	List of CFSecSecAppObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<ICFSecSecAppObj> readSecAppByClusterIdx( long ClusterId );

	/**
	 *	Get the map of CFSecSecAppObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@return	List of CFSecSecAppObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<ICFSecSecAppObj> readSecAppByClusterIdx( long ClusterId,
		boolean forceRead );

	/**
	 *	Get the CFSecSecAppObj instance for the unique UJEEMountIdx key.
	 *
	 *	@param	argClusterId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@param	argJEEMountName	The SecApp key attribute of the instance generating the id.
	 *
	 *	@return	CFSecSecAppObj cached instance for the unique UJEEMountIdx key, or
	 *		null if no such instance exists.
	 */
	ICFSecSecAppObj readSecAppByUJEEMountIdx(long ClusterId,
		String JEEMountName );

	/**
	 *	Get the CFSecSecAppObj instance for the unique UJEEMountIdx key.
	 *
	 *	@param	argClusterId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@param	argJEEMountName	The SecApp key attribute of the instance generating the id.
	 *
	 *	@return	CFSecSecAppObj refreshed instance for the unique UJEEMountIdx key, or
	 *		null if no such instance exists.
	 */
	ICFSecSecAppObj readSecAppByUJEEMountIdx(long ClusterId,
		String JEEMountName,
		boolean forceRead );

	ICFSecSecAppObj readCachedSecAppByIdIdx( long ClusterId,
		int SecAppId );

	List<ICFSecSecAppObj> readCachedSecAppByClusterIdx( long ClusterId );

	ICFSecSecAppObj readCachedSecAppByUJEEMountIdx( long ClusterId,
		String JEEMountName );

	void deepDisposeSecAppByIdIdx( long ClusterId,
		int SecAppId );

	void deepDisposeSecAppByClusterIdx( long ClusterId );

	void deepDisposeSecAppByUJEEMountIdx( long ClusterId,
		String JEEMountName );

	/**
	 *	Read a page of data as a List of SecApp-derived instances sorted by their primary keys,
	 *	as identified by the duplicate ClusterIdx key attributes.
	 *
	 *	@param	argClusterId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecApp-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<ICFSecSecAppObj> pageSecAppByClusterIdx( long ClusterId,
		Long priorClusterId,
		Integer priorSecAppId );

	/**
	 *	Internal use only.
	 */
	ICFSecSecAppObj updateSecApp( ICFSecSecAppObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecApp( ICFSecSecAppObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecApp key attribute of the instance generating the id.
	 */
	void deleteSecAppByIdIdx( long ClusterId,
		int SecAppId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The SecApp key attribute of the instance generating the id.
	 */
	void deleteSecAppByClusterIdx( long ClusterId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@param	argJEEMountName	The SecApp key attribute of the instance generating the id.
	 */
	void deleteSecAppByUJEEMountIdx(long ClusterId,
		String JEEMountName );
}
