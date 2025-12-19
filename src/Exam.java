class Exam {
    private String title;
    private int duration;

    public Exam(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean isLongerThan(Exam other) {
        return this.duration > other.duration;
    }
}
