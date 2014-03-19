/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;
using System.IO;
using Thrift;
using Thrift.Collections;
using System.Runtime.Serialization;
using Thrift.Protocol;
using Thrift.Transport;

namespace SavariWala
{

  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class BookingDetails : TBase
  {
    private int _numPax;
    private long _startTime;
    private bool _isShared;

    public int NumPax
    {
      get
      {
        return _numPax;
      }
      set
      {
        __isset.numPax = true;
        this._numPax = value;
      }
    }

    public long StartTime
    {
      get
      {
        return _startTime;
      }
      set
      {
        __isset.startTime = true;
        this._startTime = value;
      }
    }

    public bool IsShared
    {
      get
      {
        return _isShared;
      }
      set
      {
        __isset.isShared = true;
        this._isShared = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool numPax;
      public bool startTime;
      public bool isShared;
    }

    public BookingDetails() {
    }

    public void Read (TProtocol iprot)
    {
      TField field;
      iprot.ReadStructBegin();
      while (true)
      {
        field = iprot.ReadFieldBegin();
        if (field.Type == TType.Stop) { 
          break;
        }
        switch (field.ID)
        {
          case 1:
            if (field.Type == TType.I32) {
              NumPax = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.I64) {
              StartTime = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.Bool) {
              IsShared = iprot.ReadBool();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          default: 
            TProtocolUtil.Skip(iprot, field.Type);
            break;
        }
        iprot.ReadFieldEnd();
      }
      iprot.ReadStructEnd();
    }

    public void Write(TProtocol oprot) {
      TStruct struc = new TStruct("BookingDetails");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.numPax) {
        field.Name = "numPax";
        field.Type = TType.I32;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(NumPax);
        oprot.WriteFieldEnd();
      }
      if (__isset.startTime) {
        field.Name = "startTime";
        field.Type = TType.I64;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(StartTime);
        oprot.WriteFieldEnd();
      }
      if (__isset.isShared) {
        field.Name = "isShared";
        field.Type = TType.Bool;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteBool(IsShared);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    public override string ToString() {
      StringBuilder sb = new StringBuilder("BookingDetails(");
      sb.Append("NumPax: ");
      sb.Append(NumPax);
      sb.Append(",StartTime: ");
      sb.Append(StartTime);
      sb.Append(",IsShared: ");
      sb.Append(IsShared);
      sb.Append(")");
      return sb.ToString();
    }

  }

}
