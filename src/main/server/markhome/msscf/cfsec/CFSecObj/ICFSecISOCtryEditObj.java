// Description: Java 11 Instance Edit Object interface for CFSec ISOCtry.

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

public interface ICFSecISOCtryEditObj
	extends ICFSecISOCtryObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base ICFSecISOCtryObj.
	 */
	ICFSecISOCtryObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFSecISOCtryObj.
	 */
	ICFSecISOCtryObj getOrigAsISOCtry();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	ICFSecISOCtryObj create();

	/*
	 *	Update the instance.
	 */
	CFSecISOCtryEditObj update();

	/*
	 *	Delete the instance.
	 */
	CFSecISOCtryEditObj deleteInstance();

	/**
	 *	Get the required String attribute ISOCode.
	 *
	 *	@return	The String value of the attribute ISOCode.
	 */
	String getRequiredISOCode();

	/**
	 *	Set the required String attribute ISOCode.
	 *
	 *	@param	value	the String value of the attribute ISOCode.
	 */
	void setRequiredISOCode( String value );

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The String value of the attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Set the required String attribute Name.
	 *
	 *	@param	value	the String value of the attribute Name.
	 */
	void setRequiredName( String value );

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
