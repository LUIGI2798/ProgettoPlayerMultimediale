public abstract class ElementiMedia {
    protected String title;

    public ElementiMedia (String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }


    public abstract void execute();
}