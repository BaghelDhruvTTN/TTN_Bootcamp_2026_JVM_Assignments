/*
use record to create an immutable represent of student(name, id, age)
and use its  constructor for initialization, equals to compare 2 students methods.
Also keep a static counter to keep the count of objects created.
 */
record Student(String name, int id , int age){
    static int count=0;

    public Student{
        count++;
    }
}
public class fifthQues {
    public static void main(String[] args) {
        Student s1 = new Student("Padam ", 1, 23);
        Student s2 = new Student("Padam ", 1, 23);
        Student s3 = new Student("Amit", 2, 21);

        //it give true only if all three parameters which are given are same
        System.out.println(s1.equals(s2));

        System.out.println("Total Object created =" + Student.count);


    }
}

