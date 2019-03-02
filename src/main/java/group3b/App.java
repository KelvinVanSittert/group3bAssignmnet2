package group3b;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{

    private static void manageArrayList(){

        Scanner console = new Scanner(System.in);

        ArrayList<String> nameArrayList = new ArrayList<>();

        String nextInput;

        do{

            System.out.println("---------------------------------------------------------------");
            System.out.println("Enter S to display contents. Enter X to exit. ");
            System.out.println("Enter another input");

            nextInput = console.next();

            System.out.println(" ");

            if(!(nextInput.equalsIgnoreCase("S") || nextInput.equalsIgnoreCase("X"))){

                nameArrayList.add(nextInput);

            }

            if (nextInput.equalsIgnoreCase("S")){

                System.out.println("Outputting all Strings : ");

                for (int i = 0; i < nameArrayList.size();i++){

                    System.out.println(nameArrayList.get(i));

                }

                System.out.println("Done with outputting.");
            }

        }while(!nextInput.equalsIgnoreCase("X"));

        System.out.println("Exiting ...");
    }

    private static void manageHashMap(){

        Scanner console = new Scanner(System.in);

        HashMap<String, String> nameHashMap = new HashMap<>();

        String nextName;
        String nextID;

        do{

            System.out.println("---------------------------------------------------------------");
            System.out.println("If you you input the same ID twice you will overwrite the data in that index.");
            System.out.println("Enter S to display contents. Enter X to exit. ");
            System.out.println("Enter name");

            nextName = console.next();

            System.out.println(" ");

            if(!(nextName.equalsIgnoreCase("S") || nextName.equalsIgnoreCase("X"))){

                System.out.println("Enter name's ID");

                nextID = console.next();

                nameHashMap.put(nextID,nextName);

                System.out.println(" ");

            }

            if (nextName.equalsIgnoreCase("S")){

                System.out.println("Outputting all Strings : ");

                System.out.println(nameHashMap);

                System.out.println("Done with outputting.");
            }

        }while(!nextName.equalsIgnoreCase("X"));

        System.out.println("Exiting ...");

    }

    private static void manageHashSet(){

        Scanner console = new Scanner(System.in);

        HashSet<String> nameHashSet = new HashSet<>();

        String nextInput;

        do{

            System.out.println("---------------------------------------------------------------");
            System.out.println("Enter S to display contents. Enter X to exit. ");
            System.out.println("Enter another input");

            nextInput = console.next();

            System.out.println(" ");

            if(!(nextInput.equalsIgnoreCase("S") || nextInput.equalsIgnoreCase("X"))){

                nameHashSet.add(nextInput);

            }

            if (nextInput.equalsIgnoreCase("S")){

                System.out.println("Outputting all Strings : ");

                System.out.println(nameHashSet);

                System.out.println("Done with outputting.");
            }

        }while(!nextInput.equalsIgnoreCase("X"));

        System.out.println("Exiting ...");

    }

    public static void main( String[] args )
    {
        Scanner console = new Scanner(System.in);

        String whichDataStorage;

        System.out.println("Add to an arraylist if you want to keep one value and if there will be multiple values with the same value.");
        System.out.println("Add to a hashset if you don't need your data stored in the same order, and will not have multiple values with the same value");
        System.out.println("Add to a hashmap if you want to assign each value a unique key, this is an unorganised data structure");

        System.out.println("----------------------------------------------------------------------------------------------------------------------------");

        System.out.print("Would you like to add to an arraylist, hashmap or hashset? > ");

        whichDataStorage = console.next();

        System.out.println("You have chosen to create a(n) " + whichDataStorage);

        if (whichDataStorage.equalsIgnoreCase("arraylist") || whichDataStorage.equalsIgnoreCase("hashmap") || whichDataStorage.equalsIgnoreCase("hashset")){

            if(whichDataStorage.equalsIgnoreCase(("arraylist"))){

                manageArrayList();

            }else if(whichDataStorage.equalsIgnoreCase("hashmap")){

                manageHashMap();

            }else if(whichDataStorage.equalsIgnoreCase("hashset")){

                manageHashSet();

            }



        }else{
            System.out.println("Incorrect input");
        }
    }
}
