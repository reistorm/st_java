package Seminar2;

//import java.util.Arrays;
//
//public class First {
//    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder();
//        sb.append(25);
//        System.out.println(sb);
//
////        String name = new String(); так тоже можно создавать сроку
////        name.charAt(0); и вписывать в нее значения
//
//        int[] nums = {1,2,3,4};
//        System.out.println(Arrays.toString(nums)); // обращаемся к классу Array
//        sayHello(name: "Gb");
//    }
//}
//public static void sayHello(String name)
//// <доступ>, <static, если есть>, <возвращаемый тип>, <имя>(принимает в себя текст)

// Рекурсия
//public class First {
//    public static void main(String[] args) {
//        sayHello(0);
//    }
//
//    public static void sayHello(int count) {
//        if (count == 500) {
//            return;
//        }
//        System.out.println("hello" + count + "time");
//        sayHello(count + 1);
//    }
//}


//public class First {
//    public static void main(String[] args) {
//        findPath("Налево", 0);
//    }
//
//    public static void findPath(String path, int count) {
//        if (count == 30) return;
//        System.out.println("сходил" + path);
//        findPath("Налево", count + 1);
//        findPath("Направо", count + 1);
//    }
//}

public class First {
    public static void main(String[] args) {
        findPath(3, 10, 2,2, "");

    }
    // K1 - сложение
// K2 - умножение
    // ниже рекурсивная функция
    public static void findPath(int source, int target, int addend, int multiplier, String path) {
        if (source > target) return;
        if (source == target) {
            System.out.println(path);
            return;
        }
        findPath(source + addend, target, addend, multiplier, path + "K1");
        findPath(source + multiplier, target, addend, multiplier, path + "K2");
        }
}