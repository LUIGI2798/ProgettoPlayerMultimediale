public class Immagine extends ElementiMedia implements IncreDecre {
    private int brightness;

    public Immagine (String title, int brightness) {
        super(title);
        this.brightness = brightness;
    }

    @Override
    public void execute() {
        show();
    }

    public void show() {
        System.out.println(title + " " + "*".repeat(brightness));
    }

    @Override
    public void increaseLevel() {
        brightness++;
    }

    @Override
    public void decreaseLevel() {
        if (brightness > 0) brightness--;
}
}