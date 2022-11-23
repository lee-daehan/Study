public class qeustion1 {
	public static int solution(int n, int t) { 
	        int answer = n;
	        
	        for (int i=0; i<t; i++) {
	            n = n*2;
	            answer = n;
	        }
	        System.out.println(answer);
	        return answer;
	    }
		
	public static void main(String[] args) {	
		solution(2,10);
	}
}