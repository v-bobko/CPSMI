package DragonWorld;

public class Main {
    public static void main(String[] args) {
        Dragon toothless = new Dragon(0, "Беззубик", true);
        Dragon gronckle = new Dragon(30, "Сарделька", false);
        Dragon terribleTerror = new Dragon(10, "Жуткая Жуть", true);

        toothless.fire(gronckle);
        gronckle.fire(terribleTerror);
        terribleTerror.fire(toothless);

        fight(toothless, gronckle);
        fight(toothless, terribleTerror);
        fight(toothless, toothless);
        fight(terribleTerror, gronckle);
    }

    static void fight(Dragon a, Dragon b) {
        if (a.getTooth() > b.getTooth()) {
            System.out.println(a.getName() + " победил!");
        } else if (a.getTooth() < b.getTooth()) {
            System.out.println(b.getName() + " победил!");
        } else {
            System.out.println("Победила дружба");
        }
    }
}
