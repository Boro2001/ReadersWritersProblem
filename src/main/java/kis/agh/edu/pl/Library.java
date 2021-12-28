package kis.agh.edu.pl;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Library  {
    private final int maxNumberOfReaders; //domyslnie i tak będzie 5
    private final int maxnumberOfWriters;
    protected String filePath;
    private List<Reader> readers;
    private List<Writer> writers;

    public Library(int maxnumberOfWriters, int maxNumberOfReaders) {
        this.maxnumberOfWriters = maxnumberOfWriters;
        this.maxNumberOfReaders = maxNumberOfReaders;
        this.readers = new ArrayList<Reader>();
        this.writers = new ArrayList<Writer>();
    }
    public void createFile(String filePath) {
        try {
            if (filePath==null)
                    filePath = "library.txt";
            File object = new File(filePath);
            if(object.createNewFile()){
                System.out.println("File created: " + object.getName());
            }
            else
                System.out.println("File already exists");
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
    public String getFilePath(){
        return this.filePath;
    }
    public void introduceWriter(Writer w){
        if(writers.size()<maxnumberOfWriters){
            writers.add(w);
            w.updatePath(this.filePath);
        }
    }
    public void introduceReader(Reader r){
        if(readers.size()<maxNumberOfReaders){
            readers.add(r);
            r.updatePath(filePath);
        }
    }
    public void kickOffWriter(Writer w){writers.remove(w);}
    public void kickOffReader(Reader r){readers.remove(r);}

}
