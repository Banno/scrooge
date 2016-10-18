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

public class Request implements TBase<Request, Request._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("Request");

  private static final TField A_LIST_FIELD_DESC = new TField("aList", TType.LIST, (short)1);
  private static final TField A_SET_FIELD_DESC = new TField("aSet", TType.SET, (short)2);
  private static final TField A_MAP_FIELD_DESC = new TField("aMap", TType.MAP, (short)3);
  private static final TField A_REQUEST_FIELD_DESC = new TField("aRequest", TType.STRUCT, (short)4);
  private static final TField SUB_REQUESTS_FIELD_DESC = new TField("subRequests", TType.LIST, (short)5);


  private List<String> aList;
  private Set<Integer> aSet;
  private Map<Long,Long> aMap;
  private Request aRequest;
  private List<Request> subRequests;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    A_LIST((short)1, "aList"),
    A_SET((short)2, "aSet"),
    A_MAP((short)3, "aMap"),
    A_REQUEST((short)4, "aRequest"),
    SUB_REQUESTS((short)5, "subRequests");

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
        case 1: // A_LIST
          return A_LIST;
        case 2: // A_SET
          return A_SET;
        case 3: // A_MAP
          return A_MAP;
        case 4: // A_REQUEST
          return A_REQUEST;
        case 5: // SUB_REQUESTS
          return SUB_REQUESTS;
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

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.A_LIST, new FieldMetaData("aList", TFieldRequirementType.DEFAULT,
      new ListMetaData(TType.LIST,
                new FieldValueMetaData(TType.STRING))));
    tmpMap.put(_Fields.A_SET, new FieldMetaData("aSet", TFieldRequirementType.DEFAULT,
      new SetMetaData(TType.SET,
                new FieldValueMetaData(TType.I32))));
    tmpMap.put(_Fields.A_MAP, new FieldMetaData("aMap", TFieldRequirementType.DEFAULT,
      new MapMetaData(TType.MAP,
            new FieldValueMetaData(TType.I64),
            new FieldValueMetaData(TType.I64))));
    tmpMap.put(_Fields.A_REQUEST, new FieldMetaData("aRequest", TFieldRequirementType.OPTIONAL,
      new StructMetaData(TType.STRUCT, Request.class)));
    tmpMap.put(_Fields.SUB_REQUESTS, new FieldMetaData("subRequests", TFieldRequirementType.DEFAULT,
      new ListMetaData(TType.LIST,
                new StructMetaData(TType.STRUCT, Request.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(Request.class, metaDataMap);
  }


  public Request() {
  }

  public Request(
      List<String> aList,
      Set<Integer> aSet,
      Map<Long,Long> aMap,
      Request aRequest,
      List<Request> subRequests
  ) {
    this();
    if(aList != null) {
      this.aList = aList;
    }
    if(aSet != null) {
      this.aSet = aSet;
    }
    if(aMap != null) {
      this.aMap = aMap;
    }
    if(aRequest != null) {
      this.aRequest = aRequest;
    }
    if(subRequests != null) {
      this.subRequests = subRequests;
    }
  }


  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Request(Request other) {
    if (other.isSet(_Fields.A_LIST)) {
      List<String> __this__aList = new ArrayList<String>();
      for (String other_element : other.aList) {
        __this__aList.add(other_element);
      }
      this.aList = __this__aList;
    }
    if (other.isSet(_Fields.A_SET)) {
      Set<Integer> __this__aSet = new HashSet<Integer>();
      for (Integer other_element : other.aSet) {
        __this__aSet.add(other_element);
      }
      this.aSet = __this__aSet;
    }
    if (other.isSet(_Fields.A_MAP)) {
      Map<Long,Long> __this__aMap = new HashMap<Long,Long>();
      for (Map.Entry<Long, Long> other_element : other.aMap.entrySet()) {
        Long other_element_key = other_element.getKey();
        Long other_element_value = other_element.getValue();
        Long __this__aMap_copy_key = other_element_key;
        Long __this__aMap_copy_value = other_element_value;
        __this__aMap.put(__this__aMap_copy_key, __this__aMap_copy_value);
      }
      this.aMap = __this__aMap;
    }
    if (other.isSet(_Fields.A_REQUEST)) {
      this.aRequest = new Request(other.aRequest);
    }
    if (other.isSet(_Fields.SUB_REQUESTS)) {
      List<Request> __this__subRequests = new ArrayList<Request>();
      for (Request other_element : other.subRequests) {
        __this__subRequests.add(new Request(other_element));
      }
      this.subRequests = __this__subRequests;
    }
  }

  public Request deepCopy() {
    return new Request(this);
  }

  @java.lang.Override
  public void clear() {
    this.aList = null;
    this.aSet = null;
    this.aMap = null;
    this.aRequest = null;
    this.subRequests = null;
  }

  @SuppressWarnings("unchecked")
  public void addTo(_Fields field, Object elem) {
    switch(field) {
      case A_LIST: {
        if (elem instanceof String ) {
          if (this.aList == null) {
            this.aList = new ArrayList<String>();
          }
          this.aList.add((String)elem);
        } else {
          throw new IllegalArgumentException("Type of field " + aList + " should be List, but found " +  elem.getClass().toString() + " type");
        }
        break;
      }
      case A_SET: {
        if (elem instanceof Integer ) {
          if (this.aSet == null) {
            this.aSet = new HashSet<Integer>();
          }
          this.aSet.add((Integer)elem);
        } else {
          throw new IllegalArgumentException("Type of field " + aSet + " should be Set, but found " +  elem.getClass().toString() + " type");
        }
        break;
      }
      case SUB_REQUESTS: {
        if (elem instanceof Request ) {
          if (this.subRequests == null) {
            this.subRequests = new ArrayList<Request>();
          }
          this.subRequests.add((Request)elem);
        } else {
          throw new IllegalArgumentException("Type of field " + subRequests + " should be List, but found " +  elem.getClass().toString() + " type");
        }
        break;
      }
    }
  }

  @SuppressWarnings("unchecked")
  public void putTo(_Fields field, Object key, Object value) {
    switch(field) {
        case A_MAP: {
        if (key instanceof Long && value instanceof Long ) {
          if (this.aMap == null) {
            this.aMap = new HashMap<Long,Long>();
          }
          this.aMap.put((Long)key, (Long)value);
        } else {
          throw new IllegalArgumentException("[Long,Long] is expected, but [" +  key.getClass().toString() + ", " + value.getClass().toString() + "] type found.");
        }
        break;
      }
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case A_LIST:
      if (value == null) {
        this.aList = null;
      } else {
        this.aList = (List<String>) value;
      }
      break;
    case A_SET:
      if (value == null) {
        this.aSet = null;
      } else {
        this.aSet = (Set<Integer>) value;
      }
      break;
    case A_MAP:
      if (value == null) {
        this.aMap = null;
      } else {
        this.aMap = (Map<Long,Long>) value;
      }
      break;
    case A_REQUEST:
      if (value == null) {
        this.aRequest = null;
      } else {
        this.aRequest = (Request) value;
      }
      break;
    case SUB_REQUESTS:
      if (value == null) {
        this.subRequests = null;
      } else {
        this.subRequests = (List<Request>) value;
      }
      break;
    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case A_LIST:
      return this.aList;
    case A_SET:
      return this.aSet;
    case A_MAP:
      return this.aMap;
    case A_REQUEST:
      return this.aRequest;
    case SUB_REQUESTS:
      return this.subRequests;
    }
    throw new IllegalStateException();
  }

  @SuppressWarnings("unchecked")
  public <Any> Any get(_Fields field) {
    switch(field) {
      case A_LIST:
          Any rval_aList = (Any)((List<String>) getFieldValue(field));
          return rval_aList;
      case A_SET:
          Any rval_aSet = (Any)((Set<Integer>) getFieldValue(field));
          return rval_aSet;
      case A_MAP:
          Any rval_aMap = (Any)((Map<Long,Long>) getFieldValue(field));
          return rval_aMap;
      case A_REQUEST:
          Any rval_aRequest = (Any)((Request) getFieldValue(field));
          return rval_aRequest;
      case SUB_REQUESTS:
          Any rval_subRequests = (Any)((List<Request>) getFieldValue(field));
          return rval_subRequests;
      default:
        throw new IllegalStateException("Invalid field type");
    }
  }

  /** Returns true if field corresponding to field is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    switch (field) {
    case A_LIST:
        return aList != null;
    case A_SET:
        return aSet != null;
    case A_MAP:
        return aMap != null;
    case A_REQUEST:
        return aRequest != null;
    case SUB_REQUESTS:
        return subRequests != null;
    }
    throw new IllegalStateException();
  }

  @java.lang.Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Request)
      return this.equals((Request)that);
    return false;
  }

  public boolean equals(Request that) {
    if (that == null)
      return false;
    boolean this_present_aList = true && this.isSet(_Fields.A_LIST);
    boolean that_present_aList = true && that.isSet(_Fields.A_LIST);
    if (this_present_aList || that_present_aList) {
      if (!(this_present_aList && that_present_aList))
        return false;
      if (!this.aList.equals(that.aList))
        return false;
    }
    boolean this_present_aSet = true && this.isSet(_Fields.A_SET);
    boolean that_present_aSet = true && that.isSet(_Fields.A_SET);
    if (this_present_aSet || that_present_aSet) {
      if (!(this_present_aSet && that_present_aSet))
        return false;
      if (!this.aSet.equals(that.aSet))
        return false;
    }
    boolean this_present_aMap = true && this.isSet(_Fields.A_MAP);
    boolean that_present_aMap = true && that.isSet(_Fields.A_MAP);
    if (this_present_aMap || that_present_aMap) {
      if (!(this_present_aMap && that_present_aMap))
        return false;
      if (!this.aMap.equals(that.aMap))
        return false;
    }
    boolean this_present_aRequest = true && this.isSet(_Fields.A_REQUEST);
    boolean that_present_aRequest = true && that.isSet(_Fields.A_REQUEST);
    if (this_present_aRequest || that_present_aRequest) {
      if (!(this_present_aRequest && that_present_aRequest))
        return false;
      if (!this.aRequest.equals(that.aRequest))
        return false;
    }
    boolean this_present_subRequests = true && this.isSet(_Fields.SUB_REQUESTS);
    boolean that_present_subRequests = true && that.isSet(_Fields.SUB_REQUESTS);
    if (this_present_subRequests || that_present_subRequests) {
      if (!(this_present_subRequests && that_present_subRequests))
        return false;
      if (!this.subRequests.equals(that.subRequests))
        return false;
    }

    return true;
  }

  @java.lang.Override
  @SuppressWarnings("unchecked")
  public int hashCode() {
    int hashCode = 1;
    if (true && (isSet(_Fields.A_LIST))) {
        hashCode = 31 * hashCode + aList.hashCode();
    }
    if (true && (isSet(_Fields.A_SET))) {
        hashCode = 31 * hashCode + aSet.hashCode();
    }
    if (true && (isSet(_Fields.A_MAP))) {
        hashCode = 31 * hashCode + aMap.hashCode();
    }
    if (true && (isSet(_Fields.A_REQUEST))) {
        hashCode = 31 * hashCode + aRequest.hashCode();
    }
    if (true && (isSet(_Fields.SUB_REQUESTS))) {
        hashCode = 31 * hashCode + subRequests.hashCode();
    }
    return hashCode;
  }

  public int compareTo(Request other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    Request typedOther = (Request)other;

    lastComparison = Boolean.valueOf(isSet(_Fields.A_LIST)).compareTo(typedOther.isSet(_Fields.A_LIST));
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSet(_Fields.A_LIST)) {
      lastComparison = TBaseHelper.compareTo(this.aList, typedOther.aList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSet(_Fields.A_SET)).compareTo(typedOther.isSet(_Fields.A_SET));
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSet(_Fields.A_SET)) {
      lastComparison = TBaseHelper.compareTo(this.aSet, typedOther.aSet);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSet(_Fields.A_MAP)).compareTo(typedOther.isSet(_Fields.A_MAP));
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSet(_Fields.A_MAP)) {
      lastComparison = TBaseHelper.compareTo(this.aMap, typedOther.aMap);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSet(_Fields.A_REQUEST)).compareTo(typedOther.isSet(_Fields.A_REQUEST));
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSet(_Fields.A_REQUEST)) {
      lastComparison = TBaseHelper.compareTo(this.aRequest, typedOther.aRequest);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSet(_Fields.SUB_REQUESTS)).compareTo(typedOther.isSet(_Fields.SUB_REQUESTS));
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSet(_Fields.SUB_REQUESTS)) {
      lastComparison = TBaseHelper.compareTo(this.subRequests, typedOther.subRequests);
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
        case 1: // A_LIST
          if (field.type == TType.LIST) {
            {
            TList _list0 = iprot.readListBegin();
            this.aList = new ArrayList<String>(_list0.size);
            for (int _i1 = 0; _i1 < _list0.size; ++_i1)
            {
              String _elem2;
              _elem2 = iprot.readString();
              this.aList.add(_elem2);
            }
            iprot.readListEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // A_SET
          if (field.type == TType.SET) {
            {
            TSet _set3 = iprot.readSetBegin();
            this.aSet = new HashSet<Integer>(2*_set3.size);
            for (int _i4 = 0; _i4 < _set3.size; ++_i4)
            {
              int _elem5;
              _elem5 = iprot.readI32();
              this.aSet.add(_elem5);
            }
            iprot.readSetEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // A_MAP
          if (field.type == TType.MAP) {
            {
            TMap _map6 = iprot.readMapBegin();
            this.aMap = new HashMap<Long,Long>(2*_map6.size);
            for (int _i7 = 0; _i7 < _map6.size; ++_i7)
            {
              long _key8;
              long _val9;
              _key8 = iprot.readI64();
              _val9 = iprot.readI64();
              this.aMap.put(_key8, _val9);
            }
            iprot.readMapEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // A_REQUEST
          if (field.type == TType.STRUCT) {
            this.aRequest = new Request();
            this.aRequest.read(iprot);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // SUB_REQUESTS
          if (field.type == TType.LIST) {
            {
            TList _list10 = iprot.readListBegin();
            this.subRequests = new ArrayList<Request>(_list10.size);
            for (int _i11 = 0; _i11 < _list10.size; ++_i11)
            {
              Request _elem12;
              _elem12 = new Request();
              _elem12.read(iprot);
              this.subRequests.add(_elem12);
            }
            iprot.readListEnd();
            }
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
    if (this.aList != null) {
      oprot.writeFieldBegin(A_LIST_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRING, this.aList.size()));
        for (String _iter13 : this.aList)
        {
          oprot.writeString(_iter13);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.aSet != null) {
      oprot.writeFieldBegin(A_SET_FIELD_DESC);
      {
        oprot.writeSetBegin(new TSet(TType.I32, this.aSet.size()));
        for (int _iter14 : this.aSet)
        {
          oprot.writeI32(_iter14);
        }
        oprot.writeSetEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.aMap != null) {
      oprot.writeFieldBegin(A_MAP_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.I64, TType.I64, this.aMap.size()));
        for (Map.Entry<Long, Long> _iter15 : this.aMap.entrySet())
        {
          oprot.writeI64(_iter15.getKey());
          oprot.writeI64(_iter15.getValue());
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.aRequest != null) {
      if (isSet(_Fields.A_REQUEST)) {
        oprot.writeFieldBegin(A_REQUEST_FIELD_DESC);
        this.aRequest.write(oprot);
        oprot.writeFieldEnd();
      }
    }
    if (this.subRequests != null) {
      oprot.writeFieldBegin(SUB_REQUESTS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.subRequests.size()));
        for (Request _iter16 : this.subRequests)
        {
          _iter16.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @java.lang.Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Request(");
    boolean first = true;
    sb.append("aList:");
    if (this.aList == null) {
      sb.append("null");
    } else {
      sb.append(this.aList);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("aSet:");
    if (this.aSet == null) {
      sb.append("null");
    } else {
      sb.append(this.aSet);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("aMap:");
    if (this.aMap == null) {
      sb.append("null");
    } else {
      sb.append(this.aMap);
    }
    first = false;
    if (isSet(_Fields.A_REQUEST)) {
      if (!first) sb.append(", ");
      sb.append("aRequest:");
      if (this.aRequest == null) {
        sb.append("null");
      } else {
        sb.append(this.aRequest);
      }
      first = false;
      }
    if (!first) sb.append(", ");
    sb.append("subRequests:");
    if (this.subRequests == null) {
      sb.append("null");
    } else {
      sb.append(this.subRequests);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

  public static final _Fields A_LIST = _Fields.A_LIST;
  public static final _Fields A_SET = _Fields.A_SET;
  public static final _Fields A_MAP = _Fields.A_MAP;
  public static final _Fields A_REQUEST = _Fields.A_REQUEST;
  public static final _Fields SUB_REQUESTS = _Fields.SUB_REQUESTS;

  public static class Builder {
    private List<String> aList;
    private Set<Integer> aSet;
    private Map<Long,Long> aMap;
    private Request aRequest;
    private List<Request> subRequests;
  @SuppressWarnings("unchecked")
  public Builder set (_Fields field, Object value) {
    switch(field) {
      case A_LIST: {
        if (value != null) {
          this.aList = (List<String>) value;
        }
        break;
      }
      case A_SET: {
        if (value != null) {
          this.aSet = (Set<Integer>) value;
        }
        break;
      }
      case A_MAP: {
        if (value != null) {
          this.aMap = (Map<Long,Long>) value;
        }
        break;
      }
      case A_REQUEST: {
        if (value != null) {
          this.aRequest = (Request) value;
        }
        break;
      }
      case SUB_REQUESTS: {
        if (value != null) {
          this.subRequests = (List<Request>) value;
        }
        break;
      }
      default: {
        break;
      }
    }
    return this;
  }
  @SuppressWarnings("unchecked")
  public Builder addTo(_Fields field, Object elem) {
    switch(field) {
      case A_LIST: {
        if (elem instanceof String ) {
          if (this.aList == null) {
              this.aList = new ArrayList<String>();
          }
          this.aList.add((String)elem);
        } else {
          throw new IllegalArgumentException("Type of field " + aList + " should be List, but found " +  elem.getClass().toString() + " type");
        }
        break;
      }
      case A_SET: {
        if (elem instanceof Integer ) {
          if (this.aSet == null) {
              this.aSet = new HashSet<Integer>();
          }
          this.aSet.add((Integer)elem);
        } else {
          throw new IllegalArgumentException("Type of field " + aSet + " should be Set, but found " +  elem.getClass().toString() + " type");
        }
        break;
      }
      case SUB_REQUESTS: {
        if (elem instanceof Request ) {
          if (this.subRequests == null) {
              this.subRequests = new ArrayList<Request>();
          }
          this.subRequests.add((Request)elem);
        } else {
          throw new IllegalArgumentException("Type of field " + subRequests + " should be List, but found " +  elem.getClass().toString() + " type");
        }
        break;
      }
    }
    return this;
  }
  @SuppressWarnings("unchecked")
  public Builder putTo(_Fields field, Object key, Object value) {
    switch(field) {
      case A_MAP: {
        if (key instanceof Long && value instanceof Long ) {
          if (this.aMap == null) {
            this.aMap = new HashMap<Long,Long>();
          }
          this.aMap.put((Long)key, (Long)value);
        } else {
          throw new IllegalArgumentException("[Long,Long] is expected, but [" +  key.getClass().toString() + ", " + value.getClass().toString() + "] type found.");
        }
        break;
      }
    }
    return this;
  }
  public Request build() {
    // check for required fields
    return new Request(aList,aSet,aMap,aRequest,subRequests);
    }
  }
}

