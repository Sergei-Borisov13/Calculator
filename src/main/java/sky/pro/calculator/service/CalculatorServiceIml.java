package sky.pro.calculator.service;

import org.springframework.stereotype.Service;
import sky.pro.calculator.exception.ZeroDivideException;

import java.util.zip.ZipException;

@Service
public class CalculatorServiceIml implements CalculatorService{

    @Override
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ZeroDivideException();
        }
        return  num1 / num2;
    }
}
