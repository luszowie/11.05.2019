import java.util.Objects;

public class Chair {

    private String model;
    private String manufacterd;
    int productionYear;

    public Chair(String model, String manufacterd, int productionYear) {

        this.model = model;
        this.manufacterd = manufacterd;
        this.productionYear = productionYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacterd() {
        return manufacterd;
    }

    public void setManufacterd(String manufacterd) {
        this.manufacterd = manufacterd;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chair chair = (Chair) o;
        return productionYear == chair.productionYear &&
                Objects.equals(model, chair.model) &&
                Objects.equals(manufacterd, chair.manufacterd);
    }

    @Override
    public int hashCode() {
        return 17 * model.hashCode()+ 31 * manufacterd.hashCode() + 7 * productionYear;
    }
}
