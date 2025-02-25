class Audi extends vehicle {
    private String model;
    public Audi(String model) {
        super("Audi"); 
        this.model = model;
    }
    @Override
    public String getInfo() {
        return "It is  " + getMarka() + " car, model: " + model;
    }
}
