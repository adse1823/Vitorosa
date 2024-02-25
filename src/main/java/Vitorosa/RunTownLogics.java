package Vitorosa;

import java.util.Scanner;

public class RunTownLogics {
    
    public static void main(String[] args) {

        double wheatProduce;
        double energy;
        double coalEnergy = 18;
        double pollutionFactor = 3 ;
        double naturalEnergy = 16;
        double airPollution;
        double pollutionDamage;
        double resiliency;
        double energyEfficiency = 0.8;
        double split;
        double damageFactor = 0.012;
        double health;
        double totalProduce = 0;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter resiliency (0 - 100)");
        resiliency =  scanner.nextInt();
        resiliency = 0.6;

            System.out.println("Enter percent of coal used");
            split = scanner.nextDouble();
            System.out.println();
                split /= 100;
                energy = (coalEnergy * split) + (naturalEnergy * (1 - split));
                airPollution = coalEnergy * split * pollutionFactor;
                pollutionDamage = airPollution * (1 - resiliency);
                health = energyEfficiency - (pollutionDamage * damageFactor);
                wheatProduce = energy * health ;
                damageFactor += 0.008 * split;
                resiliency += 0.02 * (1 - split);
                totalProduce += wheatProduce;
                System.out.println("Produce:\t" + wheatProduce);
                System.out.println("Energy\t" + energy);
                System.out.println("Health\t" + health);
                System.out.println("Energy Efficiency" + energyEfficiency);
                System.out.println("Pollution damage:\t" + pollutionDamage);
                System.out.println("Damage Factor\t" + damageFactor);
                System.out.println("Resiliency\t" + resiliency);
                System.out.println(totalProduce);
                if(wheatProduce < 0){
                    System.out.println("negative produce!!!");
        }

    }
}