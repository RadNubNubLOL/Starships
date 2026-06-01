import java.util.ArrayList;

public class Test
{
    public static void main(String[] args)
    {
        Starship radsRadicalStarship = new Starship("Rad's Radical Starship", 50, 50, 110, 175, 200);
        
        Fighter bClassFighter = new Fighter("B Class Fighter", 100, 50, 110, 185, 200, 35, 12, 100);
        
        Hauler aClassHauler = new Hauler("A Class Hauler", 120, 40, 130, 170, 200, 20, 70);
        
        System.out.println("Starship Name: " + radsRadicalStarship.getStarshipName() +
                           "\nBase Inventory Slots: " + radsRadicalStarship.getBaseInventorySlots() +
                           "\nBase Damage Per Second: " + radsRadicalStarship.getBaseDamagePerSecond() + "\n");
        
        System.out.println("Starship Name: " + bClassFighter.getStarshipName() +
                           "\nBase Damage Per Second: " + bClassFighter.getBaseDamagePerSecond() +
                           "\nBase Maneuverability: " + bClassFighter.getBaseManeuverability() + "\n");
                           
        System.out.println("Starship Name: " + aClassHauler.getStarshipName() +
                           "\nBase Inventory Slots: " + aClassHauler.getBaseInventorySlots() +
                           "\nBase Shield Strength: " + aClassHauler.getBaseShieldStrength() + "\n");
                           
        radsRadicalStarship.setBaseInventorySlots(51);
        radsRadicalStarship.setBaseDamagePerSecond(55);
        
        bClassFighter.setBaseDamagePerSecond(60);
        bClassFighter.setManeuverabilityBonus(110);
        
        aClassHauler.setBaseShieldStrength(175);
        aClassHauler.setShieldStrengthBonus(75);
        
        ArrayList<Starship> starships = new ArrayList<Starship>();
        
        starships.add(radsRadicalStarship);
        starships.add(bClassFighter);
        starships.add(aClassHauler);
        
        for (int i = 0; i < starships.size(); i++)
        {
            System.out.println(starships.get(i).toString() + "\n");    
        }
    }
}
