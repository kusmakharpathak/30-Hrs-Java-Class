package part4;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File1 {
    public static void main(String[] args) throws IOException {
//    File Write = new File("data.txt");
        FileWriter write = new FileWriter("data.txt");
        write.write("Hello World");
        write.close();
    }
}
