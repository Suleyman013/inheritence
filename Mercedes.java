class Mercedes extends vehicle {
    private String model;

    // Constructor
    public Mercedes(String model) {
        super("Mercedes"); 
        this.model = model;
    }
    @Override
    public String getInfo() {
        return "It is  " + getMarka() + " car, model: " + model;
    }
}
