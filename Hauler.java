public class Hauler extends Starship
{
    private int inventorySlotsBonus;
    private double shieldStrengthBonus;
    private int inventorySlots;
    private double shieldStrength;
    
    public Hauler()
    {
        super();
        inventorySlotsBonus = 20;
        shieldStrengthBonus = 0.18;
        inventorySlots = getBaseInventorySlots() + inventorySlotsBonus;
        shieldStrength = getBaseShieldStrength() * (1 + (shieldStrengthBonus / 100));
    }
    
    public Hauler(String starshipName, int baseInventorySlots, double baseDamagePerSecond, int baseHyperdriveRange,
                   double baseShieldStrength, double baseManeuverability, int inventorySlotsBonus, double shieldStrengthBonus)
    {
        super(starshipName, baseInventorySlots, baseDamagePerSecond, 
              baseHyperdriveRange, baseShieldStrength, baseManeuverability);
        this.inventorySlotsBonus = inventorySlotsBonus;
        this.shieldStrengthBonus = shieldStrengthBonus;
        inventorySlots = getBaseInventorySlots() + inventorySlotsBonus;
        shieldStrength = getBaseShieldStrength() * (1 + (shieldStrengthBonus / 100));
    }
    
    public int getInventorySlotsBonus()
    {
        return inventorySlotsBonus;    
    }
    
    public double getShieldStrengthBonus()
    {
        return shieldStrengthBonus;    
    }
    
    public int getInventorySlots()
    {
        return inventorySlots;    
    }
    
    public double getShieldStrength()
    {
        return shieldStrength;    
    }
    
    public void setInventorySlotsBonus(int newInventorySlotsBonus)
    {
        inventorySlotsBonus = newInventorySlotsBonus;
        inventorySlots = getBaseInventorySlots() + inventorySlotsBonus;
    }
    
    public void setShieldStrengthBonus(double newShieldStrengthBonus)
    {
        shieldStrengthBonus = newShieldStrengthBonus;
        shieldStrength = getBaseShieldStrength() * (1 + (shieldStrengthBonus / 100));
    }
    
    public void setBaseInventorySlots(int newBaseInventorySlots)
    {
        super.setBaseInventorySlots(newBaseInventorySlots);
        inventorySlots = newBaseInventorySlots + inventorySlotsBonus;
    }
    
    public void setBaseShieldStrength(double newBaseShieldStrength)
    {
        super.setBaseShieldStrength(newBaseShieldStrength);
        shieldStrength = newBaseShieldStrength * (1 + (shieldStrengthBonus / 100));
    }
    
    public void setInventorySlots(int newInventorySlots)
    {
        inventorySlots = newInventorySlots;     
    }
    
    public void setShieldStrength(double newShieldStrength)
    {
        shieldStrength = newShieldStrength;
    }
    
    public String toString()
    {
        return super.toString() + 
               "\nInventory Slots Bonus: " + inventorySlotsBonus +
               "\nShield Strength Bonus: " + shieldStrengthBonus + "%" +
               "\nInventory Slots: " + inventorySlots +
               "\nShield Strength: " + shieldStrength;
    }
}
