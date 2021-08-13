package beans.tutorial.dependencyInjection;

//Dependency injection using constructor
public class College {

    private Students students;

    public void setStudents(Students students) {
        this.students = students;
    }


//    public College(Students students){
//        this.students = students;
//    }

    public void test()
    {
        students.methodOfStd();
    }

}
