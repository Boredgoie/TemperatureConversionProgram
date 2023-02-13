
class Main {  //this Main class is entry point of program
    public static void main(String[] args){

        Celsius c = new Celsius(56.0);

        System.out.println(c.getTemperature() + "c=" + c.toFahrenheat() + "f");

        Fahrenheat f = new Fahrenheat(56.0);
        System.out.println(f.getTemperature() + "f=" + f.toCelsius() + "c");

    }
}
class Temperature {  //this class is like a base for both Celsius and Farhenheat
    private double temperature;
    public Temperature(double temperature) {
        this.temperature = temperature;
    }


    public double getTemperature() { // The getTemperature method simply returns the value of the-
        // -temparture instance variable...
        return temperature;
    }
}
// This class extends the Temparture class and It will give a toFahrenheat method
//to convert a temperature in Celsius to Fahrenheit.
class Celsius extends Temperature {
    public Celsius(double temperature) {
        super(temperature);
    }

    public double toFahrenheat() {
        return (getTemperature() * 9 / 5) + 32;
    }
}

// This Fahrenheit class extends the Temperature class It will give a toCelsius method
//to convert a temperature in Fahrenheit to Celsiuss...
class Fahrenheat extends Temperature {
    public Fahrenheat(double temperature) {
        super(temperature);
    }
    public double toCelsius(){
        return (getTemperature() - 32) * 5 / 9;
    }
}


