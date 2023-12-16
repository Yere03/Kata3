package software.ulpgc.Kata2;

public class Register {
    private final String CpuName;
    private final float Price;
    private final int Cores;
    private final String Category;

    public Register(String cpuName, float price, int cores, String category) {
        CpuName = cpuName;
        Price = price;
        Cores = cores;
        Category = category;
    }

    public String getCpuName() {
        return CpuName;
    }

    public float getPrice() {
        return Price;
    }

    public int getCores() {
        return Cores;
    }

    public String getCategory() {
        return Category;
    }

    @Override
    public String toString() {
        return "Register{" +
                "CpuName='" + CpuName + '\'' +
                ", Price=" + Price +
                ", Cores=" + Cores +
                ", Category='" + Category + '\'' +
                '}';
    }
}
