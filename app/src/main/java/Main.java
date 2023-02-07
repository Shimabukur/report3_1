import jp.ac.uryukyu.ie.e225728.*;

public class Main {
    public static void main(String[] args){
        Warrior warrior = new Warrior("戦士", 10, 10);
        Enemy enemy = new Enemy("スライム", 20, 3);

        System.out.printf("%s vs. %s\n", warrior.getName(), enemy.getName());

        int turn = 0;
        while( warrior.isDead() == false && enemy.isDead() == false ){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            warrior.attackWithWeponSkill(enemy);
            enemy.attack(warrior);
        }
        System.out.println("戦闘終了");
    }
}