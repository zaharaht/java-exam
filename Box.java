public class Box {
    private float width;

    public Box(float width) {
        this.width = width;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public static void main(String[] args) {
        Box myBox = new Box(5.0f);

        float currentWidth = myBox.getWidth();
        System.out.println("Current width of the box: " + currentWidth);

        float newWidth = 7.5f;
        myBox.setWidth(newWidth);

        float updatedWidth = myBox.getWidth();
        System.out.println("Updated width of the box: " + updatedWidth);
    }
}
