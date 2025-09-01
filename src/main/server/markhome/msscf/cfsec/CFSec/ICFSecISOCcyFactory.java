
// Description: Java 11 Factory interface for ISOCcy.

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
 *	CFSecISOCcyFactory interface for ISOCcy
 */
public interface ICFSecISOCcyFactory
{

	/**
	 *	Allocate a primary key for ISOCcy instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecISOCcyPKey newPKey();

	/**
	 *	Allocate a primary history key for ISOCcy instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecISOCcyHPKey newHPKey();

	/**
	 *	Allocate a CcyCdIdx key over ISOCcy instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecISOCcyByCcyCdIdxKey newCcyCdIdxKey();

	/**
	 *	Allocate a CcyNmIdx key over ISOCcy instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecISOCcyByCcyNmIdxKey newCcyNmIdxKey();

	/**
	 *	Allocate a ISOCcy instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecISOCcyBuff newBuff();

	/**
	 *	Allocate a ISOCcy history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecISOCcyHBuff newHBuff();

}
