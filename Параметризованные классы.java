public class Task {
    public static void main(String[] args) {

        Wrapper<String> a = new Wrapper<>();


        System.out.println(a instanceof Wrapper); 
        System.out.println(a instanceof Wrapper<String>); // оба true, не позволяет написать с Wrapper<Short>


        Wrapper<? extends Juice> OrangeJuice1 = new Wrapper<OrangeJuice>(); //OrangeJuice и наследники
        Wrapper<? super AppleJuice> Juices1 = new Wrapper<Juice>(); //Juice или родители
    }
}

class Wrapper<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

class Juice{
    private final double JuiceVolume;

    public Juice(double vol) {
        this.JuiceVolume = vol;
    }

    public double  getVolume() {
        return JuiceVolume;
    }

    public void JuiceType(){
        System.out.println("It's a juice");
    }
}

class OrangeJuice extends Juice{

    OrangeJuice(double vol){
        super(vol);
    }

    @Override
    public void JuiceType(){
        System.out.println("It's an orange juice");
    }
}

class AppleJuice extends Juice{

    AppleJuice(double vol){
        super(vol);
    }

    @Override
    public void JuiceType(){
        System.out.println("It's an apple juice");
    }
}
