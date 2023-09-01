package Controler;

import model.HeroConstruction;

public class GeneralControler {

    //-----------------------------------
//--HeroConstruction Variables----------------------   
    private String name;
    private int hp;
    private int maxHp;
    private int mana;
    private int maxMana;
    private int physDmg;
    private int magDmg;
    private int armor;
    private int hitChance;
    private int stamina;
    private int str;
    private int dex;
    private int mag;
    private int cons;
    private int heroEspec;
    private int gender;

//--Weapon Variables------------------
    private String ArmorName;
    private int quality;
    private int bonus1;
    private int bonus2;
    private int bonus3;
    private int valueBonus1;
    private int valueBonus2;
    private int valueBonus3;

    HeroConstruction completeHero = new HeroConstruction();
    HeroConstruction refferenceHero = new HeroConstruction();

//-------------MÉTODOS----------------------
    //----------creatingHero---------------------------
    public HeroConstruction createHero(String name, int heroEspec, int gender, int mag, int strg, int dex, int cons, int lifePoints, int mana, int hitChance, int physDmg, int magDmg, int armor) {
        System.out.println("General Controler - Hero Epec "+heroEspec);
        
        if (name.equals("") || heroEspec <= 0 || gender <= 0) {
            System.out.println("\"Entrou no nulo\"");
            return null;
        } else {
            
            HeroConstruction newHero = new HeroConstruction(name, heroEspec, gender, mag, strg, dex, cons, lifePoints, mana, hitChance, physDmg, magDmg, armor);
            
            return newHero.heroCreation(newHero);
            
        }
    }
    

//------------------------------------------
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

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
        return heroEspec;
    }

    public void setHeroSpec(int heroSpec) {
        this.heroEspec = heroSpec;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getArmorName() {
        return ArmorName;
    }

    public void setArmorName(String ArmorName) {
        this.ArmorName = ArmorName;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public int getBonus1() {
        return bonus1;
    }

    public void setBonus1(int bonus1) {
        this.bonus1 = bonus1;
    }

    public int getBonus2() {
        return bonus2;
    }

    public void setBonus2(int bonus2) {
        this.bonus2 = bonus2;
    }

    public int getBonus3() {
        return bonus3;
    }

    public void setBonus3(int bonus3) {
        this.bonus3 = bonus3;
    }

    public int getValueBonus1() {
        return valueBonus1;
    }

    public void setValueBonus1(int valueBonus1) {
        this.valueBonus1 = valueBonus1;
    }

    public int getValueBonus2() {
        return valueBonus2;
    }

    public void setValueBonus2(int valueBonus2) {
        this.valueBonus2 = valueBonus2;
    }

    public int getValueBonus3() {
        return valueBonus3;
    }

    public void setValueBonus3(int valueBonus3) {
        this.valueBonus3 = valueBonus3;
    }

}
