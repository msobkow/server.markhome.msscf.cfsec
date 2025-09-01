
// Description: Java 11 Factory interface for SecDevice.

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
 *	CFSecSecDeviceFactory interface for SecDevice
 */
public interface ICFSecSecDeviceFactory
{

	/**
	 *	Allocate a primary key for SecDevice instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecDevicePKey newPKey();

	/**
	 *	Allocate a primary history key for SecDevice instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecDeviceHPKey newHPKey();

	/**
	 *	Allocate a NameIdx key over SecDevice instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecDeviceByNameIdxKey newNameIdxKey();

	/**
	 *	Allocate a UserIdx key over SecDevice instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecDeviceByUserIdxKey newUserIdxKey();

	/**
	 *	Allocate a SecDevice instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecDeviceBuff newBuff();

	/**
	 *	Allocate a SecDevice history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecSecDeviceHBuff newHBuff();

}
