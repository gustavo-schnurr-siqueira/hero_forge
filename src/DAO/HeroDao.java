
package DAO;

import javax.swing.JOptionPane;
import model.HeroConstruction;


public class HeroDao {    
    

    public HeroConstruction heroCreation(HeroConstruction newHero) {
        System.out.println("Hero DAO - Hero Epec "+newHero.getHeroEspec());
        
        String sql = "INSERT INTO hero (name,specialization,gender,life,mana,magic,strenght,dexterity,constitution,physical_dmg,magical_dmg,hit_chance,armor)"
                + " VALUES ("+ "'" + newHero.getName()+"',"
                +""+newHero.getHeroEspec()+","
                +""+newHero.getGender()+","
                +""+newHero.getLifePoints()+","
                +""+newHero.getMana()+","
                +""+newHero.getMag()+","
                +""+newHero.getStrg()+","
                +""+newHero.getDex()+","
                +""+newHero.getCons()+","
                +""+newHero.getPhysDmg()+","
                +""+newHero.getMagDmg()+","
                +""+newHero.getHitChance()+","
                +""+newHero.getArmor()+");";
        System.out.println(sql);
        HeroConnection.connect(sql);
        JOptionPane.showMessageDialog(null, "Hero created");
        
        
       return newHero; 
    }
    
    
    
}
