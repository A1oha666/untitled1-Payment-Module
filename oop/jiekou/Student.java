package jiekou;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Student {
    private String name;
    private char sex;
    private double score;
    public Student(String name,char sex,double score) {
        this.name = name;
        this.sex = sex;
        this.score = score;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public double getScore() {
        return score;
    }
}

