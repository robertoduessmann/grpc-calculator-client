package com.calculator.grpccalculatorclient.calc;

import com.calculator.grpccalculatorclient.calc.client.CalculatorClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sum")
public class SumController {

    @Autowired
    private CalculatorClient client;

    @GetMapping("{num1}/{num2}")
    public ResponseEntity sum(@PathVariable String num1, @PathVariable String num2) {
        return ResponseEntity.ok(client.sum(Double.valueOf(num1), Double.valueOf(num2)));
    }
}
