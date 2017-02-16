package ua.itea.homeWork01FormatterAndIO.byteIOStreams;

import java.io.*;

/**
 * @author vitaliy
 * @version 1.0
 * @since 1/28/17
 */
public class CaesarCipherStream {

    public class CeasarInputStream extends FilterInputStream {

        private int shift;

        /**
         * Creates a <code>FilterInputStream</code>
         * by assigning the  argument <code>in</code>
         * to the field <code>this.in</code> so as
         * to remember it for later use.
         *
         * @param in the underlying input stream, or <code>null</code> if
         *           this instance is to be created without an underlying stream.
         */
        protected CeasarInputStream(InputStream in, int shift) {
            super(in);
            this.shift = shift;
        }

        public int read() throws IOException{
            int oneByte = in.read();
            if (oneByte != -1) {
                return oneByte + shift;
            } else {
                return -1;
            }

        }
    }

    public class CeasarOutputStream extends FilterOutputStream {

        private int shift;

        /**
         * Creates an output stream filter built on top of the specified
         * underlying output stream.
         *
         * @param out the underlying output stream to be assigned to
         *            the field <tt>this.out</tt> for later use, or
         *            <code>null</code> if this instance is to be
         *            created without an underlying stream.
         */
        public CeasarOutputStream(OutputStream out, int shift) {
            super(out);
            this.shift = shift;
        }

        public void write(byte b) throws IOException {
            System.out.print(b - shift+", ");

        }
    }

    public class Demo {
        private CeasarInputStream ceasarInputStream = new CeasarInputStream(new RandomInputStream(),2);
        private CeasarOutputStream ceasarOutputStream = new CeasarOutputStream(null,0);
        public void demoRun() throws IOException {

            int oneByte;
            while(( oneByte = ceasarInputStream.read()) != -1){
                ceasarOutputStream.write((byte)oneByte);
            }
        }
    }

}
