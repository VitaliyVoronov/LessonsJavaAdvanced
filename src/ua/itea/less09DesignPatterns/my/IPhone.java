package ua.itea.less09DesignPatterns.my;

import ua.itea.less09DesignPatterns.external.IPhonePhoneFunction;

/**
 * @author vitaliy
 * @version 1.0
 * @since 2/23/17
 */
public class IPhone extends Phone {

    @Override
    public void turnOn() {
        IPhonePhoneFunction.turnOn();
    }

    @Override
    public void turnOff() {
        IPhonePhoneFunction.turnOff();
    }

    @Override
    public void openGMail() {
        IPhonePhoneFunction.openGMail();
    }

    @Override
    public void openVoiceRecord() {
        IPhonePhoneFunction.openVoiceRecord();
    }

}
