//9.Implement a class Car that models a car traveling along the x-axis, consuming gas as it moves.
// Provide methods to drive by a given number of miles, to add a given number of gallons to the gas tank,
// and to get the current distance from the origin and fuel level. Specify the fuel efficiency (in miles/gallons)
// in the constructor. Should this be an immutable class? Why or why not?


public class No9 {
    class Car {
        //Класс не immutable, т.к. состояние машины
        //будет изменятся, она потребляет бензин по мере движения.
        private double miles = 0;
        private double gallons = 0;
        private double fuelEfficiency = 0;

        Car(double miles, double gallons, double fuelEfficiency) {
            this.miles = miles;
            this.gallons = gallons;
            this.fuelEfficiency = fuelEfficiency; //эффективность расхода топлива, [мили/галлон]
        }

        Car(double fuelEfficiency) {
            this(0, 0, fuelEfficiency);
        }

        void setMiles(double miles) {
            this.miles = miles;
        }

        double getMiles() {
            return miles;
        }

        void setGallons(double gallons) {
            this.gallons = gallons;
        }

        double getGallons() {
            return gallons;
        }

        void setFuelEfficiency(double fuelEfficiency) {
            this.fuelEfficiency = fuelEfficiency;
        }

        double getFuelEfficiency() {
            return fuelEfficiency;
        }


        //поездка на заданное кол-во миль
        void driveMiles(double dmiles) {
            setMiles(getMiles() + dmiles); //полное кол-во пройденных миль
            setGallons(getGallons() - dmiles / getFuelEfficiency()); //оставшиеся галлоны после поездки
        }

    }

    public static void main(String[] args) {
        Car myCar = new No9().new Car(0, 10, 6); //текущие мили, галлоны, эффективность расхода топлива
        myCar.driveMiles(10); //задать кол-во миль для поездки, по которым рассчитается кол-во оставшихся галлонов, учитывая эффективность (см. формулу в методе)
        System.out.printf("Car's state: %.1f,  %.1f,  %.1f", //f обозначает литералы типа float. Иначе попытается обработать как double
                myCar.getMiles(),
                myCar.getGallons(),
                myCar.getFuelEfficiency());
    }

}