package com.example.grpc.server;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: service.proto")
public final class serviceGrpc {

  private serviceGrpc() {}

  public static final String SERVICE_NAME = "service";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.example.grpc.server.Service.Event,
      com.example.grpc.server.Service.Log> METHOD_HANDLE_EVENT =
      io.grpc.MethodDescriptor.<com.example.grpc.server.Service.Event, com.example.grpc.server.Service.Log>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "service", "handleEvent"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.server.Service.Event.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.server.Service.Log.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static serviceStub newStub(io.grpc.Channel channel) {
    return new serviceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static serviceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new serviceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static serviceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new serviceFutureStub(channel);
  }

  /**
   */
  public static abstract class serviceImplBase implements io.grpc.BindableService {

    /**
     */
    public void handleEvent(com.example.grpc.server.Service.Event request,
        io.grpc.stub.StreamObserver<com.example.grpc.server.Service.Log> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_HANDLE_EVENT, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_HANDLE_EVENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.server.Service.Event,
                com.example.grpc.server.Service.Log>(
                  this, METHODID_HANDLE_EVENT)))
          .build();
    }
  }

  /**
   */
  public static final class serviceStub extends io.grpc.stub.AbstractStub<serviceStub> {
    private serviceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private serviceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected serviceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new serviceStub(channel, callOptions);
    }

    /**
     */
    public void handleEvent(com.example.grpc.server.Service.Event request,
        io.grpc.stub.StreamObserver<com.example.grpc.server.Service.Log> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_HANDLE_EVENT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class serviceBlockingStub extends io.grpc.stub.AbstractStub<serviceBlockingStub> {
    private serviceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private serviceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected serviceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new serviceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.server.Service.Log handleEvent(com.example.grpc.server.Service.Event request) {
      return blockingUnaryCall(
          getChannel(), METHOD_HANDLE_EVENT, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class serviceFutureStub extends io.grpc.stub.AbstractStub<serviceFutureStub> {
    private serviceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private serviceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected serviceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new serviceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.server.Service.Log> handleEvent(
        com.example.grpc.server.Service.Event request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_HANDLE_EVENT, getCallOptions()), request);
    }
  }

  private static final int METHODID_HANDLE_EVENT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final serviceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(serviceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HANDLE_EVENT:
          serviceImpl.handleEvent((com.example.grpc.server.Service.Event) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.server.Service.Log>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class serviceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.server.Service.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (serviceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new serviceDescriptorSupplier())
              .addMethod(METHOD_HANDLE_EVENT)
              .build();
        }
      }
    }
    return result;
  }
}
