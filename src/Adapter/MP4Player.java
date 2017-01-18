package Adapter;

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
public class MP4Player implements AdvancedMediaPlayer {

    @Override
    public void playMP4(String fileName) {
        System.out.println("Playing MP4: " + fileName);
    }

    @Override
    public void playVLC(String fileName) {
    }
}