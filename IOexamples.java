package JavaByCoderArmy;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOexamples {
    public static void main(String[] args) throws IOException{
//        int x = System.in.read();
//        System.out.println(x);

        InputStreamReader is1 = new InputStreamReader(System.in);
        BufferedReader br1 = new BufferedReader(is1);

        String name = br1.readLine();
        System.out.println(name);
    }
}
