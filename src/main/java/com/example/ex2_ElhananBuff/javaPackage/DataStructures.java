
package com.example.ex2_ElhananBuff.javaPackage;

import java.util.ArrayList;

public class DataStructures {
    private final ArrayList<String> myQuestion;
    private final ArrayList<String>[] myAnswer;
    private final ArrayList<String>[] authorOfAnswer;

    /**
     * it's the constructor of this class and initialize many intern variable
     * @param myQuestions array list of all question
     */
    public DataStructures(ArrayList<String> myQuestions ) {
        myQuestion = myQuestions;
        myAnswer = new ArrayList [myQuestion.size()];
        authorOfAnswer= new ArrayList[myQuestion.size()];
        for (int i = 0; i < myQuestion.size(); i++) {
            myAnswer[i] = new ArrayList<String>();
            authorOfAnswer[i] = new ArrayList<String>();
        }
    }


    /**
     * this  function take from the server the index of the question that he want to answer ,his response and his name
     * and set a private arraylist of response and author name
     * @param index the number of the question that he want to answer
     * @param answer his response
     * @param author his name
     */
    public void setResponse(int index,String answer,String author){
        myAnswer[index].add(answer);
        authorOfAnswer[index].add(author);
    }

    /**
     * this function get from the server a number of question and return an array of all response of this question
     * @param index number of question
     * @return array of response
     */
    public ArrayList<String> getResponse(int index){
        return myAnswer[index];
    }

    /**
     * this function return an array that contain the Author of all answer of any question
     * @param index get the index to know witch array of response i need to return
     * @return array of Author name
     */
    public ArrayList<String> getAuthor(int index){
        return authorOfAnswer[index];
    }

    /**
     * this function return the how many response  there is in a given question
     * @param index get index of witch question i interested to know
     * @return number of response
     */
    public int getLenght(int index){
        return myAnswer[index].size();
    }
    /**
     * this function return all question that we are extract from the text folder
     * @return array list of all question
     */
    public ArrayList<String> getQuestion(){
        return myQuestion;
    }

}
