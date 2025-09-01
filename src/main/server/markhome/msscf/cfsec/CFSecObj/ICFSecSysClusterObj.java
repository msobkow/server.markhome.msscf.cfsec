// Description: Java 11 Object interface for CFSec SysCluster.

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

public interface ICFSecSysClusterObj
	extends ICFLibAnyObj
{
	String getClassCode();
	/**
	 *	Realise this instance of a SysCluster.
	 *
	 *	@return	CFSecSysClusterObj instance which should be subsequently referenced.
	 */
	ICFSecSysClusterObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFSecSysClusterObj the reference to the cached or read (realised) instance.
	 */
	ICFSecSysClusterObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFSecSysClusterObj the reference to the cached or read (realised) instance.
	 */
	ICFSecSysClusterObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this SysCluster instance.
	 *
	 *	@return	The newly locked ICFSecSysClusterEditObj edition of this instance.
	 */
	ICFSecSysClusterEditObj beginEdit();

	/**
	 *	End this edition of this SysCluster instance.
	 *
	 *	@throws	CFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this SysCluster instance.
	 *
	 *	@return	The ICFSecSysClusterEditObj edition of this instance.
	 */
	ICFSecSysClusterEditObj getEdit();

	/**
	 *	Get the current edition of this SysCluster instance as a ICFSecSysClusterEditObj.
	 *
	 *	@return	The ICFSecSysClusterEditObj edition of this instance.
	 */
	ICFSecSysClusterEditObj getEditAsSysCluster();

	/**
	 *	Get the ICFSecSysClusterTableObj table cache which manages this instance.
	 *
	 *	@return	ICFSecSysClusterTableObj table cache which manages this instance.
	 */
	ICFSecSysClusterTableObj getSysClusterTable();

	/**
	 *	Get the ICFSecSchemaObj schema cache which manages this instance.
	 *
	 *	@return	ICFSecSchemaObj schema cache which manages this instance.
	 */
	ICFSecSchemaObj getSchema();

	/**
	 *	Get the CFSecSysClusterBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFSecSysClusterBuff instance which currently backs this object.
	 */
	CFSecSysClusterBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( CFSecSysClusterBuff value );

	/**
	 *	Get the CFSecSysClusterBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFSecSysClusterBuff instance which currently backs this object.
	 */
	CFSecSysClusterBuff getSysClusterBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	CFSecSysClusterPKey primary key for this instance.
	 */
	CFSecSysClusterPKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param CFSecSysClusterPKey primary key value for this instance.
	 */
	void setPKey( CFSecSysClusterPKey value );

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
	 *	Get the required int attribute SingletonId.
	 *
	 *	@return	The required int attribute SingletonId.
	 */
	int getRequiredSingletonId();

	/**
	 *	Get the required long attribute ClusterId.
	 *
	 *	@return	The required long attribute ClusterId.
	 */
	long getRequiredClusterId();

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
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
