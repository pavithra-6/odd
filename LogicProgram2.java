package logic;

public class LogicProgram2 {
	public static int output1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		userMethod( 1234 );
		System.out.println( output1 );
	}
	
	public static void userMethod(int input2){
		int count=0,sum=0,rem=0;
		int temp=input2;
		int rem2=0;
		while(temp!=0){
			count++;
			temp=temp/10;
		
		}
			while(input2!=0){
				rem2=input2%10;
				rem=input2%10;
				for(int j=1;j<count;j++){
				rem2=rem2*rem;
				}
				sum=sum+rem2;
				input2=input2/10;
			
			
			}
		output1=sum;
	}
}
