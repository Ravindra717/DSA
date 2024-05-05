package string;


public class problems {
	
	public static void printAllSubString(String s) {
		for (int i = 0; i < s.length(); i++) {
			for(int j=i+1;j<s.length();j++) {
				for(int k=i;k<=j;k++) {
					System.out.print(s.charAt(k));
				}
				System.out.println();
			}
		}
	}
	
	public static boolean compare(String s, String t) {
	    if (s.length() != t.length()) {
	        return false;
	    }
	    for (int i = 0; i < s.length(); i++) {
	        if (s.charAt(i) != t.charAt(i)) {
	            return false;
	        }
	    }
	    return true;
	}
	
	public static void reverse(String s) {
		String t="";
		for(int i=s.length()-1;i>=0;i--) {
			t=t+s.charAt(i);
		}
		System.out.println(t);
	}
	
	public static boolean palindrome(String s) {
		int i=0,j=s.length()-1;
		while(i<=j) {
			if(s.charAt(i)==s.charAt(j)) {
				i++;j++;
			}else {
				return false;
			}
		}
		return true;
	}
	
	public static String addTwoNum(String s,String t) {
		int i=Integer.parseInt(s);
		int j=Integer.parseInt(t);
		return String.valueOf(i+j); 
	}
	
	public static void subStringToK(String s,int k) {
		for (int i = 0; i < s.length()-k; i++) {
			String t="";
			for(int j=i;j<i+k;j++) {
				t=t+s.charAt(j);
			}
			System.out.println(t);
		}
	}
	
	public static int countSubstring(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				for(int k=i;k<=j;k++) {
					count++;
					System.out.print(s.charAt(k));
				}
				System.out.println();
			}
		}
		return count;
	}
	
	  
	public static int countSubStringEqualtoK(String s,int x) {
		int count=0;
		for (int i = 0; i < s.length()-x; i++) {
			String t="";
			for(int j=i;j<i+x;j++) {
				t=t+s.charAt(i);
				count++;
			}
			System.out.println(t);
		}
		return count;
	}
	
	public static float shortestPath(String s) {
		int x=0,y=0;
		for(int i=0;i<s.length();i++) {
			char dir=s.charAt(i);
			if(dir=='S') {
				y--;
			}
			else if(dir=='N') {
				y++;
			}
			else if(dir=='W') {
				x--;
			}
			else {
				x++;
			}
		}
		int X2=x*x;
		int Y2=y*y;
		return (float)Math.sqrt(X2+Y2);
	}
	
	public static int myAtoi(String s) {
        s.trim();
        String t="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch >= '0' && ch <= '9') || ch == '+' || ch == '-'){
                t = t + ch;
            } else {
                break;
            }
        }
        try {
            return Integer.parseInt(t);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

	public static void main(String[] args) {
		String s="java is my fav language";
//		String t="j";
//		String s="111";
//		String t="2";
//		String s="WNEENESENNN";
//		String s="   -42";
		
//		printAllSubString(s);
//		System.out.println(compare(s, t));
//		reverse(s);
//		System.out.println(palindrome(s));
//		System.out.println(addTwoNum(s, t));
		subStringToK(s, 4);
//		System.out.println(countSubstring(s));
//		System.out.println(countSubStringEqualtoK(s, 4));
//		System.out.println(shortestPath(s));
		System.out.println(myAtoi(s));
		System.out.println(Integer.MAX_VALUE);
	}

}
