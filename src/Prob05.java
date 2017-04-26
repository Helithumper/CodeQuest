

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Prob05 {
    private static final String INPUT_FILE_NAME = "./ExampleInputs/Prob05.in.txt";
    
    public static void main(String[] args) {
        try {
            // prepare to read the file
            File inFile = new File(INPUT_FILE_NAME);
            FileReader fr = new FileReader(inFile);
            BufferedReader br = new BufferedReader(fr);
            String inLine = null;
            

            // get the number of test cases
            int T = Integer.parseInt(br.readLine());
            //gets area name
            String area = br.readLine();
            //System.out.println(area);
            
            int money = 0;
            int year = 0;
            // loop through test cases
            while (T-- > 0) {
                // get the number of lines in each test case
                int N = Integer.parseInt(br.readLine());
                int[] years = new int[N];
                String[] moneys = new String[N];


                // loop through the lines
                for (int i=0; i<N; i++) {
                    // read the line of text
                    inLine = br.readLine();
                    String num[] = inLine.split(" ");
                    money = (int) (Double.parseDouble(num[0]));
                    year = Integer.parseInt(num[1]);
                    //System.out.println("$"+money);
                    //System.out.println(year);
                    int n = money/1000;
                    StringBuilder sb = new StringBuilder();
                    for (int j=0; j<n; j++){
                    	sb.append("*");
                    }
                    //System.out.println(sb.toString());
                    //System.out.println("\n");
                   
                    years[i] = year;
                    moneys[i] = sb.toString();
                }
                for (int k=0; k<years.length;k++){
                	System.out.println(years[k]);
                }
                for (int k=0; k<years.length; k++){
                	for (int l=k+1; l<years.length; l++){
                		if (years[k]>years[l]){
                			int temp = years[k];
                			years[k]=years[l];
                			years[l]=temp;
                			String tem = moneys[k];
                			moneys[k]=moneys[l];
                			moneys[l]=tem;
                		}
                	}
                }
                
                //print array
                System.out.println("\n");
                for (int k=0; k<years.length;k++){
                	System.out.println(years[k]);
                	System.out.println(moneys[k]);
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
