package ru.sectorsj.orailly.learnjava._486_quize_v2;

class QuizCard {
    private String question;
    private String answer;

    public QuizCard(String q, String a) {
        question = q;
        answer = a;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
