/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.epam.training.thread.synchronization;
import java.io.*;

public class Resource {
     private FileWriter fileWriter;

     public Resource(String file) throws IOException {
         fileWriter = new FileWriter(file, true);
     }
  
     public synchronized void writing(String str, int i){
         try{
               System.out.print(str + i);
             fileWriter.append(str + i);
             Thread.sleep((long)(Math.random() * 50));
               System.out.print("->" + i + " ");
             fileWriter.append("->" + i + " ");
         } catch (IOException e){
             System.err.print("ошибка файла");
             e.printStackTrace();
         } catch (InterruptedException e){
             System.err.print("ошибка потока");
             e.printStackTrace();
         }
     }
      public void close(){
         try{
             fileWriter.close();
         } catch (IOException e){
             e.printStackTrace();
         }
     }
}
