package com.example.java;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);     //to get input from user
        System.out.println("Are you \n1.Residential Customer\n2.Business Customer");    //ask the user for input
        int input = scanner.nextInt();

        //test input to see if they are a residential or business
        if(input == 1){
            //ask for name and phone number
            System.out.println("Enter your name: ");
            String rName = scanner.next();
            System.out.println("Enter your phone number like xxx-xxx-xxxx: ");
            String phone = scanner.next();
            name(rName, phone);
        } else if(input == 2){
            //get users business name, contact name, and phone number
            System.out.println("Enter your  business name: ");
            String bName = scanner.next();
            System.out.println("Enter your contact name: ");
            String cName = scanner.next();
            System.out.println("Enter your phone number like xxx-xxx-xxxx: ");
            String bPhone = scanner.next();
            name(bName, cName, bPhone);
        } else{
            System.out.println("Invald choice");
        }



    }
//prints out user information
    static void name(String name, String phone) {
        System.out.println("Your name is: " + name);
        System.out.println("Your phone number is: " + phone);
    }
    static void name(String businessName, String contactName, String phone){
        System.out.println("Your business name is: " + businessName);
        System.out.println("Your contact name is: " + contactName);
        System.out.println("Your phone number is: " + phone);
    }
}
