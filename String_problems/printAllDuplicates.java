package String_problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class printAllDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		
		List<Character> list=new ArrayList<>();
		
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(!list.contains(ch)) {
				list.add(ch);
			}else {
				list.remove((Character) ch);
				System.out.println(ch);
			}
		}
	}

}
