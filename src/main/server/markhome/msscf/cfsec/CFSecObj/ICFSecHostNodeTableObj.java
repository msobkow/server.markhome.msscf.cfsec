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

public interface ICFSecHostNodeTableObj
{
	ICFSecSchemaObj getSchema();
	void setSchema( ICFSecSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new HostNode instance.
	 *
	 *	@return	A new instance.
	 */
	ICFSecHostNodeObj newInstance();

	/**
	 *	Instantiate a new HostNode edition of the specified HostNode instance.
	 *
	 *	@return	A new edition.
	 */
	ICFSecHostNodeEditObj newEditInstance( ICFSecHostNodeObj orig );

	/**
	 *	Internal use only.
	 */
	ICFSecHostNodeObj realiseHostNode( ICFSecHostNodeObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFSecHostNodeObj createHostNode( ICFSecHostNodeObj Obj );

	/**
	 *	Read a HostNode-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The HostNode-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFSecHostNodeObj readHostNode( CFSecHostNodePKey pkey );

	/**
	 *	Read a HostNode-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The HostNode-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFSecHostNodeObj readHostNode( CFSecHostNodePKey pkey,
		boolean forceRead );

	ICFSecHostNodeObj readCachedHostNode( CFSecHostNodePKey pkey );

	public void reallyDeepDisposeHostNode( ICFSecHostNodeObj obj );

	void deepDisposeHostNode( CFSecHostNodePKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFSecHostNodeObj lockHostNode( CFSecHostNodePKey pkey );

	/**
	 *	Return a sorted list of all the HostNode-derived instances in the database.
	 *
	 *	@return	List of ICFSecHostNodeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFSecHostNodeObj> readAllHostNode();

	/**
	 *	Return a sorted map of all the HostNode-derived instances in the database.
	 *
	 *	@return	List of ICFSecHostNodeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFSecHostNodeObj> readAllHostNode( boolean forceRead );

	List<ICFSecHostNodeObj> readCachedAllHostNode();

	/**
	 *	Return a sorted map of a page of the HostNode-derived instances in the database.
	 *
	 *	@return	List of ICFSecHostNodeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFSecHostNodeObj> pageAllHostNode(Long priorClusterId,
		Long priorHostNodeId );

	/**
	 *	Get the CFSecHostNodeObj instance for the primary key attributes.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@param	argHostNodeId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@return	CFSecHostNodeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFSecHostNodeObj readHostNodeByIdIdx( long ClusterId,
		long HostNodeId );

	/**
	 *	Get the CFSecHostNodeObj instance for the primary key attributes.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@param	argHostNodeId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@return	CFSecHostNodeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFSecHostNodeObj readHostNodeByIdIdx( long ClusterId,
		long HostNodeId,
		boolean forceRead );

	/**
	 *	Get the map of CFSecHostNodeObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@return	List of CFSecHostNodeObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<ICFSecHostNodeObj> readHostNodeByClusterIdx( long ClusterId );

	/**
	 *	Get the map of CFSecHostNodeObj instances sorted by their primary keys for the duplicate ClusterIdx key.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@return	List of CFSecHostNodeObj cached instances sorted by their primary keys for the duplicate ClusterIdx key,
	 *		which may be an empty set.
	 */
	List<ICFSecHostNodeObj> readHostNodeByClusterIdx( long ClusterId,
		boolean forceRead );

	/**
	 *	Get the CFSecHostNodeObj instance for the unique UDescrIdx key.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@param	argDescription	The HostNode key attribute of the instance generating the id.
	 *
	 *	@return	CFSecHostNodeObj cached instance for the unique UDescrIdx key, or
	 *		null if no such instance exists.
	 */
	ICFSecHostNodeObj readHostNodeByUDescrIdx(long ClusterId,
		String Description );

	/**
	 *	Get the CFSecHostNodeObj instance for the unique UDescrIdx key.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@param	argDescription	The HostNode key attribute of the instance generating the id.
	 *
	 *	@return	CFSecHostNodeObj refreshed instance for the unique UDescrIdx key, or
	 *		null if no such instance exists.
	 */
	ICFSecHostNodeObj readHostNodeByUDescrIdx(long ClusterId,
		String Description,
		boolean forceRead );

	/**
	 *	Get the CFSecHostNodeObj instance for the unique HostNameIdx key.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@param	argHostName	The HostNode key attribute of the instance generating the id.
	 *
	 *	@return	CFSecHostNodeObj cached instance for the unique HostNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFSecHostNodeObj readHostNodeByHostNameIdx(long ClusterId,
		String HostName );

	/**
	 *	Get the CFSecHostNodeObj instance for the unique HostNameIdx key.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@param	argHostName	The HostNode key attribute of the instance generating the id.
	 *
	 *	@return	CFSecHostNodeObj refreshed instance for the unique HostNameIdx key, or
	 *		null if no such instance exists.
	 */
	ICFSecHostNodeObj readHostNodeByHostNameIdx(long ClusterId,
		String HostName,
		boolean forceRead );

	ICFSecHostNodeObj readCachedHostNodeByIdIdx( long ClusterId,
		long HostNodeId );

	List<ICFSecHostNodeObj> readCachedHostNodeByClusterIdx( long ClusterId );

	ICFSecHostNodeObj readCachedHostNodeByUDescrIdx( long ClusterId,
		String Description );

	ICFSecHostNodeObj readCachedHostNodeByHostNameIdx( long ClusterId,
		String HostName );

	void deepDisposeHostNodeByIdIdx( long ClusterId,
		long HostNodeId );

	void deepDisposeHostNodeByClusterIdx( long ClusterId );

	void deepDisposeHostNodeByUDescrIdx( long ClusterId,
		String Description );

	void deepDisposeHostNodeByHostNameIdx( long ClusterId,
		String HostName );

	/**
	 *	Read a page of data as a List of HostNode-derived instances sorted by their primary keys,
	 *	as identified by the duplicate ClusterIdx key attributes.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@return	A List of HostNode-derived instances sorted by their primary keys,
	 *		as identified by the key attributes, which may be an empty set.
	 */
	List<ICFSecHostNodeObj> pageHostNodeByClusterIdx( long ClusterId,
		Long priorClusterId,
		Long priorHostNodeId );

	/**
	 *	Internal use only.
	 */
	ICFSecHostNodeObj updateHostNode( ICFSecHostNodeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteHostNode( ICFSecHostNodeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@param	argHostNodeId	The HostNode key attribute of the instance generating the id.
	 */
	void deleteHostNodeByIdIdx( long ClusterId,
		long HostNodeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 */
	void deleteHostNodeByClusterIdx( long ClusterId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@param	argDescription	The HostNode key attribute of the instance generating the id.
	 */
	void deleteHostNodeByUDescrIdx(long ClusterId,
		String Description );

	/**
	 *	Internal use only.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@param	argHostName	The HostNode key attribute of the instance generating the id.
	 */
	void deleteHostNodeByHostNameIdx(long ClusterId,
		String HostName );
}
