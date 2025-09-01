// Description: Java 11 Object interface for CFSec Tenant.

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

public interface ICFSecTenantObj
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
	 *	Realise this instance of a Tenant.
	 *
	 *	@return	CFSecTenantObj instance which should be subsequently referenced.
	 */
	ICFSecTenantObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFSecTenantObj the reference to the cached or read (realised) instance.
	 */
	ICFSecTenantObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFSecTenantObj the reference to the cached or read (realised) instance.
	 */
	ICFSecTenantObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this Tenant instance.
	 *
	 *	@return	The newly locked ICFSecTenantEditObj edition of this instance.
	 */
	ICFSecTenantEditObj beginEdit();

	/**
	 *	End this edition of this Tenant instance.
	 *
	 *	@throws	CFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this Tenant instance.
	 *
	 *	@return	The ICFSecTenantEditObj edition of this instance.
	 */
	ICFSecTenantEditObj getEdit();

	/**
	 *	Get the current edition of this Tenant instance as a ICFSecTenantEditObj.
	 *
	 *	@return	The ICFSecTenantEditObj edition of this instance.
	 */
	ICFSecTenantEditObj getEditAsTenant();

	/**
	 *	Get the ICFSecTenantTableObj table cache which manages this instance.
	 *
	 *	@return	ICFSecTenantTableObj table cache which manages this instance.
	 */
	ICFSecTenantTableObj getTenantTable();

	/**
	 *	Get the ICFSecSchemaObj schema cache which manages this instance.
	 *
	 *	@return	ICFSecSchemaObj schema cache which manages this instance.
	 */
	ICFSecSchemaObj getSchema();

	/**
	 *	Get the CFSecTenantBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFSecTenantBuff instance which currently backs this object.
	 */
	CFSecTenantBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( CFSecTenantBuff value );

	/**
	 *	Get the CFSecTenantBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFSecTenantBuff instance which currently backs this object.
	 */
	CFSecTenantBuff getTenantBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	CFSecTenantPKey primary key for this instance.
	 */
	CFSecTenantPKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param CFSecTenantPKey primary key value for this instance.
	 */
	void setPKey( CFSecTenantPKey value );

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
	 *	Get the required long attribute Id.
	 *
	 *	@return	The required long attribute Id.
	 */
	long getRequiredId();

	/**
	 *	Get the required String attribute TenantName.
	 *
	 *	@return	The required String attribute TenantName.
	 */
	String getRequiredTenantName();

	/**
	 *	Get the required ICFSecClusterObj instance referenced by the Cluster key.
	 *
	 *	@return	The required ICFSecClusterObj instance referenced by the Cluster key.
	 */
	ICFSecClusterObj getRequiredContainerCluster();

	/**
	 *	Get the required ICFSecClusterObj instance referenced by the Cluster key.
	 *
	 *	@return	The required ICFSecClusterObj instance referenced by the Cluster key.
	 */
	ICFSecClusterObj getRequiredContainerCluster( boolean forceRead );

	/**
	 *	Get the array of optional ICFSecTSecGroupObj array of instances referenced by the TSecGroup key.
	 *
	 *	@return	The optional ICFSecTSecGroupObj[] array of instances referenced by the TSecGroup key.
	 */
	List<ICFSecTSecGroupObj> getOptionalComponentsTSecGroup();

	/**
	 *	Get the array of optional ICFSecTSecGroupObj array of instances referenced by the TSecGroup key.
	 *
	 *	@return	The optional ICFSecTSecGroupObj[] array of instances referenced by the TSecGroup key.
	 */
	List<ICFSecTSecGroupObj> getOptionalComponentsTSecGroup( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
