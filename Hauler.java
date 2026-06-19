public class Hauler extends Starship
{
    private int inventorySlotsBonus;
    private double damagePerSecondBonus;
    private double hyperdriveRangeBonus;
    private double shieldStrengthBonus;
    private double maneuverabilityBonus;
    private int inventorySlots;
    private double damagePerSecond;
    private double hyperdriveRange;
    private double shieldStrength;
    private double maneuverability;
    
    public Hauler()
    {
        super();
        inventorySlotsBonus = 6;
        damagePerSecondBonus = 0;
        hyperdriveRangeBonus = 5;
        shieldStrengthBonus = 18;
        maneuverabilityBonus = 0;
        inventorySlots = getBaseInventorySlots() + inventorySlotsBonus;
        damagePerSecond = getBaseDamagePerSecond();
        hyperdriveRange = getBaseHyperdriveRange() * (1 + (hyperdriveRangeBonus / 100));
        shieldStrength = getBaseShieldStrength() * (1 + (shieldStrengthBonus / 100));
        maneuverability = getBaseManeuverability();
    }
    
    public Hauler(String starshipName, int baseInventorySlots, double baseDamagePerSecond, double baseHyperdriveRange, double baseShieldStrength,
                  double baseManeuverability, int inventorySlotsBonus, double damagePerSecondBonus, double hyperdriveRangeBonus, double shieldStrengthBonus, double maneuverabilityBonus)
    {
        super(starshipName, baseInventorySlots, baseDamagePerSecond, 
              baseHyperdriveRange, baseShieldStrength, baseManeuverability);
        this.inventorySlotsBonus = inventorySlotsBonus;
        this.damagePerSecondBonus = damagePerSecondBonus;
        this.hyperdriveRangeBonus = hyperdriveRangeBonus;
        this.shieldStrengthBonus = shieldStrengthBonus;
        this.maneuverabilityBonus = maneuverabilityBonus;
        inventorySlots = getBaseInventorySlots() + inventorySlotsBonus;
        damagePerSecond = baseDamagePerSecond * (1 + (damagePerSecondBonus / 100));
        hyperdriveRange = getBaseHyperdriveRange() * (1 + (hyperdriveRangeBonus / 100));
        shieldStrength = getBaseShieldStrength() * (1 + (shieldStrengthBonus / 100));
        maneuverability = baseManeuverability * (1 + (maneuverabilityBonus / 100));
    }
    
    public int getInventorySlotsBonus()
    {
        return inventorySlotsBonus;    
    }
    
    public double getDamagePerSecondBonus()
    {
        return damagePerSecondBonus;    
    }
    
    public double getHyperdriveRangeBonus()
    {
        return hyperdriveRangeBonus;
    }
    
    public double getShieldStrengthBonus()
    {
        return shieldStrengthBonus;    
    }
    
    public double getManeuverabilityBonus()
    {
        return maneuverabilityBonus;
    }
    
    public int getInventorySlots()
    {
        return inventorySlots;    
    }
    
    public double getDamagePerSecond()
    {
        return damagePerSecond;
    }
    
    public double getHyperdriveRange()
    {
        return hyperdriveRange;
    }
    
    public double getShieldStrength()
    {
        return shieldStrength;    
    }
    
    public double getManeuverability()
    {
        return maneuverability;
    }
    
    public void setInventorySlotsBonus(int newInventorySlotsBonus)
    {
        inventorySlotsBonus = newInventorySlotsBonus;
        inventorySlots = getBaseInventorySlots() + inventorySlotsBonus;
    }
    
    public void setDamagePerSecondBonus(double newDamagePerSecondBonus)
    {
        damagePerSecondBonus = newDamagePerSecondBonus;
        damagePerSecond = getBaseDamagePerSecond() * (1 + (damagePerSecondBonus / 100));
    }
    
    public void setHyperdriveRangeBonus(double newHyperdriveRangeBonus)
    {
        hyperdriveRangeBonus = newHyperdriveRangeBonus;    
        hyperdriveRange = getBaseHyperdriveRange() * (1 + (hyperdriveRangeBonus / 100)); 
    }
    
    public void setShieldStrengthBonus(double newShieldStrengthBonus)
    {
        shieldStrengthBonus = newShieldStrengthBonus;
        shieldStrength = getBaseShieldStrength() * (1 + (shieldStrengthBonus / 100));
    }
    
    public void setManeuverabilityBonus(double newManeuverabilityBonus)
    {
        maneuverabilityBonus = newManeuverabilityBonus;
        maneuverability = getBaseManeuverability() * (1 + (maneuverabilityBonus / 100));
    }
    
    public void setBaseInventorySlots(int newBaseInventorySlots)
    {
        super.setBaseInventorySlots(newBaseInventorySlots);
        inventorySlots = newBaseInventorySlots + inventorySlotsBonus;
    }
    
    public void setBaseDamagePerSecond(double newBaseDamagePerSecond)
    {
        super.setBaseDamagePerSecond(newBaseDamagePerSecond);
        damagePerSecond = newBaseDamagePerSecond * (1 + (damagePerSecondBonus / 100));
    }
    
    public void setBaseHyperdriveRange(double newBaseHyperdriveRange)
    {
        super.setBaseHyperdriveRange(newBaseHyperdriveRange);    
        hyperdriveRange = newBaseHyperdriveRange * (1 + (hyperdriveRangeBonus / 100));
    }
    
    public void setBaseShieldStrength(double newBaseShieldStrength)
    {
        super.setBaseShieldStrength(newBaseShieldStrength);
        shieldStrength = newBaseShieldStrength * (1 + (shieldStrengthBonus / 100));
    }
    
    public void setBaseManeuverability(double newBaseManeuverability)
    {
        super.setBaseManeuverability(newBaseManeuverability);
        maneuverability = newBaseManeuverability * (1 + (maneuverabilityBonus / 100));
    }
    
    public String toString()
    {
        return super.toString() + 
               "\nInventory Slots Bonus: " + inventorySlotsBonus +
               "\nDamage Per Second Bonus: " + damagePerSecondBonus + "%" +
               "\nHyperdrive Range Bonus: " + hyperdriveRangeBonus + "%" +
               "\nShield Strength Bonus: " + shieldStrengthBonus + "%" +
               "\nManeuverability Bonus: " + maneuverabilityBonus + "%" +
               "\nInventory Slots: " + inventorySlots +
               "\nDamage Per Second: " + damagePerSecond + 
               "\nHyperdrive Range: " + hyperdriveRange + 
               "\nShield Strength: " + shieldStrength + 
               "\nManeuverability: " + maneuverability;
    }
}
