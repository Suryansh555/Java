public class TWindow {
    private TDimension tDimension ;
    private int no;

    public TWindow(TDimension tDimension, int no) {
        this.tDimension = tDimension;
        this.no = no;
    }

    public TDimension gettDimension() {
        return tDimension;
    }

    public int getNo() {
        return no;
    }
}
