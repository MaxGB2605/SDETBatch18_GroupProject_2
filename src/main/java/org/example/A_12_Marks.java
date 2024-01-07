package org.example;

public abstract class A_12_Marks {
    private int math;
    private int language;
    private  int art;

    public A_12_Marks(int math, int language, int art) {
        this.math = math;
        this.language = language;
        this.art = art;
    }
    abstract void getPercentage();

    public int getMath() {
        return math;
    }

    public int getLanguage() {
        return language;
    }

    public int getArt() {
        return art;
    }
}
class StudentA extends A_12_Marks {

    public StudentA(int math, int language, int art) {
        super(math, language, art);
    }

    public void printInfo(){
        System.out.println("Student A marks are: "+getMath()+", "+getLanguage()+", "+getArt());
    }
    @Override
    void getPercentage() {
        double percentage = ((double) (getMath()+getLanguage()+getArt())/300)*100;
        System.out.println("Your average percentage is: "+percentage+" %");
    }
}
class StudentB extends A_12_Marks {
private int music;
    public StudentB(int math, int language, int art, int music) {
        super(math, language, art);
        this.music=music;
    }
public void printInfo(){
    System.out.println("Student B marks are: "+getMath()+", "+getLanguage()+", "+getArt()+", "+music);
}
    @Override
    void getPercentage() {
        double percentage = ((double) (getMath()+getLanguage()+getArt()+music)/400)*100;
        System.out.println("Your average percentage is: "+percentage+" %");
    }
}
class MarksTester{
    public static void main(String[] args) {
        StudentA a = new StudentA(86,95,87);
        a.printInfo();
        a.getPercentage();
        System.out.println("******************");
        StudentB b = new StudentB(92,86,98,78);
        b.printInfo();
        b.getPercentage();
    }
}