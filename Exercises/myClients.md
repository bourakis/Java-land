Να δημιουργηθεί πρόγραμμα που θα διαχειρίζεται πελάτες.

/*
package myclients;

import java.util.Scanner; 

public class MyClients 
{
    public static void main(String[] args) 
    { 
        int c;
        
        do
        {
            c = menu();
            
            if(c == 1)
                newClient();
            if(c == 2)
                listClients();
            if(c == 3)
                deleteClient(); 
        }
        while(c != 4);
    }
    
    public static int menu()
    {
        System.out.println("MENU MyClients v.1");
        System.out.println("-------------------------");
        System.out.println("1. Εισαγωγή Πελάτη");
        System.out.println("2. Λίστα Πελατών");
        System.out.println("3. Διαγραφή Πελάτη");
        System.out.println("4. Έξοδος");
        System.out.println();
        System.out.print("Επιλογή: ");
        
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        
        return choice;
    }
    
    public static void newClient()
    {
        System.out.println("\n -new Client \n");
    }

    public static void listClients()
    {
        System.out.println("\n -Lists Clients \n");
    }
    
    public static void deleteClient()
    {
        System.out.println("\n -Delete Client \n");
    }
    
}
*/
