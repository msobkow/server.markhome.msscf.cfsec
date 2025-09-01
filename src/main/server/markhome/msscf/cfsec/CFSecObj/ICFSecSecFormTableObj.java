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

public interface ICFSecSecFormTableObj
{
	ICFSecSchemaObj getSchema();
	void setSchema( ICFSecSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new SecForm instance.
	 *
	 *	@return	A new instance.
	 */
	ICFSecSecFormObj newInstance();

	/**
	 *	Instantiate a new SecForm edition of the specified SecForm instance.
	 *
	 *	@return	A new edition.
	 */
	ICFSecSecFormEditObj newEditInstance( ICFSecSecFormObj orig );

	/**
	 *	Internal use only.
	 */
	ICFSecSecFormObj realiseSecForm( ICFSecSecFormObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFSecSecFormObj createSecForm( ICFSecSecFormObj Obj );

	/**
	 *	Read a SecForm-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecForm-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFSecSecFormObj readSecForm( CFSecSecFormPKey pkey );

	/**
	 *	Read a SecForm-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SecForm-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFSecSecFormObj readSecForm( CFSecSecFormPKey pkey,
		boolean forceRead );

	ICFSecSecFormObj readCachedSecForm( CFSecSecFormPKey pkey );

	public void reallyDeepDisposeSecForm( ICFSecSecFormObj obj );

	void deepDisposeSecForm( CFSecSecFormPKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFSecSecFormObj lockSecForm( CFSecSecFormPKey pkey );

	/**
	 *	Return a sorted list of all the SecForm-derived instances in the database.
	 *
	 *	@return	List of ICFSecSecFormObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFSecSecFormObj> readAllSecForm();

	/**
	 *	Return a sorted map of all the SecForm-derived instances in the database.
	 *
	 *	@return	List of ICFSecSecFormObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFSecSecFormObj> readAllSecForm( boolean forceRead );

	List<ICFSecSecFormObj> readCachedAllSecForm();

	/**
	 *	Return a sorted map of a page of the SecForm-derived instances in the database.
	 *
	 *	@return	List of ICFSecSecFormObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFSecSecFormObj> pageAllSecForm(Long priorClusterId,
		Integer priorSecFormId );

	/**
	 *	Get the CFSecSecFormObj instance for the primary key attributes.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecFormId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return	CFSecSecFormObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFSecSecFormObj readSecFormByIdIdx( long ClusterId,
		int SecFormId );

	/**
	 *	Get the CFSecSecFormObj instance for the primary key attributes.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecFormId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return	CFSecSecFormObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFSecSecFormObj readSecFormByIdIdx( long ClusterId,
		int SecFormId,
		boolean forceRead );

	/**
	 *	Get the map of CFSecSecFormObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return	List of CFSecSecFormObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<ICFSecSecFormObj> readSecFormByClusterIdx( long ClusterId );

	/**
	 *	Get the map of CFSecSecFormObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return	List of CFSecSecFormObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<ICFSecSecFormObj> readSecFormByClusterIdx( long ClusterId,
		boolean forceRead );

	/**
	 *	Get the map of CFSecSecFormObj instances sorted by their primary keys for the duplicate SecAppIdx key.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return	List of CFSecSecFormObj cached instances sorted by their primary keys for the duplicate SecAppIdx key,
	 *		which may be an empty set.
	 */
	List<ICFSecSecFormObj> readSecFormBySecAppIdx( long ClusterId,
		int SecAppId );

	/**
	 *	Get the map of CFSecSecFormObj instances sorted by their primary keys for the duplicate SecAppIdx key.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return	List of CFSecSecFormObj cached instances sorted by their primary keys for the duplicate SecAppIdx key,
	 *		which may be an empty set.
	 */
	List<ICFSecSecFormObj> readSecFormBySecAppIdx( long ClusterId,
		int SecAppId,
		boolean forceRead );

	/**
	 *	Get the CFSecSecFormObj instance for the unique UJEEServletIdx key.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argJEEServletMapName	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return	CFSecSecFormObj cached instance for the unique UJEEServletIdx key, or
	 *		null if no such instance exists.
	 */
	ICFSecSecFormObj readSecFormByUJEEServletIdx(long ClusterId,
		int SecAppId,
		String JEEServletMapName );

	/**
	 *	Get the CFSecSecFormObj instance for the unique UJEEServletIdx key.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argJEEServletMapName	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return	CFSecSecFormObj refreshed instance for the unique UJEEServletIdx key, or
	 *		null if no such instance exists.
	 */
	ICFSecSecFormObj readSecFormByUJEEServletIdx(long ClusterId,
		int SecAppId,
		String JEEServletMapName,
		boolean forceRead );

	ICFSecSecFormObj readCachedSecFormByIdIdx( long ClusterId,
		int SecFormId );

	List<ICFSecSecFormObj> readCachedSecFormByClusterIdx( long ClusterId );

	List<ICFSecSecFormObj> readCachedSecFormBySecAppIdx( long ClusterId,
		int SecAppId );

	ICFSecSecFormObj readCachedSecFormByUJEEServletIdx( long ClusterId,
		int SecAppId,
		String JEEServletMapName );

	void deepDisposeSecFormByIdIdx( long ClusterId,
		int SecFormId );

	void deepDisposeSecFormByClusterIdx( long ClusterId );

	void deepDisposeSecFormBySecAppIdx( long ClusterId,
		int SecAppId );

	void deepDisposeSecFormByUJEEServletIdx( long ClusterId,
		int SecAppId,
		String JEEServletMapName );

	/**
	 *	Read a page of data as a List of SecForm-derived instances sorted by their primary keys,
	 *	as identified by the duplicate ClusterIdx key attributes.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecForm-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<ICFSecSecFormObj> pageSecFormByClusterIdx( long ClusterId,
		Long priorClusterId,
		Integer priorSecFormId );

	/**
	 *	Read a page of data as a List of SecForm-derived instances sorted by their primary keys,
	 *	as identified by the duplicate SecAppIdx key attributes.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return	A List of SecForm-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<ICFSecSecFormObj> pageSecFormBySecAppIdx( long ClusterId,
		int SecAppId,
		Long priorClusterId,
		Integer priorSecFormId );

	/**
	 *	Internal use only.
	 */
	ICFSecSecFormObj updateSecForm( ICFSecSecFormObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSecForm( ICFSecSecFormObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecFormId	The SecForm key attribute of the instance generating the id.
	 */
	void deleteSecFormByIdIdx( long ClusterId,
		int SecFormId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 */
	void deleteSecFormByClusterIdx( long ClusterId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecForm key attribute of the instance generating the id.
	 */
	void deleteSecFormBySecAppIdx( long ClusterId,
		int SecAppId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argJEEServletMapName	The SecForm key attribute of the instance generating the id.
	 */
	void deleteSecFormByUJEEServletIdx(long ClusterId,
		int SecAppId,
		String JEEServletMapName );
}
