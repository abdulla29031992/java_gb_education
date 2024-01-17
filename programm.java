// public class programm {

//     public static void main(String[] args)       # создание программы
//     {

//     }
// }



// использование сниппета 

// public class programm {           
// public static void main(String[] args) {     
//     System.out.println("Goodbye world");      
// }
    
// }



// // использование сниппета sysout 

// public class programm {           
//     public static void main(String[] args) {
//         System.out.println("Goodbye world123");     
//     }
        
//     }
 

    
// // типы данных 

// public class programm {           
//     public static void main(String[] args) {
//         String S = " 2";
        
//         System.out.println(S);
//     }
        
// }



// public class programm {
//     public static void main(String[] args)
//     {
//         short age = 10;
//         int salary = 1234;

//         System.out.println(age);
//         System.out.println(salary);
//     }    
// }



// // вещественный числа
// // при типе данных типа float необходимо добавить суффикс f
// public class programm {
//     public static void main(String[] args)
//     {
//         float e = 2.7f;
//         double pi = 3.1415;

//         System.out.println(e);
//         System.out.println(pi);
//     }    
// }




// // тип данных типа char
// public class programm {
//     public static void main(String[] args)
//     {
//        char ch = '1';   // true
//        System.out.println(Character.isDigit(ch));

//        ch = 'a';      // false
//        System.out.println(Character.isDigit(ch));

//     }    
// }



// // тип данных типа boolean
// public class programm {
//     public static void main(String[] args)
//     {
//        boolean flag_1 = 123 <= 234;
//        System.out.println(flag_1);

//        boolean flag_2 = 123 >= 234;
//        System.out.println(flag_2);

//        boolean flag_3 = flag_1 ^ flag_2;
//        System.out.println(flag_3);

//     }    
// }


// // неявная типизация
// public class programm {
//     public static void main(String[] args)
//     {
//       var a = 123;
//       System.out.println(a);

//       var b = 123.456;
//       System.out.println(b);

//     }    
// }



// public class programm {
//     public static void main(String[] args) {
//         var a = 123;
//         System.out.println(a);  // 123
//         var d = 123.456;
//         System.out.println(d);  // 123.456
//         System.out.println(getType(a));  // Integer
//         System.out.println(getType(d));  // Double
//         d = 1022;
//         System.out.println(d);  // 1022
//         //d = "mistake";
//         //error: incompatible types:
//         //String cannot be converted to double
//     }
//     static String getType(Object o){
//         return o.getClass().getSimpleName();
//     }
// }



// // классы-обертки
// public class programm {
//     public static void main(String[] args)
//     {
//       int i = 123;
//       System.out.println(Integer.MAX_VALUE);
//       System.out.println(Integer.MIN_VALUE);
//     }    
// }



// // операции java
// public class programm {
//     public static void main(String[] args)
//     {
//       int i = 123;
//       i++;
//       System.out.println(i);
//     }    
// }



// // операции java: сравнение
// public class programm {
//     public static void main(String[] args)
//     {
//       boolean f = 123 <= 124;
//       System.out.println(f);
//     }    
// }



// // операции java: побитовые сдвиг
// public class programm {
//     public static void main(String[] args)
//     {
//       int a = 8;
//       System.out.println(a << 1);
//     }    
// }



// // операции java: побитовые операции
// public class programm {
//     public static void main(String[] args)
//     {
//       int a = 5;
//       int b = 2;
//       System.out.println(a | b);
//       // 101
//       // 010
//       // 111
//     }    
// }


// // операции java: побитовые операции
// public class programm {
//     public static void main(String[] args)
//     {
//       int a = 5;
//       int b = 2;
//       System.out.println(a & b);
//       // 101
//       // 010
//       // 000
//     }    
// }



// // операции java: побитовые операции
// public class programm {
//     public static void main(String[] args)
//     {
//       int a = 5;
//       int b = 2;
//       System.out.println(a ^ b);
//       // 101
//       // 010
//       // 111
//     }    
// }