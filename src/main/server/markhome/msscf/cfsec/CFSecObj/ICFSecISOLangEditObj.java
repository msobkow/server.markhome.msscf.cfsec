// Description: Java 11 Instance Edit Object interface for CFSec ISOLang.

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

public interface ICFSecISOLangEditObj
	extends ICFSecISOLangObj
{
	/*
	 *	Get the original for this edition as the base type for the class hierarchy.
	 *
	 *	@return The original, non-modifiable instance as a base ICFSecISOLangObj.
	 */
	ICFSecISOLangObj getOrig();

	/*
	 *	Get the original for this edition cast as the specified type.
	 *
	 *	@return The original, non-modifiable instance cast to a ICFSecISOLangObj.
	 */
	ICFSecISOLangObj getOrigAsISOLang();

	/*
	 *	create() may return a different instance than the
	 *	one used to invoke the operation.  All future references
	 *	should be to the returned instance, not the original
	 *	invoker.  You should lose all references to the original
	 *	invoker.
	 *
	 *	@return The created instance.
	 */
	ICFSecISOLangObj create();

	/*
	 *	Update the instance.
	 */
	CFSecISOLangEditObj update();

	/*
	 *	Delete the instance.
	 */
	CFSecISOLangEditObj deleteInstance();

	/**
	 *	Get the required String attribute ISO6392Code.
	 *
	 *	@return	The String value of the attribute ISO6392Code.
	 */
	String getRequiredISO6392Code();

	/**
	 *	Set the required String attribute ISO6392Code.
	 *
	 *	@param	value	the String value of the attribute ISO6392Code.
	 */
	void setRequiredISO6392Code( String value );

	/**
	 *	Get the optional String attribute ISO6391Code.
	 *
	 *	@return	The String value of the attribute ISO6391Code.
	 */
	String getOptionalISO6391Code();

	/**
	 *	Set the optional String attribute ISO6391Code.
	 *
	 *	@param	value	the String value of the attribute ISO6391Code.
	 */
	void setOptionalISO6391Code( String value );

	/**
	 *	Get the required String attribute EnglishName.
	 *
	 *	@return	The String value of the attribute EnglishName.
	 */
	String getRequiredEnglishName();

	/**
	 *	Set the required String attribute EnglishName.
	 *
	 *	@param	value	the String value of the attribute EnglishName.
	 */
	void setRequiredEnglishName( String value );

	/**
	 *	Set the user who created this instance.
	 *
	 *	@param	value	The ICFSecSecUserObj instance who created this instance.
	 */
	void setCreatedBy( ICFSecSecUserObj value );

	/**
	 *	Set the Calendar date-time this instance was created.
	 *
	 *	@param	value	The Calendar value for the create time of the instance.
	 */
	void setCreatedAt( Calendar value );

	/**
	 *	Set the user who updated this instance.
	 *
	 *	@param	value	The ICFSecSecUserObj instance who updated this instance.
	 */
	void setUpdatedBy( ICFSecSecUserObj value );

	/**
	 *	Set the Calendar date-time this instance was updated.
	 *
	 *	@param	value	The Calendar value for the create time of the instance.
	 */
	void setUpdatedAt( Calendar value );}
