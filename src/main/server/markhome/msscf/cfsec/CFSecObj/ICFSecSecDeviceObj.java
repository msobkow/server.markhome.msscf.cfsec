// Description: Java 11 Object interface for CFSec SecDevice.

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

public interface ICFSecSecDeviceObj
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
	 *	Realise this instance of a SecDevice.
	 *
	 *	@return	CFSecSecDeviceObj instance which should be subsequently referenced.
	 */
	ICFSecSecDeviceObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFSecSecDeviceObj the reference to the cached or read (realised) instance.
	 */
	ICFSecSecDeviceObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFSecSecDeviceObj the reference to the cached or read (realised) instance.
	 */
	ICFSecSecDeviceObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this SecDevice instance.
	 *
	 *	@return	The newly locked ICFSecSecDeviceEditObj edition of this instance.
	 */
	ICFSecSecDeviceEditObj beginEdit();

	/**
	 *	End this edition of this SecDevice instance.
	 *
	 *	@throws	CFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this SecDevice instance.
	 *
	 *	@return	The ICFSecSecDeviceEditObj edition of this instance.
	 */
	ICFSecSecDeviceEditObj getEdit();

	/**
	 *	Get the current edition of this SecDevice instance as a ICFSecSecDeviceEditObj.
	 *
	 *	@return	The ICFSecSecDeviceEditObj edition of this instance.
	 */
	ICFSecSecDeviceEditObj getEditAsSecDevice();

	/**
	 *	Get the ICFSecSecDeviceTableObj table cache which manages this instance.
	 *
	 *	@return	ICFSecSecDeviceTableObj table cache which manages this instance.
	 */
	ICFSecSecDeviceTableObj getSecDeviceTable();

	/**
	 *	Get the ICFSecSchemaObj schema cache which manages this instance.
	 *
	 *	@return	ICFSecSchemaObj schema cache which manages this instance.
	 */
	ICFSecSchemaObj getSchema();

	/**
	 *	Get the CFSecSecDeviceBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFSecSecDeviceBuff instance which currently backs this object.
	 */
	CFSecSecDeviceBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( CFSecSecDeviceBuff value );

	/**
	 *	Get the CFSecSecDeviceBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFSecSecDeviceBuff instance which currently backs this object.
	 */
	CFSecSecDeviceBuff getSecDeviceBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	CFSecSecDevicePKey primary key for this instance.
	 */
	CFSecSecDevicePKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param CFSecSecDevicePKey primary key value for this instance.
	 */
	void setPKey( CFSecSecDevicePKey value );

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
	 *	Get the required String attribute DevName.
	 *
	 *	@return	The required String attribute DevName.
	 */
	String getRequiredDevName();

	/**
	 *	Get the optional String attribute PubKey.
	 *
	 *	@return	The optional String attribute PubKey.
	 */
	String getOptionalPubKey();

	/**
	 *	Get the required ICFSecSecUserObj instance referenced by the SecUser key.
	 *
	 *	@return	The required ICFSecSecUserObj instance referenced by the SecUser key.
	 */
	ICFSecSecUserObj getRequiredContainerSecUser();

	/**
	 *	Get the required ICFSecSecUserObj instance referenced by the SecUser key.
	 *
	 *	@return	The required ICFSecSecUserObj instance referenced by the SecUser key.
	 */
	ICFSecSecUserObj getRequiredContainerSecUser( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
