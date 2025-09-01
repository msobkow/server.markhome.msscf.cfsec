// Description: Java 11 Object interface for CFSec ISOLang.

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

public interface ICFSecISOLangObj
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
	 *	Realise this instance of a ISOLang.
	 *
	 *	@return	CFSecISOLangObj instance which should be subsequently referenced.
	 */
	ICFSecISOLangObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFSecISOLangObj the reference to the cached or read (realised) instance.
	 */
	ICFSecISOLangObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFSecISOLangObj the reference to the cached or read (realised) instance.
	 */
	ICFSecISOLangObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this ISOLang instance.
	 *
	 *	@return	The newly locked ICFSecISOLangEditObj edition of this instance.
	 */
	ICFSecISOLangEditObj beginEdit();

	/**
	 *	End this edition of this ISOLang instance.
	 *
	 *	@throws	CFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this ISOLang instance.
	 *
	 *	@return	The ICFSecISOLangEditObj edition of this instance.
	 */
	ICFSecISOLangEditObj getEdit();

	/**
	 *	Get the current edition of this ISOLang instance as a ICFSecISOLangEditObj.
	 *
	 *	@return	The ICFSecISOLangEditObj edition of this instance.
	 */
	ICFSecISOLangEditObj getEditAsISOLang();

	/**
	 *	Get the ICFSecISOLangTableObj table cache which manages this instance.
	 *
	 *	@return	ICFSecISOLangTableObj table cache which manages this instance.
	 */
	ICFSecISOLangTableObj getISOLangTable();

	/**
	 *	Get the ICFSecSchemaObj schema cache which manages this instance.
	 *
	 *	@return	ICFSecSchemaObj schema cache which manages this instance.
	 */
	ICFSecSchemaObj getSchema();

	/**
	 *	Get the CFSecISOLangBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFSecISOLangBuff instance which currently backs this object.
	 */
	CFSecISOLangBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( CFSecISOLangBuff value );

	/**
	 *	Get the CFSecISOLangBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFSecISOLangBuff instance which currently backs this object.
	 */
	CFSecISOLangBuff getISOLangBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	CFSecISOLangPKey primary key for this instance.
	 */
	CFSecISOLangPKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param CFSecISOLangPKey primary key value for this instance.
	 */
	void setPKey( CFSecISOLangPKey value );

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
	 *	Get the required short attribute ISOLangId.
	 *
	 *	@return	The required short attribute ISOLangId.
	 */
	short getRequiredISOLangId();

	/**
	 *	Get the required String attribute ISO6392Code.
	 *
	 *	@return	The required String attribute ISO6392Code.
	 */
	String getRequiredISO6392Code();

	/**
	 *	Get the optional String attribute ISO6391Code.
	 *
	 *	@return	The optional String attribute ISO6391Code.
	 */
	String getOptionalISO6391Code();

	/**
	 *	Get the required String attribute EnglishName.
	 *
	 *	@return	The required String attribute EnglishName.
	 */
	String getRequiredEnglishName();

	/**
	 *	Get the array of optional ICFSecISOCtryLangObj array of instances referenced by the Ctry key.
	 *
	 *	@return	The optional ICFSecISOCtryLangObj[] array of instances referenced by the Ctry key.
	 */
	List<ICFSecISOCtryLangObj> getOptionalChildrenCtry();

	/**
	 *	Get the array of optional ICFSecISOCtryLangObj array of instances referenced by the Ctry key.
	 *
	 *	@return	The optional ICFSecISOCtryLangObj[] array of instances referenced by the Ctry key.
	 */
	List<ICFSecISOCtryLangObj> getOptionalChildrenCtry( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
