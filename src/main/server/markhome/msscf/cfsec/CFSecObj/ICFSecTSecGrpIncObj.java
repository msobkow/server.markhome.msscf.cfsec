// Description: Java 11 Object interface for CFSec TSecGrpInc.

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

public interface ICFSecTSecGrpIncObj
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
	 *	Realise this instance of a TSecGrpInc.
	 *
	 *	@return	CFSecTSecGrpIncObj instance which should be subsequently referenced.
	 */
	ICFSecTSecGrpIncObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFSecTSecGrpIncObj the reference to the cached or read (realised) instance.
	 */
	ICFSecTSecGrpIncObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFSecTSecGrpIncObj the reference to the cached or read (realised) instance.
	 */
	ICFSecTSecGrpIncObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this TSecGrpInc instance.
	 *
	 *	@return	The newly locked ICFSecTSecGrpIncEditObj edition of this instance.
	 */
	ICFSecTSecGrpIncEditObj beginEdit();

	/**
	 *	End this edition of this TSecGrpInc instance.
	 *
	 *	@throws	CFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this TSecGrpInc instance.
	 *
	 *	@return	The ICFSecTSecGrpIncEditObj edition of this instance.
	 */
	ICFSecTSecGrpIncEditObj getEdit();

	/**
	 *	Get the current edition of this TSecGrpInc instance as a ICFSecTSecGrpIncEditObj.
	 *
	 *	@return	The ICFSecTSecGrpIncEditObj edition of this instance.
	 */
	ICFSecTSecGrpIncEditObj getEditAsTSecGrpInc();

	/**
	 *	Get the ICFSecTSecGrpIncTableObj table cache which manages this instance.
	 *
	 *	@return	ICFSecTSecGrpIncTableObj table cache which manages this instance.
	 */
	ICFSecTSecGrpIncTableObj getTSecGrpIncTable();

	/**
	 *	Get the ICFSecSchemaObj schema cache which manages this instance.
	 *
	 *	@return	ICFSecSchemaObj schema cache which manages this instance.
	 */
	ICFSecSchemaObj getSchema();

	/**
	 *	Get the CFSecTSecGrpIncBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFSecTSecGrpIncBuff instance which currently backs this object.
	 */
	CFSecTSecGrpIncBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( CFSecTSecGrpIncBuff value );

	/**
	 *	Get the CFSecTSecGrpIncBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFSecTSecGrpIncBuff instance which currently backs this object.
	 */
	CFSecTSecGrpIncBuff getTSecGrpIncBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	CFSecTSecGrpIncPKey primary key for this instance.
	 */
	CFSecTSecGrpIncPKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param CFSecTSecGrpIncPKey primary key value for this instance.
	 */
	void setPKey( CFSecTSecGrpIncPKey value );

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
	 *	Get the required long attribute TSecGrpIncId.
	 *
	 *	@return	The required long attribute TSecGrpIncId.
	 */
	long getRequiredTSecGrpIncId();

	/**
	 *	Get the required int attribute TSecGroupId.
	 *
	 *	@return	The required int attribute TSecGroupId.
	 */
	int getRequiredTSecGroupId();

	/**
	 *	Get the required int attribute IncludeGroupId.
	 *
	 *	@return	The required int attribute IncludeGroupId.
	 */
	int getRequiredIncludeGroupId();

	/**
	 *	Get the required ICFSecTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The required ICFSecTenantObj instance referenced by the Tenant key.
	 */
	ICFSecTenantObj getRequiredOwnerTenant();

	/**
	 *	Get the required ICFSecTenantObj instance referenced by the Tenant key.
	 *
	 *	@return	The required ICFSecTenantObj instance referenced by the Tenant key.
	 */
	ICFSecTenantObj getRequiredOwnerTenant( boolean forceRead );

	/**
	 *	Get the required ICFSecTSecGroupObj instance referenced by the Group key.
	 *
	 *	@return	The required ICFSecTSecGroupObj instance referenced by the Group key.
	 */
	ICFSecTSecGroupObj getRequiredContainerGroup();

	/**
	 *	Get the required ICFSecTSecGroupObj instance referenced by the Group key.
	 *
	 *	@return	The required ICFSecTSecGroupObj instance referenced by the Group key.
	 */
	ICFSecTSecGroupObj getRequiredContainerGroup( boolean forceRead );

	/**
	 *	Get the required ICFSecTSecGroupObj instance referenced by the SubGroup key.
	 *
	 *	@return	The required ICFSecTSecGroupObj instance referenced by the SubGroup key.
	 */
	ICFSecTSecGroupObj getRequiredParentSubGroup();

	/**
	 *	Get the required ICFSecTSecGroupObj instance referenced by the SubGroup key.
	 *
	 *	@return	The required ICFSecTSecGroupObj instance referenced by the SubGroup key.
	 */
	ICFSecTSecGroupObj getRequiredParentSubGroup( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
