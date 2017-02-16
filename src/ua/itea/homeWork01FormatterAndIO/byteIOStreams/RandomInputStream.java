package ua.itea.homeWork01FormatterAndIO.byteIOStreams;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author vitaliy
 * @version 1.0
 * @since 1/28/17
 */
public class RandomInputStream extends InputStream {

    //byte[] bytes;

    private int streamLength;
    private final byte MIN_LENGTH;
    private final byte MAX_LENGTH;
    private int pos;
    private int mark;

    public RandomInputStream() {
        this.MIN_LENGTH = 99;
        this.MAX_LENGTH = 100;
        streamLength = MIN_LENGTH + (int)(Math.random() * ((MAX_LENGTH - MIN_LENGTH) + 1));
        //this.bytes = new byte[streamLength];
    }

    @Override
    public int read() throws IOException {
        if (pos <= streamLength){
            ++pos;
            return 32 + (int)(Math.random() * ((1024 - 32) + 1));
        } else {
            return -1;
        }
    }

    public int available(){
        return streamLength - pos;
    }
    // TODO limit байтов которвый необходимо читать, если чиать нечего вернуть -1
    public synchronized void mark(int limit){
        mark = limit;
    }

    public synchronized void reset(){
        pos = mark;
    }

    public boolean markSupported(){
        return true;
    }

    /*public void fillBytes(){
        for (int i = 0; i < bytes.length; i++){
            bytes[i] = 32 + (int)(Math.random() * ((127 - 32) + 1));
        }
    }*/

}
