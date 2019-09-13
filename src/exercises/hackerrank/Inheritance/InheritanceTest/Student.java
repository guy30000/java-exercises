package exercises.hackerrank.Inheritance.InheritanceTest;

public class Student extends Person{
    private int[] testScores;


    public Student(String firstName,String lastName,int id, int[] scores){
        super(firstName ,lastName,id);
        testScores=scores;
    }

    public char calculate(){
        int avgCnt=0;
        int tot=0;
    for (int i=0;i<testScores.length;i++){
        avgCnt++;
        tot += testScores[i];
        }
        tot = tot/avgCnt;
char grade='a';

if (100 >= tot && tot >= 90) grade='O';
else if(90 > tot && tot >= 80) grade='E';
else if(80 > tot && tot >= 70) grade='A';
else if(70 > tot && tot >= 55) grade='P';
else if(55 > tot && tot >= 40) grade='D';
else if(40 > tot) grade='T';


        return (grade);
    }






}


