public class AudioRecording extends ElementiMedia implements InterfacciaPlay, IncreDecre {
    private int duration;
    private int volume;

    public AudioRecording(String title, int duration, int volume) {
        super(title);
        this.duration = duration;
        this.volume = volume;
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
            System.out.println(title + " " + "!".repeat(volume));
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
}