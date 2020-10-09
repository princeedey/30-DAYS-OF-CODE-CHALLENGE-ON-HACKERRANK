package hackerrank;

import java.io.*;
import java.util.*;

public class Day_6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        for(int i=0;i<t;i++)
        {
            String q = in.nextLine();
            String odd = "", even = "";
            for(int j=0;j<q.length();j++)
            {
                if(j%2==0)
                {
                    even = even+q.charAt(j);
                }
                else
                {
                    odd = odd+q.charAt(j);
                }
            }
            System.out.println(even+" "+odd);
        }
    }
}