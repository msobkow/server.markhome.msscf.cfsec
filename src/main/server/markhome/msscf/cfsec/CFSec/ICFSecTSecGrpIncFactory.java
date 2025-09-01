
// Description: Java 11 Factory interface for TSecGrpInc.

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
 *	CFSecTSecGrpIncFactory interface for TSecGrpInc
 */
public interface ICFSecTSecGrpIncFactory
{

	/**
	 *	Allocate a primary key for TSecGrpInc instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecTSecGrpIncPKey newPKey();

	/**
	 *	Allocate a primary history key for TSecGrpInc instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecTSecGrpIncHPKey newHPKey();

	/**
	 *	Allocate a TenantIdx key over TSecGrpInc instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecTSecGrpIncByTenantIdxKey newTenantIdxKey();

	/**
	 *	Allocate a GroupIdx key over TSecGrpInc instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecTSecGrpIncByGroupIdxKey newGroupIdxKey();

	/**
	 *	Allocate a IncludeIdx key over TSecGrpInc instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecTSecGrpIncByIncludeIdxKey newIncludeIdxKey();

	/**
	 *	Allocate a UIncludeIdx key over TSecGrpInc instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecTSecGrpIncByUIncludeIdxKey newUIncludeIdxKey();

	/**
	 *	Allocate a TSecGrpInc instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecTSecGrpIncBuff newBuff();

	/**
	 *	Allocate a TSecGrpInc history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecTSecGrpIncHBuff newHBuff();

}
