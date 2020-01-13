import java.util.Scanner;

public class getTemp
{
  public static void main(String[] args)
  {
    Scanner temp = new Scanner(System.in);
    System.out.print("Enter temperature: ");

    int get_temp = Integer.parseInt(temp.nextLine());

    if(get_temp < 36)
    {
      System.out.println("Eisai ok!");
    }
    else
    {
      System.out.println("Houston we got a problem!");
    }
  }
}
