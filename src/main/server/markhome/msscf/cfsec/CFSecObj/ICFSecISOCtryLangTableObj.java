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

public interface ICFSecISOCtryLangTableObj
{
	ICFSecSchemaObj getSchema();
	void setSchema( ICFSecSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new ISOCtryLang instance.
	 *
	 *	@return	A new instance.
	 */
	ICFSecISOCtryLangObj newInstance();

	/**
	 *	Instantiate a new ISOCtryLang edition of the specified ISOCtryLang instance.
	 *
	 *	@return	A new edition.
	 */
	ICFSecISOCtryLangEditObj newEditInstance( ICFSecISOCtryLangObj orig );

	/**
	 *	Internal use only.
	 */
	ICFSecISOCtryLangObj realiseISOCtryLang( ICFSecISOCtryLangObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFSecISOCtryLangObj createISOCtryLang( ICFSecISOCtryLangObj Obj );

	/**
	 *	Read a ISOCtryLang-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ISOCtryLang-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFSecISOCtryLangObj readISOCtryLang( CFSecISOCtryLangPKey pkey );

	/**
	 *	Read a ISOCtryLang-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ISOCtryLang-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFSecISOCtryLangObj readISOCtryLang( CFSecISOCtryLangPKey pkey,
		boolean forceRead );

	ICFSecISOCtryLangObj readCachedISOCtryLang( CFSecISOCtryLangPKey pkey );

	public void reallyDeepDisposeISOCtryLang( ICFSecISOCtryLangObj obj );

	void deepDisposeISOCtryLang( CFSecISOCtryLangPKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFSecISOCtryLangObj lockISOCtryLang( CFSecISOCtryLangPKey pkey );

	/**
	 *	Return a sorted list of all the ISOCtryLang-derived instances in the database.
	 *
	 *	@return	List of ICFSecISOCtryLangObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFSecISOCtryLangObj> readAllISOCtryLang();

	/**
	 *	Return a sorted map of all the ISOCtryLang-derived instances in the database.
	 *
	 *	@return	List of ICFSecISOCtryLangObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFSecISOCtryLangObj> readAllISOCtryLang( boolean forceRead );

	List<ICFSecISOCtryLangObj> readCachedAllISOCtryLang();

	/**
	 *	Get the CFSecISOCtryLangObj instance for the primary key attributes.
	 *
	 *	@param	argISOCtryId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@param	argISOLangId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@return	CFSecISOCtryLangObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFSecISOCtryLangObj readISOCtryLangByIdIdx( short ISOCtryId,
		short ISOLangId );

	/**
	 *	Get the CFSecISOCtryLangObj instance for the primary key attributes.
	 *
	 *	@param	argISOCtryId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@param	argISOLangId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@return	CFSecISOCtryLangObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFSecISOCtryLangObj readISOCtryLangByIdIdx( short ISOCtryId,
		short ISOLangId,
		boolean forceRead );

	/**
	 *	Get the map of CFSecISOCtryLangObj instances sorted by their primary keys for the duplicate CtryIdx key.
	 *
	 *	@param	argISOCtryId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@return	List of CFSecISOCtryLangObj cached instances sorted by their primary keys for the duplicate CtryIdx key,
	 *		which may be an empty set.
	 */
	List<ICFSecISOCtryLangObj> readISOCtryLangByCtryIdx( short ISOCtryId );

	/**
	 *	Get the map of CFSecISOCtryLangObj instances sorted by their primary keys for the duplicate CtryIdx key.
	 *
	 *	@param	argISOCtryId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@return	List of CFSecISOCtryLangObj cached instances sorted by their primary keys for the duplicate CtryIdx key,
	 *		which may be an empty set.
	 */
	List<ICFSecISOCtryLangObj> readISOCtryLangByCtryIdx( short ISOCtryId,
		boolean forceRead );

	/**
	 *	Get the map of CFSecISOCtryLangObj instances sorted by their primary keys for the duplicate LangIdx key.
	 *
	 *	@param	argISOLangId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@return	List of CFSecISOCtryLangObj cached instances sorted by their primary keys for the duplicate LangIdx key,
	 *		which may be an empty set.
	 */
	List<ICFSecISOCtryLangObj> readISOCtryLangByLangIdx( short ISOLangId );

	/**
	 *	Get the map of CFSecISOCtryLangObj instances sorted by their primary keys for the duplicate LangIdx key.
	 *
	 *	@param	argISOLangId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@return	List of CFSecISOCtryLangObj cached instances sorted by their primary keys for the duplicate LangIdx key,
	 *		which may be an empty set.
	 */
	List<ICFSecISOCtryLangObj> readISOCtryLangByLangIdx( short ISOLangId,
		boolean forceRead );

	ICFSecISOCtryLangObj readCachedISOCtryLangByIdIdx( short ISOCtryId,
		short ISOLangId );

	List<ICFSecISOCtryLangObj> readCachedISOCtryLangByCtryIdx( short ISOCtryId );

	List<ICFSecISOCtryLangObj> readCachedISOCtryLangByLangIdx( short ISOLangId );

	void deepDisposeISOCtryLangByIdIdx( short ISOCtryId,
		short ISOLangId );

	void deepDisposeISOCtryLangByCtryIdx( short ISOCtryId );

	void deepDisposeISOCtryLangByLangIdx( short ISOLangId );

	/**
	 *	Internal use only.
	 */
	ICFSecISOCtryLangObj updateISOCtryLang( ICFSecISOCtryLangObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteISOCtryLang( ICFSecISOCtryLangObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argISOCtryId	The ISOCtryLang key attribute of the instance generating the id.
	 *
	 *	@param	argISOLangId	The ISOCtryLang key attribute of the instance generating the id.
	 */
	void deleteISOCtryLangByIdIdx( short ISOCtryId,
		short ISOLangId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argISOCtryId	The ISOCtryLang key attribute of the instance generating the id.
	 */
	void deleteISOCtryLangByCtryIdx( short ISOCtryId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argISOLangId	The ISOCtryLang key attribute of the instance generating the id.
	 */
	void deleteISOCtryLangByLangIdx( short ISOLangId );
}
