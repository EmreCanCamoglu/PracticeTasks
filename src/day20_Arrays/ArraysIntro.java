package day20_Arrays;

import java.util.Scanner;

public class ArraysIntro {
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);

    String[] score = new String[5] ;
    int i=2;

        System.out.println("Welcome to the program");
        System.out.println("Please start entering your group member's names one by one");
        
        System.out.println();
        System.out.println("Please enter the first name");
        while (true){
            score[i-2] = scan.nextLine();
            System.out.println("Would you like to add another name?");
            if(scan.nextLine().equalsIgnoreCase("yes")){}
            else if (scan.nextLine().equalsIgnoreCase("no"))
            {
                break;
            }else{
                System.out.println("Invalid input!");
            continue;}



            
            System.out.println("Please enter "+i+". name");
            i++;
            if(i==6)
                break;

        }
        for (String b : score)
              {
                  System.out.println(b);
            
        }





}  }