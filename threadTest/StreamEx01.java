package threadTest;


import java.io.IOException;
import java.io.InputStream;

public class StreamEx01 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in; // 바이트스트림(아스키코드 한글자씩)
        try {
            int dataThread = in.read();
            System.out.println(dataThread); //아스키코드
            System.out.println((char)dataThread);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
