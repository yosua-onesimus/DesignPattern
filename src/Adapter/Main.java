package Adapter;

/**
 * @author Yosua Onesimus
 * @since 13.03.17
 * @version 13.03.17
 */
public class Main {

    public static void main(String[] args) {
        MediaAdapter mediaAdapter = new MediaAdapter();
        mediaAdapter.play("mp3", "media.mp3");
        mediaAdapter.play("mp4", "media.mp4");
        mediaAdapter.play("vlc", "media.vlc");
    }
}