/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.savariwala;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MapPoint implements org.apache.thrift.TBase<MapPoint, MapPoint._Fields>, java.io.Serializable, Cloneable, Comparable<MapPoint> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MapPoint");

  private static final org.apache.thrift.protocol.TField LOC_FIELD_DESC = new org.apache.thrift.protocol.TField("loc", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField ADDRESS_FIELD_DESC = new org.apache.thrift.protocol.TField("address", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField LOCALITY_FIELD_DESC = new org.apache.thrift.protocol.TField("locality", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MapPointStandardSchemeFactory());
    schemes.put(TupleScheme.class, new MapPointTupleSchemeFactory());
  }

  public GeoLoc loc; // required
  public String name; // required
  public String address; // required
  public String locality; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    LOC((short)1, "loc"),
    NAME((short)2, "name"),
    ADDRESS((short)3, "address"),
    LOCALITY((short)4, "locality");

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
        case 1: // LOC
          return LOC;
        case 2: // NAME
          return NAME;
        case 3: // ADDRESS
          return ADDRESS;
        case 4: // LOCALITY
          return LOCALITY;
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

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.LOC, new org.apache.thrift.meta_data.FieldMetaData("loc", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, GeoLoc.class)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ADDRESS, new org.apache.thrift.meta_data.FieldMetaData("address", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LOCALITY, new org.apache.thrift.meta_data.FieldMetaData("locality", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MapPoint.class, metaDataMap);
  }

  public MapPoint() {
  }

  public MapPoint(
    GeoLoc loc,
    String name,
    String address,
    String locality)
  {
    this();
    this.loc = loc;
    this.name = name;
    this.address = address;
    this.locality = locality;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MapPoint(MapPoint other) {
    if (other.isSetLoc()) {
      this.loc = new GeoLoc(other.loc);
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetAddress()) {
      this.address = other.address;
    }
    if (other.isSetLocality()) {
      this.locality = other.locality;
    }
  }

  public MapPoint deepCopy() {
    return new MapPoint(this);
  }

  @Override
  public void clear() {
    this.loc = null;
    this.name = null;
    this.address = null;
    this.locality = null;
  }

  public GeoLoc getLoc() {
    return this.loc;
  }

  public MapPoint setLoc(GeoLoc loc) {
    this.loc = loc;
    return this;
  }

  public void unsetLoc() {
    this.loc = null;
  }

  /** Returns true if field loc is set (has been assigned a value) and false otherwise */
  public boolean isSetLoc() {
    return this.loc != null;
  }

  public void setLocIsSet(boolean value) {
    if (!value) {
      this.loc = null;
    }
  }

  public String getName() {
    return this.name;
  }

  public MapPoint setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public String getAddress() {
    return this.address;
  }

  public MapPoint setAddress(String address) {
    this.address = address;
    return this;
  }

  public void unsetAddress() {
    this.address = null;
  }

  /** Returns true if field address is set (has been assigned a value) and false otherwise */
  public boolean isSetAddress() {
    return this.address != null;
  }

  public void setAddressIsSet(boolean value) {
    if (!value) {
      this.address = null;
    }
  }

  public String getLocality() {
    return this.locality;
  }

  public MapPoint setLocality(String locality) {
    this.locality = locality;
    return this;
  }

  public void unsetLocality() {
    this.locality = null;
  }

  /** Returns true if field locality is set (has been assigned a value) and false otherwise */
  public boolean isSetLocality() {
    return this.locality != null;
  }

  public void setLocalityIsSet(boolean value) {
    if (!value) {
      this.locality = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case LOC:
      if (value == null) {
        unsetLoc();
      } else {
        setLoc((GeoLoc)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case ADDRESS:
      if (value == null) {
        unsetAddress();
      } else {
        setAddress((String)value);
      }
      break;

    case LOCALITY:
      if (value == null) {
        unsetLocality();
      } else {
        setLocality((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case LOC:
      return getLoc();

    case NAME:
      return getName();

    case ADDRESS:
      return getAddress();

    case LOCALITY:
      return getLocality();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case LOC:
      return isSetLoc();
    case NAME:
      return isSetName();
    case ADDRESS:
      return isSetAddress();
    case LOCALITY:
      return isSetLocality();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MapPoint)
      return this.equals((MapPoint)that);
    return false;
  }

  public boolean equals(MapPoint that) {
    if (that == null)
      return false;

    boolean this_present_loc = true && this.isSetLoc();
    boolean that_present_loc = true && that.isSetLoc();
    if (this_present_loc || that_present_loc) {
      if (!(this_present_loc && that_present_loc))
        return false;
      if (!this.loc.equals(that.loc))
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_address = true && this.isSetAddress();
    boolean that_present_address = true && that.isSetAddress();
    if (this_present_address || that_present_address) {
      if (!(this_present_address && that_present_address))
        return false;
      if (!this.address.equals(that.address))
        return false;
    }

    boolean this_present_locality = true && this.isSetLocality();
    boolean that_present_locality = true && that.isSetLocality();
    if (this_present_locality || that_present_locality) {
      if (!(this_present_locality && that_present_locality))
        return false;
      if (!this.locality.equals(that.locality))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(MapPoint other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetLoc()).compareTo(other.isSetLoc());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLoc()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.loc, other.loc);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAddress()).compareTo(other.isSetAddress());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAddress()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.address, other.address);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLocality()).compareTo(other.isSetLocality());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLocality()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.locality, other.locality);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("MapPoint(");
    boolean first = true;

    sb.append("loc:");
    if (this.loc == null) {
      sb.append("null");
    } else {
      sb.append(this.loc);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("address:");
    if (this.address == null) {
      sb.append("null");
    } else {
      sb.append(this.address);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("locality:");
    if (this.locality == null) {
      sb.append("null");
    } else {
      sb.append(this.locality);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (loc != null) {
      loc.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class MapPointStandardSchemeFactory implements SchemeFactory {
    public MapPointStandardScheme getScheme() {
      return new MapPointStandardScheme();
    }
  }

  private static class MapPointStandardScheme extends StandardScheme<MapPoint> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MapPoint struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // LOC
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.loc = new GeoLoc();
              struct.loc.read(iprot);
              struct.setLocIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ADDRESS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.address = iprot.readString();
              struct.setAddressIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // LOCALITY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.locality = iprot.readString();
              struct.setLocalityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, MapPoint struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.loc != null) {
        oprot.writeFieldBegin(LOC_FIELD_DESC);
        struct.loc.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.address != null) {
        oprot.writeFieldBegin(ADDRESS_FIELD_DESC);
        oprot.writeString(struct.address);
        oprot.writeFieldEnd();
      }
      if (struct.locality != null) {
        oprot.writeFieldBegin(LOCALITY_FIELD_DESC);
        oprot.writeString(struct.locality);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MapPointTupleSchemeFactory implements SchemeFactory {
    public MapPointTupleScheme getScheme() {
      return new MapPointTupleScheme();
    }
  }

  private static class MapPointTupleScheme extends TupleScheme<MapPoint> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, MapPoint struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetLoc()) {
        optionals.set(0);
      }
      if (struct.isSetName()) {
        optionals.set(1);
      }
      if (struct.isSetAddress()) {
        optionals.set(2);
      }
      if (struct.isSetLocality()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetLoc()) {
        struct.loc.write(oprot);
      }
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetAddress()) {
        oprot.writeString(struct.address);
      }
      if (struct.isSetLocality()) {
        oprot.writeString(struct.locality);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, MapPoint struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.loc = new GeoLoc();
        struct.loc.read(iprot);
        struct.setLocIsSet(true);
      }
      if (incoming.get(1)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.address = iprot.readString();
        struct.setAddressIsSet(true);
      }
      if (incoming.get(3)) {
        struct.locality = iprot.readString();
        struct.setLocalityIsSet(true);
      }
    }
  }

}

