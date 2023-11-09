package com.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class MyLambdaHandler implements RequestHandler<RequestClass, ResponseClass> {

    @Override
    public ResponseClass handleRequest(RequestClass input, Context context) {
        int num1 = input.getNum1();
        int num2 = input.getNum2();
        int sum = num1 + num2;

        ResponseClass response = new ResponseClass();
        response.setResult(sum);

        return response;
    }
}
