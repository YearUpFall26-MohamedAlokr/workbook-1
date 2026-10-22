package com.pluralsight;

public class Receipt {
    public static void main(String[] args) {
        String itemName = "apples";
        double itemPrice = 2.37;
        int quantity = 3;

        double totalPrice = itemPrice * quantity;

        System.out.println("You bought " + quantity + " " + itemName + " for $" + totalPrice);
           }
       }

//        Step 3
//        Create a new file in com.pluralsight named Receipt.java structured as
//        follows:
//        public class Receipt {
//            public static void main(String[] args) {
//                System.out.println();
//            }
//        }
//        1. Create variables for an item name (String) and item price (double)
//        2. Create a quantity variable (int)
//                3. Build and print: EX. "You bought 3 apples for $7.10"