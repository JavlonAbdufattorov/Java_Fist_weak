public class Clothes {

    private Color color;
    private Size size;

    Clothes(Color color, Size size){
        this.color = color;
        this.size = size;
    }
    public void setColor(Color color) {
        this.color = color;
    }
    public Color getColor() {
        return color;
    }
    public void setSize(Size size) {
        this.size = size;
    }
    public Size getSize() {
        return size;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Color of clothes"+getColor()+" and size " + getSize();
    }
}