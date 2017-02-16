package ua.itea.lessonsWithMaksim.barbershop.version01;

/**
 * Created by vitaliy on 11/30/16.
 */
public class BarberShop {

    private BarberCabinet barberCabinet;
    private BarberWaitRoom barberWaitRoom;

    public BarberShop(int WaitRoomCapacity){
        barberCabinet = new BarberCabinet();
        barberWaitRoom = new BarberWaitRoom(WaitRoomCapacity, barberCabinet);
    }

    public BarberWaitRoom getBarberWaitRoom() {
        return barberWaitRoom;
    }

    public BarberCabinet getBarberCabinet() {
        return barberCabinet;
    }
}
