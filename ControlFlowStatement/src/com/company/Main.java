package com.company;

public class Main {

    public static void main(String[] args) {

        int switchValue = 3;
        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Was 3 or 4 or 5");
                System.out.println("Actually it was " + switchValue);
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        // ============================================================
        // ============================================================

                /*

                Create a new switch statement using char instead of int
                Create a new char variable
                Create a switch statement testing for
                A,B,C,D or E
                display a message if any of these are found then break
                Add a default which displays a message saying not found

                 */

            char charValue = 'f';
            switch(charValue){
               /*

               case 'A':
                    System.out.println("Value was A");
                    break;
                case 'B':
                    System.out.println("Value was B");
                    break;
                case 'C':
                    System.out.println("Value was C");
                   break;

                    */
                case 'A': case 'B': case 'C': case 'D': case 'E':
                    System.out.println("Value was " + charValue);
                    break;
                default:
                    System.out.println("Not found");
            }

            //==========================================================
            //==========================================================

        /*
        To lower case
         */
        // ============================================================

        String month = "JUNE";
        switch(month.toLowerCase()) {
            case "january":  case "february":  case "march":
                case "april":  case "may":  case "june":
                System.out.println("It is " + month);
                break;
            default:
                System.out.println("It is another month not listed");
        }

        //==============================================================
        }
    }
