package EX1;

import java.util.Date;

public class Student {
    private int Id;
    private String name;
    private String DOB;
    private Character gender;
    private final Character MALE = 'm';

    public Student(int id, String name, String DOB, Character gender) {
        Id = id;
        this.name = name;
        this.DOB = DOB;
        this.gender = gender;
    }

//region Get/Set
    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getDOB() {
        return DOB;
    }

    public Character getGender() {
        return gender;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }
//endregion

    public void print(){
        String gender;
        if (this.gender == MALE){
            gender = "male";
        }else {
            gender = "female";
        }
        System.out.printf("\n|ID: %-5d |Name: %-10s|DOB: %-15s|Gender: %s",Id,name,DOB,gender);
    }
}
