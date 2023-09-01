
package model;

    import DAO.HeroDao;
    import java.sql.ResultSet;
    import java.util.ArrayList;

    public class HeroConstruction {
    
    private String name;
    private int lifePoints,
            maxHp,
            mana,
            maxMana,
            physDmg,
            magDmg,
            armor,
            hitChance,
            strg,
            dex,
            mag,
            cons,
            heroSpec,
            gender;
    
    
//----------------METHODS-------------

    public HeroConstruction() {
  
    }

    public HeroConstruction(String name, int heroEspec, int gender, int mag, int strg, int dex, int cons, int lifePoints, int mana, int hitChance, int physDmg, int magDmg, int armor) {

        this.name=name;
        this.heroSpec=heroEspec;
        this.gender=gender;
        this.mag=mag;
        this.strg=strg;
        this.dex=dex;
        this.cons=cons;
        this.lifePoints=lifePoints;
        this.mana=mana;
        this.hitChance=hitChance;
        this.physDmg=physDmg;
        this.magDmg=magDmg;
        this.armor=armor;
        
    }
    
    public HeroConstruction heroCreation(HeroConstruction newHero) {
        
    HeroDao hd = new HeroDao();
    System.out.println("Hero Construction - Hero Epec "+newHero.getHeroEspec());
    return hd.heroCreation(newHero);

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
    
    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }


    public int getStrg() {
        return strg;
    }

    public void setStrg(int strg) {
        this.strg = strg;
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

    public int getHeroEspec() {
        return heroSpec;
    }

    public void setHeroSpec(int heroSpec) {
        this.heroSpec = heroSpec;
    }
 //-------------------------END gets and sets-----------------------------------    



    
    
}
