package AdaptorDesignPattern1;

/**
 * Created by udaka on 7/17/16.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    public void playMp4(String fileName) {
        //Do nothing
    }
}
