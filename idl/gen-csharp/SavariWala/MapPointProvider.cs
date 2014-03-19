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
  public partial class MapPointProvider {
    public interface Iface {
      List<SavariWala.MapPoint> getMapPoint(bool isSrc, double latitude, double longitude);
      #if SILVERLIGHT
      IAsyncResult Begin_getMapPoint(AsyncCallback callback, object state, bool isSrc, double latitude, double longitude);
      List<SavariWala.MapPoint> End_getMapPoint(IAsyncResult asyncResult);
      #endif
    }

    public class Client : IDisposable, Iface {
      public Client(TProtocol prot) : this(prot, prot)
      {
      }

      public Client(TProtocol iprot, TProtocol oprot)
      {
        iprot_ = iprot;
        oprot_ = oprot;
      }

      protected TProtocol iprot_;
      protected TProtocol oprot_;
      protected int seqid_;

      public TProtocol InputProtocol
      {
        get { return iprot_; }
      }
      public TProtocol OutputProtocol
      {
        get { return oprot_; }
      }


      #region " IDisposable Support "
      private bool _IsDisposed;

      // IDisposable
      public void Dispose()
      {
        Dispose(true);
      }
      

      protected virtual void Dispose(bool disposing)
      {
        if (!_IsDisposed)
        {
          if (disposing)
          {
            if (iprot_ != null)
            {
              ((IDisposable)iprot_).Dispose();
            }
            if (oprot_ != null)
            {
              ((IDisposable)oprot_).Dispose();
            }
          }
        }
        _IsDisposed = true;
      }
      #endregion


      
      #if SILVERLIGHT
      public IAsyncResult Begin_getMapPoint(AsyncCallback callback, object state, bool isSrc, double latitude, double longitude)
      {
        return send_getMapPoint(callback, state, isSrc, latitude, longitude);
      }

      public List<SavariWala.MapPoint> End_getMapPoint(IAsyncResult asyncResult)
      {
        oprot_.Transport.EndFlush(asyncResult);
        return recv_getMapPoint();
      }

      #endif

      public List<SavariWala.MapPoint> getMapPoint(bool isSrc, double latitude, double longitude)
      {
        #if !SILVERLIGHT
        send_getMapPoint(isSrc, latitude, longitude);
        return recv_getMapPoint();

        #else
        var asyncResult = Begin_getMapPoint(null, null, isSrc, latitude, longitude);
        return End_getMapPoint(asyncResult);

        #endif
      }
      #if SILVERLIGHT
      public IAsyncResult send_getMapPoint(AsyncCallback callback, object state, bool isSrc, double latitude, double longitude)
      #else
      public void send_getMapPoint(bool isSrc, double latitude, double longitude)
      #endif
      {
        oprot_.WriteMessageBegin(new TMessage("getMapPoint", TMessageType.Call, seqid_));
        getMapPoint_args args = new getMapPoint_args();
        args.IsSrc = isSrc;
        args.Latitude = latitude;
        args.Longitude = longitude;
        args.Write(oprot_);
        oprot_.WriteMessageEnd();
        #if SILVERLIGHT
        return oprot_.Transport.BeginFlush(callback, state);
        #else
        oprot_.Transport.Flush();
        #endif
      }

      public List<SavariWala.MapPoint> recv_getMapPoint()
      {
        TMessage msg = iprot_.ReadMessageBegin();
        if (msg.Type == TMessageType.Exception) {
          TApplicationException x = TApplicationException.Read(iprot_);
          iprot_.ReadMessageEnd();
          throw x;
        }
        getMapPoint_result result = new getMapPoint_result();
        result.Read(iprot_);
        iprot_.ReadMessageEnd();
        if (result.__isset.success) {
          return result.Success;
        }
        throw new TApplicationException(TApplicationException.ExceptionType.MissingResult, "getMapPoint failed: unknown result");
      }

    }
    public class Processor : TProcessor {
      public Processor(Iface iface)
      {
        iface_ = iface;
        processMap_["getMapPoint"] = getMapPoint_Process;
      }

      protected delegate void ProcessFunction(int seqid, TProtocol iprot, TProtocol oprot);
      private Iface iface_;
      protected Dictionary<string, ProcessFunction> processMap_ = new Dictionary<string, ProcessFunction>();

      public bool Process(TProtocol iprot, TProtocol oprot)
      {
        try
        {
          TMessage msg = iprot.ReadMessageBegin();
          ProcessFunction fn;
          processMap_.TryGetValue(msg.Name, out fn);
          if (fn == null) {
            TProtocolUtil.Skip(iprot, TType.Struct);
            iprot.ReadMessageEnd();
            TApplicationException x = new TApplicationException (TApplicationException.ExceptionType.UnknownMethod, "Invalid method name: '" + msg.Name + "'");
            oprot.WriteMessageBegin(new TMessage(msg.Name, TMessageType.Exception, msg.SeqID));
            x.Write(oprot);
            oprot.WriteMessageEnd();
            oprot.Transport.Flush();
            return true;
          }
          fn(msg.SeqID, iprot, oprot);
        }
        catch (IOException)
        {
          return false;
        }
        return true;
      }

      public void getMapPoint_Process(int seqid, TProtocol iprot, TProtocol oprot)
      {
        getMapPoint_args args = new getMapPoint_args();
        args.Read(iprot);
        iprot.ReadMessageEnd();
        getMapPoint_result result = new getMapPoint_result();
        result.Success = iface_.getMapPoint(args.IsSrc, args.Latitude, args.Longitude);
        oprot.WriteMessageBegin(new TMessage("getMapPoint", TMessageType.Reply, seqid)); 
        result.Write(oprot);
        oprot.WriteMessageEnd();
        oprot.Transport.Flush();
      }

    }


    #if !SILVERLIGHT
    [Serializable]
    #endif
    public partial class getMapPoint_args : TBase
    {
      private bool _isSrc;
      private double _latitude;
      private double _longitude;

      public bool IsSrc
      {
        get
        {
          return _isSrc;
        }
        set
        {
          __isset.isSrc = true;
          this._isSrc = value;
        }
      }

      public double Latitude
      {
        get
        {
          return _latitude;
        }
        set
        {
          __isset.latitude = true;
          this._latitude = value;
        }
      }

      public double Longitude
      {
        get
        {
          return _longitude;
        }
        set
        {
          __isset.longitude = true;
          this._longitude = value;
        }
      }


      public Isset __isset;
      #if !SILVERLIGHT
      [Serializable]
      #endif
      public struct Isset {
        public bool isSrc;
        public bool latitude;
        public bool longitude;
      }

      public getMapPoint_args() {
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
              if (field.Type == TType.Bool) {
                IsSrc = iprot.ReadBool();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.Double) {
                Latitude = iprot.ReadDouble();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 3:
              if (field.Type == TType.Double) {
                Longitude = iprot.ReadDouble();
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
        TStruct struc = new TStruct("getMapPoint_args");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (__isset.isSrc) {
          field.Name = "isSrc";
          field.Type = TType.Bool;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          oprot.WriteBool(IsSrc);
          oprot.WriteFieldEnd();
        }
        if (__isset.latitude) {
          field.Name = "latitude";
          field.Type = TType.Double;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          oprot.WriteDouble(Latitude);
          oprot.WriteFieldEnd();
        }
        if (__isset.longitude) {
          field.Name = "longitude";
          field.Type = TType.Double;
          field.ID = 3;
          oprot.WriteFieldBegin(field);
          oprot.WriteDouble(Longitude);
          oprot.WriteFieldEnd();
        }
        oprot.WriteFieldStop();
        oprot.WriteStructEnd();
      }

      public override string ToString() {
        StringBuilder sb = new StringBuilder("getMapPoint_args(");
        sb.Append("IsSrc: ");
        sb.Append(IsSrc);
        sb.Append(",Latitude: ");
        sb.Append(Latitude);
        sb.Append(",Longitude: ");
        sb.Append(Longitude);
        sb.Append(")");
        return sb.ToString();
      }

    }


    #if !SILVERLIGHT
    [Serializable]
    #endif
    public partial class getMapPoint_result : TBase
    {
      private List<SavariWala.MapPoint> _success;

      public List<SavariWala.MapPoint> Success
      {
        get
        {
          return _success;
        }
        set
        {
          __isset.success = true;
          this._success = value;
        }
      }


      public Isset __isset;
      #if !SILVERLIGHT
      [Serializable]
      #endif
      public struct Isset {
        public bool success;
      }

      public getMapPoint_result() {
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
            case 0:
              if (field.Type == TType.List) {
                {
                  Success = new List<SavariWala.MapPoint>();
                  TList _list0 = iprot.ReadListBegin();
                  for( int _i1 = 0; _i1 < _list0.Count; ++_i1)
                  {
                    SavariWala.MapPoint _elem2 = new SavariWala.MapPoint();
                    _elem2 = new SavariWala.MapPoint();
                    _elem2.Read(iprot);
                    Success.Add(_elem2);
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
        TStruct struc = new TStruct("getMapPoint_result");
        oprot.WriteStructBegin(struc);
        TField field = new TField();

        if (this.__isset.success) {
          if (Success != null) {
            field.Name = "Success";
            field.Type = TType.List;
            field.ID = 0;
            oprot.WriteFieldBegin(field);
            {
              oprot.WriteListBegin(new TList(TType.Struct, Success.Count));
              foreach (SavariWala.MapPoint _iter3 in Success)
              {
                _iter3.Write(oprot);
              }
              oprot.WriteListEnd();
            }
            oprot.WriteFieldEnd();
          }
        }
        oprot.WriteFieldStop();
        oprot.WriteStructEnd();
      }

      public override string ToString() {
        StringBuilder sb = new StringBuilder("getMapPoint_result(");
        sb.Append("Success: ");
        sb.Append(Success);
        sb.Append(")");
        return sb.ToString();
      }

    }

  }
}
