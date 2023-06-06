//Java Loops II

import java.util.*;
import java.io.*;

class JavaLoopsII
{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t-- >0)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
        
            int sum=a;
            for( int i=0 ; i<n ; i++ )
            {
                sum=sum+(int)Math.pow(2,i)*b;
                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
}
