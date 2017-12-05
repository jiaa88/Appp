package com.sample.multiplechoicequiz;

// This file contains questions from QuestionBank

public class QuestionBank {




    // array of questions
    private String textQuestions [] = {
            "1. The day after the day after tomorrow is four days before Monday. What day is it today?",
            "2. When is the World Population Day observed?",
            "3. The great Victoria Desert is located in?",
            "4. The humidity of the air depends upon."
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"Monday", "Tuesday","Thursday","Friday"},
            {"11 July", "10 December", "15 November", "30 March"},
            {"North America", "West Africa", "Canada", "Australia"},
            {"temperature", "location", "weather", "all of the above"}
    };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswers[] = {"Monday", "11 July", "Australia", "all of the above"};

    // method returns number of questions
    public int getLength(){
        return textQuestions.length;
    }

    // method returns question from array textQuestions[] based on array index
    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    // method return a single multiple choice item for question based on array index,
    // based on number of multiple choice item in the list - 1, 2, 3 or 4 as an argument
    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num-1];
        return choice0;
    }

    //  method returns correct answer for the question based on array index
    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}