

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Prob11 {
    private static final String INPUT_FILE_NAME = "./ExampleInputs/Prob11.in.txt";
    
    public static void main(String[] args) {
        try {
            // prepare to read the file
            File inFile = new File(INPUT_FILE_NAME);
            FileReader fr = new FileReader(inFile);
            BufferedReader br = new BufferedReader(fr);
            String inLine = null;
            
            // get the number of test cases
            int T = Integer.parseInt(br.readLine());
            
            String group1[] = {"b","f","p","v"};
            String group2[] = {"c","g","j","k","q","s","x","z"};
            String group3[] = {"d","t"};
            String group4[] = {"l"};
            String group5[] = {"m","n"};
            String group6[] = {"r"};
            String wild[] = {"h","w"};
            String vowel[] = {"a","e","i","o","u","y"};
        
            
            
            // loop through test cases
            while (T-- > 0) {
            	String firstletter = "";
                // get the number of lines in each test case
                int N = Integer.parseInt(br.readLine());
                
                // loop through the lines
                for (int i=0; i<N; i++) {
                    // read the line of text
                    inLine = br.readLine();
                    System.out.println(inLine);
                    firstletter = inLine.substring(0,1);
                    System.out.println(firstletter);
  
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
