package task4;

public class Woman extends Human {

    final int cash = 500;

    public Woman(String name, String city, String hair_color, int height, int weight, Boolean children) {
        this.name = name;
        this.city = city;
        this.height = height;
        this.weight = weight;
        this.children = children;
        this.hair_color = hair_color;
    }

    public Woman() {
        this.name = "unknown";
        this.city = "unknown";
        this.height = 180;
        this.weight = 100;
        this.children = Boolean.FALSE;
    }
}
