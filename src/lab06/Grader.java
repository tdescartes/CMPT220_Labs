package lab06;

import javax.print.DocFlavor;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Grader {
    //instance field
    private File file;
    private ArrayList<Integer> grades = new ArrayList<>();

    /* The Constructor method using file(File) parameters throws a FileNotFoundException.*/
    public Grader(File file) throws FileNotFoundException {
        if(file.exists()){
            setFile(file);
            setGrades(); 
        }
        else{
            throw new FileNotFoundException("The file was not found.");
        }
    }

    /* The Constructor method using path(string) parameters throws a FileNotFoundException.*/
    public Grader(String path) throws FileNotFoundException{
        File gradeText = new File(path); // This help to have one setFile method
        if(gradeText.exists()){
            setFile(gradeText);
            setGrades();
        }
        else{
            throw new FileNotFoundException("The file was not found.");
        }
    }

    /*Method to calculate the average of number in the array grades */
    public double calculateAverage() {
        double sum=0;// initializing  an empty variable to hold the sum
        for(int a= 0; a < grades.size(); a++){
            sum += grades.get(a); // accumulating the sum
        }
        return (sum/ grades.size());// returning the average of numbers from array grades
    }


    /* setFile method to set file to the inputted file (gradeTxt)*/
    public void setFile(File gradeTxt) throws FileNotFoundException{
        if(gradeTxt.exists()){
            file= gradeTxt;
        }
        else{
            throw new FileNotFoundException("The file was not found.");
        }
    }

    /*getGrades method to return the grades*/
    public ArrayList<Integer> getGrades() throws FileNotFoundException{
        setGrades();
        return grades;
    }

    /* The setGrades method takes no parameters throws a FileNotFoundException. */
    private void setGrades() throws FileNotFoundException{
        //try-with-resources
        try (Scanner input= new Scanner(file)){
            while (input.hasNextInt()){
                grades.add(input.nextInt());
            }
        }
        catch(FileNotFoundException ex){
            throw new FileNotFoundException("The file was not found.");
        }
    }

    public File getFile() {
        return this.file;// accessing setGrades variable instance.
    }


    /*the main method to invoke other methods*/
    public static void main(String[] args){
        try{// try try/catch/finally
            File gradeTxt= new File("src/lab06/grades1.txt");
            Grader grade1Txt= new Grader(gradeTxt);
            Grader grade2Txt= new Grader("src/lab06/grades2.txt");

            System.out.println("The grade1.txt average is "+ grade1Txt.calculateAverage());
            System.out.println("The grade2.txt average is "+ grade2Txt.calculateAverage());

        }
        catch (FileNotFoundException ex){
            System.out.println("The file cannot be found");
            System.exit(1);
        }
    }
}
