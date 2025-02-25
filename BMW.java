class BMW extends vehicle {
    private String model;

    // Constructor
    public BMW(String model) {
        super("BMW"); // Avtomobil classının constructorunu çağırır
        this.model = model;
    }
    @Override
    public String getInfo() {
        return "It is  " + getMarka() + " car, model: " + model;
    }
}