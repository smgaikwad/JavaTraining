package interfaceproject;
public class InterfaceDemApp {
    public static void main(String[] args) {

        PDF pdf1 = new PDF("This is PDF");
        DOCUMENT doc = new DOCUMENT("This is Document");
        IMAGE img = new IMAGE("This is IMAGE");
        PPT ppt = new PPT("This is PPT");

        Printer p = new Printer();
        Presenter pr = new Presenter();

        p.print(pdf1);
        p.print(doc);
        pr.presant(ppt);
        pr.presant(img);
    }
}
