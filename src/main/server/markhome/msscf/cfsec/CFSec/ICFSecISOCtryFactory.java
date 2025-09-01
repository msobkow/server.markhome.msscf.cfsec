
// Description: Java 11 Factory interface for ISOCtry.

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
 *	CFSecISOCtryFactory interface for ISOCtry
 */
public interface ICFSecISOCtryFactory
{

	/**
	 *	Allocate a primary key for ISOCtry instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecISOCtryPKey newPKey();

	/**
	 *	Allocate a primary history key for ISOCtry instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecISOCtryHPKey newHPKey();

	/**
	 *	Allocate a ISOCodeIdx key over ISOCtry instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecISOCtryByISOCodeIdxKey newISOCodeIdxKey();

	/**
	 *	Allocate a NameIdx key over ISOCtry instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecISOCtryByNameIdxKey newNameIdxKey();

	/**
	 *	Allocate a ISOCtry instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecISOCtryBuff newBuff();

	/**
	 *	Allocate a ISOCtry history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecISOCtryHBuff newHBuff();

}
