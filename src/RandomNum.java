import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class RandomNum {

	public void isRandomNo(double input) {
		double max=input-1,min=0, randomNo;
		randomNo=(max-min)*(double)Math.random();
		Math.round(randomNo);
		System.out.println("The Random Number is : " + randomNo);
	}
	
	
	public static void main(String[] args) throws IOException {
		double inputNum;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Please enter a number to generate the randdom number :\n");
		inputNum=Integer.parseInt(br.readLine());
		
		RandomNum rn=new RandomNum();
		rn.isRandomNo(inputNum);
		
	}

}
