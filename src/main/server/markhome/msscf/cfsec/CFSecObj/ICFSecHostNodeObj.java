// Description: Java 11 Object interface for CFSec HostNode.

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

public interface ICFSecHostNodeObj
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
	 *	Realise this instance of a HostNode.
	 *
	 *	@return	CFSecHostNodeObj instance which should be subsequently referenced.
	 */
	ICFSecHostNodeObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFSecHostNodeObj the reference to the cached or read (realised) instance.
	 */
	ICFSecHostNodeObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFSecHostNodeObj the reference to the cached or read (realised) instance.
	 */
	ICFSecHostNodeObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this HostNode instance.
	 *
	 *	@return	The newly locked ICFSecHostNodeEditObj edition of this instance.
	 */
	ICFSecHostNodeEditObj beginEdit();

	/**
	 *	End this edition of this HostNode instance.
	 *
	 *	@throws	CFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this HostNode instance.
	 *
	 *	@return	The ICFSecHostNodeEditObj edition of this instance.
	 */
	ICFSecHostNodeEditObj getEdit();

	/**
	 *	Get the current edition of this HostNode instance as a ICFSecHostNodeEditObj.
	 *
	 *	@return	The ICFSecHostNodeEditObj edition of this instance.
	 */
	ICFSecHostNodeEditObj getEditAsHostNode();

	/**
	 *	Get the ICFSecHostNodeTableObj table cache which manages this instance.
	 *
	 *	@return	ICFSecHostNodeTableObj table cache which manages this instance.
	 */
	ICFSecHostNodeTableObj getHostNodeTable();

	/**
	 *	Get the ICFSecSchemaObj schema cache which manages this instance.
	 *
	 *	@return	ICFSecSchemaObj schema cache which manages this instance.
	 */
	ICFSecSchemaObj getSchema();

	/**
	 *	Get the CFSecHostNodeBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFSecHostNodeBuff instance which currently backs this object.
	 */
	CFSecHostNodeBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( CFSecHostNodeBuff value );

	/**
	 *	Get the CFSecHostNodeBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFSecHostNodeBuff instance which currently backs this object.
	 */
	CFSecHostNodeBuff getHostNodeBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	CFSecHostNodePKey primary key for this instance.
	 */
	CFSecHostNodePKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param CFSecHostNodePKey primary key value for this instance.
	 */
	void setPKey( CFSecHostNodePKey value );

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
	 *	Get the required long attribute HostNodeId.
	 *
	 *	@return	The required long attribute HostNodeId.
	 */
	long getRequiredHostNodeId();

	/**
	 *	Get the required String attribute Description.
	 *
	 *	@return	The required String attribute Description.
	 */
	String getRequiredDescription();

	/**
	 *	Get the required String attribute HostName.
	 *
	 *	@return	The required String attribute HostName.
	 */
	String getRequiredHostName();

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
	 *	Get the array of optional ICFSecServiceObj array of instances referenced by the Service key.
	 *
	 *	@return	The optional ICFSecServiceObj[] array of instances referenced by the Service key.
	 */
	List<ICFSecServiceObj> getOptionalComponentsService();

	/**
	 *	Get the array of optional ICFSecServiceObj array of instances referenced by the Service key.
	 *
	 *	@return	The optional ICFSecServiceObj[] array of instances referenced by the Service key.
	 */
	List<ICFSecServiceObj> getOptionalComponentsService( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
