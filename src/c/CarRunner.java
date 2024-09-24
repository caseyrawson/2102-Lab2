
public class CarRunner {

    public static void main(String[] args) {
        Hybrid aHybrid = new Hybrid();

        double miles = 300;
        aHybrid.setElectricMiles(miles);
        aHybrid.setMilesfromGas(miles);
        aHybrid.setTotalkWh(80.0);
        aHybrid.setGallonsfromGas(15);

        double MPGe = aHybrid.calcMPGe();
        System.out.print("MPGe in fully electric mode:\t\t");
        System.out.println(MPGe);

        double MPG = aHybrid.calcGasMPG();
        System.out.print("MPG in fully gas mode:\t\t\t");
        System.out.println(MPG);

        double average = (MPG + MPGe) / 2;
        System.out.print("Average MPG in half-and-half mode:\t");
        System.out.println(average);

    }

}