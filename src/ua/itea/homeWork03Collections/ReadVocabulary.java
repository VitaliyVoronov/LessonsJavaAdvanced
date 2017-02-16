package ua.itea.homeWork03Collections;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author vitaliy
 * @version 1.0
 * @since 2/6/17
 */
public class ReadVocabulary {

    private FileReader fileReader;

    public ReadVocabulary(String vocabularyPath) {
        try {
            this.fileReader = new FileReader(vocabularyPath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String readAllFromFile() {
        String resultString = "";
        int c;
        try {
            while((c=fileReader.read())!=-1){
                resultString+=(char)c;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return resultString;
    }
}
