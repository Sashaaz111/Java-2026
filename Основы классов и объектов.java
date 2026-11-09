interface Shape {
    int getArea();
}

class Rectangle implements Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    // сеттеры оставлены, так как они имеют смысл для прямоугольника
    public void setWidth(int width) { this.width = width; }
    public void setHeight(int height) { this.height = height; }

    @Override
    public int getArea() { return width * height; }
}

class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    // у квадрата свой сеттер, он не пытается притворяться прямоугольником
    public void setSide(int side) { this.side = side; }

    @Override
    public int getArea() { return side * side; }
}
