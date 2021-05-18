package objectcreation;

public class CloneObject {
    public static void main(String[] args)throws CloneNotSupportedException {
        Clone clone = new Clone();

        //create a copy of clone object in clone1 object
        Clone clone1 = (Clone) clone.clone();

        clone.a = 20;
        clone1.a = 30;
        System.out.println(clone + "\n" + clone1);
    }
}

class Clone implements Cloneable{
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    int a = 10;

    @Override
    public String toString() {
        return "Clone{" +
                "a=" + a +
                '}';
    }
}
