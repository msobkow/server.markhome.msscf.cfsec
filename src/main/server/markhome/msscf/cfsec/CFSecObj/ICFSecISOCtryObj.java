// Description: Java 11 Object interface for CFSec ISOCtry.

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

public interface ICFSecISOCtryObj
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
	 *	Realise this instance of a ISOCtry.
	 *
	 *	@return	CFSecISOCtryObj instance which should be subsequently referenced.
	 */
	ICFSecISOCtryObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFSecISOCtryObj the reference to the cached or read (realised) instance.
	 */
	ICFSecISOCtryObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFSecISOCtryObj the reference to the cached or read (realised) instance.
	 */
	ICFSecISOCtryObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this ISOCtry instance.
	 *
	 *	@return	The newly locked ICFSecISOCtryEditObj edition of this instance.
	 */
	ICFSecISOCtryEditObj beginEdit();

	/**
	 *	End this edition of this ISOCtry instance.
	 *
	 *	@throws	CFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this ISOCtry instance.
	 *
	 *	@return	The ICFSecISOCtryEditObj edition of this instance.
	 */
	ICFSecISOCtryEditObj getEdit();

	/**
	 *	Get the current edition of this ISOCtry instance as a ICFSecISOCtryEditObj.
	 *
	 *	@return	The ICFSecISOCtryEditObj edition of this instance.
	 */
	ICFSecISOCtryEditObj getEditAsISOCtry();

	/**
	 *	Get the ICFSecISOCtryTableObj table cache which manages this instance.
	 *
	 *	@return	ICFSecISOCtryTableObj table cache which manages this instance.
	 */
	ICFSecISOCtryTableObj getISOCtryTable();

	/**
	 *	Get the ICFSecSchemaObj schema cache which manages this instance.
	 *
	 *	@return	ICFSecSchemaObj schema cache which manages this instance.
	 */
	ICFSecSchemaObj getSchema();

	/**
	 *	Get the CFSecISOCtryBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFSecISOCtryBuff instance which currently backs this object.
	 */
	CFSecISOCtryBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( CFSecISOCtryBuff value );

	/**
	 *	Get the CFSecISOCtryBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFSecISOCtryBuff instance which currently backs this object.
	 */
	CFSecISOCtryBuff getISOCtryBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	CFSecISOCtryPKey primary key for this instance.
	 */
	CFSecISOCtryPKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param CFSecISOCtryPKey primary key value for this instance.
	 */
	void setPKey( CFSecISOCtryPKey value );

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
	 *	Get the required String attribute ISOCode.
	 *
	 *	@return	The required String attribute ISOCode.
	 */
	String getRequiredISOCode();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The required String attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Get the array of optional ICFSecISOCtryCcyObj array of instances referenced by the Ccy key.
	 *
	 *	@return	The optional ICFSecISOCtryCcyObj[] array of instances referenced by the Ccy key.
	 */
	List<ICFSecISOCtryCcyObj> getOptionalComponentsCcy();

	/**
	 *	Get the array of optional ICFSecISOCtryCcyObj array of instances referenced by the Ccy key.
	 *
	 *	@return	The optional ICFSecISOCtryCcyObj[] array of instances referenced by the Ccy key.
	 */
	List<ICFSecISOCtryCcyObj> getOptionalComponentsCcy( boolean forceRead );

	/**
	 *	Get the array of optional ICFSecISOCtryLangObj array of instances referenced by the Lang key.
	 *
	 *	@return	The optional ICFSecISOCtryLangObj[] array of instances referenced by the Lang key.
	 */
	List<ICFSecISOCtryLangObj> getOptionalComponentsLang();

	/**
	 *	Get the array of optional ICFSecISOCtryLangObj array of instances referenced by the Lang key.
	 *
	 *	@return	The optional ICFSecISOCtryLangObj[] array of instances referenced by the Lang key.
	 */
	List<ICFSecISOCtryLangObj> getOptionalComponentsLang( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
