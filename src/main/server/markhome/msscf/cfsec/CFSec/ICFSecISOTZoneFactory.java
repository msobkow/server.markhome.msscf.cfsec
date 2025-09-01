
// Description: Java 11 Factory interface for ISOTZone.

/*
 *	server.markhome.msscf.CFSec
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfsec.CFSec;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;

/*
 *	CFSecISOTZoneFactory interface for ISOTZone
 */
public interface ICFSecISOTZoneFactory
{

	/**
	 *	Allocate a primary key for ISOTZone instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecISOTZonePKey newPKey();

	/**
	 *	Allocate a primary history key for ISOTZone instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecISOTZoneHPKey newHPKey();

	/**
	 *	Allocate a OffsetIdx key over ISOTZone instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecISOTZoneByOffsetIdxKey newOffsetIdxKey();

	/**
	 *	Allocate a UTZNameIdx key over ISOTZone instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecISOTZoneByUTZNameIdxKey newUTZNameIdxKey();

	/**
	 *	Allocate a Iso8601Idx key over ISOTZone instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecISOTZoneByIso8601IdxKey newIso8601IdxKey();

	/**
	 *	Allocate a ISOTZone instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecISOTZoneBuff newBuff();

	/**
	 *	Allocate a ISOTZone history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecISOTZoneHBuff newHBuff();

}
