package kis.agh.edu.pl;

import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Library library = new Library(5,1);
        Reader reader = new Reader();
        Writer writer = new Writer("library.txt");
        library.createFile("library.txt");
        library.introduceReader(reader);
        library.introduceWriter(writer);
        writer.write("siemano kolano");
    }
}
