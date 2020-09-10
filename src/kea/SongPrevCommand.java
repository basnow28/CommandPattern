package kea;

public class SongPrevCommand implements Command {

    private Song mySong;

    public SongPrevCommand(Song singing){
        mySong = singing;
    }

    @Override
    public void execute() {
        mySong.prevSong();
    }
}
