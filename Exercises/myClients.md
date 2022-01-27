# My Clients
Να δημιουργηθεί πρόγραμμα που θα διαχειρίζεται πελάτες. Αρχικά θα εμφανίζεται ένα μενού με 4 επιλογές.

```
1. Εισαγωγή Πελάτη
2. Λίστα Πελατών
3. Διαγραφή Πελάτη
4. Έξοδος
Επιλογή: _
```

Ο χρήστης θα επιλέγει έναν αριθμό από το μενού και θα πραγματοποιείται η αντίστοιχη ενέργεια. 

Συγκεκριμένα κατά την εισαγωγή νέου πελάτη, θα αποθηκεύονται να στοιχεία του πελάτη όπως ΟΝΟΜΑ, ΕΠΩΝΥΜΟ και E-MAIL. 

Στην Λίστα Πελατών θα εμφανίζει όλους τους πελάτες που είναι καταχωρημένοι στο αρχείο.

Στην Διαγραφή Πελάτη, θα δίνεται ο αριθμός του πελάτη και θα πραγματοποιείται η διαγραφή του από το αρχείο.

Το αρχείο θα έχει όνομα myclients.csv και θα αποθηκεύονται οι πελάτες με τον παρακάτω τρόπο:

```
1,Ανδρέας,Μπουράκης,bourakis@gmail.com
2,Bill,Gates,bill@microsoft.com
3,Steve,Jobs,steve@apple.com
```

Οι αριθμοί είναι τα ID του κάθε πελάτη. Θα χρησιμοποιείται αυτός ο αριθμός για την διαγραφή του.

<!--
------
STEP 1
------

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
-->
