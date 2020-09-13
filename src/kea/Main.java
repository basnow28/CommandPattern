package kea;

public class Main {

    public static void testPlayer()
    {
        MusicPlayer musicPlayer = new MusicPlayer();
        Button musicPlayerPlayCommand = new Button(new MusicPlayerPlayCommand(musicPlayer));
        Button musicPlayerStopCommand = new Button(new MusicPlayerStopCommand(musicPlayer));

        musicPlayerPlayCommand.execute();
        musicPlayerStopCommand.execute();
    }

    public static void main(String[] args)
    {
        testPlayer();
    }
}