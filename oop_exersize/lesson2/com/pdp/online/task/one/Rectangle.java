package oop_exersize.lesson2.com.pdp.online.task.one;

public class Rectangle {
    private int width;
    private int height;
    private int result;
    public void setHeight(int height) {
        this.height = height;
    }
    public void setResult(int result) {
        this.result = result;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public int getResult() {
        return result;
    }
    public int getWidth() {
        return width;
    }
    public void calcResult(){
        result = height+width;
    }

    @Override
    public String toString() {
        return width+" * "+height+" = "+result;
    }
}
