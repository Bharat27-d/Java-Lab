public class Box {
    private int length, width, height;
    private double dLength, dWidth, dHeight;

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    
    public Box(double dLength, double dWidth, double dHeight) {
        this.dLength = dLength;
        this.dWidth = dWidth;
        this.dHeight = dHeight;
    }

   
    public int getVolumeInt() {
        return length * width * height;
    }

    
    public double getVolumeDouble() {
        return dLength * dWidth * dHeight;
    }

    public static void main(String[] args) {
        Box intBox = new Box(3, 4, 5);
        Box doubleBox = new Box(3.5, 4.5, 5.5);

        System.out.println("Volume of integer box: " + intBox.getVolumeInt());
        System.out.println("Volume of double box: " + doubleBox.getVolumeDouble());
    }
}