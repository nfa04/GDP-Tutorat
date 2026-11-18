package bibliothek;

public class MedienListe {

    private static class Node {
        Medium data;
        Node next;

        Node(Medium data) {
            this.data = data;
        }
    }

    private Node head;
    private int size;

    public void add(Medium m) {
        if (m == null) {
            return;
        }
        Node neu = new Node(m);
        if (head == null) {
            head = neu;
        } else {
            Node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = neu;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public boolean contains(Medium m) {
        if (m == null) {
            return false;
        }
        for (Node cur = head; cur != null; cur = cur.next) {
            if (cur.data.equals(m)) {
                return true;
            }
        }
        return false;
    }

    public int countVerfuegbar() {
        int count = 0;
        for (Node cur = head; cur != null; cur = cur.next) {
            if (!cur.data.istAusgeliehen()) {
                count++;
            }
        }
        return count;
    }

    public void printAll() {
        for (Node cur = head; cur != null; cur = cur.next) {
            System.out.println(cur.data.getBeschreibung());
        }
    }
}
