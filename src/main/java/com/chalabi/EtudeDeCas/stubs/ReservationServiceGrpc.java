package com.chalabi.EtudeDeCas.stubs;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: reservation.proto")
public final class ReservationServiceGrpc {

  private ReservationServiceGrpc() {}

  public static final String SERVICE_NAME = "com.chalabi.EtudeDeCas.ReservationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.chalabi.EtudeDeCas.stubs.Reservation,
      com.chalabi.EtudeDeCas.stubs.Reservation> getCreateReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateReservation",
      requestType = com.chalabi.EtudeDeCas.stubs.Reservation.class,
      responseType = com.chalabi.EtudeDeCas.stubs.Reservation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.chalabi.EtudeDeCas.stubs.Reservation,
      com.chalabi.EtudeDeCas.stubs.Reservation> getCreateReservationMethod() {
    io.grpc.MethodDescriptor<com.chalabi.EtudeDeCas.stubs.Reservation, com.chalabi.EtudeDeCas.stubs.Reservation> getCreateReservationMethod;
    if ((getCreateReservationMethod = ReservationServiceGrpc.getCreateReservationMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getCreateReservationMethod = ReservationServiceGrpc.getCreateReservationMethod) == null) {
          ReservationServiceGrpc.getCreateReservationMethod = getCreateReservationMethod = 
              io.grpc.MethodDescriptor.<com.chalabi.EtudeDeCas.stubs.Reservation, com.chalabi.EtudeDeCas.stubs.Reservation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.chalabi.EtudeDeCas.ReservationService", "CreateReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.chalabi.EtudeDeCas.stubs.Reservation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.chalabi.EtudeDeCas.stubs.Reservation.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("CreateReservation"))
                  .build();
          }
        }
     }
     return getCreateReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.chalabi.EtudeDeCas.stubs.GetReservationRequest,
      com.chalabi.EtudeDeCas.stubs.Reservation> getGetReservationByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetReservationById",
      requestType = com.chalabi.EtudeDeCas.stubs.GetReservationRequest.class,
      responseType = com.chalabi.EtudeDeCas.stubs.Reservation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.chalabi.EtudeDeCas.stubs.GetReservationRequest,
      com.chalabi.EtudeDeCas.stubs.Reservation> getGetReservationByIdMethod() {
    io.grpc.MethodDescriptor<com.chalabi.EtudeDeCas.stubs.GetReservationRequest, com.chalabi.EtudeDeCas.stubs.Reservation> getGetReservationByIdMethod;
    if ((getGetReservationByIdMethod = ReservationServiceGrpc.getGetReservationByIdMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getGetReservationByIdMethod = ReservationServiceGrpc.getGetReservationByIdMethod) == null) {
          ReservationServiceGrpc.getGetReservationByIdMethod = getGetReservationByIdMethod = 
              io.grpc.MethodDescriptor.<com.chalabi.EtudeDeCas.stubs.GetReservationRequest, com.chalabi.EtudeDeCas.stubs.Reservation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.chalabi.EtudeDeCas.ReservationService", "GetReservationById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.chalabi.EtudeDeCas.stubs.GetReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.chalabi.EtudeDeCas.stubs.Reservation.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("GetReservationById"))
                  .build();
          }
        }
     }
     return getGetReservationByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.chalabi.EtudeDeCas.stubs.Empty,
      com.chalabi.EtudeDeCas.stubs.ReservationList> getListReservationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListReservations",
      requestType = com.chalabi.EtudeDeCas.stubs.Empty.class,
      responseType = com.chalabi.EtudeDeCas.stubs.ReservationList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.chalabi.EtudeDeCas.stubs.Empty,
      com.chalabi.EtudeDeCas.stubs.ReservationList> getListReservationsMethod() {
    io.grpc.MethodDescriptor<com.chalabi.EtudeDeCas.stubs.Empty, com.chalabi.EtudeDeCas.stubs.ReservationList> getListReservationsMethod;
    if ((getListReservationsMethod = ReservationServiceGrpc.getListReservationsMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getListReservationsMethod = ReservationServiceGrpc.getListReservationsMethod) == null) {
          ReservationServiceGrpc.getListReservationsMethod = getListReservationsMethod = 
              io.grpc.MethodDescriptor.<com.chalabi.EtudeDeCas.stubs.Empty, com.chalabi.EtudeDeCas.stubs.ReservationList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.chalabi.EtudeDeCas.ReservationService", "ListReservations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.chalabi.EtudeDeCas.stubs.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.chalabi.EtudeDeCas.stubs.ReservationList.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("ListReservations"))
                  .build();
          }
        }
     }
     return getListReservationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.chalabi.EtudeDeCas.stubs.UpdateReservationRequest,
      com.chalabi.EtudeDeCas.stubs.Reservation> getUpdateReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateReservation",
      requestType = com.chalabi.EtudeDeCas.stubs.UpdateReservationRequest.class,
      responseType = com.chalabi.EtudeDeCas.stubs.Reservation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.chalabi.EtudeDeCas.stubs.UpdateReservationRequest,
      com.chalabi.EtudeDeCas.stubs.Reservation> getUpdateReservationMethod() {
    io.grpc.MethodDescriptor<com.chalabi.EtudeDeCas.stubs.UpdateReservationRequest, com.chalabi.EtudeDeCas.stubs.Reservation> getUpdateReservationMethod;
    if ((getUpdateReservationMethod = ReservationServiceGrpc.getUpdateReservationMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getUpdateReservationMethod = ReservationServiceGrpc.getUpdateReservationMethod) == null) {
          ReservationServiceGrpc.getUpdateReservationMethod = getUpdateReservationMethod = 
              io.grpc.MethodDescriptor.<com.chalabi.EtudeDeCas.stubs.UpdateReservationRequest, com.chalabi.EtudeDeCas.stubs.Reservation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.chalabi.EtudeDeCas.ReservationService", "UpdateReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.chalabi.EtudeDeCas.stubs.UpdateReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.chalabi.EtudeDeCas.stubs.Reservation.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("UpdateReservation"))
                  .build();
          }
        }
     }
     return getUpdateReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.chalabi.EtudeDeCas.stubs.DeleteReservationRequest,
      com.chalabi.EtudeDeCas.stubs.DeleteReservationResponse> getDeleteReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteReservation",
      requestType = com.chalabi.EtudeDeCas.stubs.DeleteReservationRequest.class,
      responseType = com.chalabi.EtudeDeCas.stubs.DeleteReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.chalabi.EtudeDeCas.stubs.DeleteReservationRequest,
      com.chalabi.EtudeDeCas.stubs.DeleteReservationResponse> getDeleteReservationMethod() {
    io.grpc.MethodDescriptor<com.chalabi.EtudeDeCas.stubs.DeleteReservationRequest, com.chalabi.EtudeDeCas.stubs.DeleteReservationResponse> getDeleteReservationMethod;
    if ((getDeleteReservationMethod = ReservationServiceGrpc.getDeleteReservationMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getDeleteReservationMethod = ReservationServiceGrpc.getDeleteReservationMethod) == null) {
          ReservationServiceGrpc.getDeleteReservationMethod = getDeleteReservationMethod = 
              io.grpc.MethodDescriptor.<com.chalabi.EtudeDeCas.stubs.DeleteReservationRequest, com.chalabi.EtudeDeCas.stubs.DeleteReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.chalabi.EtudeDeCas.ReservationService", "DeleteReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.chalabi.EtudeDeCas.stubs.DeleteReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.chalabi.EtudeDeCas.stubs.DeleteReservationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("DeleteReservation"))
                  .build();
          }
        }
     }
     return getDeleteReservationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReservationServiceStub newStub(io.grpc.Channel channel) {
    return new ReservationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReservationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ReservationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReservationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ReservationServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ReservationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createReservation(com.chalabi.EtudeDeCas.stubs.Reservation request,
        io.grpc.stub.StreamObserver<com.chalabi.EtudeDeCas.stubs.Reservation> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateReservationMethod(), responseObserver);
    }

    /**
     */
    public void getReservationById(com.chalabi.EtudeDeCas.stubs.GetReservationRequest request,
        io.grpc.stub.StreamObserver<com.chalabi.EtudeDeCas.stubs.Reservation> responseObserver) {
      asyncUnimplementedUnaryCall(getGetReservationByIdMethod(), responseObserver);
    }

    /**
     */
    public void listReservations(com.chalabi.EtudeDeCas.stubs.Empty request,
        io.grpc.stub.StreamObserver<com.chalabi.EtudeDeCas.stubs.ReservationList> responseObserver) {
      asyncUnimplementedUnaryCall(getListReservationsMethod(), responseObserver);
    }

    /**
     */
    public void updateReservation(com.chalabi.EtudeDeCas.stubs.UpdateReservationRequest request,
        io.grpc.stub.StreamObserver<com.chalabi.EtudeDeCas.stubs.Reservation> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateReservationMethod(), responseObserver);
    }

    /**
     */
    public void deleteReservation(com.chalabi.EtudeDeCas.stubs.DeleteReservationRequest request,
        io.grpc.stub.StreamObserver<com.chalabi.EtudeDeCas.stubs.DeleteReservationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteReservationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateReservationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.chalabi.EtudeDeCas.stubs.Reservation,
                com.chalabi.EtudeDeCas.stubs.Reservation>(
                  this, METHODID_CREATE_RESERVATION)))
          .addMethod(
            getGetReservationByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.chalabi.EtudeDeCas.stubs.GetReservationRequest,
                com.chalabi.EtudeDeCas.stubs.Reservation>(
                  this, METHODID_GET_RESERVATION_BY_ID)))
          .addMethod(
            getListReservationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.chalabi.EtudeDeCas.stubs.Empty,
                com.chalabi.EtudeDeCas.stubs.ReservationList>(
                  this, METHODID_LIST_RESERVATIONS)))
          .addMethod(
            getUpdateReservationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.chalabi.EtudeDeCas.stubs.UpdateReservationRequest,
                com.chalabi.EtudeDeCas.stubs.Reservation>(
                  this, METHODID_UPDATE_RESERVATION)))
          .addMethod(
            getDeleteReservationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.chalabi.EtudeDeCas.stubs.DeleteReservationRequest,
                com.chalabi.EtudeDeCas.stubs.DeleteReservationResponse>(
                  this, METHODID_DELETE_RESERVATION)))
          .build();
    }
  }

  /**
   */
  public static final class ReservationServiceStub extends io.grpc.stub.AbstractStub<ReservationServiceStub> {
    private ReservationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReservationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReservationServiceStub(channel, callOptions);
    }

    /**
     */
    public void createReservation(com.chalabi.EtudeDeCas.stubs.Reservation request,
        io.grpc.stub.StreamObserver<com.chalabi.EtudeDeCas.stubs.Reservation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getReservationById(com.chalabi.EtudeDeCas.stubs.GetReservationRequest request,
        io.grpc.stub.StreamObserver<com.chalabi.EtudeDeCas.stubs.Reservation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetReservationByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listReservations(com.chalabi.EtudeDeCas.stubs.Empty request,
        io.grpc.stub.StreamObserver<com.chalabi.EtudeDeCas.stubs.ReservationList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListReservationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateReservation(com.chalabi.EtudeDeCas.stubs.UpdateReservationRequest request,
        io.grpc.stub.StreamObserver<com.chalabi.EtudeDeCas.stubs.Reservation> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteReservation(com.chalabi.EtudeDeCas.stubs.DeleteReservationRequest request,
        io.grpc.stub.StreamObserver<com.chalabi.EtudeDeCas.stubs.DeleteReservationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteReservationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ReservationServiceBlockingStub extends io.grpc.stub.AbstractStub<ReservationServiceBlockingStub> {
    private ReservationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReservationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReservationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.chalabi.EtudeDeCas.stubs.Reservation createReservation(com.chalabi.EtudeDeCas.stubs.Reservation request) {
      return blockingUnaryCall(
          getChannel(), getCreateReservationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.chalabi.EtudeDeCas.stubs.Reservation getReservationById(com.chalabi.EtudeDeCas.stubs.GetReservationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetReservationByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.chalabi.EtudeDeCas.stubs.ReservationList listReservations(com.chalabi.EtudeDeCas.stubs.Empty request) {
      return blockingUnaryCall(
          getChannel(), getListReservationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.chalabi.EtudeDeCas.stubs.Reservation updateReservation(com.chalabi.EtudeDeCas.stubs.UpdateReservationRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateReservationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.chalabi.EtudeDeCas.stubs.DeleteReservationResponse deleteReservation(com.chalabi.EtudeDeCas.stubs.DeleteReservationRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteReservationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ReservationServiceFutureStub extends io.grpc.stub.AbstractStub<ReservationServiceFutureStub> {
    private ReservationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReservationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReservationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.chalabi.EtudeDeCas.stubs.Reservation> createReservation(
        com.chalabi.EtudeDeCas.stubs.Reservation request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateReservationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.chalabi.EtudeDeCas.stubs.Reservation> getReservationById(
        com.chalabi.EtudeDeCas.stubs.GetReservationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetReservationByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.chalabi.EtudeDeCas.stubs.ReservationList> listReservations(
        com.chalabi.EtudeDeCas.stubs.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getListReservationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.chalabi.EtudeDeCas.stubs.Reservation> updateReservation(
        com.chalabi.EtudeDeCas.stubs.UpdateReservationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateReservationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.chalabi.EtudeDeCas.stubs.DeleteReservationResponse> deleteReservation(
        com.chalabi.EtudeDeCas.stubs.DeleteReservationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteReservationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_RESERVATION = 0;
  private static final int METHODID_GET_RESERVATION_BY_ID = 1;
  private static final int METHODID_LIST_RESERVATIONS = 2;
  private static final int METHODID_UPDATE_RESERVATION = 3;
  private static final int METHODID_DELETE_RESERVATION = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ReservationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ReservationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_RESERVATION:
          serviceImpl.createReservation((com.chalabi.EtudeDeCas.stubs.Reservation) request,
              (io.grpc.stub.StreamObserver<com.chalabi.EtudeDeCas.stubs.Reservation>) responseObserver);
          break;
        case METHODID_GET_RESERVATION_BY_ID:
          serviceImpl.getReservationById((com.chalabi.EtudeDeCas.stubs.GetReservationRequest) request,
              (io.grpc.stub.StreamObserver<com.chalabi.EtudeDeCas.stubs.Reservation>) responseObserver);
          break;
        case METHODID_LIST_RESERVATIONS:
          serviceImpl.listReservations((com.chalabi.EtudeDeCas.stubs.Empty) request,
              (io.grpc.stub.StreamObserver<com.chalabi.EtudeDeCas.stubs.ReservationList>) responseObserver);
          break;
        case METHODID_UPDATE_RESERVATION:
          serviceImpl.updateReservation((com.chalabi.EtudeDeCas.stubs.UpdateReservationRequest) request,
              (io.grpc.stub.StreamObserver<com.chalabi.EtudeDeCas.stubs.Reservation>) responseObserver);
          break;
        case METHODID_DELETE_RESERVATION:
          serviceImpl.deleteReservation((com.chalabi.EtudeDeCas.stubs.DeleteReservationRequest) request,
              (io.grpc.stub.StreamObserver<com.chalabi.EtudeDeCas.stubs.DeleteReservationResponse>) responseObserver);
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

  private static abstract class ReservationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReservationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.chalabi.EtudeDeCas.stubs.ReservationOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ReservationService");
    }
  }

  private static final class ReservationServiceFileDescriptorSupplier
      extends ReservationServiceBaseDescriptorSupplier {
    ReservationServiceFileDescriptorSupplier() {}
  }

  private static final class ReservationServiceMethodDescriptorSupplier
      extends ReservationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ReservationServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ReservationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReservationServiceFileDescriptorSupplier())
              .addMethod(getCreateReservationMethod())
              .addMethod(getGetReservationByIdMethod())
              .addMethod(getListReservationsMethod())
              .addMethod(getUpdateReservationMethod())
              .addMethod(getDeleteReservationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
