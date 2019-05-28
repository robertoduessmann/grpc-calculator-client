package com.calculator.grpccalculatorclient.calc.client;

import com.calculator.CalculatorServiceGrpc;
import com.calculator.SumRequest;
import com.calculator.SumResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CalculatorClient {

    @Value("${calculator-server.host}")
    private String host;

    @Value("${calculator-server.port}")
    private Integer port;

    public double sum(double num1, double num2) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
        CalculatorServiceGrpc.CalculatorServiceBlockingStub stub = CalculatorServiceGrpc.newBlockingStub(channel);

        SumResponse response = stub.sum(SumRequest.newBuilder().setNum1(num1).setNum2(num2).build());

        return response.getResult();
    }
}
