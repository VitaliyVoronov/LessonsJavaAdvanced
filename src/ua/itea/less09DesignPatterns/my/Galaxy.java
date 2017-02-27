package ua.itea.less09DesignPatterns.my;

import ua.itea.less09DesignPatterns.external.GalaxyPhoneFunctions;

/**
 * @author vitaliy
 * @version 1.0
 * @since 2/23/17
 */
public class Galaxy extends Phone {

    @Override
    public void turnOn() {
        GalaxyPhoneFunctions.turnOn();
    }

    @Override
    public void turnOff() {
        GalaxyPhoneFunctions.turnOff();
    }

    @Override
    public void openGMail() {
        GalaxyPhoneFunctions.openGMail();
    }

    @Override
    public void openVoiceRecord() {
        GalaxyPhoneFunctions.openVoiceRecord();
    }

}
