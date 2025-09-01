// Description: Java 11 Instance Edit Object interface for CFSec SecSession.

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

public interface ICFSecSecSessionEditObj
	extends ICFSecSecSessionObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base ICFSecSecSessionObj.
	 */
	ICFSecSecSessionObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFSecSecSessionObj.
	 */
	ICFSecSecSessionObj getOrigAsSecSession();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	ICFSecSecSessionObj create();

	/*
	 *	Update the instance.
	 */
	CFSecSecSessionEditObj update();

	/*
	 *	Delete the instance.
	 */
	CFSecSecSessionEditObj deleteInstance();

	/**
	 *	Get the optional String attribute SecDevName.
	 *
	 *	@return	The String value of the attribute SecDevName.
	 */
	String getOptionalSecDevName();

	/**
	 *	Set the optional String attribute SecDevName.
	 *
	 *	@param	value	the String value of the attribute SecDevName.
	 */
	void setOptionalSecDevName( String value );

	/**
	 *	Get the required Calendar attribute Start.
	 *
	 *	@return	The Calendar value of the attribute Start.
	 */
	Calendar getRequiredStart();

	/**
	 *	Set the required Calendar attribute Start.
	 *
	 *	@param	value	the Calendar value of the attribute Start.
	 */
	void setRequiredStart( Calendar value );

	/**
	 *	Get the optional Calendar attribute Finish.
	 *
	 *	@return	The Calendar value of the attribute Finish.
	 */
	Calendar getOptionalFinish();

	/**
	 *	Set the optional Calendar attribute Finish.
	 *
	 *	@param	value	the Calendar value of the attribute Finish.
	 */
	void setOptionalFinish( Calendar value );

	/**
	 *	Get the ICFSecSecUserObj instance referenced by the SecUser key.
	 *
	 *	@return	The ICFSecSecUserObj instance referenced by the SecUser key.
	 */
	ICFSecSecUserObj getRequiredContainerSecUser();

	/**
	 *	Set the ICFSecSecUserObj instance referenced by the SecUser key.
	 *
	 *	@param	value	the ICFSecSecUserObj instance to be referenced by the SecUser key.
	 */
	void setRequiredContainerSecUser( ICFSecSecUserObj value );

	/**
	 *	Get the ICFSecSecUserObj instance referenced by the SecProxy key.
	 *
	 *	@return	The ICFSecSecUserObj instance referenced by the SecProxy key.
	 */
	ICFSecSecUserObj getRequiredParentSecProxy();

	/**
	 *	Set the ICFSecSecUserObj instance referenced by the SecProxy key.
	 *
	 *	@param	value	the ICFSecSecUserObj instance to be referenced by the SecProxy key.
	 */
	void setRequiredParentSecProxy( ICFSecSecUserObj value );
}
