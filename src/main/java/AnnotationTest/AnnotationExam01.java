package AnnotationTest;

public class AnnotationExam01 {

    @InsertIntData(data = 30)
    int myAge;

    @InsertIntData
    int defaultAge;

    public AnnotationExam01(){
        this.myAge = -1;
        this.defaultAge = -1;
    }


    public int getMyAge() {
        return myAge;
    }

    public int getDefaultAge() {
        return defaultAge;
    }

}
