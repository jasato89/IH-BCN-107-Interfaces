package com.ironhack;

import com.ironhack.IntList.IntArray;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {



        /*
        Empresa empresa = new Empresa("asdsad","Ironhack", 25);
        SociedadAnonima sa = new SociedadAnonima("234234", "Facebook", 145, 220.0, 1000);

        empresa.mostrarElementos();
        sa.mostrarElementos();

        List<Playable> devices = new ArrayList<>();
        devices.add(new Jukebox("Walking on Sunshine", 2.30));
        devices.add(new iOSApp("Maria Becerra"));

        TransactionList transactionList = new PaymentList();


        double a = 0.70;
        double b = 0.10;
        double c = .2;

        System.out.println(a + b);
        System.out.println(b + c);

        BigDecimal b1 = new BigDecimal("1");
        BigDecimal b2 = new BigDecimal("4");
        BigDecimal b3 = new BigDecimal("3");


        System.out.println("Suma: " + b1.add(b2));

        System.out.println("Resta: "+ b1.subtract(b2));

        System.out.println("Combo: "+ b1.add(b2).subtract(new BigDecimal(".3")));

        System.out.println("División y recorte decimales: "
                + b1.divide(b2));


        BigDecimal result = b1.divide(b3, 3, RoundingMode.HALF_EVEN);

        System.out.println(result);


        System.out.println("División infinita " + b1.divide(b3, 3, RoundingMode.HALF_EVEN).multiply(result));

        System.out.println("Comparar números: " + b2.compareTo(b2));

        //As a challenge, determine how to
        // perform  the following
        // operation (2.3 * x + 1.5)
        // /
        // (x - 0.8).

        System.out.println(performOperation(new BigDecimal("1")));

        IntArray intArray = new IntArray();

        for (int i = 0; i < 25; i++) {
            intArray.add(i);
        }

        for (int i : intArray.getFullArray()) {
            System.out.println(i);
        }
         */


        for (int i : balancer(new int[]{1, 3, 4, 2, 5, 7}, 67)) {
            System.out.println(i);
        }

        System.out.println("Estoy en la rama develop");


    }

    public static int[] balancer(int[] array, int sum) {

        while (getSum(array) < sum) {

            int lowerIndex = 0;
            int lowerValue = Integer.MAX_VALUE;

            for(int i=0; i<array.length; i++) {
                if (array[i] < lowerValue) {
                    lowerIndex = i;
                    lowerValue = array[i];
                }
            }
            array[lowerIndex]++;

        }

        return array;

    }

    private static int getSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static BigDecimal performOperation(BigDecimal x) {
        BigDecimal a = (new BigDecimal("2.3")
                .multiply(x))
                .add(new BigDecimal("1.5"));

        BigDecimal numeroARestar = new BigDecimal("0.8");

        BigDecimal b = x.subtract(numeroARestar);

        return a.divide(b, 2, RoundingMode.HALF_EVEN);

    }

}
