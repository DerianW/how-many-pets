package howmanypetspack ;

import java.util.ArrayList ;
import java.util.HashMap;
import java.util.Scanner ;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in) ;

        System.out.println("How many pets do you have?");

        int numOfPets = scan.nextInt() ;

        scan.nextLine();

        ArrayList<String> petList = new ArrayList<String>() ;

        for ( int i = 0; i < numOfPets; i++ )
        {
            System.out.println("List the type of pet") ;
            petList.add( scan.nextLine() ) ;
            System.out.println("Enter the name of pet");
            petList.set(i, petList.get(i) + "=" + scan.nextLine() ) ;
        }
        System.out.println(petList);
    }
}
