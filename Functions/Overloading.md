# Functions Overloading

Με το Function Overloading μπορούμε να χρησιμοποιήσουμε πολλαπλές functions με το ίδιο όνομα, αλλά με διαφορετικές παραμέτρους:

```java
int myMethod(int x)
float myMethod(float x)
double myMethod(double x, double y)
```

Στον παρακάτω κώδικα έχουμε δημιουργήσει δύο διαφορετικές functions με διαφορετικές ονομασίες (plusMethodInt & plusMethodDouble) για να κάνουν το ίδιο πράγμα. Να προσθέσουν δηλαδή δύο αριθμούς διαφορετικοών τύπων. Στην πρώτη περίπτωση ακέραιους (int) και στην δεύτερη δεκαδικούς (double). Θα ήταν πιο λειτουργικό αν δημιουργούσαμε πολλαπλές functions με το ίδιο όνομα αλλά με διαφορετικές παραμέτρους. Αυτό θα είχε ως αποτέλεσμα ο κώδικάς μας να είναι πιο ευανάγνωστος αλλά και πιο διαχειρίσιμος.

```java
static int plusMethodInt(int x, int y) 
{
  return x + y;
}

static double plusMethodDouble(double x, double y) 
{
  return x + y;
}

public static void main(String[] args) 
{
  int myNum1 = plusMethodInt(8, 5);
  double myNum2 = plusMethodDouble(4.3, 6.26);
  
  System.out.println("int: " + myNum1);
  System.out.println("double: " + myNum2);
}
```

Παρακάτω θα δούμε οτι στην Java υπάρχει η δυνατότητα να δημιουργήσουμε πολλαπλές functions με το ίδιο όνομα. Αυτή η τεχνική ονομάζεται Methods Overloading.

```java
static int plusMethod(int x, int y) 
{
  return x + y;
}

static double plusMethod(double x, double y) 
{
  return x + y;
}

public static void main(String[] args) 
{
  int myNum1 = plusMethod(8, 5);
  double myNum2 = plusMethod(4.3, 6.26);

  System.out.println("int: " + myNum1);
  System.out.println("double: " + myNum2);
}
```

Αποτέλεσμα:
```
13
10.56
```
