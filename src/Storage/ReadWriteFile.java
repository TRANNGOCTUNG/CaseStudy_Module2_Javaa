package Storage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile<T> {
    private static ReadWriteFile INSTANCE = null;
    private ReadWriteFile(){

    }
    public static ReadWriteFile getINSTANCE(){
        if(INSTANCE == null)
            INSTANCE = new ReadWriteFile();
        return INSTANCE;
    }
    public List<T> readFile(String path){
        List<T> read = new ArrayList<T>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            read =(List<T>) ois.readObject();
            fis.close();
            ois.close();
            System.out.println("Read file successfully: " + read + "\n");
        } catch (IOException e) {
            System.out.println("Read file failed: " + e.getMessage());
        }catch (ClassNotFoundException e){
            System.out.println("File does not exist: " + e.getMessage());
        }
        return read;
    }
    public void writeFile(List<T> list, String path){
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            fos.close();
            oos.close();
            System.out.println("Write file successfully: " + oos.toString());
        } catch (IOException e){
            System.out.println("File does not exist: " + e.getMessage());
        }
    }
}
