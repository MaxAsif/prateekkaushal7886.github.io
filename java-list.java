import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {

	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		List<Integer> l = new ArrayList<Integer>();
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			l.add(sc.nextInt());
		}
		//System.out.printf("List %s\n", l);
		int q = sc.nextInt();
		for(int i=0;i<q;i++){
			String str = sc.next();
			if(str.equals("Insert"))
				l.add(sc.nextInt(),sc.nextInt());
			else
				l.remove(sc.nextInt());
		}
		for(int x:l){
			System.out.print(x+" ");
		}
	}
}
