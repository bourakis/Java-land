# Functions Overloading

Με το Function Overloading μπορούμε να χρησιμοποιήσουμε πολλαπλές functions με το ίδιο όνομα, αλλά με διαφορετικές παραμέτρους:

```java
int myMethod(int x)
float myMethod(float x)
double myMethod(double x, double y)
```

Στον παρακάτω κώδικα έχουμε δημιουργήσει δύο διαφορετικές functions με διαφορετικές ονομασίες για να κάνουν το ίδιο πράγμα. Να προσθέσουν δηλαδή δύο αριθμούς διαφορετικοών τύπων. Στην πρώτη περίπτωση ακέραιους (int) και στην δεύτερη δεκαδικούς (double). 

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
