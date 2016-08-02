package ca.kgb.jsonparsing;

/**
 * Created by admin on 8/2/2016.
 */
public class Student {
    String name;
    int age;
    double grade;
    public void setAge(int newAge){
        if(newAge > 0 && newAge< 120){
            age = newAge;
        }
    }
}
