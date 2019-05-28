# grpc-calculator-client
A gRPC client demo that connects to grpc-calculator-server

## Installation

### Build
```console
$ mvn clean install
```

### Running
```console
$ mvn spring-boot:run
```

## Usage

### GET /sum
```console
$ curl -X GET http://localhost:8081/sum/1/2
```

## How it works
1) Create the service definition in a proto file [CalculatorService.proto](https://github.com/robertoduessmann/grpc-calculator-client/blob/master/src/main/proto/CalculatorService.proto) 
2) Compile to be able to handle the generated objects
3) Connect to gRPC server through a `ManagedChannel` [CalculatorClient.java](https://github.com/robertoduessmann/grpc-calculator-client/blob/master/src/main/java/com/calculator/grpccalculatorclient/calc/client/CalculatorClient.java)

To check how the gRPC server is implement see [grpc-calculator-server](https://github.com/robertoduessmann/grpc-calculator-server).

## License
The MIT License (MIT)