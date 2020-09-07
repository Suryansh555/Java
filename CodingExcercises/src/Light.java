public class Light {
    private String brand;
    private int no;


    public String getBrand() {
        return brand;
    }

    public void light(){
        System.out.println("Light Working At 100 % Intensity");
    }

    public int getNo() {
        return no;
    }

    public Light(String brand, int no) {
        this.brand = brand;
        this.no = no;
    }
}
