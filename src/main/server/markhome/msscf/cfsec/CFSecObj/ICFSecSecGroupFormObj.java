// Description: Java 11 Object interface for CFSec SecGroupForm.

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

public interface ICFSecSecGroupFormObj
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
	 *	Realise this instance of a SecGroupForm.
	 *
	 *	@return	CFSecSecGroupFormObj instance which should be subsequently referenced.
	 */
	ICFSecSecGroupFormObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFSecSecGroupFormObj the reference to the cached or read (realised) instance.
	 */
	ICFSecSecGroupFormObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFSecSecGroupFormObj the reference to the cached or read (realised) instance.
	 */
	ICFSecSecGroupFormObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this SecGroupForm instance.
	 *
	 *	@return	The newly locked ICFSecSecGroupFormEditObj edition of this instance.
	 */
	ICFSecSecGroupFormEditObj beginEdit();

	/**
	 *	End this edition of this SecGroupForm instance.
	 *
	 *	@throws	CFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this SecGroupForm instance.
	 *
	 *	@return	The ICFSecSecGroupFormEditObj edition of this instance.
	 */
	ICFSecSecGroupFormEditObj getEdit();

	/**
	 *	Get the current edition of this SecGroupForm instance as a ICFSecSecGroupFormEditObj.
	 *
	 *	@return	The ICFSecSecGroupFormEditObj edition of this instance.
	 */
	ICFSecSecGroupFormEditObj getEditAsSecGroupForm();

	/**
	 *	Get the ICFSecSecGroupFormTableObj table cache which manages this instance.
	 *
	 *	@return	ICFSecSecGroupFormTableObj table cache which manages this instance.
	 */
	ICFSecSecGroupFormTableObj getSecGroupFormTable();

	/**
	 *	Get the ICFSecSchemaObj schema cache which manages this instance.
	 *
	 *	@return	ICFSecSchemaObj schema cache which manages this instance.
	 */
	ICFSecSchemaObj getSchema();

	/**
	 *	Get the CFSecSecGroupFormBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFSecSecGroupFormBuff instance which currently backs this object.
	 */
	CFSecSecGroupFormBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( CFSecSecGroupFormBuff value );

	/**
	 *	Get the CFSecSecGroupFormBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFSecSecGroupFormBuff instance which currently backs this object.
	 */
	CFSecSecGroupFormBuff getSecGroupFormBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	CFSecSecGroupFormPKey primary key for this instance.
	 */
	CFSecSecGroupFormPKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param CFSecSecGroupFormPKey primary key value for this instance.
	 */
	void setPKey( CFSecSecGroupFormPKey value );

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
	 *	Get the required long attribute SecGroupFormId.
	 *
	 *	@return	The required long attribute SecGroupFormId.
	 */
	long getRequiredSecGroupFormId();

	/**
	 *	Get the required int attribute SecGroupId.
	 *
	 *	@return	The required int attribute SecGroupId.
	 */
	int getRequiredSecGroupId();

	/**
	 *	Get the required int attribute SecAppId.
	 *
	 *	@return	The required int attribute SecAppId.
	 */
	int getRequiredSecAppId();

	/**
	 *	Get the required int attribute SecFormId.
	 *
	 *	@return	The required int attribute SecFormId.
	 */
	int getRequiredSecFormId();

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
	 *	Get the required ICFSecSecGroupObj instance referenced by the Group key.
	 *
	 *	@return	The required ICFSecSecGroupObj instance referenced by the Group key.
	 */
	ICFSecSecGroupObj getRequiredContainerGroup();

	/**
	 *	Get the required ICFSecSecGroupObj instance referenced by the Group key.
	 *
	 *	@return	The required ICFSecSecGroupObj instance referenced by the Group key.
	 */
	ICFSecSecGroupObj getRequiredContainerGroup( boolean forceRead );

	/**
	 *	Get the required ICFSecSecAppObj instance referenced by the App key.
	 *
	 *	@return	The required ICFSecSecAppObj instance referenced by the App key.
	 */
	ICFSecSecAppObj getRequiredParentApp();

	/**
	 *	Get the required ICFSecSecAppObj instance referenced by the App key.
	 *
	 *	@return	The required ICFSecSecAppObj instance referenced by the App key.
	 */
	ICFSecSecAppObj getRequiredParentApp( boolean forceRead );

	/**
	 *	Get the required ICFSecSecFormObj instance referenced by the Form key.
	 *
	 *	@return	The required ICFSecSecFormObj instance referenced by the Form key.
	 */
	ICFSecSecFormObj getRequiredParentForm();

	/**
	 *	Get the required ICFSecSecFormObj instance referenced by the Form key.
	 *
	 *	@return	The required ICFSecSecFormObj instance referenced by the Form key.
	 */
	ICFSecSecFormObj getRequiredParentForm( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
