package jp.ac.uryukyu.ie.e225728;


public class Warrior extends Hero{

    public Warrior (String _name, int _maximumHP, int _attack) {
        super(_name, _maximumHP, _attack);
    }

    public void attackWithWeponSkill(LivingThing opponent){
        if (this.dead == false){
        int damage = (int)(this.getAttack() * 1.5 );
        System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", this.getName(), opponent.getName(), damage);
        opponent.wounded(damage);
        }
    }

    
}