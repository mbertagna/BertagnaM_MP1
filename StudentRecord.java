// a. Michael Bertagna
// b. 2353491
// c. bertagna@chapman.edu
// d. CPSC 231-01
// e. MP1: Recursion and Intro to Classes

import java.text.DecimalFormat;

//class declaration
public class StudentRecord{
  //member variables
  private double m_quiz1;
  private double m_quiz2;
  private double m_quiz3;
  private double m_midtermExam;
  private double m_finalExam;

  //default constructor
  public StudentRecord(){
    m_quiz1=0;
    m_quiz2=0;
    m_quiz3=0;
    m_midtermExam=0;
    m_finalExam=0;
  }
  //overloaded
  public StudentRecord(double quiz1, double quiz2, double quiz3, double midtermExam, double finalExam){
    m_quiz1=quiz1;
    m_quiz2=quiz2;
    m_quiz3=quiz3;
    m_midtermExam=midtermExam;
    m_finalExam=finalExam;
  }
  //accessor
  public double getQuiz1(){
    return m_quiz1;
  }
  //accessor
  public double getQuiz2(){
    return m_quiz2;
  }
  //accessor
  public double getQuiz3(){
    return m_quiz3;
  }
  //accessor
  public double getMidtermExam(){
    return m_midtermExam;
  }
  //accessor
  public double getFinalExam(){
    return m_finalExam;
  }

  //mutator
  public void setQuiz1(double quiz1){
    m_quiz1 = quiz1;
  }
  //mutator
  public void setQuiz2(double quiz2){
    m_quiz2 = quiz2;
  }//mutator
  public void setQuiz3(double quiz3){
    m_quiz3 = quiz3;
  }
  //mutator
  public void setFinalExam(double finalExam){
    m_finalExam = finalExam;
  }
  //mutator
  public void setMidtermExam(double midtermExam){
    m_midtermExam = midtermExam;
  }

  //method
  public double computeNumericScore(){
    //computing the overall score
    double numericScore = ( (0.4*(m_finalExam) + 0.35*(m_midtermExam) + 0.25*((m_quiz1+m_quiz2+m_quiz3)/30)*100) );
    //rounding to two decimal places
    DecimalFormat df = new DecimalFormat("#.00");
    String formattedNumericScoreStr = df.format(numericScore);
    double formattedNumericScore = Double.parseDouble(formattedNumericScoreStr);
    //reutrning formatted overall score
    return formattedNumericScore;
  }

  //method
  public char computeLetterGrade(){
    double numericScore=computeNumericScore();
    if (  numericScore  >= 90 ){
      return 'A';
    }
    else if (  numericScore  >= 80 ){
      return 'B';
    }
    else if (  numericScore  >= 70 ){
      return 'C';
    }
    else if (  numericScore  >= 60 ){
      return 'D';
    }
    else {
      return 'F';
    }
  }

  //toString method
  public String toString(){
    return ("Quiz 1 Score: " + m_quiz1+", Quiz 2 Score: " + m_quiz2+", Quiz 3 Score: " + m_quiz3+ ", Midterm Exam Score: " +m_midtermExam + ", Final Exam Score: " +m_finalExam+ ", \nOverall Score: " +computeNumericScore()+ ", Letter Grade: " +computeLetterGrade());
  }

  //method
  public boolean equals(StudentRecord otherStudentRecord){
    return (m_quiz1==otherStudentRecord.m_quiz1 && m_quiz2==otherStudentRecord.m_quiz2 && m_quiz3==otherStudentRecord.m_quiz3 && m_midtermExam==otherStudentRecord.m_midtermExam && m_finalExam==otherStudentRecord.m_finalExam);
  }

  //main method
  public static void main(String[] args) {
    //creation of student 1
    StudentRecord student1 = new StudentRecord(10/*quiz1*/,10/*quiz2*/,10/*quiz3*/,100/*midtermExam*/,100/*finalExam*/);
    //creation of student 2
    StudentRecord student2 = new StudentRecord(9/*quiz1*/,7/*quiz2*/,10/*quiz3*/,85/*midtermExam*/,93/*finalExam*/);
    //print student 1's records
    System.out.println(student1.toString());
    //print student 2's records
    System.out.println(student2.toString());
    //print true if student 1 has same attributes and student 2, else print false
    System.out.println(student1.equals(student2));
  }
}
