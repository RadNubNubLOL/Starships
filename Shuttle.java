public class Shuttle extends Starship
{
    private double damagePerSecondBonus;
    private double hyperdriveRangeBonus;
    private double shieldStrengthBonus;
    private double maneuverabilityBonus;
    private double damagePerSecond;
    private double hyperdriveRange;
    private double shieldStrength;
    private double maneuverability;
    
    public Shuttle()
    {
        super();
        damagePerSecondBonus = 0;
        hyperdriveRangeBonus = 0;
        shieldStrengthBonus = 0;
        maneuverabilityBonus = 0;
        damagePerSecond = getBaseDamagePerSecond();
        hyperdriveRange = getBaseHyperdriveRange();
        shieldStrength = getBaseShieldStrength();
        maneuverability = getBaseManeuverability();
    }
    
    public Shuttle(String starshipName, int baseInventorySlots, double baseDamagePerSecond, double baseHyperdriveRange, double baseShieldStrength,
                  double baseManeuverability, double damagePerSecondBonus, double hyperdriveRangeBonus, double shieldStrengthBonus, double maneuverabilityBonus)
    {
        super(starshipName, baseInventorySlots, baseDamagePerSecond, 
              baseHyperdriveRange, baseShieldStrength, baseManeuverability);
        this.damagePerSecondBonus = damagePerSecondBonus;
        this.hyperdriveRangeBonus = hyperdriveRangeBonus;
        this.shieldStrengthBonus = shieldStrengthBonus;
        this.maneuverabilityBonus = maneuverabilityBonus;
        damagePerSecond = baseDamagePerSecond * (1 + (damagePerSecondBonus / 100));
        hyperdriveRange = getBaseHyperdriveRange() * (1 + (hyperdriveRangeBonus / 100));
        shieldStrength = getBaseShieldStrength() * (1 + (shieldStrengthBonus / 100));
        maneuverability = baseManeuverability * (1 + (maneuverabilityBonus / 100));
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
               "\nDamage Per Second Bonus: " + damagePerSecondBonus + "%" +
               "\nHyperdrive Range Bonus: " + hyperdriveRangeBonus + "%" +
               "\nShield Strength Bonus: " + shieldStrengthBonus + "%" +
               "\nManeuverability Bonus: " + maneuverabilityBonus + "%" +
               "\nDamage Per Second: " + damagePerSecond + 
               "\nHyperdrive Range: " + hyperdriveRange + 
               "\nShield Strength: " + shieldStrength + 
               "\nManeuverability: " + maneuverability;
    }
}
