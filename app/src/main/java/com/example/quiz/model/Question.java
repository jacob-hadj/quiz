package com.example.quiz.model;

import java.util.List;
//hhhhhhhhhhhhhhhhhhhhhhhh
public class Question {
    private String mQuestion ;
    private List <String> mChoiceList;
    private int mAnswerIndex;

    public Question (String question, List<String> choiceList, int answerIndex){
        this.mQuestion = question;
        this.mChoiceList= choiceList;
        this.mAnswerIndex = answerIndex ;
    }

    public String getQuestion() {
        return mQuestion;
    }

    public void setQuestion(String question) {
        this.mQuestion = question;
    }

    public List<String> getChoiceList() {
        return mChoiceList;
    }

    public void setChoiceList(List<String> choiceList) {
        if (choiceList == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        this.mChoiceList = choiceList;
    }

    public int getAnswerIndex() {
        return mAnswerIndex;
    }

    public void setAnswerIndex(int answerIndex) {
        if (answerIndex < 0 || answerIndex >= mChoiceList.size()){
            throw new IllegalArgumentException("Answer index is out of bound");
        }
        this.mAnswerIndex = answerIndex;
    }

    @Override
    public String toString() {
        return "Question{" +
                "mQuestion='" + mQuestion + '\'' +
                ", mChoiceList=" + mChoiceList +
                ", mAnswerIndex=" + mAnswerIndex +
                '}';
    }
}
