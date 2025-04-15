package exo10;

public class Main {
    public static void main(String[] args) {
        ModeleVehicule bmw = new BMW();
        ModeleVehicule bmwAvecOption1 = new Option1(bmw);
        ModeleVehicule bmwAvecOption1et2 = new Option2(bmwAvecOption1);
        ModeleVehicule bmwToutesOptions = new Option3(bmwAvecOption1et2);

        System.out.println(bmwToutesOptions.cout());
    }
}
