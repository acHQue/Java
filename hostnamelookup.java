package hostlookup;

import java.util.Scanner;
import java.net.*;

public class Hostlookup 
{

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println(" Welcome to the IP lookup appplication.");
        
        String host;
        
        
        do
        {
        System.out.print("\nEnter a host name: ");
        System.out.print("\nExample google.com ");
        System.out.print("\n");
        host = sc.nextLine();
        try
        {
        InetAddress[] addresses = InetAddress.getAllByName(host);
        for (InetAddress ip : addresses)
            System.out.println(ip.toString());
        }
        catch (Exception e)
        {
            System.out.println("Unkown host ....?");
        }
        
                
    } while (doAgain());
    }
            private static boolean doAgain()
        {
          System.out.println();
          String s;
          while (true)
          {
           System.out.print("Lookup another? " + "(Y or N) ");
           s = sc.nextLine();
           if (s.equalsIgnoreCase("Y"))
               return true;
           else if (s.equalsIgnoreCase("N"))
            return false;
          }
        }
        
}
