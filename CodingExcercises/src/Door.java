

public class Door {
    private TDimension dimension;
    private int no ;

    public Door(TDimension dimension, int no) {
        this.dimension = dimension;
        this.no = no;
    }

    public TDimension getDimension() {
        return dimension;
    }

    public int getNo() {
        return no;
    }
}
