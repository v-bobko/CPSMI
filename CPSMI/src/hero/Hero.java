package hero;

public class Hero extends Thread {
    String name;
    Hero enemy;
    public int hp = 10000;

    public Hero(String name) {
        this.name = name;
    }

    public void assignEnemy(Hero enemy) {
        this.enemy = enemy;
    }

    public void run() {
        for (int i = 0; i <= 10000; i++) {
            if (hp <= 0) {
                System.out.println(name + " Убит!!!!!!!!");
                return;
            }
            enemy.hp--;
            /*      try {
                       Thread.sleep(1);
                    } catch (InterruptedException e) {
                      e.printStackTrace();
                  } */
            System.out.println(name + " ударил " + enemy.name + " " + i + " раз");
        }
    }
}
