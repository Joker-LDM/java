package io;
import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class Test_02 {
    public static void main(String[] args) {
        File f=new File("F://test.txt");  //调用File类读取文件
        System.out.println(f.getName()+"read："+f.canRead());
        System.out.println(f.getName()+"length"+f.length());
        System.out.println(f.getName()+"AbsolutePath"+f.getAbsolutePath());
        File file=new File("new.txt");
        System.out.println("make new file"+file.getName());
        if (!file.exists()){
            try{
                file.createNewFile();
                System.out.println("sucess");
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
