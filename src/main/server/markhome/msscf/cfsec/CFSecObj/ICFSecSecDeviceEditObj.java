// Description: Java 11 Instance Edit Object interface for CFSec SecDevice.

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

public interface ICFSecSecDeviceEditObj
	extends ICFSecSecDeviceObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base ICFSecSecDeviceObj.
	 */
	ICFSecSecDeviceObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFSecSecDeviceObj.
	 */
	ICFSecSecDeviceObj getOrigAsSecDevice();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	ICFSecSecDeviceObj create();

	/*
	 *	Update the instance.
	 */
	CFSecSecDeviceEditObj update();

	/*
	 *	Delete the instance.
	 */
	CFSecSecDeviceEditObj deleteInstance();

	/**
	 *	Get the required String attribute DevName.
	 *
	 *	@return	The String value of the attribute DevName.
	 */
	String getRequiredDevName();

	/**
	 *	Set the required String attribute DevName.
	 *
	 *	@param	value	the String value of the attribute DevName.
	 */
	void setRequiredDevName( String value );

	/**
	 *	Get the optional String attribute PubKey.
	 *
	 *	@return	The String value of the attribute PubKey.
	 */
	String getOptionalPubKey();

	/**
	 *	Set the optional String attribute PubKey.
	 *
	 *	@param	value	the String value of the attribute PubKey.
	 */
	void setOptionalPubKey( String value );

	/**
	 *	Get the ICFSecSecUserObj instance referenced by the SecUser key.
	 *
	 *	@return	The ICFSecSecUserObj instance referenced by the SecUser key.
	 */
	ICFSecSecUserObj getRequiredContainerSecUser();

	/**
	 *	Set the ICFSecSecUserObj instance referenced by the SecUser key.
	 *
	 *	@param	value	the ICFSecSecUserObj instance to be referenced by the SecUser key.
	 */
	void setRequiredContainerSecUser( ICFSecSecUserObj value );

	/**
	 *	Set the user who created this instance.
	 *
	 *	@param	value	The ICFSecSecUserObj instance who created this instance.
	 */
	void setCreatedBy( ICFSecSecUserObj value );

	/**
	 *	Set the Calendar date-time this instance was created.
	 *
	 *	@param	value	The Calendar value for the create time of the instance.
	 */
	void setCreatedAt( Calendar value );

	/**
	 *	Set the user who updated this instance.
	 *
	 *	@param	value	The ICFSecSecUserObj instance who updated this instance.
	 */
	void setUpdatedBy( ICFSecSecUserObj value );

	/**
	 *	Set the Calendar date-time this instance was updated.
	 *
	 *	@param	value	The Calendar value for the create time of the instance.
	 */
	void setUpdatedAt( Calendar value );}
