import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class Prob04 {
private static final String INPUT_FILE_NAME = "./ExampleInputs/Prob04.in.txt";
    
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
                    inLine = br.readLine();
                    String[] inArray = inLine.split(" ");
                    double inputValue = Double.parseDouble(inArray[0]);
                    char units = inArray[1].charAt(0);
                    double outValue = 0;
                    char outUnits;
                    if(units == 'F'){
                    	outValue = (5/9)*(inputValue-32);
                    	outUnits = 'C';
                    }
                    else{
                    	outValue = ((9/5)*inputValue)+32;
                    	outUnits = 'F';
                    }
                    System.out.println(inputValue + " " + units + " = " + outValue + " " + outUnits);
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
