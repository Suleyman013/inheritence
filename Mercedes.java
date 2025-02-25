class Mercedes extends vehicle {
    private String model;

    // Constructor
    public Mercedes(String model) {
        super("Mercedes"); // Avtomobil classının constructorunu çağırır
        this.model = model;
    }

    // Abstract metodun implementasiyası
    @Override
    public String getInfo() {
        return "It is  " + getMarka() + " car, model: " + model;
    }
}