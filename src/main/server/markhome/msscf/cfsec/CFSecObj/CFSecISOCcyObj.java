// Description: Java 11 base object instance implementation for CFSec ISOCcy.

/*
 *	server.markhome.msscf.CFSec
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfsec.CFSecObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import server.markhome.msscf.cfsec.CFSec.*;

public class CFSecISOCcyObj
	implements ICFSecISOCcyObj
{
	public final static String CLASS_CODE = "a003";
	protected ICFSecSecUserObj createdBy = null;
	protected ICFSecSecUserObj updatedBy = null;
	protected boolean isNew;
	protected ICFSecISOCcyEditObj edit;
	protected ICFSecSchemaObj schema;
	protected CFSecISOCcyPKey pKey;
	protected CFSecISOCcyBuff buff;

	public CFSecISOCcyObj() {
		isNew = true;
	}

	public CFSecISOCcyObj( ICFSecSchemaObj argSchema ) {
		schema = argSchema;
		isNew = true;
		edit = null;
	}

	public String getClassCode() {
		return( CLASS_CODE );
	}

	public String getGenDefName() {
		return( "ISOCcy" );
	}

	public ICFLibAnyObj getScope() {
		return( null );
	}

	public ICFLibAnyObj getObjScope() {
		return( null );
	}

	public String getObjName() {
		String objName;
		objName = getRequiredISOCode();
		return( objName );
	}

	public ICFLibAnyObj getObjQualifier( Class qualifyingClass ) {
		ICFLibAnyObj container = this;
		if( qualifyingClass != null ) {
			while( container != null ) {
				if( container instanceof ICFSecClusterObj ) {
					break;
				}
				else if( container instanceof ICFSecTenantObj ) {
					break;
				}
				else if( qualifyingClass.isInstance( container ) ) {
					break;
				}
				container = container.getObjScope();
			}
		}
		else {
			while( container != null ) {
				if( container instanceof ICFSecClusterObj ) {
					break;
				}
				else if( container instanceof ICFSecTenantObj ) {
					break;
				}
				container = container.getObjScope();
			}
		}
		return( container );
	}

	public ICFLibAnyObj getNamedObject( Class qualifyingClass, String objName ) {
		ICFLibAnyObj topContainer = getObjQualifier( qualifyingClass );
		if( topContainer == null ) {
			return( null );
		}
		ICFLibAnyObj namedObject = topContainer.getNamedObject( objName );
		return( namedObject );
	}

	public ICFLibAnyObj getNamedObject( String objName ) {
		String nextName;
		String remainingName;
		ICFLibAnyObj subObj = null;
		ICFLibAnyObj retObj;
		int nextDot = objName.indexOf( '.' );
		if( nextDot >= 0 ) {
			nextName = objName.substring( 0, nextDot );
			remainingName = objName.substring( nextDot + 1 );
		}
		else {
			nextName = objName;
			remainingName = null;
		}
		if( remainingName == null ) {
			retObj = subObj;
		}
		else if( subObj == null ) {
			retObj = null;
		}
		else {
			retObj = subObj.getNamedObject( remainingName );
		}
		return( retObj );
	}

	public String getObjQualifiedName() {
		String qualName = getObjName();
		ICFLibAnyObj container = getObjScope();
		String containerName;
		while( container != null ) {
			if( container instanceof ICFSecClusterObj ) {
				container = null;
			}
			else if( container instanceof ICFSecTenantObj ) {
				container = null;
			}
			else {
				containerName = container.getObjName();
				qualName = containerName + "." + qualName;
				container = container.getObjScope();
			}
		}
		return( qualName );
	}

	public String getObjFullName() {
		String fullName = getObjName();
		ICFLibAnyObj container = getObjScope();
		String containerName;
		while( container != null ) {
			if( container instanceof ICFSecClusterObj ) {
				container = null;
			}
			else if( container instanceof ICFSecTenantObj ) {
				container = null;
			}
			else {
				containerName = container.getObjName();
				fullName = containerName + "." + fullName;
				container = container.getObjScope();
			}
		}
		return( fullName );
	}

	public ICFSecISOCcyObj realise() {
		ICFSecISOCcyObj retobj = ((ICFSecSchemaObj)schema).getISOCcyTableObj().realiseISOCcy(
			(ICFSecISOCcyObj)this );
		return( (ICFSecISOCcyObj)retobj );
	}

	public void forget() {
		((ICFSecSchemaObj)schema).getISOCcyTableObj().reallyDeepDisposeISOCcy( (ICFSecISOCcyObj)this );
	}

	public ICFSecISOCcyObj read() {
		ICFSecISOCcyObj retobj = ((ICFSecSchemaObj)schema).getISOCcyTableObj().readISOCcyByIdIdx( getPKey().getRequiredISOCcyId(), false );
		return( (ICFSecISOCcyObj)retobj );
	}

	public ICFSecISOCcyObj read( boolean forceRead ) {
		ICFSecISOCcyObj retobj = ((ICFSecSchemaObj)schema).getISOCcyTableObj().readISOCcyByIdIdx( getPKey().getRequiredISOCcyId(), forceRead );
		return( (ICFSecISOCcyObj)retobj );
	}

	public ICFSecISOCcyTableObj getISOCcyTable() {
		return( ((ICFSecSchemaObj)schema).getISOCcyTableObj() );
	}

	public ICFSecSchemaObj getSchema() {
		return( schema );
	}

	public void setSchema( ICFSecSchemaObj value ) {
		schema = value;
	}

	public CFSecISOCcyBuff getBuff() {
		if( buff == null ) {
			if( isNew ) {
				buff = ((ICFSecSchema)schema.getBackingStore()).getFactoryISOCcy().newBuff();
			}
			else {
				// Read the data buff via the backing store
				buff = ((ICFSecSchema)schema.getBackingStore()).getTableISOCcy().readDerivedByIdIdx( ((ICFSecSchemaObj)schema).getAuthorization(),
						getPKey().getRequiredISOCcyId() );
				if( buff != null ) {
					copyBuffToPKey();
				}
			}
		}
		return( buff );
	}

	public void setBuff( CFSecISOCcyBuff value ) {
		if( ! ( ( value == null ) || ( value instanceof CFSecISOCcyBuff ) ) ) {
			throw new CFLibUnsupportedClassException( getClass(),
				"setBuff",
				"value",
				value,
				"CFSecISOCcyBuff" );
		}
		buff = value;
		copyBuffToPKey();
	}

	public CFSecISOCcyBuff getISOCcyBuff() {
		return( (CFSecISOCcyBuff)getBuff() );
	}

	public CFSecISOCcyPKey getPKey() {
		if( pKey == null ) {
			pKey = ((ICFSecSchema)schema.getBackingStore()).getFactoryISOCcy().newPKey();
		}
		return( pKey );
	}

	public void setPKey( CFSecISOCcyPKey value ) {
		if( pKey != value ) {
			pKey = value;
			copyPKeyToBuff();
		}
	}

	public boolean getIsNew() {
		return( isNew );
	}

	public void setIsNew( boolean value ) {
		isNew = value;
	}

	public ICFSecISOCcyEditObj beginEdit() {
		if( edit != null ) {
			throw new CFLibUsageException( getClass(), "beginEdit", "An edit is already open" );
		}
		ICFSecISOCcyObj lockobj;
		if( getIsNew() ) {
			lockobj = (ICFSecISOCcyObj)this;
		}
		else {
			lockobj = ((ICFSecSchemaObj)schema).getISOCcyTableObj().lockISOCcy( getPKey() );
		}
		edit = ((ICFSecSchemaObj)schema).getISOCcyTableObj().newEditInstance( lockobj );
		return( (ICFSecISOCcyEditObj)edit );
	}

	public void endEdit() {
		edit = null;
	}

	public ICFSecISOCcyEditObj getEdit() {
		return( edit );
	}

	public ICFSecISOCcyEditObj getEditAsISOCcy() {
		return( (ICFSecISOCcyEditObj)edit );
	}

	public ICFSecSecUserObj getCreatedBy() {
		if( createdBy == null ) {
			CFSecISOCcyBuff buff = getBuff();
			createdBy = ((ICFSecSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getCreatedByUserId() );
		}
		return( createdBy );
	}

	public Calendar getCreatedAt() {
		return( getBuff().getCreatedAt() );
	}

	public ICFSecSecUserObj getUpdatedBy() {
		if( updatedBy == null ) {
			CFSecISOCcyBuff buff = getBuff();
			updatedBy = ((ICFSecSchemaObj)getSchema()).getSecUserTableObj().readSecUserByIdIdx( buff.getUpdatedByUserId() );
		}
		return( updatedBy );
	}

	public Calendar getUpdatedAt() {
		return( getBuff().getUpdatedAt() );
	}

	public short getRequiredISOCcyId() {
		return( getPKey().getRequiredISOCcyId() );
	}

	public String getRequiredISOCode() {
		return( getISOCcyBuff().getRequiredISOCode() );
	}

	public String getRequiredName() {
		return( getISOCcyBuff().getRequiredName() );
	}

	public String getOptionalUnitSymbol() {
		return( getISOCcyBuff().getOptionalUnitSymbol() );
	}

	public short getRequiredPrecis() {
		return( getISOCcyBuff().getRequiredPrecis() );
	}

	public List<ICFSecISOCtryCcyObj> getOptionalChildrenCtry() {
		List<ICFSecISOCtryCcyObj> retval;
		retval = ((ICFSecSchemaObj)schema).getISOCtryCcyTableObj().readISOCtryCcyByCcyIdx( getPKey().getRequiredISOCcyId(),
			false );
		return( retval );
	}

	public List<ICFSecISOCtryCcyObj> getOptionalChildrenCtry( boolean forceRead ) {
		List<ICFSecISOCtryCcyObj> retval;
		retval = ((ICFSecSchemaObj)schema).getISOCtryCcyTableObj().readISOCtryCcyByCcyIdx( getPKey().getRequiredISOCcyId(),
			forceRead );
		return( retval );
	}

	public void copyPKeyToBuff() {
		if( buff != null ) {
			buff.setRequiredISOCcyId( getPKey().getRequiredISOCcyId() );
		}
		if( edit != null ) {
			edit.copyPKeyToBuff();
		}
	}

	public void copyBuffToPKey() {
		getPKey().setRequiredISOCcyId( buff.getRequiredISOCcyId() );
	}
}
