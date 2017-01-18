package Adapter;

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
public class VLCPlayer implements AdvancedMediaPlayer {

    @Override
    public void playMP4(String fileName) {
    }

    @Override
    public void playVLC(String fileName) {
        System.out.println("Playing VLC: " + fileName);
    }
}