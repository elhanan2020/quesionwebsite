package com.example.ex2_ElhananBuff.javaPackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class File {

    private final String myPath ;

    private final ArrayList<String> myQuestion ;

    /**
     * this constructor get a path where to find the question folder
     * @param path OF THE QUESTION FOLDER
     */
    public File(String path){
        myQuestion = new ArrayList<String>();
        myPath = path;
    }

    /**
     * this function extract all question of a given folder snd enter them in an array
     * @return the array list of question
     * @throws Exception if we cannot find the folder
     */
    public ArrayList<String>  getQuestion()throws Exception {
        String line = "";

        try( BufferedReader reader = new BufferedReader(new FileReader(myPath)))
        {
            while ((line = reader.readLine()) != null){
                myQuestion.add(line);
            }
        }
        catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return myQuestion;
    }
}



