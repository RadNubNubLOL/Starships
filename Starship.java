public class Starship 
{
    private String starshipName;
    private int baseInventorySlots;
    private double baseDamagePerSecond;
    private double baseHyperdriveRange;
    private double baseShieldStrength;
    private double baseManeuverability;
    
    public Starship()
    {
        starshipName = "";
        baseInventorySlots = 24;
        baseDamagePerSecond = 33.8;
        baseHyperdriveRange = 101;
        baseShieldStrength = 165;
        baseManeuverability = 192.5;
    }
    
    public Starship(String starshipName, int baseInventorySlots, double baseDamagePerSecond, 
                    double baseHyperdriveRange, double baseShieldStrength, double baseManeuverability)
    {
        this.starshipName = starshipName;
        this.baseInventorySlots = baseInventorySlots;
        this.baseDamagePerSecond = baseDamagePerSecond;
        this.baseHyperdriveRange = baseHyperdriveRange;
        this.baseShieldStrength = baseShieldStrength;
        this.baseManeuverability = baseManeuverability;
    }
    
    public String getStarshipName()
    {
        return starshipName;    
    }
    
    public int getBaseInventorySlots()
    {
        return baseInventorySlots;    
    }
    
    public double getBaseDamagePerSecond()
    {
        return baseDamagePerSecond;    
    }
    
    public double getBaseHyperdriveRange()
    {
        return baseHyperdriveRange;    
    }
    
    public double getBaseShieldStrength()
    {
        return baseShieldStrength;    
    }
    
    public double getBaseManeuverability()
    {
        return baseManeuverability;    
    }
    
    public void setStarshipName(String newStarshipName)
    {
        starshipName = newStarshipName;
    }
    
    public void setBaseInventorySlots(int newBaseInventorySlots)
    {
        baseInventorySlots = newBaseInventorySlots;
    }
    
    public void setBaseDamagePerSecond(double newBaseDamagePerSecond)
    {
        baseDamagePerSecond = newBaseDamagePerSecond;
    }
    
    public void setBaseHyperdriveRange(double newBaseHyperdriveRange)
    {
        baseHyperdriveRange = newBaseHyperdriveRange;
    }
    
    public void setBaseShieldStrength(double newBaseShieldStrength)
    {
        baseShieldStrength = newBaseShieldStrength;     
    }
    
    public void setBaseManeuverability(double newBaseManeuverability)
    {
        baseManeuverability = newBaseManeuverability;
    }
    
    public String toString()
    {
        return "Starship Name: " + starshipName +
               "\nBase Inventory Slots: " + baseInventorySlots +
               "\nBase Damage Per Second: " + baseDamagePerSecond +
               "\nBase Hyperdrive Range: " + baseHyperdriveRange +
               "\nBase Shield Strength: " + baseShieldStrength +
               "\nBase Maneuverability: " + baseManeuverability;
    }
}
