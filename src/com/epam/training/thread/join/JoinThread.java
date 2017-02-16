/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.training.thread.join;

class JoinThread extends Thread {

    public JoinThread(String str) {
        super(str);
//        setName(str);
    }

    public void run() {
        String nameT = getName();
        long timeout = 0;
        System.out.println("Start " + nameT);
        try {
            switch (nameT) {
                case "First":
                    timeout = 5_000;
                    break;
                case "Second":
                    timeout = 1_000;
            }
            Thread.sleep(timeout);
            System.out.println("end " + nameT);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}