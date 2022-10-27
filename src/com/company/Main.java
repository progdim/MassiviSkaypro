package com.company;

public class Main {

    public static void main(String[] args) {
        int [] arr = new int[3];
//            arr[0]=1;
//            arr[1]=2;
//            arr[2]=3;
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//        }
//
//        System.out.print(", ");
//        double [] masiv = new double[3];
//            masiv[0] = 1.57;
//            masiv[1] = 7.654;
//            masiv[2] = 9.986;
//        for (int i = 0; i < masiv.length; i++) {
//            System.out.print(masiv[i]);
//        }
//
//        System.out.print(", ");
//        int [] weight = {90, 91, 93, 92, 85, 87, 84, 83, 0, 0, 0, 0};
//        for (int i = 0; i < weight.length; i++) {
//            System.out.print(weight[i]+",");
////        }
////
//        int [] arr = new int[3];
//        arr[0]=1;
//        arr[1]=2;
//        arr[2]=3;
//
//        for (int i = arr.length-1; i >=0; i--) {
//            System.out.print(arr[i]);
//        }
////
//        System.out.print(", ");
//        double [] masiv = new double[3];
//        masiv[0] = 1.57;
//        masiv[1] = 7.654;
//        masiv[2] = 9.986;
//        for (int i = masiv.length-1; i >=0; i--) {
//            System.out.print(masiv[i]+",");
//        }
//
//        System.out.print(", ");
//        int [] weight = {90, 91, 93, 92, 85, 87, 84, 83, 0, 0, 0, 0};
//        for (int i = weight.length-1; i >= 0; i--) {
//            System.out.print(weight[i]+",");
//        }


        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {

            }
            else {
                arr[i]++;
            }
            System.out.println(arr[i]);
        }


    }
}
