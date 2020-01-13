import java.util.Scanner;

public class getTempFloat
{
  public static void main(String[] args)
  {
    Scanner temp = new Scanner(System.in);
    System.out.println("Enter temperature");

    float get_temp = Float.parseFloat(temp.nextLine());

    if(get_temp < 36.6)
    {
      System.out.println("Eisai ok!");
    }
    else
    {
      System.out.println("Huston we've got problem!");
    }

  }
}
