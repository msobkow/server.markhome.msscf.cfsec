// Description: Java 11 Object interface for CFSec TSecGroup.

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

public interface ICFSecTSecGroupObj
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
	 *	Realise this instance of a TSecGroup.
	 *
	 *	@return	CFSecTSecGroupObj instance which should be subsequently referenced.
	 */
	ICFSecTSecGroupObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFSecTSecGroupObj the reference to the cached or read (realised) instance.
	 */
	ICFSecTSecGroupObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFSecTSecGroupObj the reference to the cached or read (realised) instance.
	 */
	ICFSecTSecGroupObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this TSecGroup instance.
	 *
	 *	@return	The newly locked ICFSecTSecGroupEditObj edition of this instance.
	 */
	ICFSecTSecGroupEditObj beginEdit();

	/**
	 *	End this edition of this TSecGroup instance.
	 *
	 *	@throws	CFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this TSecGroup instance.
	 *
	 *	@return	The ICFSecTSecGroupEditObj edition of this instance.
	 */
	ICFSecTSecGroupEditObj getEdit();

	/**
	 *	Get the current edition of this TSecGroup instance as a ICFSecTSecGroupEditObj.
	 *
	 *	@return	The ICFSecTSecGroupEditObj edition of this instance.
	 */
	ICFSecTSecGroupEditObj getEditAsTSecGroup();

	/**
	 *	Get the ICFSecTSecGroupTableObj table cache which manages this instance.
	 *
	 *	@return	ICFSecTSecGroupTableObj table cache which manages this instance.
	 */
	ICFSecTSecGroupTableObj getTSecGroupTable();

	/**
	 *	Get the ICFSecSchemaObj schema cache which manages this instance.
	 *
	 *	@return	ICFSecSchemaObj schema cache which manages this instance.
	 */
	ICFSecSchemaObj getSchema();

	/**
	 *	Get the CFSecTSecGroupBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFSecTSecGroupBuff instance which currently backs this object.
	 */
	CFSecTSecGroupBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( CFSecTSecGroupBuff value );

	/**
	 *	Get the CFSecTSecGroupBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFSecTSecGroupBuff instance which currently backs this object.
	 */
	CFSecTSecGroupBuff getTSecGroupBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	CFSecTSecGroupPKey primary key for this instance.
	 */
	CFSecTSecGroupPKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param CFSecTSecGroupPKey primary key value for this instance.
	 */
	void setPKey( CFSecTSecGroupPKey value );

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
	 *	Get the required long attribute TenantId.
	 *
	 *	@return	The required long attribute TenantId.
	 */
	long getRequiredTenantId();

	/**
	 *	Get the required int attribute TSecGroupId.
	 *
	 *	@return	The required int attribute TSecGroupId.
	 */
	int getRequiredTSecGroupId();

	/**
	 *	Get the required String attribute Name.
	 *
	 *	@return	The required String attribute Name.
	 */
	String getRequiredName();

	/**
	 *	Get the required boolean attribute IsVisible.
	 *
	 *	@return	The required boolean attribute IsVisible.
	 */
	boolean getRequiredIsVisible();

	/**
	 *	Get the required ICFSecTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The required ICFSecTenantObj instance referenced by the Tenant key.
	 */
	ICFSecTenantObj getRequiredContainerTenant();

	/**
	 *	Get the required ICFSecTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The required ICFSecTenantObj instance referenced by the Tenant key.
	 */
	ICFSecTenantObj getRequiredContainerTenant( boolean forceRead );

	/**
	 *	Get the array of optional ICFSecTSecGrpIncObj array of instances referenced by the Include key.
	 *
	 *	@return	The optional ICFSecTSecGrpIncObj[] array of instances referenced by the Include key.
	 */
	List<ICFSecTSecGrpIncObj> getOptionalComponentsInclude();

	/**
	 *	Get the array of optional ICFSecTSecGrpIncObj array of instances referenced by the Include key.
	 *
	 *	@return	The optional ICFSecTSecGrpIncObj[] array of instances referenced by the Include key.
	 */
	List<ICFSecTSecGrpIncObj> getOptionalComponentsInclude( boolean forceRead );

	/**
	 *	Get the array of optional ICFSecTSecGrpMembObj array of instances referenced by the Member key.
	 *
	 *	@return	The optional ICFSecTSecGrpMembObj[] array of instances referenced by the Member key.
	 */
	List<ICFSecTSecGrpMembObj> getOptionalComponentsMember();

	/**
	 *	Get the array of optional ICFSecTSecGrpMembObj array of instances referenced by the Member key.
	 *
	 *	@return	The optional ICFSecTSecGrpMembObj[] array of instances referenced by the Member key.
	 */
	List<ICFSecTSecGrpMembObj> getOptionalComponentsMember( boolean forceRead );

	/**
	 *	Get the array of required ICFSecTSecGrpIncObj array of instances referenced by the IncByGroup key.
	 *
	 *	@return	The required ICFSecTSecGrpIncObj[] array of instances referenced by the IncByGroup key.
	 */
	List<ICFSecTSecGrpIncObj> getRequiredChildrenIncByGroup();

	/**
	 *	Get the array of required ICFSecTSecGrpIncObj array of instances referenced by the IncByGroup key.
	 *
	 *	@return	The required ICFSecTSecGrpIncObj[] array of instances referenced by the IncByGroup key.
	 */
	List<ICFSecTSecGrpIncObj> getRequiredChildrenIncByGroup( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
