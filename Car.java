public class Car {
    private String make;
    private String model;
    private double price;
    private String vin;

    public Car(String makeParam, String modelParam, double priceParam, String vinParam) {
        make = makeParam;
        model = modelParam;
        price = priceParam;
        vin = vinParam;
    }

    public String getMake() { 
        return make; 
    }
    
    public String getModel() { 
        return model; 
    }
    
    public double getPrice() { 
        return price; 
    }
    
    public String getVin() { 
        return vin; 
    }
}

