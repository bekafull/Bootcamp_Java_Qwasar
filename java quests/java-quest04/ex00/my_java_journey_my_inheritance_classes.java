class Mammal{
    int life;
    public Mammal(){
        System.out.println("Constructor Mammal");
        this.life = 10;
    }
    public int getLife(){
        return life;
    }
}
class Human extends Mammal{
    String name;
    public Human(String name){
        System.out.println("Constructor Human");
        this.name = name;
        this.life = 100;
    }
    public String getName(){
        return name;
    }
}