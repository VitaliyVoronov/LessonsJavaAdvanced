package ua.itea.homeWork01FormatterAndIO.byteIOStreams;

import java.io.IOException;

/**
 * @author vitaliy
 * @version 1.0
 * @since 1/28/17
 */
public class IOMain {
    public static void main(String[] args) throws IOException {
        /*InputStream ris = new RandomInputStream();
        int oneByte;
        while ((oneByte =ris.readAllFromFile()) != -1){
            System.out.print(oneByte+", ");
        }*/

        CaesarCipherStream caesarCipherStream = new CaesarCipherStream();
        CaesarCipherStream.Demo demo = caesarCipherStream.new Demo();
        demo.demoRun();
    }
}
