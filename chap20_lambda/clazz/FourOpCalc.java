package chap20_lambda.clazz;

import java.util.Scanner;

public class FourOpCalc {
    public int calc(int num1, int num2,char op, FourOperation fo){
        int result = fo.operate(num1, num2);
        return result;
    }
}
