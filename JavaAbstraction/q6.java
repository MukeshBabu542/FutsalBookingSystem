package taskabstraction;

// 6. You are developing a media player application.
// There is a base class called MediaPlayer with methods play(), pause(), and stop().
// The VideoPlayer class inherits from MediaPlayer and adds rewind() and fastForward().
// Additionally, there is an interface called Playlist, which defines addSong() and removeSong().
// The VideoPlayer class implements the Playlist interface.

interface Playlist {
    void addSong(String song);
    void removeSong(String song);
}

class MediaPlayer {
    void play() {
        System.out.println("Playing media...");
    }

    void pause() {
        System.out.println("Media paused.");
    }

    void stop() {
        System.out.println("Media stopped.");
    }
}

class VideoPlayer extends MediaPlayer implements Playlist {
    @Override
    public void addSong(String song) {
        System.out.println("Added to playlist: " + song);
    }

    @Override
    public void removeSong(String song) {
        System.out.println("Removed from playlist: " + song);
    }

    void rewind() {
        System.out.println("Rewinding video...");
    }

    void fastForward() {
        System.out.println("Fast forwarding video...");
    }
}

public class q6 {
    public static void main(String[] args) {
        VideoPlayer player = new VideoPlayer();

        player.play();
        player.pause();
        player.rewind();
        player.fastForward();
        player.stop();

        player.addSong("Song A");
        player.removeSong("Song A");
    }
}
