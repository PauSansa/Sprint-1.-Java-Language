package n2exercici1;

@Serialitzable(path = "./cotxe2.json")
public class Cotxe {
    @ElementJson
    private String marca;
    @ElementJson
    private String model;
    private final String path;

    public Cotxe(String marca, String model) {
        this.marca = marca;
        this.model = model;
        this.path = "./cotxe.json";
    }

    @Init
    private void init() {
        this.marca = this.marca.substring(0, 1).toUpperCase()
                + this.marca.substring(1);
        this.model = this.model.substring(0, 1).toUpperCase()
                + this.model.substring(1);
    }


}
