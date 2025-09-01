
// Description: Java 11 Factory interface for ISOCtryCcy.

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
 *	CFSecISOCtryCcyFactory interface for ISOCtryCcy
 */
public interface ICFSecISOCtryCcyFactory
{

	/**
	 *	Allocate a primary key for ISOCtryCcy instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecISOCtryCcyPKey newPKey();

	/**
	 *	Allocate a primary history key for ISOCtryCcy instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecISOCtryCcyHPKey newHPKey();

	/**
	 *	Allocate a CtryIdx key over ISOCtryCcy instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecISOCtryCcyByCtryIdxKey newCtryIdxKey();

	/**
	 *	Allocate a CcyIdx key over ISOCtryCcy instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecISOCtryCcyByCcyIdxKey newCcyIdxKey();

	/**
	 *	Allocate a ISOCtryCcy instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecISOCtryCcyBuff newBuff();

	/**
	 *	Allocate a ISOCtryCcy history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecISOCtryCcyHBuff newHBuff();

}
