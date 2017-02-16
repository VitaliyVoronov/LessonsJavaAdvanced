package ua.itea.lessonsWithMaksim.barbershop.version02;

/**
 * Created by vitaliy on 12/5/16.
 */
public class Barbershop {

    private WaitRoom waitRoom;
    private Cabinet cabinet;
    private boolean isOpen;

    public Barbershop(int waitRoomCapacity, Men barber){
        waitRoom = new WaitRoom(waitRoomCapacity);
        cabinet = new Cabinet(barber);
        isOpen = true;
    }

    public WaitRoom getWaitRoom() {
        return waitRoom;
    }

    public Cabinet getCabinet() {
        return cabinet;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}
