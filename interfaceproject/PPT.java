package interfaceproject;

public class PPT implements Presantable{
    String msg = "";
    PPT(String msg)
    {
        this.msg = msg;
    }
    @Override
    public String getPresantableContents()
    {
        return msg;
    }
}
