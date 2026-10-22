package com.pluralsight;

public class Format {
    public static void main(String[] args) {
        String Result= formatName("Mohamed","Alokr");
        System.out.println(Result);
    }
    public static String formatName(String first, String last){
        return last+" , "+first;
    }
}
