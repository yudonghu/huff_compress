import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.LineNumberInputStream;
import java.util.HashMap;
import java.util.Map;

public class Huffman {
    class HuffmanNode{
        HuffmanNode left;
        HuffmanNode right;
        int weight;
        int code;

        public HuffmanNode(int frequency,HuffmanNode left,HuffmanNode right){
            this.left = left;
            this.right = right;
            this.weight = frequency;
        }




    }
    void scanFile(Map letterMap) throws FileNotFoundException {
        FileInputStream inStream = null;
        letterMap = new HashMap<String,Integer>();
        LoopArray loopArray = new LoopArray();
        //creating a buffer with length of 1024 for reading
        byte[] buff = loopArray.get();
        //
        int defaultLength = 1024;

        try{
            inStream = new FileInputStream("C:\\Users\\HydenLuc\\Desktop\\123.txt");
            //use for saving the actual bits amount that read from file
            int hasRead=0;
            byte[] lastBytes=null;
            while((hasRead=inStream.read(buff)) >0){
                if(hasRead < defaultLength){

                    
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
