package ua.itea.less09DesignPatterns.my;

import ua.itea.less09DesignPatterns.external.PixelPhoneFunction;

/**
 * @author vitaliy
 * @version 1.0
 * @since 2/23/17
 */
public class Pixel extends Phone {

    @Override
    public void turnOn() {
        PixelPhoneFunction.turnOn();
    }

    @Override
    public void turnOff() {
        PixelPhoneFunction.turnOff();
    }

    @Override
    public void openGMail() {
        PixelPhoneFunction.openGMail();
    }

    @Override
    public void openVoiceRecord() {
        PixelPhoneFunction.openVoiceRecord();
    }

}
