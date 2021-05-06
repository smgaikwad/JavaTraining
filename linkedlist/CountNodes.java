package linkedlist;

public class CountNodes {
    public static void main(String[] args) {
        Node sooraj = new Node("Sooraj");
        Node dhiraj = new Node("dhiraj");
        Node shubh = new Node("shub");
        Node niks = new Node("niks");
        sooraj.next = dhiraj;
        dhiraj.next = shubh;
        shubh.next = niks;
        System.out.println(countNode(sooraj));
    }

    private static int countNode(Node sooraj) {
        int count = 0;
        while(sooraj != null) {
            count++;
            sooraj = sooraj.next;
        }
        return count;
    }
}
