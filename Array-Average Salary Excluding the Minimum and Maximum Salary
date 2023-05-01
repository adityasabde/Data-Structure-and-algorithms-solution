class Solution {
    public double average(int[] s) {
        int max =0;
        int min = 100000000;
        double avg=0;
		// getting max and min salary
        for(int i=0;i<s.length;i++)
        {
            if(s[i]>max)
                max=s[i];
            if(s[i]<min)
                min =s[i];
        }
         
		 // adding all the salaries
		 
        for(int i=0;i<s.length;i++)
        {
            avg+=s[i];
        }
        avg = (avg-min-max)/(s.length-2); // finding mean and excluding min and max values. 
        return avg;
        
    }
}
