
import java.util.*;
//import java.util.Scanner;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;

public class billing {
    public static void format(Date date , String name  )
    {

        System.out.println(" ");
        System.out.println("\t\t\t          JAI MATADI RESTURANT  ");
        System.out.println("=====================================================================");
        System.out.println(" Date :" +date);
        System.out.print(" Invoice To :"+name);
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------");
        System.out.print(" Items ");
        System.out.print(" \t\t\t QTY ");
        System.out.print("\t\t\t Per unit Cost ");
        System.out.println("\t\t\t Total ");
        System.out.println("---------------------------------------------------------------------");
    }

    public static void printBill(String item, int qty , float price)
    {
        System.out.print("  "+item);
        System.out.print("  \t\t\t "+qty);
        System.out.print("    \t\t\t  "+price);
        System.out.println("    \t\t\t  "+qty*price);
        System.out.println(" ");
    }

    public static void calculate_Bill(float[] price , int[] quantities)
    {
        float total = 0;
        for(int i = 0 ; i<price.length ; i++)
        {
            total += price[i]*quantities[i];
        }
        float discount = (float) (0.1 * total);
        float netTotal = total - discount;
        System.out.println("\n ---------------------------------------------------------------------\n");
        System.out.println(" Discount:                         10% \t\t\t " +discount);
        System.out.println("\n ---------------------------------------------------------------------\n");
        System.out.println(" Total Amount : \t\t\t\t\t\t "+netTotal);
        System.out.println("\n ---------------------------------------------------------------------\n");
        System.out.println(" ");
        System.out.println(" \t\t Thank's and visit again !!! \n\n ");
    }

    public static void main(String[] args) {
        System.out.println("\t\n Welcome to the resturant billing code using java\n");
        // format("1/1/2024", "Aman singh");
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER CUSTOMER NAME: ");
        String input_name = sc.nextLine();

        System.out.print("Enter the Number Of orders requested by the customer: ");
        int input_number = sc.nextInt();

        String[] items = new String[input_number];
        int [] quantities = new int[input_number];
        float[] prices = new float[input_number];

        for(int i = 0 ; i< input_number; i++)
        {
            System.out.println(" ");
            System.out.println("Enter Item "+(i+1)+ ": ");
            System.out.print("Please Enter The Item Name : ");
            sc.nextLine();
            items[i] = sc.nextLine();
            System.out.print("Enter Quantity of Items : ");
            quantities[i]= sc.nextInt();
            System.out.print("Enter the Per Unit Charge of Item : ");
            prices[i] = sc.nextFloat();
            System.out.println(" ");
        }
        Date d1=new Date();
//        DateFormat dateFormat=new SimpleDateFormat("yyyy-mm-dd");
//        String st=dateFormat.format(d1);
        format(d1, input_name);

        for(int i = 0 ;i <input_number ; i++)
        {
            printBill(items[i], quantities[i], prices[i]);
        }
        calculate_Bill(prices, quantities);
    }
}
