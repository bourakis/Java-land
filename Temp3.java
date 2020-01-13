import java.util.Scanner;

public class getTempFloat 
{
  public static void main(String[] args) 
  {	
    Scanner temp = new Scanner(System.in); 
    System.out.print("Enter temperature: ");

    float get_temp = Float.parseFloat(temp.nextLine());

    if(get_temp <= 35.5)
    {
      System.out.println("Exeis ypothermia!");
    }
    else if(get_temp <= 36.6 || get_temp <= 36.8) 
    {
      System.out.println("Eisai ok!");
    }
    else if(get_temp >= 36.8 && get_temp <= 40)
    {
      System.out.println("Exeis pyreto!");
    }
    else if(get_temp > 40)
    {
      System.out.println("Pethaineis!");
    }

  }	
}
