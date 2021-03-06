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

public class PooledBooking implements org.apache.thrift.TBase<PooledBooking, PooledBooking._Fields>, java.io.Serializable, Cloneable, Comparable<PooledBooking> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PooledBooking");

  private static final org.apache.thrift.protocol.TField NUM_PAX_FIELD_DESC = new org.apache.thrift.protocol.TField("numPax", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField START_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("startTime", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField SRC_FIELD_DESC = new org.apache.thrift.protocol.TField("src", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField DST_FIELD_DESC = new org.apache.thrift.protocol.TField("dst", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PooledBookingStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PooledBookingTupleSchemeFactory());
  }

  public int numPax; // required
  public long startTime; // required
  public com.savariwala.MapPoint src; // required
  public com.savariwala.MapPoint dst; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NUM_PAX((short)1, "numPax"),
    START_TIME((short)2, "startTime"),
    SRC((short)3, "src"),
    DST((short)4, "dst");

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
        case 1: // NUM_PAX
          return NUM_PAX;
        case 2: // START_TIME
          return START_TIME;
        case 3: // SRC
          return SRC;
        case 4: // DST
          return DST;
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
  private static final int __NUMPAX_ISSET_ID = 0;
  private static final int __STARTTIME_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NUM_PAX, new org.apache.thrift.meta_data.FieldMetaData("numPax", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.START_TIME, new org.apache.thrift.meta_data.FieldMetaData("startTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.SRC, new org.apache.thrift.meta_data.FieldMetaData("src", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.savariwala.MapPoint.class)));
    tmpMap.put(_Fields.DST, new org.apache.thrift.meta_data.FieldMetaData("dst", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, com.savariwala.MapPoint.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PooledBooking.class, metaDataMap);
  }

  public PooledBooking() {
  }

  public PooledBooking(
    int numPax,
    long startTime,
    com.savariwala.MapPoint src,
    com.savariwala.MapPoint dst)
  {
    this();
    this.numPax = numPax;
    setNumPaxIsSet(true);
    this.startTime = startTime;
    setStartTimeIsSet(true);
    this.src = src;
    this.dst = dst;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PooledBooking(PooledBooking other) {
    __isset_bitfield = other.__isset_bitfield;
    this.numPax = other.numPax;
    this.startTime = other.startTime;
    if (other.isSetSrc()) {
      this.src = new com.savariwala.MapPoint(other.src);
    }
    if (other.isSetDst()) {
      this.dst = new com.savariwala.MapPoint(other.dst);
    }
  }

  public PooledBooking deepCopy() {
    return new PooledBooking(this);
  }

  @Override
  public void clear() {
    setNumPaxIsSet(false);
    this.numPax = 0;
    setStartTimeIsSet(false);
    this.startTime = 0;
    this.src = null;
    this.dst = null;
  }

  public int getNumPax() {
    return this.numPax;
  }

  public PooledBooking setNumPax(int numPax) {
    this.numPax = numPax;
    setNumPaxIsSet(true);
    return this;
  }

  public void unsetNumPax() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NUMPAX_ISSET_ID);
  }

  /** Returns true if field numPax is set (has been assigned a value) and false otherwise */
  public boolean isSetNumPax() {
    return EncodingUtils.testBit(__isset_bitfield, __NUMPAX_ISSET_ID);
  }

  public void setNumPaxIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NUMPAX_ISSET_ID, value);
  }

  public long getStartTime() {
    return this.startTime;
  }

  public PooledBooking setStartTime(long startTime) {
    this.startTime = startTime;
    setStartTimeIsSet(true);
    return this;
  }

  public void unsetStartTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STARTTIME_ISSET_ID);
  }

  /** Returns true if field startTime is set (has been assigned a value) and false otherwise */
  public boolean isSetStartTime() {
    return EncodingUtils.testBit(__isset_bitfield, __STARTTIME_ISSET_ID);
  }

  public void setStartTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STARTTIME_ISSET_ID, value);
  }

  public com.savariwala.MapPoint getSrc() {
    return this.src;
  }

  public PooledBooking setSrc(com.savariwala.MapPoint src) {
    this.src = src;
    return this;
  }

  public void unsetSrc() {
    this.src = null;
  }

  /** Returns true if field src is set (has been assigned a value) and false otherwise */
  public boolean isSetSrc() {
    return this.src != null;
  }

  public void setSrcIsSet(boolean value) {
    if (!value) {
      this.src = null;
    }
  }

  public com.savariwala.MapPoint getDst() {
    return this.dst;
  }

  public PooledBooking setDst(com.savariwala.MapPoint dst) {
    this.dst = dst;
    return this;
  }

  public void unsetDst() {
    this.dst = null;
  }

  /** Returns true if field dst is set (has been assigned a value) and false otherwise */
  public boolean isSetDst() {
    return this.dst != null;
  }

  public void setDstIsSet(boolean value) {
    if (!value) {
      this.dst = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NUM_PAX:
      if (value == null) {
        unsetNumPax();
      } else {
        setNumPax((Integer)value);
      }
      break;

    case START_TIME:
      if (value == null) {
        unsetStartTime();
      } else {
        setStartTime((Long)value);
      }
      break;

    case SRC:
      if (value == null) {
        unsetSrc();
      } else {
        setSrc((com.savariwala.MapPoint)value);
      }
      break;

    case DST:
      if (value == null) {
        unsetDst();
      } else {
        setDst((com.savariwala.MapPoint)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NUM_PAX:
      return Integer.valueOf(getNumPax());

    case START_TIME:
      return Long.valueOf(getStartTime());

    case SRC:
      return getSrc();

    case DST:
      return getDst();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NUM_PAX:
      return isSetNumPax();
    case START_TIME:
      return isSetStartTime();
    case SRC:
      return isSetSrc();
    case DST:
      return isSetDst();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PooledBooking)
      return this.equals((PooledBooking)that);
    return false;
  }

  public boolean equals(PooledBooking that) {
    if (that == null)
      return false;

    boolean this_present_numPax = true;
    boolean that_present_numPax = true;
    if (this_present_numPax || that_present_numPax) {
      if (!(this_present_numPax && that_present_numPax))
        return false;
      if (this.numPax != that.numPax)
        return false;
    }

    boolean this_present_startTime = true;
    boolean that_present_startTime = true;
    if (this_present_startTime || that_present_startTime) {
      if (!(this_present_startTime && that_present_startTime))
        return false;
      if (this.startTime != that.startTime)
        return false;
    }

    boolean this_present_src = true && this.isSetSrc();
    boolean that_present_src = true && that.isSetSrc();
    if (this_present_src || that_present_src) {
      if (!(this_present_src && that_present_src))
        return false;
      if (!this.src.equals(that.src))
        return false;
    }

    boolean this_present_dst = true && this.isSetDst();
    boolean that_present_dst = true && that.isSetDst();
    if (this_present_dst || that_present_dst) {
      if (!(this_present_dst && that_present_dst))
        return false;
      if (!this.dst.equals(that.dst))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(PooledBooking other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetNumPax()).compareTo(other.isSetNumPax());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNumPax()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.numPax, other.numPax);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStartTime()).compareTo(other.isSetStartTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStartTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.startTime, other.startTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSrc()).compareTo(other.isSetSrc());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSrc()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.src, other.src);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDst()).compareTo(other.isSetDst());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDst()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dst, other.dst);
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
    StringBuilder sb = new StringBuilder("PooledBooking(");
    boolean first = true;

    sb.append("numPax:");
    sb.append(this.numPax);
    first = false;
    if (!first) sb.append(", ");
    sb.append("startTime:");
    sb.append(this.startTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("src:");
    if (this.src == null) {
      sb.append("null");
    } else {
      sb.append(this.src);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("dst:");
    if (this.dst == null) {
      sb.append("null");
    } else {
      sb.append(this.dst);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (src != null) {
      src.validate();
    }
    if (dst != null) {
      dst.validate();
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PooledBookingStandardSchemeFactory implements SchemeFactory {
    public PooledBookingStandardScheme getScheme() {
      return new PooledBookingStandardScheme();
    }
  }

  private static class PooledBookingStandardScheme extends StandardScheme<PooledBooking> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PooledBooking struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NUM_PAX
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.numPax = iprot.readI32();
              struct.setNumPaxIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // START_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.startTime = iprot.readI64();
              struct.setStartTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SRC
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.src = new com.savariwala.MapPoint();
              struct.src.read(iprot);
              struct.setSrcIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DST
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.dst = new com.savariwala.MapPoint();
              struct.dst.read(iprot);
              struct.setDstIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, PooledBooking struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(NUM_PAX_FIELD_DESC);
      oprot.writeI32(struct.numPax);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(START_TIME_FIELD_DESC);
      oprot.writeI64(struct.startTime);
      oprot.writeFieldEnd();
      if (struct.src != null) {
        oprot.writeFieldBegin(SRC_FIELD_DESC);
        struct.src.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.dst != null) {
        oprot.writeFieldBegin(DST_FIELD_DESC);
        struct.dst.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PooledBookingTupleSchemeFactory implements SchemeFactory {
    public PooledBookingTupleScheme getScheme() {
      return new PooledBookingTupleScheme();
    }
  }

  private static class PooledBookingTupleScheme extends TupleScheme<PooledBooking> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PooledBooking struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetNumPax()) {
        optionals.set(0);
      }
      if (struct.isSetStartTime()) {
        optionals.set(1);
      }
      if (struct.isSetSrc()) {
        optionals.set(2);
      }
      if (struct.isSetDst()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetNumPax()) {
        oprot.writeI32(struct.numPax);
      }
      if (struct.isSetStartTime()) {
        oprot.writeI64(struct.startTime);
      }
      if (struct.isSetSrc()) {
        struct.src.write(oprot);
      }
      if (struct.isSetDst()) {
        struct.dst.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PooledBooking struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.numPax = iprot.readI32();
        struct.setNumPaxIsSet(true);
      }
      if (incoming.get(1)) {
        struct.startTime = iprot.readI64();
        struct.setStartTimeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.src = new com.savariwala.MapPoint();
        struct.src.read(iprot);
        struct.setSrcIsSet(true);
      }
      if (incoming.get(3)) {
        struct.dst = new com.savariwala.MapPoint();
        struct.dst.read(iprot);
        struct.setDstIsSet(true);
      }
    }
  }

}

