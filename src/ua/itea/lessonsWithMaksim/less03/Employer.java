package ua.itea.lessonsWithMaksim.less03;

/**
 * Created by vitaliy on 12/2/16.
 */
public class Employer implements Runnable {

    private Hall hall;

    public Employer(Hall hall){
        this.hall = hall;
    }

    @Override
    public void run() {
        if (hall.isFreePrint()) {
            hall.goToPrint();
        } else {
            hall.waitRoom();
            hall.goToPrint();
        }


    }
}
