package Vitorosa;

public class WheatField {
    
    private double wheatProduce;
    private double energy;
    private double coalEnergy = 18;
    private double pollutionFactor = 3 ;
    private double naturalEnergy = 16;
    private double airPollution;
    private double pollutionDamage;
    private double resiliency = 70;
    private double energyEfficiency = 0.8;
    // private double split;
    private double damageFactor = 0.012;
    private double health;
    private double totalProduce;

    public double getWheatProduce(double split) {
        wheatProduce = this.getEnergy(split) * this.getHealth(split);
        setDamageFactor(split);
        setResiliency(split);
        totalProduce += wheatProduce;
        return wheatProduce;
    }   

    public double getTotalProduce() {
        return totalProduce;
    }

    public double getEnergy(double split) {
        energy = (coalEnergy * split) + (naturalEnergy * (1-split));
        return energy;
    }

    public double getHealth(double split) {
        health = energyEfficiency - (this.getPollutionDamage(split) * damageFactor);
        return health;
    }

    public double getPollutionDamage(double split) {
        pollutionDamage = this.getAirPollution(split) * (1- resiliency);
        return pollutionDamage;
    }

    public double getAirPollution(double split) {
        airPollution = coalEnergy * split * pollutionFactor;
        return airPollution;
    }


    public void setDamageFactor(double split) {
        this.damageFactor += 0.008 * split;
    }

    public void setResiliency(double split) {
        this.resiliency += 0.02 * (1 -  split);
    }

    public WheatField(){
        this.totalProduce = 0;

    }
}
