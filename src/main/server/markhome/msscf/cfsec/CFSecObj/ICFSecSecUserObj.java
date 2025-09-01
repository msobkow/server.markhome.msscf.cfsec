// Description: Java 11 Object interface for CFSec SecUser.

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

public interface ICFSecSecUserObj
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
	 *	Realise this instance of a SecUser.
	 *
	 *	@return	CFSecSecUserObj instance which should be subsequently referenced.
	 */
	ICFSecSecUserObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFSecSecUserObj the reference to the cached or read (realised) instance.
	 */
	ICFSecSecUserObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFSecSecUserObj the reference to the cached or read (realised) instance.
	 */
	ICFSecSecUserObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this SecUser instance.
	 *
	 *	@return	The newly locked ICFSecSecUserEditObj edition of this instance.
	 */
	ICFSecSecUserEditObj beginEdit();

	/**
	 *	End this edition of this SecUser instance.
	 *
	 *	@throws	CFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this SecUser instance.
	 *
	 *	@return	The ICFSecSecUserEditObj edition of this instance.
	 */
	ICFSecSecUserEditObj getEdit();

	/**
	 *	Get the current edition of this SecUser instance as a ICFSecSecUserEditObj.
	 *
	 *	@return	The ICFSecSecUserEditObj edition of this instance.
	 */
	ICFSecSecUserEditObj getEditAsSecUser();

	/**
	 *	Get the ICFSecSecUserTableObj table cache which manages this instance.
	 *
	 *	@return	ICFSecSecUserTableObj table cache which manages this instance.
	 */
	ICFSecSecUserTableObj getSecUserTable();

	/**
	 *	Get the ICFSecSchemaObj schema cache which manages this instance.
	 *
	 *	@return	ICFSecSchemaObj schema cache which manages this instance.
	 */
	ICFSecSchemaObj getSchema();

	/**
	 *	Get the CFSecSecUserBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFSecSecUserBuff instance which currently backs this object.
	 */
	CFSecSecUserBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( CFSecSecUserBuff value );

	/**
	 *	Get the CFSecSecUserBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFSecSecUserBuff instance which currently backs this object.
	 */
	CFSecSecUserBuff getSecUserBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	CFSecSecUserPKey primary key for this instance.
	 */
	CFSecSecUserPKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param CFSecSecUserPKey primary key value for this instance.
	 */
	void setPKey( CFSecSecUserPKey value );

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
	 *	Get the required UUID attribute SecUserId.
	 *
	 *	@return	The required UUID attribute SecUserId.
	 */
	UUID getRequiredSecUserId();

	/**
	 *	Get the required String attribute LoginId.
	 *
	 *	@return	The required String attribute LoginId.
	 */
	String getRequiredLoginId();

	/**
	 *	Get the required String attribute EMailAddress.
	 *
	 *	@return	The required String attribute EMailAddress.
	 */
	String getRequiredEMailAddress();

	/**
	 *	Get the optional UUID attribute EMailConfirmUuid.
	 *
	 *	@return	The optional UUID attribute EMailConfirmUuid.
	 */
	UUID getOptionalEMailConfirmUuid();

	/**
	 *	Get the optional UUID attribute DfltDevUserId.
	 *
	 *	@return	The optional UUID attribute DfltDevUserId.
	 */
	UUID getOptionalDfltDevUserId();

	/**
	 *	Get the optional String attribute DfltDevName.
	 *
	 *	@return	The optional String attribute DfltDevName.
	 */
	String getOptionalDfltDevName();

	/**
	 *	Get the required String attribute PasswordHash.
	 *
	 *	@return	The required String attribute PasswordHash.
	 */
	String getRequiredPasswordHash();

	/**
	 *	Get the optional UUID attribute PasswordResetUuid.
	 *
	 *	@return	The optional UUID attribute PasswordResetUuid.
	 */
	UUID getOptionalPasswordResetUuid();

	/**
	 *	Get the array of optional ICFSecSecDeviceObj array of instances referenced by the SecDev key.
	 *
	 *	@return	The optional ICFSecSecDeviceObj[] array of instances referenced by the SecDev key.
	 */
	List<ICFSecSecDeviceObj> getOptionalComponentsSecDev();

	/**
	 *	Get the array of optional ICFSecSecDeviceObj array of instances referenced by the SecDev key.
	 *
	 *	@return	The optional ICFSecSecDeviceObj[] array of instances referenced by the SecDev key.
	 */
	List<ICFSecSecDeviceObj> getOptionalComponentsSecDev( boolean forceRead );

	/**
	 *	Get the optional ICFSecSecDeviceObj instance referenced by the DefDev key.
	 *
	 *	@return	The optional ICFSecSecDeviceObj instance referenced by the DefDev key.
	 */
	ICFSecSecDeviceObj getOptionalLookupDefDev();

	/**
	 *	Get the optional ICFSecSecDeviceObj instance referenced by the DefDev key.
	 *
	 *	@return	The optional ICFSecSecDeviceObj instance referenced by the DefDev key.
	 */
	ICFSecSecDeviceObj getOptionalLookupDefDev( boolean forceRead );

	/**
	 *	Get the array of optional ICFSecSecSessionObj array of instances referenced by the SecSess key.
	 *
	 *	@return	The optional ICFSecSecSessionObj[] array of instances referenced by the SecSess key.
	 */
	List<ICFSecSecSessionObj> getOptionalComponentsSecSess();

	/**
	 *	Get the array of optional ICFSecSecSessionObj array of instances referenced by the SecSess key.
	 *
	 *	@return	The optional ICFSecSecSessionObj[] array of instances referenced by the SecSess key.
	 */
	List<ICFSecSecSessionObj> getOptionalComponentsSecSess( boolean forceRead );

	/**
	 *	Get the array of optional ICFSecSecSessionObj array of instances referenced by the SecProxy key.
	 *
	 *	@return	The optional ICFSecSecSessionObj[] array of instances referenced by the SecProxy key.
	 */
	List<ICFSecSecSessionObj> getOptionalChildrenSecProxy();

	/**
	 *	Get the array of optional ICFSecSecSessionObj array of instances referenced by the SecProxy key.
	 *
	 *	@return	The optional ICFSecSecSessionObj[] array of instances referenced by the SecProxy key.
	 */
	List<ICFSecSecSessionObj> getOptionalChildrenSecProxy( boolean forceRead );

	/**
	 *	Get the array of optional ICFSecSecGrpMembObj array of instances referenced by the SecGrpMemb key.
	 *
	 *	@return	The optional ICFSecSecGrpMembObj[] array of instances referenced by the SecGrpMemb key.
	 */
	List<ICFSecSecGrpMembObj> getOptionalChildrenSecGrpMemb();

	/**
	 *	Get the array of optional ICFSecSecGrpMembObj array of instances referenced by the SecGrpMemb key.
	 *
	 *	@return	The optional ICFSecSecGrpMembObj[] array of instances referenced by the SecGrpMemb key.
	 */
	List<ICFSecSecGrpMembObj> getOptionalChildrenSecGrpMemb( boolean forceRead );

	/**
	 *	Get the array of optional ICFSecTSecGrpMembObj array of instances referenced by the TSecGrpMemb key.
	 *
	 *	@return	The optional ICFSecTSecGrpMembObj[] array of instances referenced by the TSecGrpMemb key.
	 */
	List<ICFSecTSecGrpMembObj> getOptionalChildrenTSecGrpMemb();

	/**
	 *	Get the array of optional ICFSecTSecGrpMembObj array of instances referenced by the TSecGrpMemb key.
	 *
	 *	@return	The optional ICFSecTSecGrpMembObj[] array of instances referenced by the TSecGrpMemb key.
	 */
	List<ICFSecTSecGrpMembObj> getOptionalChildrenTSecGrpMemb( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
