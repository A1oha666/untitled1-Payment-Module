package jiekou;

public class ClassDataInterImpl1 implements ClassDataInter {
    private Student[] students;//接
    public ClassDataInterImpl1(Student[] students) {
        this.students = students;
    }
    @Override
    public void printAllStudentsInfos() {
        System.out.println("ALL STUDENTS' INFORMATION");
        for (int i = 0; i <students.length; i++) {
            Student s = students[i];
            System.out.println(s.getName() +' '+s.getSex()+' '+s.getScore());
        }
    }

    @Override
    public void printAverageScore() {
        double sum= 0;
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            sum += s.getScore();
        }
        System.out.println("AVERAGE SCORE: "+sum/students.length);
    }
}
