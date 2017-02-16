/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.epam.training.thread.synchronization;

import com.epam.training.thread.synchronization.Resource;

public class SyncThread extends Thread{
    private Resource s;

    public SyncThread(String str, Resource s){
        super(str);
        this.s = s;
    }
    public void run(){
        for (int i = 0; i < 5; i++){
            s.writing(getName(), i);
        }
    }
}
