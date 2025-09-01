// Description: Java 11 Object interface for CFSec SecGrpInc.

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

public interface ICFSecSecGrpIncObj
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
	 *	Realise this instance of a SecGrpInc.
	 *
	 *	@return	CFSecSecGrpIncObj instance which should be subsequently referenced.
	 */
	ICFSecSecGrpIncObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFSecSecGrpIncObj the reference to the cached or read (realised) instance.
	 */
	ICFSecSecGrpIncObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFSecSecGrpIncObj the reference to the cached or read (realised) instance.
	 */
	ICFSecSecGrpIncObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this SecGrpInc instance.
	 *
	 *	@return	The newly locked ICFSecSecGrpIncEditObj edition of this instance.
	 */
	ICFSecSecGrpIncEditObj beginEdit();

	/**
	 *	End this edition of this SecGrpInc instance.
	 *
	 *	@throws	CFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this SecGrpInc instance.
	 *
	 *	@return	The ICFSecSecGrpIncEditObj edition of this instance.
	 */
	ICFSecSecGrpIncEditObj getEdit();

	/**
	 *	Get the current edition of this SecGrpInc instance as a ICFSecSecGrpIncEditObj.
	 *
	 *	@return	The ICFSecSecGrpIncEditObj edition of this instance.
	 */
	ICFSecSecGrpIncEditObj getEditAsSecGrpInc();

	/**
	 *	Get the ICFSecSecGrpIncTableObj table cache which manages this instance.
	 *
	 *	@return	ICFSecSecGrpIncTableObj table cache which manages this instance.
	 */
	ICFSecSecGrpIncTableObj getSecGrpIncTable();

	/**
	 *	Get the ICFSecSchemaObj schema cache which manages this instance.
	 *
	 *	@return	ICFSecSchemaObj schema cache which manages this instance.
	 */
	ICFSecSchemaObj getSchema();

	/**
	 *	Get the CFSecSecGrpIncBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFSecSecGrpIncBuff instance which currently backs this object.
	 */
	CFSecSecGrpIncBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( CFSecSecGrpIncBuff value );

	/**
	 *	Get the CFSecSecGrpIncBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFSecSecGrpIncBuff instance which currently backs this object.
	 */
	CFSecSecGrpIncBuff getSecGrpIncBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	CFSecSecGrpIncPKey primary key for this instance.
	 */
	CFSecSecGrpIncPKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param CFSecSecGrpIncPKey primary key value for this instance.
	 */
	void setPKey( CFSecSecGrpIncPKey value );

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
	 *	Get the required long attribute SecGrpIncId.
	 *
	 *	@return	The required long attribute SecGrpIncId.
	 */
	long getRequiredSecGrpIncId();

	/**
	 *	Get the required int attribute SecGroupId.
	 *
	 *	@return	The required int attribute SecGroupId.
	 */
	int getRequiredSecGroupId();

	/**
	 *	Get the required int attribute IncludeGroupId.
	 *
	 *	@return	The required int attribute IncludeGroupId.
	 */
	int getRequiredIncludeGroupId();

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
	 *	Get the required ICFSecSecGroupObj instance referenced by the SubGroup key.
	 *
	 *	@return	The required ICFSecSecGroupObj instance referenced by the SubGroup key.
	 */
	ICFSecSecGroupObj getRequiredParentSubGroup();

	/**
	 *	Get the required ICFSecSecGroupObj instance referenced by the SubGroup key.
	 *
	 *	@return	The required ICFSecSecGroupObj instance referenced by the SubGroup key.
	 */
	ICFSecSecGroupObj getRequiredParentSubGroup( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
