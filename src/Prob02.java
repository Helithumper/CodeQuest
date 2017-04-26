import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.math.BigInteger;

public class Prob02 {
private static final String INPUT_FILE_NAME = "./ExampleInputs/Prob02.in.txt";
    
    public static void main(String[] args) {
        try {
            // prepare to read the file
            File inFile = new File(INPUT_FILE_NAME);
            FileReader fr = new FileReader(inFile);
            BufferedReader br = new BufferedReader(fr);
            String inLine = null;

            BigInteger sum = new BigInteger("0");
            
            // get the number of test cases
            int T = Integer.parseInt(br.readLine());
            
            // loop through test cases
            while (T-- > 0) {
                // get the number of lines in each test case
                int N = Integer.parseInt(br.readLine());
                
                // loop through the lines
                for (int i=0; i<N; i++) {
                    //read the line of text
                    inLine = br.readLine();
                    //System.out.println(inLine);
                    BigInteger bi = new BigInteger(inLine);
                    sum = sum.add(bi);
                }
                System.out.println(sum);
                sum = new BigInteger("0");
            }
            
            // clean up
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
