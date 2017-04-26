import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Prob03 {
private static final String INPUT_FILE_NAME = "./JudgingInputs/Prob03.in.txt";
    
    public static void main(String[] args) {
        try {
            // prepare to read the file
            File inFile = new File(INPUT_FILE_NAME);
            FileReader fr = new FileReader(inFile);
            BufferedReader br = new BufferedReader(fr);
            String inLine = null;
            
            // get the number of test cases
            int T = Integer.parseInt(br.readLine());
            
            // loop through test cases
            while (T-- > 0) {
                // get the number of lines in each test case
                int N = Integer.parseInt(br.readLine());
                
                // loop through the lines
                for (int i=0; i<N; i++) {
                    // read the line of text
                    inLine = br.readLine();
                    int inNum = Integer.parseInt(inLine);
                    if(inNum<1582){
                    	System.out.println("No");
                    }
                    else if(inNum%4!=0){
                    	System.out.println("No");
                    }
                    else if(inNum%100!=0){
                    	System.out.println("Yes");
                    }
                    else if(inNum%400!=0){
                    	System.out.println("No");
                    }
                    else{
                    	System.out.println("Yes");
                    }
  
                }
            }
            
            // clean up
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
