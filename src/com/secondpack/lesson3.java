package com.secondpack;

public class lesson3 {

    public static void main(String[] args) {
       // lesson3.isequal("moran","gavrieli");
        lesson3.howmuch("moran hhh");

    }

    public static void isequal (String fname, String lname){
        if (fname==lname) System.out.println("first name and last name are equals");
        else System.out.println("first name and last name are not equals");
    }

    public static void howmuch (String a){
        int sum = a.length();
        System.out.println(sum);

        sum = a.replace(" ","").length();

        System.out.println(sum);
    }

}

