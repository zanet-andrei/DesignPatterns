package exo10;

public class Main {
    public static void main(String[] args) {
        ModeleVehicule bmw = new BMW();
        ModeleVehicule bmwAvecOption1 = new VehiculeAvecOption1(bmw);
        ModeleVehicule bmwAvecOption1et2 = new VehiculeAvecOption2(bmwAvecOption1);
        ModeleVehicule bmwToutesOptions = new VehiculeAvecOption3(bmwAvecOption1et2);

        System.out.println(bmwToutesOptions.cout());
    }
}
