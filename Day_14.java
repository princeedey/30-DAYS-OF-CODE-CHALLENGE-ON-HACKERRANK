package hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
    public Difference(int[] q)
    {
        elements = new int[q.length];
        for(int i=0;i<q.length;i++)
        {
            elements[i] = q[i];
        }
    }
	void computeDifference()
    {
        int max = 0;
        for(int i=0;i<elements.length;i++)
        {
            for(int j=0;j<elements.length;j++)
            {
                if(Math.abs(elements[i]-elements[j])>max)
                {
                    max = Math.abs(elements[i]-elements[j]);
                }
            }
        }
        maximumDifference = max;
    }

} // End of Difference class

public class Day_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}