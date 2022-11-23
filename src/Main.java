import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        ArrayList<String> myArray = new ArrayList<>();
        String userInput;
        boolean Done = false;
        boolean inputDone;

        //myArray.add("Tom");

        do {
            userInput = "";
            System.out.println("What option do you select?");
            inputDone = false;

            do {
                userInput = SafeInput.getNonZeroLengthString(in,"(A)dd (D)elete (P)rint (Q)uit");

                if (userInput.equalsIgnoreCase("A"))
                {
                    arrayAdd(in,myArray);
                    inputDone = true;
                }
                else if (userInput.equalsIgnoreCase("D"))
                {
                    arrayDelete(in, myArray);
                    inputDone = true;
                }
                else if (userInput.equalsIgnoreCase("P"))
                {
                    display(myArray);
                    inputDone = true;
                }
                else if (userInput.equalsIgnoreCase("Q"))
                {
                    Done = userFinished(in);
                    inputDone = true;
                }
                else
                {
                    System.out.println("invalid input " + userInput + " try again");
                }
            } while (!inputDone);

        }while (!Done);


    }
    public static void arrayAdd (Scanner pipe, ArrayList array)
    {
        array.add(SafeInput.getNonZeroLengthString(pipe, "What would you like to add to the string? "));
        // myArray.add(1, "Tom");
    }

    public static void arrayDelete (Scanner pipe, ArrayList array)
    {
        for(int x = 0; x < array.size(); x++)
        {
            System.out.println((x + 1) + " " + array.get(x));   // get(x)  array[x]
        }

        array.remove((SafeInput.getRangedInt(pipe,"What item on the list would you like to delete", 1,array.size() + 1)) - 1);


    }

    public static void display (ArrayList array)
    {
        for(int x = 0; x < array.size(); x++)
        {
            System.out.println(array.get(x));   // get(x)  array[x]
        }
    }

    public static boolean userFinished (Scanner pipe)
    {
        boolean YNDone;
        YNDone = SafeInput.getYNConfirm(pipe, "Are you sure that you are done?");
        if (YNDone = true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }




}