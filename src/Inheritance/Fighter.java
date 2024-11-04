package Inheritance;

public interface Fighter {
    boolean isVulnerable();
    int getDamagePoints(Fighter fighter);
}

class Run {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Wizard wizard = new Wizard();
        System.out.println(warrior.isVulnerable());
        System.out.println(wizard.isVulnerable());
        System.out.println(warrior.getDamagePoints(wizard));
        System.out.println(wizard.getDamagePoints(warrior));
        wizard.prepareSpell();
        System.out.println(warrior.isVulnerable());
        System.out.println(wizard.isVulnerable());
        System.out.println(warrior.getDamagePoints(wizard));
        System.out.println(wizard.getDamagePoints(warrior));
    }
}

class Warrior implements Fighter{
    public String toString(){
        return "Fighter is a Warrior";
    }
    public boolean isVulnerable() {
        return false;
    }
    public int getDamagePoints(Fighter fighter) {
        if(fighter instanceof Wizard && ((Wizard)fighter).isVulnerable() == true)
            return 10;
        else 
            return 6;
    }
}
class Wizard implements Fighter {
    private boolean isVulnerable = true;
    public String toString() {
        return "Fighter is a Wizard";
    }
    public void prepareSpell() {
        System.out.println("Spell is prepared");
        isVulnerable = false;
    }
    public int getDamagePoints(Fighter fighter) {
        return isVulnerable ? 3 : 12;
    }
    public boolean isVulnerable() {
        return isVulnerable;
    }
}
