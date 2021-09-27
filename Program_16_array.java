package csacademy;

public class Program_16_array {
	
	public int remove_duplicate(int a[],int p) {
		
		if(a.length==1) {
			return 1;
		}
		
		else {
			int b[] = new int[p];
			int j=0;
			for(int i= 0 ; i<a.length-1;i++) {
				if(a[i] != a[i+1]) {
					b[j] = a[i];
					j++;
				}
			}
			
			b[j++]= a[p-1];
			for(int i=0; i<j;j++) {
				a[i] = b[i];
			}
			return j;
		}
		
	}

	public static void main(String[] args) {
		int arr []= {10,20,20,30,30,50,60};
		int x =arr.length;
         
		program_16 obj = new program_16();
		int y = obj.remove_duplicate(arr,x);
		
		
		for(int i=0 ;i<y ;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
