public class Explorer extends Starship
{
    private double hyperdriveRangeBonus;
    private double shieldStrengthBonus;
    private double maneuverabilityBonus;
    private double hyperdriveRange;
    private double shieldStrength;
    private double maneuverability;
    
    public Explorer()
    {
        super();
        hyperdriveRangeBonus = 15;
        shieldStrengthBonus = 0;
        maneuverabilityBonus = 5;
        hyperdriveRange = getBaseHyperdriveRange() * (1 + (hyperdriveRangeBonus / 100));
        shieldStrength = getBaseShieldStrength();
        maneuverability = getBaseManeuverability() * (1 + (maneuverabilityBonus / 100));
    }
    
    public Explorer(String starshipName, int baseInventorySlots, double baseDamagePerSecond, double baseHyperdriveRange, double baseShieldStrength,
                  double baseManeuverability, double hyperdriveRangeBonus, double shieldStrengthBonus, double maneuverabilityBonus)
    {
        super(starshipName, baseInventorySlots, baseDamagePerSecond, 
              baseHyperdriveRange, baseShieldStrength, baseManeuverability);
        this.hyperdriveRangeBonus = hyperdriveRangeBonus;
        this.shieldStrengthBonus = shieldStrengthBonus;
        this.maneuverabilityBonus = maneuverabilityBonus;
        hyperdriveRange = getBaseHyperdriveRange() * (1 + (hyperdriveRangeBonus / 100));
        shieldStrength = getBaseShieldStrength() * (1 + (shieldStrengthBonus / 100));
        maneuverability = baseManeuverability * (1 + (maneuverabilityBonus / 100));
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
               "\nHyperdrive Range Bonus: " + hyperdriveRangeBonus + "%" +
               "\nShield Strength Bonus: " + shieldStrengthBonus + "%" +
               "\nManeuverability Bonus: " + maneuverabilityBonus + "%" +
               "\nHyperdrive Range: " + hyperdriveRange + 
               "\nShield Strength: " + shieldStrength + 
               "\nManeuverability: " + maneuverability;
    }
}
