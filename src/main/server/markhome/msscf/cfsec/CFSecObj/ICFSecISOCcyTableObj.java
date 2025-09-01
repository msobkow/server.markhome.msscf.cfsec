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

public interface ICFSecISOCcyTableObj
{
	ICFSecSchemaObj getSchema();
	void setSchema( ICFSecSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new ISOCcy instance.
	 *
	 *	@return	A new instance.
	 */
	ICFSecISOCcyObj newInstance();

	/**
	 *	Instantiate a new ISOCcy edition of the specified ISOCcy instance.
	 *
	 *	@return	A new edition.
	 */
	ICFSecISOCcyEditObj newEditInstance( ICFSecISOCcyObj orig );

	/**
	 *	Internal use only.
	 */
	ICFSecISOCcyObj realiseISOCcy( ICFSecISOCcyObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFSecISOCcyObj createISOCcy( ICFSecISOCcyObj Obj );

	/**
	 *	Read a ISOCcy-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ISOCcy-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFSecISOCcyObj readISOCcy( CFSecISOCcyPKey pkey );

	/**
	 *	Read a ISOCcy-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ISOCcy-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFSecISOCcyObj readISOCcy( CFSecISOCcyPKey pkey,
		boolean forceRead );

	ICFSecISOCcyObj readCachedISOCcy( CFSecISOCcyPKey pkey );

	public void reallyDeepDisposeISOCcy( ICFSecISOCcyObj obj );

	void deepDisposeISOCcy( CFSecISOCcyPKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFSecISOCcyObj lockISOCcy( CFSecISOCcyPKey pkey );

	/**
	 *	Return a sorted list of all the ISOCcy-derived instances in the database.
	 *
	 *	@return	List of ICFSecISOCcyObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFSecISOCcyObj> readAllISOCcy();

	/**
	 *	Return a sorted map of all the ISOCcy-derived instances in the database.
	 *
	 *	@return	List of ICFSecISOCcyObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFSecISOCcyObj> readAllISOCcy( boolean forceRead );

	List<ICFSecISOCcyObj> readCachedAllISOCcy();

	/**
	 *	Get the CFSecISOCcyObj instance for the primary key attributes.
	 *
	 *	@param	argISOCcyId	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return	CFSecISOCcyObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFSecISOCcyObj readISOCcyByIdIdx( short ISOCcyId );

	/**
	 *	Get the CFSecISOCcyObj instance for the primary key attributes.
	 *
	 *	@param	argISOCcyId	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return	CFSecISOCcyObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFSecISOCcyObj readISOCcyByIdIdx( short ISOCcyId,
		boolean forceRead );

	/**
	 *	Get the CFSecISOCcyObj instance for the unique CcyCdIdx key.
	 *
	 *	@param	argISOCode	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return	CFSecISOCcyObj cached instance for the unique CcyCdIdx key, or
	 *		null if no such instance exists.
	 */
	ICFSecISOCcyObj readISOCcyByCcyCdIdx(String ISOCode );

	/**
	 *	Get the CFSecISOCcyObj instance for the unique CcyCdIdx key.
	 *
	 *	@param	argISOCode	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return	CFSecISOCcyObj refreshed instance for the unique CcyCdIdx key, or
	 *		null if no such instance exists.
	 */
	ICFSecISOCcyObj readISOCcyByCcyCdIdx(String ISOCode,
		boolean forceRead );

	/**
	 *	Get the CFSecISOCcyObj instance for the unique CcyNmIdx key.
	 *
	 *	@param	argName	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return	CFSecISOCcyObj cached instance for the unique CcyNmIdx key, or
	 *		null if no such instance exists.
	 */
	ICFSecISOCcyObj readISOCcyByCcyNmIdx(String Name );

	/**
	 *	Get the CFSecISOCcyObj instance for the unique CcyNmIdx key.
	 *
	 *	@param	argName	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return	CFSecISOCcyObj refreshed instance for the unique CcyNmIdx key, or
	 *		null if no such instance exists.
	 */
	ICFSecISOCcyObj readISOCcyByCcyNmIdx(String Name,
		boolean forceRead );

	ICFSecISOCcyObj readCachedISOCcyByIdIdx( short ISOCcyId );

	ICFSecISOCcyObj readCachedISOCcyByCcyCdIdx( String ISOCode );

	ICFSecISOCcyObj readCachedISOCcyByCcyNmIdx( String Name );

	void deepDisposeISOCcyByIdIdx( short ISOCcyId );

	void deepDisposeISOCcyByCcyCdIdx( String ISOCode );

	void deepDisposeISOCcyByCcyNmIdx( String Name );

	/**
	 *	Internal use only.
	 */
	ICFSecISOCcyObj updateISOCcy( ICFSecISOCcyObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteISOCcy( ICFSecISOCcyObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argISOCcyId	The ISOCcy key attribute of the instance generating the id.
	 */
	void deleteISOCcyByIdIdx( short ISOCcyId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argISOCode	The ISOCcy key attribute of the instance generating the id.
	 */
	void deleteISOCcyByCcyCdIdx(String ISOCode );

	/**
	 *	Internal use only.
	 *
	 *	@param	argName	The ISOCcy key attribute of the instance generating the id.
	 */
	void deleteISOCcyByCcyNmIdx(String Name );
}
