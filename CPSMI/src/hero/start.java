package hero;

public class start {
    public static void main(String[] args) {
        Hero drakula=new Hero("Дракула");
        Hero vanHelsing = new Hero("Ван Хельсинг");
        drakula.setPriority(10);
        vanHelsing.setPriority(1);
        drakula.assignEnemy(vanHelsing);
        vanHelsing.assignEnemy(drakula);
        drakula.start();
        vanHelsing.start();

    }
}
