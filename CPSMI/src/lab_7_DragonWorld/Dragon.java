package lab_7_DragonWorld;

public class Dragon {
    private String name;
    private int tooth;
    private boolean canFire;

    public Dragon(int tooth, String name, boolean canFair) {
        this.tooth = tooth;
        this.name = name;
        this.canFire = canFair;
    }

    public int getTooth() {
        return tooth;
    }

    public String getName() {
        return name;
    }

    public boolean isCanFire() {
        return canFire;
    }

    public void fire(Dragon x) {
        if (canFire) {
            System.out.println(getName() + " поджег " + x.getName());
        } else {
            System.out.println(getName() + " не смог поджечь " + x.getName());
        }
    }

}
