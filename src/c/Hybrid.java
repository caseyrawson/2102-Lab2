public class Hybrid implements ElectricInterface, GasolineInterface {

    private double gasMPG;
    private double MpgE;
    private double miles;
    private double gallons;
    private double kWh;
    private double cpg;
    private double cpk;

    private final double MPG_E = 33.7;

    public double calcGasMPG() {
        gasMPG = miles/gallons;
        return gasMPG;
    }

    public double calcMPGe() {
        MpgE = (miles/kWh) * MPG_E;
        return  MpgE;
    }

    public void setMilesfromGas(double miles) {
        this.miles = miles;
    }

    public void setGallonsfromGas(double gallons) {
        this.gallons = gallons;
    }

    public void setElectricMiles(double totalElectricMiles) {
        miles =  totalElectricMiles;
    }

    public void setTotalkWh(double totalkWh) {
        kWh = totalkWh;
    }

    public void setCostPerGallon(double costpg) {
        cpg = costpg;
    }
    public double getCostPerGallon() {
        return cpg;
    }

    public void setCostPerKWH(double costpkwh) {
        cpk = costpkwh;
    }
    public double getCostPerKWH() {
        return cpk;
    }
}
