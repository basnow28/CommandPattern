package kea;

public class VolumeUp implements Command {
    private Volume volume;

    public VolumeUp(Volume volume){
        this.volume = volume;
    }

    @Override
    public void execute() {
        volume.volumeUp();
    }
}
