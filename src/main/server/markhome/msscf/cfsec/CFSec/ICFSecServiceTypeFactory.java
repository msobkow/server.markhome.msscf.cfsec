
// Description: Java 11 Factory interface for ServiceType.

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
 *	CFSecServiceTypeFactory interface for ServiceType
 */
public interface ICFSecServiceTypeFactory
{

	/**
	 *	Allocate a primary key for ServiceType instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecServiceTypePKey newPKey();

	/**
	 *	Allocate a primary history key for ServiceType instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecServiceTypeHPKey newHPKey();

	/**
	 *	Allocate a UDescrIdx key over ServiceType instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecServiceTypeByUDescrIdxKey newUDescrIdxKey();

	/**
	 *	Allocate a ServiceType instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecServiceTypeBuff newBuff();

	/**
	 *	Allocate a ServiceType history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecServiceTypeHBuff newHBuff();

}
