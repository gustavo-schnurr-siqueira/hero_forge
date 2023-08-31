
package DAO;

import javax.swing.JOptionPane;
import model.Hero;


public class HeroDao {    
    

    public Hero heroCreation(Hero newHero) {
        
        String sql = "INSERT INTO hero (name,specialization,gender,life,mana,magic,strenght,dexterity,constitution,physical_dmg,magical_dmg,hit_chance,armor)"
                + "VALUES"+ "'" + newHero.getName()+"',"
                +""+newHero.getHeroSpec()+","
                +""+newHero.getGender()+","
                +""+newHero.getHp()+","
                +""+newHero.getMana()+","
                +""+newHero.getMag()+","
                +""+newHero.getStr()+","
                +""+newHero.getDex()+","
                +""+newHero.getCons()+","
                +""+newHero.getPhysDmg()+","
                +""+newHero.getMagDmg()+","
                +""+newHero.getHitChance()+","
                +""+newHero.getArmor()+")";
        
        HeroConnection.executar(sql);
        JOptionPane.showMessageDialog(null, "Hero created");
        
       return newHero; 
    }
    
    
    
}
