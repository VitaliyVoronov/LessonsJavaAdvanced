/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.epam.training.thread.basic;

public class TalkThread extends Thread{

//    public TalkThread() {
//    }
//
//    public TalkThread(Runnable target) {
//        super(target);
//    }
    
    @Override
    public void run(){
        for (int i = 0; i < 10; i++){
            System.out.println("Talking");
            try{
                Thread.sleep(1400);
            }catch (InterruptedException e){
                System.err.println(e);
            }
        }
//        super.run();
    }

}
