public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    public Fighter(String name, int damage, int health, int weight, double dodge){
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    public int hit(Fighter rakip){
        System.out.println("---------");
        System.out.println(this.name +" ==> "+ rakip.name + " " + this.damage + " hasar vurdu");

        if(rakip.dodge()){
            System.out.println(rakip.name+" gelen hasarı savundu");
            return rakip.health;
        }

        if(rakip.health - this.damage < 0)
        return 0;

        return rakip.health - this.damage;
    }

    public boolean dodge(){
        double randomValue = Math.random() * 100;
        return randomValue <=this.dodge;
    }

}
