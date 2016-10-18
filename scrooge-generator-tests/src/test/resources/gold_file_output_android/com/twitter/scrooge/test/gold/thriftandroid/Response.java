/**
 * Autogenerated by Scrooge
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package com.twitter.scrooge.test.gold.thriftandroid;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

// No additional import required for struct/union.

public class Response implements TBase<Response, Response._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("Response");

  private static final TField STATUS_CODE_FIELD_DESC = new TField("statusCode", TType.I32, (short)1);
  private static final TField RESPONSE_UNION_FIELD_DESC = new TField("responseUnion", TType.STRUCT, (short)2);


  private int statusCode;
  private ResponseUnion responseUnion;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    STATUS_CODE((short)1, "statusCode"),
    RESPONSE_UNION((short)2, "responseUnion");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // STATUS_CODE
          return STATUS_CODE;
        case 2: // RESPONSE_UNION
          return RESPONSE_UNION;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }


  // isset id assignments
  private static final int __STATUSCODE_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STATUS_CODE, new FieldMetaData("statusCode", TFieldRequirementType.DEFAULT,
      new FieldValueMetaData(TType.I32)));
    tmpMap.put(_Fields.RESPONSE_UNION, new FieldMetaData("responseUnion", TFieldRequirementType.DEFAULT,
      new StructMetaData(TType.STRUCT, ResponseUnion.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(Response.class, metaDataMap);
  }


  public Response() {
  }

  public Response(
      Integer statusCode,
      ResponseUnion responseUnion
  ) {
    this();
    if(statusCode != null) {
      this.statusCode = statusCode;
      __isset_bit_vector.set(__STATUSCODE_ISSET_ID, true);

    }
    if(responseUnion != null) {
      this.responseUnion = responseUnion;
    }
  }


  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Response(Response other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.statusCode = other.statusCode;
    if (other.isSet(_Fields.RESPONSE_UNION)) {
      this.responseUnion = new ResponseUnion(other.responseUnion);
    }
  }

  public Response deepCopy() {
    return new Response(this);
  }

  @java.lang.Override
  public void clear() {
    __isset_bit_vector.set(__STATUSCODE_ISSET_ID, false);
    this.statusCode = 0;
    this.responseUnion = null;
  }



  @SuppressWarnings("unchecked")
  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STATUS_CODE:
      if (value == null) {
        __isset_bit_vector.clear(__STATUSCODE_ISSET_ID);
      } else {
        this.statusCode = (Integer) value;
        __isset_bit_vector.set(__STATUSCODE_ISSET_ID, true);
      }
      break;
    case RESPONSE_UNION:
      if (value == null) {
        this.responseUnion = null;
      } else {
        this.responseUnion = (ResponseUnion) value;
      }
      break;
    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STATUS_CODE:
      return new Integer(this.statusCode);
    case RESPONSE_UNION:
      return this.responseUnion;
    }
    throw new IllegalStateException();
  }

  @SuppressWarnings("unchecked")
  public <Any> Any get(_Fields field) {
    switch(field) {
      case STATUS_CODE:
          Any rval_statusCode = (Any)((Integer) getFieldValue(field));
          return rval_statusCode;
      case RESPONSE_UNION:
          Any rval_responseUnion = (Any)((ResponseUnion) getFieldValue(field));
          return rval_responseUnion;
      default:
        throw new IllegalStateException("Invalid field type");
    }
  }

  /** Returns true if field corresponding to field is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    switch (field) {
    case STATUS_CODE:
        return __isset_bit_vector.get(__STATUSCODE_ISSET_ID);
    case RESPONSE_UNION:
        return responseUnion != null;
    }
    throw new IllegalStateException();
  }

  @java.lang.Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Response)
      return this.equals((Response)that);
    return false;
  }

  public boolean equals(Response that) {
    if (that == null)
      return false;
    boolean this_present_statusCode = true;
    boolean that_present_statusCode = true;
    if (this_present_statusCode || that_present_statusCode) {
      if (!(this_present_statusCode && that_present_statusCode))
        return false;
      if (this.statusCode != that.statusCode)
        return false;
    }
    boolean this_present_responseUnion = true && this.isSet(_Fields.RESPONSE_UNION);
    boolean that_present_responseUnion = true && that.isSet(_Fields.RESPONSE_UNION);
    if (this_present_responseUnion || that_present_responseUnion) {
      if (!(this_present_responseUnion && that_present_responseUnion))
        return false;
      if (!this.responseUnion.equals(that.responseUnion))
        return false;
    }

    return true;
  }

  @java.lang.Override
  @SuppressWarnings("unchecked")
  public int hashCode() {
    int hashCode = 1;
    if (true) {
        hashCode = 31 * hashCode + ((Integer)statusCode).hashCode();
    }
    if (true && (isSet(_Fields.RESPONSE_UNION))) {
        hashCode = 31 * hashCode + responseUnion.hashCode();
    }
    return hashCode;
  }

  public int compareTo(Response other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Response typedOther = (Response)other;

    lastComparison = Boolean.valueOf(isSet(_Fields.STATUS_CODE)).compareTo(typedOther.isSet(_Fields.STATUS_CODE));
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSet(_Fields.STATUS_CODE)) {
      lastComparison = TBaseHelper.compareTo(this.statusCode, typedOther.statusCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSet(_Fields.RESPONSE_UNION)).compareTo(typedOther.isSet(_Fields.RESPONSE_UNION));
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSet(_Fields.RESPONSE_UNION)) {
      lastComparison = TBaseHelper.compareTo(this.responseUnion, typedOther.responseUnion);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) {
        break;
      }
      switch (field.id) {
        case 1: // STATUS_CODE
          if (field.type == TType.I32) {
            this.statusCode = iprot.readI32();
            __isset_bit_vector.set(__STATUSCODE_ISSET_ID, true);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // RESPONSE_UNION
          if (field.type == TType.STRUCT) {
            this.responseUnion = new ResponseUnion();
            this.responseUnion.read(iprot);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(STATUS_CODE_FIELD_DESC);
    oprot.writeI32(this.statusCode);
    oprot.writeFieldEnd();
    if (this.responseUnion != null) {
      oprot.writeFieldBegin(RESPONSE_UNION_FIELD_DESC);
      this.responseUnion.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @java.lang.Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Response(");
    boolean first = true;
    sb.append("statusCode:");
    sb.append(this.statusCode);
    first = false;
    if (!first) sb.append(", ");
    sb.append("responseUnion:");
    if (this.responseUnion == null) {
      sb.append("null");
    } else {
      sb.append(this.responseUnion);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

  public static final _Fields STATUS_CODE = _Fields.STATUS_CODE;
  public static final _Fields RESPONSE_UNION = _Fields.RESPONSE_UNION;

  public static class Builder {
    private Integer statusCode;
    private ResponseUnion responseUnion;
  @SuppressWarnings("unchecked")
  public Builder set (_Fields field, Object value) {
    switch(field) {
      case STATUS_CODE: {
        if (value != null) {
          this.statusCode = (Integer) value;
        }
        break;
      }
      case RESPONSE_UNION: {
        if (value != null) {
          this.responseUnion = (ResponseUnion) value;
        }
        break;
      }
      default: {
        break;
      }
    }
    return this;
  }
  public Response build() {
    // check for required fields
    return new Response(statusCode,responseUnion);
    }
  }
}

