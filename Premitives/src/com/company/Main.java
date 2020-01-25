package com.company;

public class Main {

    public static void main(String[] args) {
	// Interger datatype
        int myintmax= Integer.MAX_VALUE;
        int myintmin= Integer.MIN_VALUE;
        System.out.println("my interger max value"+myintmax);
        System.out.println("my interger min value"+myintmin);
        //over and underflow in java
        System.out.println("my interger max value"+(myintmax+1));
        System.out.println("my interger min value"+(myintmin-1));
        // Another way of representing integers
        int number = 2_33_555;
     // byte datatype
        byte mybytemax = Byte.MAX_VALUE;
        byte mybytemin = Byte.MIN_VALUE;
        System.out.println("my byte max value"+mybytemax);
        System.out.println("my byte min value"+mybytemin);
     //short datatype   
        short myshortmax = Short.MAX_VALUE;
        short myshortmin = Short.MIN_VALUE;
        System.out.println("my short max value"+myshortmax);
        System.out.println("my short min value"+myshortmin);
     //long datatype
        long mylongvalue = 100L;
        long mylongmax = Long.MAX_VALUE;
        long mylongmin = Long.MIN_VALUE;
        System.out.println("my long max value"+mylongmax);
        System.out.println("my long min value"+mylongmin);
     //casting
        int mytotal = (myintmin/2);
        byte mytotalbyte = (byte) (mybytemin/2);
        short myshorttotal = (short)(myshortmin/2);
     //premitive challenge
        short short1 = 345;
        int num = 90;
        long muml = 500+(num+short1);
        System.out.println(muml);
     //float data type
        float myfloatmax = Float.MAX_VALUE;
        float myfloatmin = Float.MIN_VALUE;
        System.out.println("my float max value"+myfloatmax);
        System.out.println("my float min value"+myfloatmin);
     // double datatype
        double mydoublemax = Double.MAX_VALUE;
        double mydoublemin = Double.MIN_VALUE;
        System.out.println("my double max value"+mydoublemax);
        System.out.println("my double min value"+mydoublemin);
     //casting for float
        float myfloat = 5.45f;
     //char and boolean
        char mychar = 'h';
        char myunicode = '\u00A9';
        System.out.println(mychar);
        System.out.println(myunicode);
        boolean mybooleantrue = true;
        boolean mybooleanfalse = false;
        // String is a class in java
        String mystring = "hi i am bharath";
        System.out.println(mystring);
        int myint = 455;
        String intstring = mystring + myint;
        System.out.println(intstring);



        


        
        



    }
}
