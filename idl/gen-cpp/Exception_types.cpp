/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#include "Exception_types.h"

#include <algorithm>

namespace savariwala {

int _kErrorCodeValues[] = {
  ErrorCode::Unspecified,
  ErrorCode::NotFound
};
const char* _kErrorCodeNames[] = {
  "Unspecified",
  "NotFound"
};
const std::map<int, const char*> _ErrorCode_VALUES_TO_NAMES(::apache::thrift::TEnumIterator(2, _kErrorCodeValues, _kErrorCodeNames), ::apache::thrift::TEnumIterator(-1, NULL, NULL));

const char* ServerError::ascii_fingerprint = "D6FD826D949221396F4FFC3ECCD3D192";
const uint8_t ServerError::binary_fingerprint[16] = {0xD6,0xFD,0x82,0x6D,0x94,0x92,0x21,0x39,0x6F,0x4F,0xFC,0x3E,0xCC,0xD3,0xD1,0x92};

uint32_t ServerError::read(::apache::thrift::protocol::TProtocol* iprot) {

  uint32_t xfer = 0;
  std::string fname;
  ::apache::thrift::protocol::TType ftype;
  int16_t fid;

  xfer += iprot->readStructBegin(fname);

  using ::apache::thrift::protocol::TProtocolException;


  while (true)
  {
    xfer += iprot->readFieldBegin(fname, ftype, fid);
    if (ftype == ::apache::thrift::protocol::T_STOP) {
      break;
    }
    switch (fid)
    {
      case 1:
        if (ftype == ::apache::thrift::protocol::T_STRING) {
          xfer += iprot->readString(this->what);
          this->__isset.what = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      case 2:
        if (ftype == ::apache::thrift::protocol::T_I32) {
          int32_t ecast0;
          xfer += iprot->readI32(ecast0);
          this->err = (ErrorCode::type)ecast0;
          this->__isset.err = true;
        } else {
          xfer += iprot->skip(ftype);
        }
        break;
      default:
        xfer += iprot->skip(ftype);
        break;
    }
    xfer += iprot->readFieldEnd();
  }

  xfer += iprot->readStructEnd();

  return xfer;
}

uint32_t ServerError::write(::apache::thrift::protocol::TProtocol* oprot) const {
  uint32_t xfer = 0;
  xfer += oprot->writeStructBegin("ServerError");

  xfer += oprot->writeFieldBegin("what", ::apache::thrift::protocol::T_STRING, 1);
  xfer += oprot->writeString(this->what);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldBegin("err", ::apache::thrift::protocol::T_I32, 2);
  xfer += oprot->writeI32((int32_t)this->err);
  xfer += oprot->writeFieldEnd();

  xfer += oprot->writeFieldStop();
  xfer += oprot->writeStructEnd();
  return xfer;
}

void swap(ServerError &a, ServerError &b) {
  using ::std::swap;
  swap(a.what, b.what);
  swap(a.err, b.err);
  swap(a.__isset, b.__isset);
}

} // namespace
