package csacademy;

public class program_13 {
	
	public String Stringrev(String str) {
		char ch[] =str.toCharArray();
		String ans ="";
		String ans1 [] = str.split(" ");
		for(int i=ch.length-1;i>=0;i--) {
			ans = ans + ch[i];
		}
		
		for(int i=ans1.length-1;i>=0;i--) {
			System.out.print(ans1[i]+" ");
			
		}
		System.out.println();
		return ans;
		
		
	}

	public static void main(String[] args) {
		String s ="hi i am aditya";
		
		program_13 obj = new program_13();
		System.out.println("output");
		
		System.out.println(obj.Stringrev(s));

	}

}
