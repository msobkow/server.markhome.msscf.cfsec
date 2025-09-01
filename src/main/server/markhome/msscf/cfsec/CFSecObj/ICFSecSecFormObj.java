// Description: Java 11 Object interface for CFSec SecForm.

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

public interface ICFSecSecFormObj
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
	 *	Realise this instance of a SecForm.
	 *
	 *	@return	CFSecSecFormObj instance which should be subsequently referenced.
	 */
	ICFSecSecFormObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFSecSecFormObj the reference to the cached or read (realised) instance.
	 */
	ICFSecSecFormObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFSecSecFormObj the reference to the cached or read (realised) instance.
	 */
	ICFSecSecFormObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this SecForm instance.
	 *
	 *	@return	The newly locked ICFSecSecFormEditObj edition of this instance.
	 */
	ICFSecSecFormEditObj beginEdit();

	/**
	 *	End this edition of this SecForm instance.
	 *
	 *	@throws	CFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this SecForm instance.
	 *
	 *	@return	The ICFSecSecFormEditObj edition of this instance.
	 */
	ICFSecSecFormEditObj getEdit();

	/**
	 *	Get the current edition of this SecForm instance as a ICFSecSecFormEditObj.
	 *
	 *	@return	The ICFSecSecFormEditObj edition of this instance.
	 */
	ICFSecSecFormEditObj getEditAsSecForm();

	/**
	 *	Get the ICFSecSecFormTableObj table cache which manages this instance.
	 *
	 *	@return	ICFSecSecFormTableObj table cache which manages this instance.
	 */
	ICFSecSecFormTableObj getSecFormTable();

	/**
	 *	Get the ICFSecSchemaObj schema cache which manages this instance.
	 *
	 *	@return	ICFSecSchemaObj schema cache which manages this instance.
	 */
	ICFSecSchemaObj getSchema();

	/**
	 *	Get the CFSecSecFormBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFSecSecFormBuff instance which currently backs this object.
	 */
	CFSecSecFormBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( CFSecSecFormBuff value );

	/**
	 *	Get the CFSecSecFormBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFSecSecFormBuff instance which currently backs this object.
	 */
	CFSecSecFormBuff getSecFormBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	CFSecSecFormPKey primary key for this instance.
	 */
	CFSecSecFormPKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param CFSecSecFormPKey primary key value for this instance.
	 */
	void setPKey( CFSecSecFormPKey value );

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
	 *	Get the required long attribute ClusterId.
	 *
	 *	@return	The required long attribute ClusterId.
	 */
	long getRequiredClusterId();

	/**
	 *	Get the required int attribute SecFormId.
	 *
	 *	@return	The required int attribute SecFormId.
	 */
	int getRequiredSecFormId();

	/**
	 *	Get the required int attribute SecAppId.
	 *
	 *	@return	The required int attribute SecAppId.
	 */
	int getRequiredSecAppId();

	/**
	 *	Get the required String attribute JEEServletMapName.
	 *
	 *	@return	The required String attribute JEEServletMapName.
	 */
	String getRequiredJEEServletMapName();

	/**
	 *	Get the required ICFSecClusterObj instance referenced by the Cluster key.
	 *
	 *	@return	The required ICFSecClusterObj instance referenced by the Cluster key.
	 */
	ICFSecClusterObj getRequiredOwnerCluster();

	/**
	 *	Get the required ICFSecClusterObj instance referenced by the Cluster key.
	 *
	 *	@return	The required ICFSecClusterObj instance referenced by the Cluster key.
	 */
	ICFSecClusterObj getRequiredOwnerCluster( boolean forceRead );

	/**
	 *	Get the required ICFSecSecAppObj instance referenced by the Application key.
	 *
	 *	@return	The required ICFSecSecAppObj instance referenced by the Application key.
	 */
	ICFSecSecAppObj getRequiredContainerApplication();

	/**
	 *	Get the required ICFSecSecAppObj instance referenced by the Application key.
	 *
	 *	@return	The required ICFSecSecAppObj instance referenced by the Application key.
	 */
	ICFSecSecAppObj getRequiredContainerApplication( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
