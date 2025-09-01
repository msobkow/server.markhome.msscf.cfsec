
// Description: Java 11 Factory interface for SecGrpInc.

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
 *	CFSecSecGrpIncFactory interface for SecGrpInc
 */
public interface ICFSecSecGrpIncFactory
{

	/**
	 *	Allocate a primary key for SecGrpInc instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecGrpIncPKey newPKey();

	/**
	 *	Allocate a primary history key for SecGrpInc instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecGrpIncHPKey newHPKey();

	/**
	 *	Allocate a ClusterIdx key over SecGrpInc instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecGrpIncByClusterIdxKey newClusterIdxKey();

	/**
	 *	Allocate a GroupIdx key over SecGrpInc instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecGrpIncByGroupIdxKey newGroupIdxKey();

	/**
	 *	Allocate a IncludeIdx key over SecGrpInc instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecGrpIncByIncludeIdxKey newIncludeIdxKey();

	/**
	 *	Allocate a UIncludeIdx key over SecGrpInc instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecGrpIncByUIncludeIdxKey newUIncludeIdxKey();

	/**
	 *	Allocate a SecGrpInc instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecGrpIncBuff newBuff();

	/**
	 *	Allocate a SecGrpInc history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecGrpIncHBuff newHBuff();

}
