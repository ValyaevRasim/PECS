import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class PECS {
    public static void main(String[] args) {

        // КОВАРИАНТНЫЙ ТИП Producer. Upper Bounded Wildcards
        List<? extends Number> number;

        // присвоить наследников
        number = new ArrayList<Number>();
        number = new ArrayList<Long>();
        number = new ArrayList<Integer>();

        // добавить только null
        number.add(null);

        // читать только предков
        System.out.println(number.get(0));

//***************************

        //КОНТРВАРИАНТНЫЙ тип Consumer. Lower Bounded Wildcards
        List<? super Number> numbers;

        // можем присвоить предков
        numbers = new ArrayList<Object>();
        numbers = new ArrayList<Number>();

        // добавить только потомков и тип самого класса
        numbers.add( new Long(1));
        numbers.add( new Integer(2));
        numbers.add(12);


        // выводить только Object
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(2));
    }
}
