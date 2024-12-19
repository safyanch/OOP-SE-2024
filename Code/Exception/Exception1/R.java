import java.io.FileReader;
import java.io.IOException;
public class R {
rivate static final String FILENAME = "E:\\test\\filename.txt";
public static void main(String[] args) 
{

BufferedReader br = null;
FileReader fr = null;
fr = new FileReader(FILENAME);
br = new BufferedReader(fr);
String sCurrentLine;
br = new BufferedReader(new FileReader(FILENAME));
while ((sCurrentLine = br.readLine()) != null)
 {
System.out.println(sCurrentLine);
}
}
}
			