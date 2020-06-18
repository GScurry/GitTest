import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class MainTest {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("a.txt");
        FileWriter fileWriter = new FileWriter("d.txt");
        char [] chars = new char[100];
        int len = 0;
        while((len = fileReader.read(chars))!= -1){
            fileWriter.write(chars);
            System.out.println(new String(chars,0,len));
        }
        fileWriter.flush();
        fileWriter.close();
        fileReader.close();
    }
}
