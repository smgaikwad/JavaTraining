package interfaceproject;

public class PDF implements Printable {
    String msg="";
    PDF(String msg)
    {
        this.msg = msg;
    }
    @Override
    public String getPrintableContents() {
        return msg;
    }
}
