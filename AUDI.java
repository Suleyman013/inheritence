class Audi extends vehicle {
    private String model;

    // Constructor
    public Audi(String model) {
        super("Audi"); // Avtomobil classının constructorunu çağırır
        this.model = model;
    }

    // Abstract metodun implementasiyası
    @Override
    public String getInfo() {
        return "It is  " + getMarka() + " car, model: " + model;
    }
}