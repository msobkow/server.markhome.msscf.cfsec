
// Description: Java 11 Factory interface for ISOCtryLang.

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
 *	CFSecISOCtryLangFactory interface for ISOCtryLang
 */
public interface ICFSecISOCtryLangFactory
{

	/**
	 *	Allocate a primary key for ISOCtryLang instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecISOCtryLangPKey newPKey();

	/**
	 *	Allocate a primary history key for ISOCtryLang instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecISOCtryLangHPKey newHPKey();

	/**
	 *	Allocate a CtryIdx key over ISOCtryLang instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecISOCtryLangByCtryIdxKey newCtryIdxKey();

	/**
	 *	Allocate a LangIdx key over ISOCtryLang instances.
	 *
	 *	@return	The new instance.
	 */
	CFSecISOCtryLangByLangIdxKey newLangIdxKey();

	/**
	 *	Allocate a ISOCtryLang instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecISOCtryLangBuff newBuff();

	/**
	 *	Allocate a ISOCtryLang history instance buffer.
	 *
	 *	@return	The new instance.
	 */
	CFSecISOCtryLangHBuff newHBuff();

}
