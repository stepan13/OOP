public class HotWater extends Water {
    private Integer temperature;

    public HotWater(String name, Double price, int volume, int temperature) {
        super(name, price, volume);
        this.temperature = temperature;
    }

    public Integer getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return String.format("name: %s vol: %d temp %d",getName(),getVolume(), getTemperature());
    }
}
