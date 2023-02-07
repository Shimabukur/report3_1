package jp.ac.uryukyu.ie.e225728;


public class Enemy extends LivingThing {
    

    public Enemy (String _name, int _maximumHP, int _attack) {
        super(_name, _maximumHP, _attack);
    }

    @Override
    public void wounded(int damage){
        this.hitPoint -= damage;
        if( this.hitPoint < 0 ) {
            this.dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }

    
}