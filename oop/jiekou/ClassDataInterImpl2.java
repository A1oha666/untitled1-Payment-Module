package jiekou;

public class ClassDataInterImpl2 implements ClassDataInter {
    private Student[] students;//接
    public ClassDataInterImpl2(Student[] students) {
        this.students = students;
    }    @Override
    public void printAllStudentsInfos() {
        int male = 0,female = 0;
        System.out.println("ALL STUDENTS' INFORMATION");
        for (int i = 0; i <students.length; i++) {
            Student s = students[i];
            System.out.println(s.getName() +' '+s.getSex()+' '+s.getScore());
            if(s.getSex()=='男'){
                male++;
            }
            if(s.getSex()=='女'){
                female++;
            }
        }
        System.out.println("Male: "+male);
        System.out.println("Female: "+female);
    }

    @Override
    public void printAverageScore() {
        double sum= 0,max=students[0].getScore(),min=students[0].getScore();
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            sum += s.getScore();
            if(s.getScore()>max){
                max = s.getScore();
            }
            if(s.getScore()<min){
                min = s.getScore();
            }
        }
        System.out.println("AVERAGE SCORE: "+(sum-max-min)/(students.length-2));
    }
}
