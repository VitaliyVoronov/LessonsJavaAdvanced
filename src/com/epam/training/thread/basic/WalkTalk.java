/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.epam.training.thread.basic;

import com.epam.training.thread.basic.TalkThread;
import com.epam.training.thread.basic.WalkRunnable;

public class WalkTalk {
    public static void main(String[] args) {
        //новые объекты потоков
        TalkThread talk = new TalkThread();
        Thread walk = new Thread(new WalkRunnable());        
        //запуск потоков
        talk.start();
        walk.start();
//        WalkRunnable w = new WalkRunnable(); //объект, не поток
//        w.run(); talk.run();
    }

}
