package kea;

public class Main {

    public static void testVolume(){
        Volume volume = new Volume();
        Button volumeUpButton = new Button(new VolumeUp(volume));
        Button volumeDownButton = new Button(new VolumeDown(volume));

        volumeUpButton.execute();
        volumeDownButton.execute();
    }
    public static void main(String[] args) {
        testVolume();
    }
}
