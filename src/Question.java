class Question {
    private String text;
    private String correctAnswer;

    public Question(String text, String correctAnswer) {
        this.text = text;
        this.correctAnswer = correctAnswer;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public boolean checkAnswer(String userAnswer) {
        return correctAnswer.equals(userAnswer);
    }

    @Override
    public String toString() {
        return "Question{text='" + text + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Question) {
            Question q = (Question) o;
            return text.equals(q.text);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }
}