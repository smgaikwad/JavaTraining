package interfaceproject;

public class IMAGE implements Presantable {
    String msg="";
    IMAGE(String msg)
    {
        this.msg=msg;
    }
    @Override
    public String getPresantableContents() {
        return msg;
    }
}
