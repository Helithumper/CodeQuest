import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Prob13 {
private static final String INPUT_FILE_NAME = "./ExampleInputs/Prob13.in.txt";
    
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
                Block[] blocks = new Block[N];
                // loop through the lines
                for (int i=0; i<N; i++) {
                    inLine = br.readLine();
                    String[] inLineSplit = inLine.split("x");
                    blocks[i] = new Block(Integer.parseInt(inLineSplit[0]),Integer.parseInt(inLineSplit[1]),Integer.parseInt(inLineSplit[2]));
                }
                ArrayList<Block> bigList = new ArrayList<Block>();
                for(Block b:blocks){
                	for(int i = 0; i < bigList.size(); i++){
                		if(b.getArea()<bigList.get(i).getArea()){
                			bigList.add(i, b);
                			break;
                		}
                	}
                }
                System.out.println(bigList.size());
            }
            
            // clean up
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Block{
	public int x;
	public int y;
	public int z;
	
	public Block(int a, int b, int c){
		x=a;
		y=b;
		z=c;
	}
	
	public int getArea(){
		int one = x*y;
		int two = y*z;
		int three = z*x;
		return Math.max(Math.max(one, two),three);
	}
}