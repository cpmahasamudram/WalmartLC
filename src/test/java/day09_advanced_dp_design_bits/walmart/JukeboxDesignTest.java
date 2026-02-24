package test.java.day09_advanced_dp_design_bits.walmart;

import main.java.day09_advanced_dp_design_bits.walmart.JukeboxDesign;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JukeboxDesignTest {

    @Test
    void noSongPlayingInitially() {
        JukeboxDesign jukebox = new JukeboxDesign();
        assertNull(jukebox.getCurrentSong());
    }

    @Test
    void addAndPlaySong() {
        JukeboxDesign jukebox = new JukeboxDesign();
        jukebox.addSong(1, "Imagine");
        jukebox.playSong(1);
        assertEquals("Imagine", jukebox.getCurrentSong());
    }

    @Test
    void switchSongs() {
        JukeboxDesign jukebox = new JukeboxDesign();
        jukebox.addSong(1, "Imagine");
        jukebox.addSong(2, "Yesterday");
        jukebox.playSong(1);
        assertEquals("Imagine", jukebox.getCurrentSong());
        jukebox.playSong(2);
        assertEquals("Yesterday", jukebox.getCurrentSong());
    }

    @Test
    void playNonExistentSongDoesNothing() {
        JukeboxDesign jukebox = new JukeboxDesign();
        jukebox.addSong(1, "Imagine");
        jukebox.playSong(1);
        jukebox.playSong(99); // does nothing
        assertEquals("Imagine", jukebox.getCurrentSong());
    }

    @Test
    void addDuplicateSongIdIgnored() {
        JukeboxDesign jukebox = new JukeboxDesign();
        jukebox.addSong(1, "Imagine");
        jukebox.addSong(1, "Overwrite"); // should be ignored
        jukebox.playSong(1);
        assertEquals("Imagine", jukebox.getCurrentSong());
    }

    @Test
    void playWithoutAddDoesNothing() {
        JukeboxDesign jukebox = new JukeboxDesign();
        jukebox.playSong(1);
        assertNull(jukebox.getCurrentSong());
    }
}
