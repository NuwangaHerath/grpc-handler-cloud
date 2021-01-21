package com.example.grpcserver;

import com.example.grpc.server.Service;
import com.example.grpc.server.serviceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.Map;

@GrpcService
public class ServiceImpl extends serviceGrpc.serviceImplBase {


    @Override
    public void handleEvent(Service.Event request, StreamObserver<Service.Log> responseObserver) {

        System.out.println("handleEvent method is called");
        Service.Log.Builder serverLog = Service.Log.newBuilder();

        for (Map.Entry<String, String> entry : request.getEventPropertiesMap().entrySet()) {
            System.out.println("Key: "+entry.getKey()+" Value: "+ entry.getValue());
        }

        if (request.getEvent().equals("POST_ADD_USER")) {
            serverLog.setLog("testing POST_ADD_USER event using GrpcEventHandler on Java grpc server : " +
                    "Successfully added the user with UserName- " + request.getEventPropertiesOrThrow("user-name")
                    + ", TenantDomain- " + request.getEventPropertiesOrThrow("tenant-domain"));

            System.out.println("testing POST_ADD_USER event using GrpcEventHandler on Java grpc server : " +
                    "Successfully added the user with UserName- " + request.getEventPropertiesOrThrow("user-name")
                    + ", TenantDomain- " + request.getEventPropertiesOrThrow("tenant-domain"));
        }
        if (request.getEvent().equals("PRE_ADD_USER")){
            serverLog.setLog("testing PRE_ADD_USER");
            System.out.println("testing PRE_ADD_USER");
        }
        responseObserver.onNext(serverLog.build());
        responseObserver.onCompleted();
    }
}
