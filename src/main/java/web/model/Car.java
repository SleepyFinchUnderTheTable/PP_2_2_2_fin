package web.model;

public class Car {
    private String model;
    private int releaseYear;
    private int cost;

    public Car(String model, int releaseYear, int cost) {
        this.model = model;
        this.releaseYear = releaseYear;
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public int getReleaseDate() {
        return releaseYear;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", releaseYear=" + releaseYear +
                ", cost=" + cost +
                '}';
    }
}
