package kea;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Songs, Next and Prev Testing:

        Song testSong = new Song();
        SongNextCommand testNext = new SongNextCommand(testSong);
        SongPrevCommand testPrev = new SongPrevCommand(testSong);
        Button nextSongButton = new Button(testNext);
        nextSongButton.execute();
        Button prevSongButton = new Button(testPrev);
        prevSongButton.execute();

        

    }
}
