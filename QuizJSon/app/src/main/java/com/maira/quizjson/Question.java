package com.maira.quizjson;

import java.util.List;

public class Question {
    private int id;
    private String text;
    private List<Answer> answers;
    private String correct;

    public Question(int id, String text, List<Answer> answers, String correct) {
        this.id = id;
        this.text = text;
        this.answers = answers;
        this.correct = correct;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public String getCorrect() {
        return correct;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }

    public class Answer {
        private String letter;
        private String answer;

        public Answer(String letter, String answer) {
            this.letter = letter;
            this.answer = answer;
        }

        public String getLetter() {
            return letter;
        }

        public void setLetter(String letter) {
            this.letter = letter;
        }

        @Override
        public String toString() {
            return "Answer{" +
                    "letter='" + letter + '\'' +
                    ", answer='" + answer + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", answers=" + answers +
                ", correct='" + correct + '\'' +
                '}';
    }
}
