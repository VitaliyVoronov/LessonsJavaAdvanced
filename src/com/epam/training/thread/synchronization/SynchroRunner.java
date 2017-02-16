/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.epam.training.thread.synchronization;
import com.epam.training.thread.synchronization.SyncThread;
import com.epam.training.thread.synchronization.Resource;
import java.io.*;

public class SynchroRunner {
    public static void main(String[] args) {
        try{
            Resource s = new Resource("f:\\data.txt");

            SyncThread t1 = new SyncThread("First", s);
            SyncThread t2 = new SyncThread("Second", s);
            t1.start();
            t2.start();
            t1.join();
            t2.join();
                s.close();
        } catch (IOException e){
            System.err.print("ошибка файла");
            e.printStackTrace();
        } catch (InterruptedException e){
            System.err.print("ошибка потока");
            e.printStackTrace();
        }
    }

}
