public class Test2 {

    public static void main(String[] args) {

        Double valueOne = Double.valueOf(1.0);
        Double valueTwo = Double.valueOf(2.0);
        
        int hashCode1 = valueOne.hashCode();
        int hashCode2 = valueTwo.hashCode();

        System.out.println(hashCode1);
        System.out.println(hashCode2);

    }

}
