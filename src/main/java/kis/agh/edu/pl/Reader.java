package kis.agh.edu.pl;

public class Reader extends Thread {
    private String path;

    public void updatePath(String path){this.path = path;}
    @Override
    public void run(){}
}
