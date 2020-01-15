import java.util.*;

interface InterfaceJava8Features {

    //java 8 allows static method in interface
    static void calculate(){
        List list = Arrays.asList("Test1","Test2");

        list.forEach( a -> {
            System.out.println(a);
        });
    }

    //java 8 allows default method in interface
    default void testDefault(){
        System.out.println("This is default implementation");
    }

    static void main(String[] args){
        InterfaceJava8Features.calculate();

    }
}

@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}


public class TestJava8{

    public static void main(String[] args) {
        Converter<String, Integer> converter = (from) ->
            Integer.parseInt(from);

        Integer converted = converter.convert("123");
        System.out.println(converted);    // 123
    }


}
