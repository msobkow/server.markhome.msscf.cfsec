// Description: Java 11 Instance Edit Object interface for CFSec SecGroupForm.

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

public interface ICFSecSecGroupFormEditObj
	extends ICFSecSecGroupFormObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base ICFSecSecGroupFormObj.
	 */
	ICFSecSecGroupFormObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFSecSecGroupFormObj.
	 */
	ICFSecSecGroupFormObj getOrigAsSecGroupForm();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	ICFSecSecGroupFormObj create();

	/*
	 *	Update the instance.
	 */
	CFSecSecGroupFormEditObj update();

	/*
	 *	Delete the instance.
	 */
	CFSecSecGroupFormEditObj deleteInstance();

	/**
	 *	Get the ICFSecClusterObj instance referenced by the Cluster key.
	 *
	 *	@return	The ICFSecClusterObj instance referenced by the Cluster key.
	 */
	ICFSecClusterObj getRequiredOwnerCluster();

	/**
	 *	Set the ICFSecClusterObj instance referenced by the Cluster key.
	 *
	 *	@param	value	the ICFSecClusterObj instance to be referenced by the Cluster key.
	 */
	void setRequiredOwnerCluster( ICFSecClusterObj value );

	/**
	 *	Get the ICFSecSecGroupObj instance referenced by the Group key.
	 *
	 *	@return	The ICFSecSecGroupObj instance referenced by the Group key.
	 */
	ICFSecSecGroupObj getRequiredContainerGroup();

	/**
	 *	Set the ICFSecSecGroupObj instance referenced by the Group key.
	 *
	 *	@param	value	the ICFSecSecGroupObj instance to be referenced by the Group key.
	 */
	void setRequiredContainerGroup( ICFSecSecGroupObj value );

	/**
	 *	Get the ICFSecSecAppObj instance referenced by the App key.
	 *
	 *	@return	The ICFSecSecAppObj instance referenced by the App key.
	 */
	ICFSecSecAppObj getRequiredParentApp();

	/**
	 *	Set the ICFSecSecAppObj instance referenced by the App key.
	 *
	 *	@param	value	the ICFSecSecAppObj instance to be referenced by the App key.
	 */
	void setRequiredParentApp( ICFSecSecAppObj value );

	/**
	 *	Get the ICFSecSecFormObj instance referenced by the Form key.
	 *
	 *	@return	The ICFSecSecFormObj instance referenced by the Form key.
	 */
	ICFSecSecFormObj getRequiredParentForm();

	/**
	 *	Set the ICFSecSecFormObj instance referenced by the Form key.
	 *
	 *	@param	value	the ICFSecSecFormObj instance to be referenced by the Form key.
	 */
	void setRequiredParentForm( ICFSecSecFormObj value );

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
