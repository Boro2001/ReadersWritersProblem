package kis.agh.edu.pl;

import java.io.FileWriter;
import java.io.IOException;

public class Writer extends Thread{
    private String filePath;
    Writer(String filePath){
        this.filePath = filePath;
    }
    public void write(String message){
        try {
            System.out.println(filePath+ "dla piarza");
            FileWriter writer = new FileWriter(filePath);
            writer.write(message);
            writer.close();
            System.out.printf("Succesfully wrote to file");
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public void updatePath(String filePath){
        this.filePath = filePath;
    }
    @Override
    public void run(){
        Thread.yield();
    }
}
