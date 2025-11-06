public class BoxTest {
    
    public static void main(String[] args) {
        
        Box<String> stringBox = new Box<>();
        stringBox.set("Hola");
        System.out.println(stringBox.get());

        Box<Integer> intBox = new Box<>();
        intBox.set(123);
        System.out.println(intBox.get());
    }

}
