abstract class vehicle {
    private String marka;
    public vehicle(String marka) {
        this.marka = marka;
    }
    public String getMarka() {
        return marka;
    }
    public abstract String getInfo();
}