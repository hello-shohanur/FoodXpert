package foodxpert;
import java.util.Scanner;
import java.util.*;
public class FoodXpert_Test {   
    public static void main(String[] args) {

        Queue<Integer> pq = new PriorityQueue<>();
        System.out.println("FoodXpert");
        System.out.println("1. Log In\n2. Sign Up");
        int fx, phn, pin, fi, dash, pcode, pay;                                      
        Scanner inp = new Scanner(System.in);                                                           
        fx = inp.nextInt();                         // © 2020-2021, FoodXpert.
        switch (fx) {                              //  All Rights Reserved                         
            case 1:                                   
                System.out.println("** Log In **");
                System.out.println("Enter phone number: ");
                phn = inp.nextInt();
                while (phn != 123456789) {
                    System.out.println("Incorrect Phone number! try again.");
                    phn = inp.nextInt();
                }
                System.out.println("Enter pin: ");
                pin = inp.nextInt();
                while (pin != 3401) {
                    System.out.println("Incorrect pin! try again.");
                    pin = inp.nextInt();
                }
                System.out.println("Dashboard: \n1.Food Iteam\n2.Order\n3.Payment\n4.About");
                dash = inp.nextInt();
                switch (dash) {
                    case 1:
                        System.out.println("**Food Iteam: \n1.PIZZA\n2.SNACK\n3.COFFEE\n4.RICH FOOD\n");
                        fi = inp.nextInt();
                        switch (fi) {
                            case 1:
                                System.out.println("\nPIZZA: ");
                                FoodXpert code = new FoodXpert("Cheese Pizza", "Pepperoni Pizza", "Meat Pizza", "Hawaiian Pizza", "BBQ Chicken Pizza");
                                code.FoodXpert_show();
                                break;
                            case 2:
                                System.out.println("\nSNACK: ");
                                FoodXpert code1 = new FoodXpert("Cookies", "Cakes", "Pastries", "Bread/sandwiches", "Cheese");
                                code1.FoodXpert_show();
                                break;
                            case 3:
                                System.out.println("\nCOFFEE: ");
                                FoodXpert code2 = new FoodXpert("Latte", "Cappuccino", "Americano", "Espresso", "Doppio");
                                code2.FoodXpert_show();
                                break;
                            case 4:
                                System.out.println("\nRICH FOOD: ");
                                FoodXpert code3 = new FoodXpert("Hyderabadi Biryani", "Keema Biryani", "Awadhi Mutton Biryani", "Chicken Pulao", "Beef Kalo Vuna With Pulao");
                                code3.FoodXpert_show();
                                break;
                            default:
                                System.out.println("Sorry! invalid input. Please, try again.\n");
                        }
                        break;
                    case 2:
                        System.out.println("**Order: ");
                        System.out.println("Enter the pin: ");
                        pcode = inp.nextInt();
                        while (pcode != 0) {
                            System.out.println("\nEnter the product code: ");
                            System.out.println("(Once the product codes have been entered, then complete the order by entering 0)");
                            pcode = inp.nextInt();
                            pq.add(pcode);
                            System.out.println("The products you ordered: " + pq);
                        }
                        System.out.println("Thank you! We just received your order. We will notify you soon.");
                        break;
                    case 3:
                        System.out.println("**Payment: \n1.Visa Card\n2.bKash\n3.Rocket\n4.Nagad");
                        pay = inp.nextInt();
                        switch (pay) {
                            case 1:
                                System.out.println("Visa Card: \n This feature is coming soon..");
                                break;
                            case 2:
                                System.out.println("\nbKash: \nEnter your bKash number: ");
                                int bnum = inp.nextInt();
                                while (bnum != 123456789) {
                                    System.out.println("Sorry! Please, enter the valid phone number.");
                                    bnum = inp.nextInt();
                                }
                                System.out.println("Enter one time verification code: ");
                                int otp = inp.nextInt();
                                System.out.println("Enter your pin number: ");
                                int bpin = inp.nextInt();
                                while (bpin != 3401) {
                                    System.out.println("Incorrect! Please, use correct pin to complete the payment.");
                                    bpin = inp.nextInt();
                                }
                                System.out.println("bKash payment successful! \nThank You.");
                                break;
                            case 3:
                                System.out.println("\nRocket: \nEnter your Rocket number: ");
                                int rnum = inp.nextInt();
                                while (rnum != 123456789) {
                                    System.out.println("Sorry! Please, enter the valid phone number.");
                                    rnum = inp.nextInt();
                                }
                                System.out.println("Enter your pin number: ");
                                int rpin = inp.nextInt();
                                while (rpin != 3401) {
                                    System.out.println("Incorrect! Please, use correct pin to complete the payment.");
                                }
                                System.out.println("Rocket payment successful! \nThank You.");
                                break;
                            case 4:
                                System.out.println("\nNagad: \nEnter your Nagad number: ");
                                int nnum = inp.nextInt();
                                while (nnum != 123456789) {
                                    System.out.println("Sorry! Please, enter the valid phone number.");
                                    nnum = inp.nextInt();
                                }
                                System.out.println("Enter your pin number: ");
                                int npin = inp.nextInt();
                                while (npin != 3401) {
                                    System.out.println("Incorrect! Please, use correct pin to complete the payment.");
                                }
                                System.out.println("Nagad payment successful! \nThank You.");
                                break;
                            default:
                                System.out.println("Invalid input! Try again to complete the payment.");

                        }
                        break;
                    case 4:
                        System.out.println("**About: FoodXpert is a mobile food delivery marketplace. \nIt is mostly active in Dhaka, Chittagong, Rangpur and \nMymensingh. It is headquartered in Savar, Dhaka, Bangladesh. \nThe service allows users to select from local restaurants \nand place orders via its mobile applications as well as its \nwebsites. The company has partnered with over 8500 restaurants \nin 29 cities and works with over 900 delivery riders. FoodXpert \nprocesses and sends orders directly to partner restaurants, \nthen delivers the meals by delivery riders to the customers. \nThe service is available via its websites and mobile applications. \nIt connects customers with restaurants that offer food delivery \nin their area and lets them choose, order and pay online. \n\n");
                        break;
                    default:
                        System.out.println("Invalid input. Please, input someting valid.");

                }
                break;

            case 2:
                System.out.println("** Sign Up **");

                System.out.println("Enter your name: ");
                String name = inp.nextLine();
                System.out.println("Enter your name: ");
                String name1 = inp.nextLine();
                System.out.println("Enter your phone number: ");
                int phone = inp.nextInt();
                System.out.println("Enter a pin: ");
                int SUpin = inp.nextInt();
                System.out.println("Enter id verification code: ");
                int id = inp.nextInt();
                while (id != 3401) {
                    System.out.println("Sorry! please, enter correct id verification code.");
                    id = inp.nextInt();
                }
                System.out.println("\nSign Up Successful! \n--- Welcome to FoodXpert ---");
                System.out.println("** Log In **");
                System.out.println("Enter phone number: ");
                phn = inp.nextInt();
                while (phn != 123456789) {
                    System.out.println("Incorrect Phone number! try again.");
                    phn = inp.nextInt();
                }
                System.out.println("Enter pin: ");
                pin = inp.nextInt();
                while (pin != 3401) {
                    System.out.println("Incorrect pin! try again.");
                    pin = inp.nextInt();
                }
                System.out.println("Dashboard: \n1.Food Iteam\n2.Order\n3.Payment\n4.About");
                dash = inp.nextInt();
                switch (dash) {
                    case 1:
                        System.out.println("**Food Iteam: \n1.PIZZA\n2.SNACK\n3.COFFEE\n4.RICH FOOD\n");
                        fi = inp.nextInt();
                        switch (fi) {
                            case 1:
                                System.out.println("\nPIZZA: ");
                                FoodXpert_Encap code = new FoodXpert_Encap();
                                code.setName1("Cheese Pizza");
                                code.setName2("Pepperoni Pizza");
                                code.setName3("Meat Pizza");
                                code.setName4("Hawaiian Pizza");
                                code.setName5("BBQ Chicken Pizza");
                                System.out.println(code.getName1());
                                System.out.println(code.getName2());
                                System.out.println(code.getName3());
                                System.out.println(code.getName4());
                                System.out.println(code.getName5());
                                
                                break;
                            case 2:
                                System.out.println("\nSNACK: ");
                                FoodXpert code1 = new FoodXpert("Cookies", "Cakes", "Pastries", "Bread/sandwiches", "Cheese");
                                code1.FoodXpert_show();
                                break;
                            case 3:
                                System.out.println("\nCOFFEE: ");
                                FoodXpert code2 = new FoodXpert("Latte", "Cappuccino", "Americano", "Espresso", "Doppio");
                                code2.FoodXpert_show();
                                break;
                            case 4:
                                System.out.println("\nRICH FOOD: ");
                                FoodXpert code3 = new FoodXpert("Hyderabadi Biryani", "Keema Biryani", "Awadhi Mutton Biryani", "Chicken Pulao", "Beef Kalo Vuna With Pulao");
                                code3.FoodXpert_show();
                                break;
                            default:
                                System.out.println("Sorry! invalid input. Please, try again.\n");
                        }
                        break;
                    case 2:
                        System.out.println("**Order: ");
                        System.out.println("Enter the pin: ");
                        pcode = inp.nextInt();
                        while (pcode != 0) {
                            System.out.println("\nEnter the product code: ");
                            System.out.println("(Once the product codes have been entered, then complete the order by entering 0)");
                            pcode = inp.nextInt();
                            pq.add(pcode);
                            System.out.println("The products ou ordered: " + pq);
                        }
                        System.out.println("Thank you! We just received your order. We will notify you soon.");
                        break;
                    case 3:
                        System.out.println("**Payment: \n1.Visa Card\n2.bKash\n3.Rocket\n4.Nagad");
                        pay = inp.nextInt();
                        switch (pay) {
                            case 1:
                                System.out.println("Visa Card: \n This feature is coming soon..");
                                break;
                            case 2:
                                System.out.println("\nbKash: \nEnter your bKash number: ");
                                int bnum = inp.nextInt();
                                while (bnum != 123456789) {
                                    System.out.println("Sorry! Please, enter the valid phone number.");
                                    bnum = inp.nextInt();
                                }
                                System.out.println("Enter one time verification code: ");
                                int otp = inp.nextInt();
                                System.out.println("Enter your pin number: ");
                                int bpin = inp.nextInt();
                                while (bpin != 3401) {
                                    System.out.println("Incorrect! Please, use correct pin to complete the payment.");
                                }
                                System.out.println("bKash payment successful! \nThank You.");
                                break;
                            case 3:
                                System.out.println("\nRocket: \nEnter your Rocket number: ");
                                int rnum = inp.nextInt();
                                while (rnum != 123456789) {
                                    System.out.println("Sorry! Please, enter the valid phone number.");
                                    rnum = inp.nextInt();
                                }
                                System.out.println("Enter your pin number: ");
                                int rpin = inp.nextInt();
                                while (rpin != 3401) {
                                    System.out.println("Incorrect! Please, use correct pin to complete the payment.");
                                }
                                System.out.println("Rocket payment successful! \nThank You.");
                                break;
                            case 4:
                                System.out.println("\nNagad: \nEnter your Nagad number: ");
                                int nnum = inp.nextInt();
                                while (nnum != 123456789) {
                                    System.out.println("Sorry! Please, enter the valid phone number.");
                                    nnum = inp.nextInt();
                                }
                                System.out.println("Enter your pin number: ");
                                int npin = inp.nextInt();
                                while (npin != 3401) {
                                    System.out.println("Incorrect! Please, use correct pin to complete the payment.");
                                }
                                System.out.println("Nagad payment successful! \nThank You.");
                                break;
                            default:
                                System.out.println("Invalid input! Try again to complete the payment.");

                        }
                        break;
                    case 4:
                        System.out.println("**About: FoodXpert is a mobile food delivery marketplace. \nIt is mostly active in Dhaka, Chittagong, Rangpur and \nMymensingh. It is headquartered in Savar, Dhaka, Bangladesh. \nThe service allows users to select from local restaurants \nand place orders via its mobile applications as well as its \nwebsites. The company has partnered with over 8500 restaurants \nin 29 cities and works with over 900 delivery riders. FoodXpert \nprocesses and sends orders directly to partner restaurants, \nthen delivers the meals by delivery riders to the customers. \nThe service is available via its websites and mobile applications. \nIt connects customers with restaurants that offer food delivery \nin their area and lets them choose, order and pay online. \n\n");
                        break;
                    default:
                        System.out.println("Invalid input. Please, input someting valid.");

                }

                break;

            default:
                System.out.println("Sorry! Please, Try again. Enter 1(for Log In) or 2(for Sign Up)");

        }

    }
}
