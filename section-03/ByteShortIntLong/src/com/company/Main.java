package com.company;

public class Main {

    public static void main(String[] args) {

        // int -> -2,147,483,648 - 2,137,483,647
        // 32 bits
        // width: 32
        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer minimum value: " + minIntValue);
        System.out.println("Integer maximum value: " + maxIntValue);

        // overflow & underflow
        System.out.println("Busted max value: " + (maxIntValue + 1));
        System.out.println("Busted min value: " + (minIntValue - 1));

        // byte -> -128 - 127
        // 8 bits
        // width = 8
        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte minimum value: " + minByteValue);
        System.out.println("Byte maximum value: " + maxByteValue);

        // short -> -32768 - 32767
        // 16 bits
        // width: 16
        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("Short minimum value: " + minShortValue);
        System.out.println("Short maximum value: " + maxShortValue);

        // long -> -9,223,372,036,854,775,808 - 9,223,372,036,854,775,807 (2^63)
        // 64 bits
        // width: 64
        long myLongValue = 100L;
        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("Long minimum value: " + minLongValue);
        System.out.println("Long maximum value: " + maxLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);


        short bigShortLiteralValue = 32767;

    }
}
