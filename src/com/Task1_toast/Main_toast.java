package com.Task1_toast;

public class Main_toast {


    public static void main(String[] args)
    {
        int toastprice = 15;
        int age = Func_toast.age();
        if (age >= 15 && age <=18)
        {
            toastprice = toastprice - 5;
            System.out.println("You get discount for teenager");
        }
        int extention = Func_toast.extention();
        toastprice = toastprice+extention;
        int drinkp = Func_toast.drink();
        toastprice = toastprice + drinkp;


        System.out.println(toastprice);


    }
}
