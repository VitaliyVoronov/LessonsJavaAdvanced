package ua.itea.lessonsWithMaksim.barbershop.version02;

/**
 * Created by vitaliy on 12/5/16.
 */
public class Cabinet {

    private volatile Men barber;
    private volatile Men client;

    public Cabinet(Men barber){
        addBarber(barber);
    }

    public void addBarber(Men barber) {
        System.out.println(barber.getName()+": in cabinet");
        this.barber = barber;
    }

    public void addClient(Men client) {
        this.client = client;
    }

    public Men takeClient(){
        Men clientTemp = client;
        client = null;
        return clientTemp;
    }

    public Men takeBarber(){
        if (barber != null) {
            Men barberTemp = barber;
            barber = null;
            return barberTemp;
        } else {
            return null;
        }
    }

    public void haircut(){
        if (barber != null && client != null){
            System.out.println(client.getName()+": haircut!");
        } else if (barber == null){
            System.out.println("No barber");
        } else if (client == null){
            System.out.println("No client");
        }
    }

    public boolean isBarber(){
        if (barber != null){
            return true;
        } else {
            return false;
        }
    }

}
