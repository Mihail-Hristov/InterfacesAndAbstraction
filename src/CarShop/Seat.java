package CarShop;

public class Seat extends CarImp implements Sellable{
    private Double price;

    public Seat(String model, String color, Integer horsePower, String countryProduced, Double price) {
        super(model, color, horsePower, countryProduced);
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return String.format("%s sells for %.2f", super.getModel(), this.getPrice());
    }

}
