// Description: Java 11 Object interface for CFSec SecSession.

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

public interface ICFSecSecSessionObj
	extends ICFLibAnyObj
{
	String getClassCode();
	/**
	 *	Realise this instance of a SecSession.
	 *
	 *	@return	CFSecSecSessionObj instance which should be subsequently referenced.
	 */
	ICFSecSecSessionObj realise();

	/**
	 *	Forget this instance from the cache.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 */
	void forget();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFSecSecSessionObj the reference to the cached or read (realised) instance.
	 */
	ICFSecSecSessionObj read();

	/**
	 *	Re-read this instance by it's primary key.
	 *
	 *	@return	ICFSecSecSessionObj the reference to the cached or read (realised) instance.
	 */
	ICFSecSecSessionObj read( boolean forceRead );

	/**
	 *	Initialize and return a locked edition of this SecSession instance.
	 *
	 *	@return	The newly locked ICFSecSecSessionEditObj edition of this instance.
	 */
	ICFSecSecSessionEditObj beginEdit();

	/**
	 *	End this edition of this SecSession instance.
	 *
	 *	@throws	CFLibNotSupportedException if you try to end a read-only view.
	 */
	void endEdit();

	/**
	 *	Get the current edition of this SecSession instance.
	 *
	 *	@return	The ICFSecSecSessionEditObj edition of this instance.
	 */
	ICFSecSecSessionEditObj getEdit();

	/**
	 *	Get the current edition of this SecSession instance as a ICFSecSecSessionEditObj.
	 *
	 *	@return	The ICFSecSecSessionEditObj edition of this instance.
	 */
	ICFSecSecSessionEditObj getEditAsSecSession();

	/**
	 *	Get the ICFSecSecSessionTableObj table cache which manages this instance.
	 *
	 *	@return	ICFSecSecSessionTableObj table cache which manages this instance.
	 */
	ICFSecSecSessionTableObj getSecSessionTable();

	/**
	 *	Get the ICFSecSchemaObj schema cache which manages this instance.
	 *
	 *	@return	ICFSecSchemaObj schema cache which manages this instance.
	 */
	ICFSecSchemaObj getSchema();

	/**
	 *	Get the CFSecSecSessionBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFSecSecSessionBuff instance which currently backs this object.
	 */
	CFSecSecSessionBuff getBuff();

	/**
	 *	Internal use only.
	 */
	void setBuff( CFSecSecSessionBuff value );

	/**
	 *	Get the CFSecSecSessionBuff instance which currently backs this instance.
	 *	<p>
	 *	This value <i>will</i> change for read-only instances, so you should
	 *	not hold on to the value as a reference anywhere outside the current call stack.
	 *
	 *	@return	CFSecSecSessionBuff instance which currently backs this object.
	 */
	CFSecSecSessionBuff getSecSessionBuff();

	/**
	 *	Get the primary key of this instance.
	 *
	 *	@return	CFSecSecSessionPKey primary key for this instance.
	 */
	CFSecSecSessionPKey getPKey();

	/**
	 *	Set the primary key of this instance.
	 *	<p>
	 *	This method should only be invoked by implementation internals.
	 *
	 *	@param CFSecSecSessionPKey primary key value for this instance.
	 */
	void setPKey( CFSecSecSessionPKey value );

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
	 *	Get the required UUID attribute SecSessionId.
	 *
	 *	@return	The required UUID attribute SecSessionId.
	 */
	UUID getRequiredSecSessionId();

	/**
	 *	Get the required UUID attribute SecUserId.
	 *
	 *	@return	The required UUID attribute SecUserId.
	 */
	UUID getRequiredSecUserId();

	/**
	 *	Get the optional String attribute SecDevName.
	 *
	 *	@return	The optional String attribute SecDevName.
	 */
	String getOptionalSecDevName();

	/**
	 *	Get the required Calendar attribute Start.
	 *
	 *	@return	The required Calendar attribute Start.
	 */
	Calendar getRequiredStart();

	/**
	 *	Get the optional Calendar attribute Finish.
	 *
	 *	@return	The optional Calendar attribute Finish.
	 */
	Calendar getOptionalFinish();

	/**
	 *	Get the optional UUID attribute SecProxyId.
	 *
	 *	@return	The optional UUID attribute SecProxyId.
	 */
	UUID getOptionalSecProxyId();

	/**
	 *	Get the required ICFSecSecUserObj instance referenced by the SecUser key.
	 *
	 *	@return	The required ICFSecSecUserObj instance referenced by the SecUser key.
	 */
	ICFSecSecUserObj getRequiredContainerSecUser();

	/**
	 *	Get the required ICFSecSecUserObj instance referenced by the SecUser key.
	 *
	 *	@return	The required ICFSecSecUserObj instance referenced by the SecUser key.
	 */
	ICFSecSecUserObj getRequiredContainerSecUser( boolean forceRead );

	/**
	 *	Get the required ICFSecSecUserObj instance referenced by the SecProxy key.
	 *
	 *	@return	The required ICFSecSecUserObj instance referenced by the SecProxy key.
	 */
	ICFSecSecUserObj getRequiredParentSecProxy();

	/**
	 *	Get the required ICFSecSecUserObj instance referenced by the SecProxy key.
	 *
	 *	@return	The required ICFSecSecUserObj instance referenced by the SecProxy key.
	 */
	ICFSecSecUserObj getRequiredParentSecProxy( boolean forceRead );

	/**
	 *	Internal use only.
	 */
	void copyPKeyToBuff();

	/**
	 *	Internal use only.
	 */
	void copyBuffToPKey();

}
