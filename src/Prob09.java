import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Prob09 {

	 private static final String INPUT_FILE_NAME = "./ExampleInputs/Prob09.in.txt";
	    
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
	                
	                ArrayList<char[]> AllLines= new ArrayList<char[]>();
	                
	                // loop through the lines and add to matrix
	                for (int i=0; i<N; i++) {
	                    // read the line of text
	                    inLine = br.readLine();
	                    AllLines.add(inLine.toCharArray());
	                }
	                
	                inLine = br.readLine();
	                int type =0;
	                if(inLine.equals("X")){type=1;}
	                else if(inLine.equals("Y")){type=2;}
	                else if(inLine.equals("INVERSE")){type=3;}
	                
	                if(type==0){System.out.println("ERROR");}
	                
	                int maxLength=0;
	                for(char[] aLine : AllLines){
	                	if(aLine.length>maxLength){maxLength=aLine.length;}
	                }
	                
	                char[][] fullArray = new char[AllLines.size()][maxLength];
	                for(int i=0;i<AllLines.size();i++){
	                	fullArray[i]=AllLines.get(i);
	                }
	               
	                char[][] outputArray = new char[AllLines.size()][maxLength];
	                for(int y=0;y<outputArray.length;y++){
                		for(int x=0;x<outputArray[0].length;x++){
                			outputArray[y][x]=' ';	
                		}
                	}
	                
	                //REFLECTION SWITCH
	                switch(type){
	                case 1:
	                	for(int i=0;i<outputArray.length;i++){
	                		outputArray[i]=fullArray[fullArray.length-1-i];
	                	}
	                	break;
	                case 2:
	                	for(int y=0;y<outputArray.length;y++){
	                		for(int x=0;x<outputArray[0].length;x++){
	                			try{
	                				outputArray[y][x]=fullArray[y][x-outputArray.length-1];
	                			}
	                			catch(ArrayIndexOutOfBoundsException e){
	                				outputArray[y][x]=' ';
	                			}
	                		}
	                	}
	                	break;
	                case 3:
	                	for(int y=0;y<outputArray.length;y++){
	                		for(int x=0;x<outputArray[0].length;x++){
	                			outputArray[y][x]=fullArray[x][y];	
	                		}
	                	}
	                	break;
	                }
	                for(int y=0;y<outputArray.length;y++){
                		for(int x=0;x<outputArray[0].length;x++){
                			try{
                				System.out.print(outputArray[y][x]);	
                			}
                			catch(ArrayIndexOutOfBoundsException e){
                				System.out.print(' ');
                			}
                		}
                		System.out.println();
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
