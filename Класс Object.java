import java.util.Objects;

public class Module4Theme7Task1 {
       public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5.0, 3.0);
        Rectangle r2 = new Rectangle(5.0, 3.0);
        Rectangle r3 = new Rectangle(4.0, 2.0);
        
        System.out.println(r1.equals(r2)); // true
        System.out.println(r1.equals(r3)); // false
        System.out.println(r1.equals(null)); // false
        System.out.println(r1.equals(r1)); // true
    } 
}

class Rectangle {
    private double width;
    private double height;
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public double getWidth() { return width; }
    public double getHeight() { return height; }
    
    @Override
    public boolean equals(Object obj) {
        // 1. Сравнение с самим собой (рефлексивность)
        if (this == obj) return true;
        
        // 2. Проверка на null (если obj == null, сразу false)
        if (obj == null) return false;
        
        // 3. Проверка совпадения классов (или можно через instanceof,
        //    но тогда нужно учитывать симметричность для наследников)
        if (getClass() != obj.getClass()) return false;
        
        // 4. Приведение типа
        Rectangle other = (Rectangle) obj;
        
        // 5. Сравнение значимых полей
        return Double.compare(this.width, other.width) == 0 &&
               Double.compare(this.height, other.height) == 0;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(width, height);  // всегда переопределять hashCode вместе с equals
    }
    
    @Override
    public String toString() {
        return "Rectangle{" + width + " x " + height + "}";
    }
}
