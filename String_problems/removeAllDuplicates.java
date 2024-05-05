package String_problems;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class removeAllDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		
		Set<Character> set=new LinkedHashSet<>();
		
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		System.out.println(set);
	}

}
