package jp.ac.uryukyu.ie.e225728;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class WarriorTest {

    @Test
    void warriorWeaponTest() {

        Warrior demoWarrior = new Warrior("デモ戦士", 100, 20);
        Enemy slime = new Enemy("スライムもどき", 100, 0);

        for (int i = 0; i < 3; i++) {
            double attack = demoWarrior.getAttack() * 1.5;
            int beforeHP = slime.getHitPoint();
            demoWarrior.attackWithWeponSkill(slime);
            int afterHP = slime.getHitPoint();
            assertEquals(attack, beforeHP - afterHP);
        }
    }

}