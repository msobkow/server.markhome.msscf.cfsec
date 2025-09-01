// Description: Java 11 Instance Edit Object interface for CFSec ISOCtryCcy.

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

public interface ICFSecISOCtryCcyEditObj
	extends ICFSecISOCtryCcyObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base ICFSecISOCtryCcyObj.
	 */
	ICFSecISOCtryCcyObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFSecISOCtryCcyObj.
	 */
	ICFSecISOCtryCcyObj getOrigAsISOCtryCcy();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	ICFSecISOCtryCcyObj create();

	/*
	 *	Update the instance.
	 */
	CFSecISOCtryCcyEditObj update();

	/*
	 *	Delete the instance.
	 */
	CFSecISOCtryCcyEditObj deleteInstance();

	/**
	 *	Get the ICFSecISOCtryObj instance referenced by the Ctry key.
	 *
	 *	@return	The ICFSecISOCtryObj instance referenced by the Ctry key.
	 */
	ICFSecISOCtryObj getRequiredContainerCtry();

	/**
	 *	Set the ICFSecISOCtryObj instance referenced by the Ctry key.
	 *
	 *	@param	value	the ICFSecISOCtryObj instance to be referenced by the Ctry key.
	 */
	void setRequiredContainerCtry( ICFSecISOCtryObj value );

	/**
	 *	Get the ICFSecISOCcyObj instance referenced by the Ccy key.
	 *
	 *	@return	The ICFSecISOCcyObj instance referenced by the Ccy key.
	 */
	ICFSecISOCcyObj getRequiredParentCcy();

	/**
	 *	Set the ICFSecISOCcyObj instance referenced by the Ccy key.
	 *
	 *	@param	value	the ICFSecISOCcyObj instance to be referenced by the Ccy key.
	 */
	void setRequiredParentCcy( ICFSecISOCcyObj value );

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
