// Description: Java 11 Object interface for CFSec ISOCcy.

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

public interface ICFSecISOCcyObj
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
	 *	Realise this instance of a ISOCcy.
	 *
	 *	@return	CFSecISOCcyObj instance which should be subsequently referenced.
	 */
	ICFSecISOCcyObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFSecISOCcyObj the reference to the cached or read (realised) instance.
	 */
	ICFSecISOCcyObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFSecISOCcyObj the reference to the cached or read (realised) instance.
	 */
	ICFSecISOCcyObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this ISOCcy instance.
	 *
	 *	@return	The newly locked ICFSecISOCcyEditObj edition of this instance.
	 */
	ICFSecISOCcyEditObj beginEdit();

	/**
	 *	End this edition of this ISOCcy instance.
	 *
	 *	@throws	CFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this ISOCcy instance.
	 *
	 *	@return	The ICFSecISOCcyEditObj edition of this instance.
	 */
	ICFSecISOCcyEditObj getEdit();

	/**
	 *	Get the current edition of this ISOCcy instance as a ICFSecISOCcyEditObj.
	 *
	 *	@return	The ICFSecISOCcyEditObj edition of this instance.
	 */
	ICFSecISOCcyEditObj getEditAsISOCcy();

	/**
	 *	Get the ICFSecISOCcyTableObj table cache which manages this instance.
	 *
	 *	@return	ICFSecISOCcyTableObj table cache which manages this instance.
	 */
	ICFSecISOCcyTableObj getISOCcyTable();

	/**
	 *	Get the ICFSecSchemaObj schema cache which manages this instance.
	 *
	 *	@return	ICFSecSchemaObj schema cache which manages this instance.
	 */
	ICFSecSchemaObj getSchema();

	/**
	 *	Get the CFSecISOCcyBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFSecISOCcyBuff instance which currently backs this object.
	 */
	CFSecISOCcyBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( CFSecISOCcyBuff value );

	/**
	 *	Get the CFSecISOCcyBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFSecISOCcyBuff instance which currently backs this object.
	 */
	CFSecISOCcyBuff getISOCcyBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	CFSecISOCcyPKey primary key for this instance.
	 */
	CFSecISOCcyPKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param CFSecISOCcyPKey primary key value for this instance.
	 */
	void setPKey( CFSecISOCcyPKey value );

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
	 *	Get the required short attribute ISOCcyId.
	 *
	 *	@return	The required short attribute ISOCcyId.
	 */
	short getRequiredISOCcyId();

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
	 *	Get the optional String attribute UnitSymbol.
	 *
	 *	@return	The optional String attribute UnitSymbol.
	 */
	String getOptionalUnitSymbol();

	/**
	 *	Get the required short attribute Precis.
	 *
	 *	@return	The required short attribute Precis.
	 */
	short getRequiredPrecis();

	/**
	 *	Get the array of optional ICFSecISOCtryCcyObj array of instances referenced by the Ctry key.
	 *
	 *	@return	The optional ICFSecISOCtryCcyObj[] array of instances referenced by the Ctry key.
	 */
	List<ICFSecISOCtryCcyObj> getOptionalChildrenCtry();

	/**
	 *	Get the array of optional ICFSecISOCtryCcyObj array of instances referenced by the Ctry key.
	 *
	 *	@return	The optional ICFSecISOCtryCcyObj[] array of instances referenced by the Ctry key.
	 */
	List<ICFSecISOCtryCcyObj> getOptionalChildrenCtry( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
