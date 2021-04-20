package vk;

public class list {
    Element head = null;

    int getListSize() {
        Element t = head;
        int n = 0;
        while (t != null) {
            n += 1;
            t = t.element;
        }
        return n;
    }

    public void addToList(Element e) {
        e.element = head;
        head = e;
    }

    public void showList() {
        Element t = head;
        while (t != null) {
            System.out.println(t.value);
            t = t.element;

        }
    }

    public static void main(String[] args) {
        list myList = new list();
        myList.addToList(new Element(101));
        myList.addToList(new Element(202));
        myList.addToList(new Element(303));
        myList.showList();
        System.out.println(myList.getListSize());
    }
}

