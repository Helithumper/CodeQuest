

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Prob08 {
    private static final String INPUT_FILE_NAME = "Prob08.in.txt";
    
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
<<<<<<< HEAD
                System.out.println(N);
                String plane = "";
                int x1 = 0;
                int y1 = 0;
                int x2 = 0;
                int y2 = 0;
                int x3 = 0;
                int y3 = 0;
                // loop through the lines
                for (int i=0; i<N; i++) {
                    // read the line of text
                    for(int j = 0; j < 4; j++){
	                	inLine = br.readLine(); 
	                    System.out.println(inLine);
	                    //first line = name
	                    if (j==0){
	                    	plane = inLine;  
	                    }
	                    //start coordinate
	                    if (j==1){
	                    	String[] startC = inLine.split(",");
	                    	x1 = Integer.parseInt(startC[0]);
	                    	y1 = Integer.parseInt(startC[1]);
	                    }
	                    //first end coordinate
	                    if (j==2){
	                    	String[] endC1 = inLine.split(",");
	                    	x2 = Integer.parseInt(endC1[0]);
	                    	y2 = Integer.parseInt(endC1[1]);
	                    }
	                    //second end coordinate
	                    if (j==3){
	                    	String[] endC2 = inLine.split(",");
	                    	x3 = Integer.parseInt(endC2[0]);
	                    	y3 = Integer.parseInt(endC2[1]);
	                    }

                    }                       
                /*shows the coordinates    
	                   
                System.out.println("x1 = " + x1);
                System.out.println("y1 = " + y1);

                System.out.println("x2 = " + x2);
                System.out.println("y2 = " + y2);

                System.out.println("x3 = " + x3);
                System.out.println("y3 = " + y3);
				*/
                
                double slope1 = (double) (y2-y1)/(double) (x2-x1);
                double slope2 = (double)(y3-y1)/(double) (x3-x1);
                System.out.println("S1: " + slope1);
                System.out.println("S2: " + slope2);
                    
=======
                
                // loop through the lines
                for (int i=0; i<N; i++) {
                    // read the line of text
                    inLine = br.readLine();
                    
  
>>>>>>> origin/master
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
