// Description: Java 11 Object interface for CFSec ISOCtryLang.

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
import server.markhome.msscf.cfsec.CFSec.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;

public interface ICFSecISOCtryLangObj
	extends ICFLibAnyObj
{
	String getClassCode();
	/**
	 *	Get the user who created this instance.
	 *
	 *	@return	The ICFSecSecUserObj instance who created this instance.
	 */
	ICFSecSecUserObj getCreatedBy();

	/**
	 *	Get the Calendar date-time this instance was created.
	 *
	 *	@return	The Calendar value for the create time of the instance.
	 */
	Calendar getCreatedAt();

	/**
	 *	Get the user who updated this instance.
	 *
	 *	@return	The ICFSecSecUserObj instance who updated this instance.
	 */
	ICFSecSecUserObj getUpdatedBy();

	/**
	 *	Get the Calendar date-time this instance was updated.
	 *
	 *	@return	The Calendar value for the create time of the instance.
	 */
	Calendar getUpdatedAt();
	/**
	 *	Realise this instance of a ISOCtryLang.
	 *
	 *	@return	CFSecISOCtryLangObj instance which should be subsequently referenced.
	 */
	ICFSecISOCtryLangObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFSecISOCtryLangObj the reference to the cached or read (realised) instance.
	 */
	ICFSecISOCtryLangObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFSecISOCtryLangObj the reference to the cached or read (realised) instance.
	 */
	ICFSecISOCtryLangObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this ISOCtryLang instance.
	 *
	 *	@return	The newly locked ICFSecISOCtryLangEditObj edition of this instance.
	 */
	ICFSecISOCtryLangEditObj beginEdit();

	/**
	 *	End this edition of this ISOCtryLang instance.
	 *
	 *	@throws	CFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this ISOCtryLang instance.
	 *
	 *	@return	The ICFSecISOCtryLangEditObj edition of this instance.
	 */
	ICFSecISOCtryLangEditObj getEdit();

	/**
	 *	Get the current edition of this ISOCtryLang instance as a ICFSecISOCtryLangEditObj.
	 *
	 *	@return	The ICFSecISOCtryLangEditObj edition of this instance.
	 */
	ICFSecISOCtryLangEditObj getEditAsISOCtryLang();

	/**
	 *	Get the ICFSecISOCtryLangTableObj table cache which manages this instance.
	 *
	 *	@return	ICFSecISOCtryLangTableObj table cache which manages this instance.
	 */
	ICFSecISOCtryLangTableObj getISOCtryLangTable();

	/**
	 *	Get the ICFSecSchemaObj schema cache which manages this instance.
	 *
	 *	@return	ICFSecSchemaObj schema cache which manages this instance.
	 */
	ICFSecSchemaObj getSchema();

	/**
	 *	Get the CFSecISOCtryLangBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFSecISOCtryLangBuff instance which currently backs this object.
	 */
	CFSecISOCtryLangBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( CFSecISOCtryLangBuff value );

	/**
	 *	Get the CFSecISOCtryLangBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFSecISOCtryLangBuff instance which currently backs this object.
	 */
	CFSecISOCtryLangBuff getISOCtryLangBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	CFSecISOCtryLangPKey primary key for this instance.
	 */
	CFSecISOCtryLangPKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param CFSecISOCtryLangPKey primary key value for this instance.
	 */
	void setPKey( CFSecISOCtryLangPKey value );

	/**
	 *	Is this a new instance?
	 *
	 *	@return	True if this is a new instance, otherwise false if it has
	 *		been read, locked, or created.
	 */
	boolean getIsNew();

	/**
	 *	Indicate whether this is a new instance.
	 *	<p>
	 *	This method should only be used by implementation internals.
	 *
	 *	@param	True if this is a new instance, otherwise false.
	 */
	void setIsNew( boolean value );

	/**
	 *	Get the required short attribute ISOCtryId.
	 *
	 *	@return	The required short attribute ISOCtryId.
	 */
	short getRequiredISOCtryId();

	/**
	 *	Get the required short attribute ISOLangId.
	 *
	 *	@return	The required short attribute ISOLangId.
	 */
	short getRequiredISOLangId();

	/**
	 *	Get the required ICFSecISOCtryObj instance referenced by the Ctry key.
	 *
	 *	@return	The required ICFSecISOCtryObj instance referenced by the Ctry key.
	 */
	ICFSecISOCtryObj getRequiredContainerCtry();

	/**
	 *	Get the required ICFSecISOCtryObj instance referenced by the Ctry key.
	 *
	 *	@return	The required ICFSecISOCtryObj instance referenced by the Ctry key.
	 */
	ICFSecISOCtryObj getRequiredContainerCtry( boolean forceRead );

	/**
	 *	Get the required ICFSecISOLangObj instance referenced by the Lang key.
	 *
	 *	@return	The required ICFSecISOLangObj instance referenced by the Lang key.
	 */
	ICFSecISOLangObj getRequiredParentLang();

	/**
	 *	Get the required ICFSecISOLangObj instance referenced by the Lang key.
	 *
	 *	@return	The required ICFSecISOLangObj instance referenced by the Lang key.
	 */
	ICFSecISOLangObj getRequiredParentLang( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
