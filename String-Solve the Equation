class Solution {
    public String solveEquation(String equation) {
        int x1 = 0,x2 = 0;
        int sum1=0,sum2=0;
        int sign = 1;
        int i=0;
        boolean flag = true;
        for(i=0;i<equation.length();i++){
            char ch = equation.charAt(i);
            if(ch == '=') flag = false;
            else if(ch == 'x'){
                if(flag) x1 += sign;
                else x2 += sign;
                sign = 1;
            }
            else if(Character.isDigit(ch)){
                int val =0;
                while(i<equation.length() && Character.isDigit(equation.charAt(i))){
                    val = val*10 + Character.getNumericValue(equation.charAt(i)); 
                    i++;
                }
                i--;
                if(i<equation.length()-1 && equation.charAt(i+1) == 'x'){
                    i++;
                    if(flag) x1+=sign * val;
                    else x2 += sign * val;
                }
                else{
                    if(flag)sum1 += sign * val;
                    else sum2 += sign * val;
                }
                sign = 1;
            }else if(ch == '-') sign = -1;
        }
        StringBuilder sb = new StringBuilder();
        if(x1==x2 && sum1 == sum2) return "Infinite solutions";
        else if(sum1 == 0 && sum2 == 0) return "x=0";
        else if(x1 == x2 && ((sum1!=0)||(sum2!=0))) return "No solution";
        int sum=0;
        int x=0;
        if(x1>x2){
            x = x1 - x2;
            sum = sum2-sum1;
            sum = sum/x;
        }
        else if(x2>x1){
            x = x2 - x1;
            sum = sum1-sum2;
            sum = sum/x;
        }
        sb.append("x=");
        sb.append(sum);
        return sb.toString();
    }
}
