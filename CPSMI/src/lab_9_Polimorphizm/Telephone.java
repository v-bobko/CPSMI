package lab_9_Polimorphizm;

public class Telephone {
    private String name;

    public Telephone(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void ring() {
        System.out.println(getName() + ": Дзынь-дзынь!");
    }

}
