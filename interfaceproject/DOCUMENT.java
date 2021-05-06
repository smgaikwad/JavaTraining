package interfaceproject;

public class DOCUMENT implements Printable{
    String msg="";
    DOCUMENT(String msg)
    {
        this.msg=msg;
    }
    @Override
    public String getPrintableContents() {
        return msg;
    }
}
