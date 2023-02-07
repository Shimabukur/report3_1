package jp.ac.uryukyu.ie.e225728;

public class LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead;

    public LivingThing (String _name, int _maximumHP, int _attack) {
        this.setName(_name);
        this.setHitPoint(_maximumHP);
        this.setAttack(_attack);
        this.dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", _name, _maximumHP, _attack);
    }

    public void setName(String _name){
        this.name = _name;
    }

    public void setHitPoint(int _maximumHP){
        this.hitPoint = _maximumHP;
    }

    public void setAttack(int _attack){
        this.attack = _attack;
    }

    public String getName(){
        return this.name;
    }

    public int getHitPoint(){
        return this.hitPoint;
    }

    public int getAttack(){
        return this.attack;
    }

    public boolean isDead(){
        return this.dead;
    }

    public void attack(LivingThing opponent){
        if (this.dead == false){
            int damage = (int)(Math.random() * this.getAttack());
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", this.getName(), opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    public void wounded(int damage){
        this.hitPoint -= damage;
        if( this.hitPoint < 0 ) {
            this.dead = true;
            System.out.printf("%sは倒れた。\n", this.getName());
        }
    }
}