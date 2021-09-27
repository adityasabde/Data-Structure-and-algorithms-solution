package csacademy;

public class program_15 {

	public static void main(String[] args) {
		String s = "aaaa";
		
		char ch[] =s.toCharArray();
		
		String ans1 = "";
		String ans2 ="";
		 // clockwise rotation
		for(int i=1 ;i<ch.length ; i++) {
			ans1 = ans1 +ch[i];
		}
		ans1 = ans1 + ch[0];
		
		System.out.println("clockwise");
		System.out.println( ans1);
		
		
		
		 //anticlockwise
		ans2 = ans2 + ch[ch.length-1];
		for(int i=0; i<ch.length-1 ;i++) {
			ans2  = ans2 + ch[i];
		}
		
		System.out.println("anticlockwise");
		System.out.println(ans2);
		if(ans1.equals(ans2)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
			
		}
		
	}

}
