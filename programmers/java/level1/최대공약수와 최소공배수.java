class Solution {
    public int gcd(int a, int b) {
        if(b==0) {
            return a;
        }
        else {
            return gcd(b,a%b);
        }
    }
    
    public int lcm(int a, int b) {
        return (a*b)/gcd(a,b);
    }
    
    public int[] solution(int n, int m) {
        
            
        int a = gcd(n,m);
        int b = lcm(n,m);
        
        int[] answer = {a,b};
            
        return answer;
    }
}