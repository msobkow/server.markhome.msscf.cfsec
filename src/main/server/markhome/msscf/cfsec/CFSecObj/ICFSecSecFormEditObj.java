// Description: Java 11 Instance Edit Object interface for CFSec SecForm.

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

public interface ICFSecSecFormEditObj
	extends ICFSecSecFormObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base ICFSecSecFormObj.
	 */
	ICFSecSecFormObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFSecSecFormObj.
	 */
	ICFSecSecFormObj getOrigAsSecForm();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	ICFSecSecFormObj create();

	/*
	 *	Update the instance.
	 */
	CFSecSecFormEditObj update();

	/*
	 *	Delete the instance.
	 */
	CFSecSecFormEditObj deleteInstance();

	/**
	 *	Get the required String attribute JEEServletMapName.
	 *
	 *	@return	The String value of the attribute JEEServletMapName.
	 */
	String getRequiredJEEServletMapName();

	/**
	 *	Set the required String attribute JEEServletMapName.
	 *
	 *	@param	value	the String value of the attribute JEEServletMapName.
	 */
	void setRequiredJEEServletMapName( String value );

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
	 *	Get the ICFSecSecAppObj instance referenced by the Application key.
	 *
	 *	@return	The ICFSecSecAppObj instance referenced by the Application key.
	 */
	ICFSecSecAppObj getRequiredContainerApplication();

	/**
	 *	Set the ICFSecSecAppObj instance referenced by the Application key.
	 *
	 *	@param	value	the ICFSecSecAppObj instance to be referenced by the Application key.
	 */
	void setRequiredContainerApplication( ICFSecSecAppObj value );

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
