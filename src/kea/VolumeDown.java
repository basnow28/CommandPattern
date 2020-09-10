package kea;

public class VolumeDown implements Command {
    private Volume volume;

    public VolumeDown(Volume volume){
        this.volume = volume;
    }

    @Override
    public void execute() {
        volume.volumeDown();
    }
}
