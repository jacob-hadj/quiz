package com.example.quiz.model;

import java.util.Collections;
import java.util.List;

public class QuestionBank {

    private List <Question> mQuestionList;
    private  int mNextQuestionIndex;

    public QuestionBank(List<Question> questionList) {
        this.mQuestionList = questionList;
        // Shuffle the question list
        Collections.shuffle(mQuestionList);
        this.mNextQuestionIndex = 0 ;
    }

    public List<Question> getQuestionList() {
        return mQuestionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.mQuestionList = questionList;
    }

    public int getNextQuestionIndex() {
        return mNextQuestionIndex;
    }

    public void setNextQuestionIndex(int nextQuestionIndex) {
        this.mNextQuestionIndex = nextQuestionIndex;
    }

    public Question getQuestion() {
        if (mNextQuestionIndex == mQuestionList.size()){
            mNextQuestionIndex=0;
        }
        return mQuestionList.get(mNextQuestionIndex++);
    }
}
