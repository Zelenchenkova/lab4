package com.lab.lab4;

import java.text.DecimalFormat;

public class Data {
    public final static String TASK = "Скласти довільну канальну матрицю розміром 3*3 з боку \nприймача повідомлень. Обчислити ентропію приймача повідомлень, \nякщо символи алфавіту, з якого складено повідомлення, - рівноймовірні.";
    public final static String ANSWER = "H(B) = "+findEntropy();
    public static String findEntropy(){
        double arr[][] = {
                {0.98,0.01,0.01},
                {0.1,0.85,0.05},
                {0.2,0.2,0.6}
        };
        double res = 0;
        double temp = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                temp = temp + (0.33*arr[j][i]);
            }
            res = res + temp*(Math.log(temp) / Math.log(2));
            temp=0;
        }
        res= -1*res;

        return new DecimalFormat("#0.000").format(res);
    }
}
