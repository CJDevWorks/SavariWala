// This autogenerated skeleton file illustrates how to build a server.
// You should copy it to another filename to avoid overwriting it.

#include "UsersManager.h"
#include <thrift/protocol/TBinaryProtocol.h>
#include <thrift/server/TSimpleServer.h>
#include <thrift/transport/TServerSocket.h>
#include <thrift/transport/TBufferTransports.h>

using namespace ::apache::thrift;
using namespace ::apache::thrift::protocol;
using namespace ::apache::thrift::transport;
using namespace ::apache::thrift::server;

using boost::shared_ptr;

using namespace  ::savariwala;

class UsersManagerHandler : virtual public UsersManagerIf {
 public:
  UsersManagerHandler() {
    // Your initialization goes here
  }

  void getUser(User& _return, const std::string& fbUserId) {
    // Your implementation goes here
    printf("getUser\n");
  }

  void addUser(const User& user) {
    // Your implementation goes here
    printf("addUser\n");
  }

};

int main(int argc, char **argv) {
  int port = 9090;
  shared_ptr<UsersManagerHandler> handler(new UsersManagerHandler());
  shared_ptr<TProcessor> processor(new UsersManagerProcessor(handler));
  shared_ptr<TServerTransport> serverTransport(new TServerSocket(port));
  shared_ptr<TTransportFactory> transportFactory(new TBufferedTransportFactory());
  shared_ptr<TProtocolFactory> protocolFactory(new TBinaryProtocolFactory());

  TSimpleServer server(processor, serverTransport, transportFactory, protocolFactory);
  server.serve();
  return 0;
}

