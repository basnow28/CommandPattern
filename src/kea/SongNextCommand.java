package kea;

public class SongNextCommand implements Command{
    private Song mySong;

    public SongNextCommand(Song singing){
        mySong = singing;
    }

    @Override
    public void execute() {
        mySong.nextSong();
    }
}
