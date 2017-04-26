import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Prob10 {
    private static final String INPUT_FILE_NAME = "./ExampleInputs/Prob10.in.txt";
    
    public static void main(String[] args) {
        try {
            // prepare to read the file
            File inFile = new File(INPUT_FILE_NAME);
            FileReader fr = new FileReader(inFile);
            BufferedReader br = new BufferedReader(fr);
            String inLine = null;
            
            // get the number of test cases
            int TestCases = 1;//Integer.parseInt(br.readLine());
            
            // loop through test cases
            while (TestCases-- > 0) {
            	System.out.println("Game Start");
                // get the number of lines in each test case
                //int N = Integer.parseInt(br.readLine());
                
                int P1=0,P2=0;
                
                // loop through the lines
                while ((inLine = br.readLine())!= null) {
                    if(inLine.equals("1")){
                    	P1++;
                    }
                    else{
                    	P2++;
                    }
                    //Tie Cases
                    if(P1>P2+1&&P1>3){
                    	System.out.println("Game Player 1");
                    	P1=0;P2=0;
                    }
                    else if(P2>P1+1&&P2>3){
                    	System.out.println("Game Player 2");
                    	P1=0;P2=0;
                    }
                    //tie cases
                    else if(P1==P2){
                    	//deuce
                    	if(P1>=3){System.out.println("deuce");}
                    	//all
                    	else{
                    		System.out.println(text(P1) + "-all");
                    	}
                    }
                    //normal scores
                    else if(P1<=3&&P2<=3){
                    	System.out.println(text(P1) + "-" + text(P2));
                    }
                    //advantages
                    else if(P1>P2){
                    	System.out.println("Advantage Player 1");
                    }
                    else{
                    	System.out.println("Advantage Player 2");
                    }
                    
                }
            }
            
            // clean up
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//end main
    
    static String text(int p1){
    	switch(p1){
    		case 0:
    			return "love";
    			//break;
    		case 1:
    			return "15";
    			//break;
    		case 2:
    			return "30";
    			//break;
    		case 3:
    			return "40";
    			//break;
    	}
		return "ERR";
    }
}
