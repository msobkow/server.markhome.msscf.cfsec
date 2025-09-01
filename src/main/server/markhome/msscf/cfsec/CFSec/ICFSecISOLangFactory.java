
// Description: Java 11 Factory interface for ISOLang.

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
 *	CFSecISOLangFactory interface for ISOLang
 */
public interface ICFSecISOLangFactory
{

	/**
	 *	Allocate a primary key for ISOLang instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecISOLangPKey newPKey();

	/**
	 *	Allocate a primary history key for ISOLang instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecISOLangHPKey newHPKey();

	/**
	 *	Allocate a Code3Idx key over ISOLang instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecISOLangByCode3IdxKey newCode3IdxKey();

	/**
	 *	Allocate a Code2Idx key over ISOLang instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecISOLangByCode2IdxKey newCode2IdxKey();

	/**
	 *	Allocate a ISOLang instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecISOLangBuff newBuff();

	/**
	 *	Allocate a ISOLang history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecISOLangHBuff newHBuff();

}
