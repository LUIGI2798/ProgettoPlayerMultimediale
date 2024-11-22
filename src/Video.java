public class Video extends ElementiMedia implements InterfacciaPlay, IncreDecre {
    private int duration;
    private int volume;
    private int brightness;

    public Video(String title, int duration, int volume, int brightness) {
        super(title);
        this.duration = duration;
        this.volume = volume;
        this.brightness = brightness;
    }

    @Override
    public void execute() {
        play();
    }

    @Override
    public int getDuration() {
        return duration;
    }

    @Override
    public void play() {
        for (int i = 0; i < duration; i++) {
            System.out.println(title + " " + "!".repeat(volume) + "*".repeat(brightness));
        }
    }

    @Override
    public void increaseLevel() {
        volume++;
    }

    @Override
    public void decreaseLevel() {
        if (volume > 0) volume--;
    }

    public void increaseBrightness() {
        brightness++;
    }

    public void decreaseBrightness() {
        if (brightness > 0) brightness--;
}
}
