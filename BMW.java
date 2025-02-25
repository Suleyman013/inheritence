class BMW extends vehicle {
    private String model;
    public BMW(String model) {
        super("BMW"); 
        this.model = model;
    }
    @Override
    public String getInfo() {
        return "It is  " + getMarka() + " car, model: " + model;
    }
}
