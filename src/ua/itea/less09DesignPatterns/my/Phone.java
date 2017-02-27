package ua.itea.less09DesignPatterns.my;

/**
 * @author vitaliy
 * @version 1.0
 * @since 2/23/17
 */
public abstract class Phone {

    abstract void turnOn();
    abstract void turnOff();
    abstract void openGMail();
    abstract void openVoiceRecord();

    void sendVoiceMessageViaGMail(){
        turnOn();
        turnOff();
        openGMail();
        sendVoiceMessageViaGMail();
    }
}
