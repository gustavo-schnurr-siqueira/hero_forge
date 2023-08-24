
package model;

    import java.sql.ResultSet;
    import java.util.ArrayList;

public class hero {
    
    private String name;
    private int hp,
            maxHp,
            mana,
            maxMana,
            physDmg,
            magDmg,
            armor,
            hitChance,
            stamina,
            str,
            dex,
            mag,
            cons,
            heroSpec,
            gender;
//----------------METHODS-------------
    
    public boolean permitHeroCreation(String name,int heroSpec,int gender){
        this.name=name;        
        this.heroSpec=heroSpec;
        this.gender=gender;
        
        return true;        
    }
    
    public hero creation (String name,int hp,int maxHp,int mana,int maxMana,int physDmg,int magDmg,int armor,int hitChance,int stamina,int str,int dex,int mag,int cons,int heroSpec,int gender){
        hero newHero = new hero();
        
        this.name=name;
        this.hp=hp;
        this.maxHp=maxHp;
        this.mana=mana;
        this.maxMana=maxMana;
        this.physDmg=physDmg;
        this.magDmg=magDmg;
        this.armor=armor;
        this.hitChance=hitChance;
        this.stamina=stamina;
        this.str=str;
        this.dex=dex;
        this.mag=mag;
        this.cons=cons;
        this.heroSpec=heroSpec;
        this.gender=gender;
        
        return newHero;
    }
    
    
    
//-------------------------------------    
//------------GETS AND SETS-----------------------------------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    //--------INTs----------------
    
    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getMaxMana() {
        return maxMana;
    }

    public void setMaxMana(int maxMana) {
        this.maxMana = maxMana;
    }

    public int getPhysDmg() {
        return physDmg;
    }

    public void setPhysDmg(int physDmg) {
        this.physDmg = physDmg;
    }

    public int getMagDmg() {
        return magDmg;
    }

    public void setMagDmg(int magDmg) {
        this.magDmg = magDmg;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getHitChance() {
        return hitChance;
    }

    public void setHitChance(int hitChance) {
        this.hitChance = hitChance;
    }
    
    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
    
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public int getMag() {
        return mag;
    }

    public void setMag(int mag) {
        this.mag = mag;
    }

    public int getCons() {
        return cons;
    }

    public void setCons(int cons) {
        this.cons = cons;
    }

    public int getHeroSpec() {
        return heroSpec;
    }

    public void setHeroSpec(int heroSpec) {
        this.heroSpec = heroSpec;
    }
 //-------------------------END gets and sets-----------------------------------    
    
}
