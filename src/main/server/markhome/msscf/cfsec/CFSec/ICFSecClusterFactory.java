
// Description: Java 11 Factory interface for Cluster.

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
 *	CFSecClusterFactory interface for Cluster
 */
public interface ICFSecClusterFactory
{

	/**
	 *	Allocate a primary key for Cluster instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecClusterPKey newPKey();

	/**
	 *	Allocate a primary history key for Cluster instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecClusterHPKey newHPKey();

	/**
	 *	Allocate a UDomNameIdx key over Cluster instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecClusterByUDomNameIdxKey newUDomNameIdxKey();

	/**
	 *	Allocate a UDescrIdx key over Cluster instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecClusterByUDescrIdxKey newUDescrIdxKey();

	/**
	 *	Allocate a Cluster instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecClusterBuff newBuff();

	/**
	 *	Allocate a Cluster history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecClusterHBuff newHBuff();

}
