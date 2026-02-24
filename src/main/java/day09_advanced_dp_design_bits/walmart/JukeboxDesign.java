package main.java.day09_advanced_dp_design_bits.walmart;

/**
 * Custom Walmart - Jukebox Design
 * Difficulty: Medium | Source: WALMART
 *
 * Design an OOP jukebox system. The jukebox manages a collection of songs
 * and supports adding songs, playing a song by ID, and querying the currently
 * playing song.
 *
 * Implement the JukeboxDesign class:
 * - void addSong(int id, String title) Adds a song with the given id and title
 *   to the jukebox. If a song with the same id already exists, do nothing.
 * - void playSong(int id) Plays the song with the given id. If the song does
 *   not exist, do nothing. Sets it as the currently playing song.
 * - String getCurrentSong() Returns the title of the currently playing song.
 *   If no song is playing, return null.
 *
 * Example:
 *   JukeboxDesign jukebox = new JukeboxDesign();
 *   jukebox.getCurrentSong();        -> null
 *   jukebox.addSong(1, "Imagine");
 *   jukebox.addSong(2, "Yesterday");
 *   jukebox.playSong(1);
 *   jukebox.getCurrentSong();        -> "Imagine"
 *   jukebox.playSong(2);
 *   jukebox.getCurrentSong();        -> "Yesterday"
 *   jukebox.playSong(99);            -> does nothing (song not found)
 *   jukebox.getCurrentSong();        -> "Yesterday"
 *
 * Constraints:
 * - 1 <= id <= 10^5
 * - title is a non-null, non-empty string
 * - At most 10^4 calls total to addSong, playSong, and getCurrentSong
 *
 * PATTERN: OOP Design with HashMap
 * HINT: Use a HashMap<Integer, String> to store songs by id. Keep a variable
 *       to track the currently playing song title. addSong uses putIfAbsent,
 *       playSong looks up the id and updates current, getCurrentSong returns current.
 *
 * TIME: O(1) per operation | SPACE: O(n) where n = number of songs
 */
public class JukeboxDesign {

    public JukeboxDesign() {
        // TODO: Implement - initialize song map and current song tracker
    }

    public void addSong(int id, String title) {
        // TODO: Implement - add song if id not already present
    }

    public void playSong(int id) {
        // TODO: Implement - set currently playing song if id exists
    }

    public String getCurrentSong() {
        // TODO: Implement - return title of currently playing song or null
        return null;
    }
}
