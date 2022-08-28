package com.Task1_toast;

import java.util.Scanner;

public class Func_toast {
    public static int age() {
        Scanner sc = new Scanner(System.in);

        int age = 0;
        while (age == 0) {
            try {
                System.out.print("Enter your age:");
                age = sc.nextInt();
            }
            catch (Exception e) {
                System.out.println("Please enter valid age");
                sc.next();
            }
        }

        if (5 > age || age > 100) {
            System.out.println("Not Valid age");
        }

        return age;


    }

    public static int extention() {
        int NumofExt = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Do you want any extention?");
        String Answer = s.next();
        while (!Answer.equals("No") && !Answer.equals("Yes"))
        {
            System.out.println("Please answer - Yes or no");
            Scanner s2 = new Scanner(System.in);
            Answer = s2.nextLine();
        }


        if (Answer.equals("No"))
        {
            Scanner s1 = new Scanner(System.in);
            System.out.print("Are you sure?");
            String Answer2 = s1.nextLine();
            while (!Answer2.equals("No") && !Answer2.equals("Yes"))
            {
                System.out.println("Please answer - Yes or no");
                Scanner s3 = new Scanner(System.in);
                Answer2 = s3.nextLine();
            }

            if (Answer2.equals("Yes")) {
                return NumofExt;
            }
            else if (Answer2.equals("No"))
            {
                Scanner s4 = new Scanner(System.in);
                System.out.print("Grate! How much?");
                while (NumofExt == 0)
                {
                    try {

                        NumofExt = s4.nextInt();
                    }
                    catch (Exception e)
                    {
                        System.out.println("Please enter valid number");
                        s4.next();
                    }
                }

            }
        }

        if (Answer.equals("Yes"))
        {
            System.out.print("How much?");
            Scanner s5 = new Scanner(System.in);
            while (NumofExt == 0)
            {
                try {

                    NumofExt = s5.nextInt();
                }
                catch (Exception e)
                {
                    System.out.println("Please enter valid number");
                    s5.next();
                }
            }
        }

        return (NumofExt*3) ;


    }

    public static int drink()
    {
        int drinkprice = 0;
        System.out.println("What do you want to drink? you can choose orange juice or coca cola");
        Scanner s = new Scanner(System.in);
        String d = s.nextLine();

        while (!d.equals("orange juice") && !d.equals("coca cola"))
        {
            Scanner s1 = new Scanner(System.in);
            System.out.println("Please choose orange juice or coca cola");
            d = s1.nextLine();
        }



        if (d.equals("orange juice") || d.equals("coca cola"))
        {
            drinkprice = 8;
            return drinkprice;

        }
        return drinkprice;

    }

}
