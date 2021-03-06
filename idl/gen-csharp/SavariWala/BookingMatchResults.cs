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
  public partial class BookingMatchResults : TBase
  {
    private int _id;
    private int _total;
    private List<PooledBooking> _topBookings;

    public int Id
    {
      get
      {
        return _id;
      }
      set
      {
        __isset.id = true;
        this._id = value;
      }
    }

    public int Total
    {
      get
      {
        return _total;
      }
      set
      {
        __isset.total = true;
        this._total = value;
      }
    }

    public List<PooledBooking> TopBookings
    {
      get
      {
        return _topBookings;
      }
      set
      {
        __isset.topBookings = true;
        this._topBookings = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool id;
      public bool total;
      public bool topBookings;
    }

    public BookingMatchResults() {
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
              Id = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.I32) {
              Total = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.List) {
              {
                TopBookings = new List<PooledBooking>();
                TList _list0 = iprot.ReadListBegin();
                for( int _i1 = 0; _i1 < _list0.Count; ++_i1)
                {
                  PooledBooking _elem2 = new PooledBooking();
                  _elem2 = new PooledBooking();
                  _elem2.Read(iprot);
                  TopBookings.Add(_elem2);
                }
                iprot.ReadListEnd();
              }
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
      TStruct struc = new TStruct("BookingMatchResults");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.id) {
        field.Name = "id";
        field.Type = TType.I32;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(Id);
        oprot.WriteFieldEnd();
      }
      if (__isset.total) {
        field.Name = "total";
        field.Type = TType.I32;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(Total);
        oprot.WriteFieldEnd();
      }
      if (TopBookings != null && __isset.topBookings) {
        field.Name = "topBookings";
        field.Type = TType.List;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.Struct, TopBookings.Count));
          foreach (PooledBooking _iter3 in TopBookings)
          {
            _iter3.Write(oprot);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }

    public override string ToString() {
      StringBuilder sb = new StringBuilder("BookingMatchResults(");
      sb.Append("Id: ");
      sb.Append(Id);
      sb.Append(",Total: ");
      sb.Append(Total);
      sb.Append(",TopBookings: ");
      sb.Append(TopBookings);
      sb.Append(")");
      return sb.ToString();
    }

  }

}
