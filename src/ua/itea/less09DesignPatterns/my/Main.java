package ua.itea.less09DesignPatterns.my;

/**
 * @author vitaliy
 * @version 1.0
 * @since 2/23/17
 */
public class Main {
    public static void main(String[] args) {
        Phone iPhone = new IPhone();
        Phone galaxy = new Galaxy();
        Phone pixel = new Pixel();
        iPhone.sendVoiceMessageViaGMail();
//        galaxy.sendVoiceMessageViaGMail();
//        pixel.sendVoiceMessageViaGMail();
    }
}
