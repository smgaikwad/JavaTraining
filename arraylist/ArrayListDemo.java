package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList(9);
        Student sooraj = new JuniorStudent(36,"SOORAJ",99.99f,"A");
        Student niks = new Student(22,"NIKS",99.99f,"B");
        Student shubh = new Student(25,"SHUBH",99.99f,"B");
        myList.add(sooraj);
        myList.add(niks);
        myList.add(shubh);

        Iterator itr = myList.iterator();

        while(itr.hasNext()) {
            Student student = (Student) itr.next();
            System.out.println(student);
        }
    }
}

class Student
{
    int roll;
    String name;
    float marks;
    String div;

    Student(int roll, String name, float marks, String div)
    {
        this.roll=roll;
        this.name=name;
        this.div=div;
        this.marks=marks;
    }

    public String toString()
    {
        return "Name: "+name+" RollNo: "+roll+" Div: "+div+" Marks: "+marks;
    }
}

class JuniorStudent extends Student
{

    JuniorStudent(int roll, String name, float marks, String div) {
        super(roll, name, marks, div);
    }

}