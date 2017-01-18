package Adapter;

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    @Override
    public void play(String audioType, String fileName) {
        if ("vlc".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer = new VLCPlayer();
            advancedMediaPlayer.playVLC(fileName);
        } else if ("mp4".equalsIgnoreCase(audioType)) {
            advancedMediaPlayer = new MP4Player();
            advancedMediaPlayer.playMP4(fileName);
        } else {
            System.out.println("Playing " + audioType + ": " + fileName);
        }
    }
}