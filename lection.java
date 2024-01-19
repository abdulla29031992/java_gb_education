// public class lection {

//     public static void main(String[] args)       # создание программы
//     {

//     }
// }



// использование сниппета 

// public class lection {           
// public static void main(String[] args) {     
//     System.out.println("Goodbye world");      
// }
    
// }



// // использование сниппета sysout 

// public class lection{           
//     public static void main(String[] args) {
//         System.out.println("Goodbye world123");     
//     }
        
//     }
 
//////////////////////////////////////////////////////////////////////////////////////////////////
    
// // типы данных 

// public class lection {           
//     public static void main(String[] args) {
//         String S = " 2";
        
//         System.out.println(S);
//     }
        
// }



// public class lection {
//     public static void main(String[] args)
//     {
//         short age = 10;
//         int salary = 1234;

//         System.out.println(age);
//         System.out.println(salary);
//     }    
// }

//////////////////////////////////////////////////////////////////////////////////////////////////

// // вещественный числа
// // при типе данных типа float необходимо добавить суффикс f
// public class lection {
//     public static void main(String[] args)
//     {
//         float e = 2.7f;
//         double pi = 3.1415;

//         System.out.println(e);
//         System.out.println(pi);
//     }    
// }

//////////////////////////////////////////////////////////////////////////////////////////////////


// // тип данных типа char
// public class lection {
//     public static void main(String[] args)
//     {
//        char ch = '1';   // true
//        System.out.println(Character.isDigit(ch));

//        ch = 'a';      // false
//        System.out.println(Character.isDigit(ch));

//     }    
// }

//////////////////////////////////////////////////////////////////////////////////////////////////

// // тип данных типа boolean
// public class lection {
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

//////////////////////////////////////////////////////////////////////////////////////////////////

// // неявная типизация
// public class lection{
//     public static void main(String[] args)
//     {
//       var a = 123;
//       System.out.println(a);

//       var b = 123.456;
//       System.out.println(b);

//     }    
// }


// public class lection{
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

//////////////////////////////////////////////////////////////////////////////////////////////////

// // классы-обертки
// public class lection {
//     public static void main(String[] args)
//     {
//       int i = 123;
//       System.out.println(Integer.MAX_VALUE);
//       System.out.println(Integer.MIN_VALUE);
//     }    
// }

//////////////////////////////////////////////////////////////////////////////////////////////////

// // операции java
// public class lection {
//     public static void main(String[] args)
//     {
//       int i = 123;
//       i++;
//       System.out.println(i);
//     }    
// }


// // операции java: сравнение
// public class lection {
//     public static void main(String[] args)
//     {
//       boolean f = 123 <= 124;
//       System.out.println(f);
//     }    
// }


// // операции java: побитовые сдвиг
// public class lection {
//     public static void main(String[] args)
//     {
//       int a = 8;
//       System.out.println(a << 1);
//     }    
// }


// // операции java: побитовые операции
// public class lection {
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
// public class lection {
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


// // операции java: побитовые операции сдвиги
// public class lection {
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

//////////////////////////////////////////////////////////////////////////////////////////////////

// // одномерные массивы
// public class lection {
//     public static void main(String[] args)
//     {
//     int[] arr = new int[10];
//     System.out.println(arr.length); 

//     arr = new int[] {1,2,3,4,5};
//     System.out.println(arr.length);
//     }    
// }


// // одномерные массивы : выделение индекса 
// public class lection {
//     public static void main(String[] args)
//     {
//     int[] arr = new int[10];
//     System.out.println(arr[3]); 

//     }    
// }


// // одномерные массивы : присвоение
// public class lection {
//     public static void main(String[] args)
//     {
//     int[] arr = new int[10];
//     arr[3] = 10;
//     System.out.println(arr[3]); 

//     }    
// }

//////////////////////////////////////////////////////////////////////////////////////////////////

// // многомерные массивы
// public class lection {
//     public static void main(String[] args)
//     {
//         int[] arr[] = new int[3][5];
//         for (int[] line : arr) {
//             for (int item : line) {
//                 System.out.printf("%d ",item);
//             }
//             System.out.println();
//         }
//     }

// }


// многомерные массивы : двумерные массивы
// public class lection {
//     public static void main(String[] args)
//     {
//         int[][] arr = new int[3][5];
//         for (int i = 0 ; i < arr.length ; i++) {
//             for (int j = 0 ; j < arr[i].length ; j++) {
//                 System.out.printf(":d", arr[i][j]);
//             }
//             System.out.println();
//         }
// }
// }


//////////////////////////////////////////////////////////////////////////////////////////////////


// преобразование : можно ?

// public class lection {
//     public static void main(String[] args) {
//         int i = 123; double d = i;
//         System.out.println(i);  // 123
//         System.out.println(d);  // 123.0
        
//         d = 3.1415; i = (int)d;
//         System.out.println(d);  // 3.1415
//         System.out.println(i);  // 3
        
//         d = 3.9415; i = (int)d;
//         System.out.println(d);  // 3.9415
//         System.out.println(i);  // 3
        
//         byte b = Byte.parseByte("123");
//         System.out.println(b);  // 123
        
//         b = Byte.parseByte("1234");
//         System.out.println(b);  // NumberFormatException: Value out of range
//     }
// }


//////////////////////////////////////////////////////////////////////////////////////////////////


// получение данных их терминала
// import java.util.Scanner;

// public class lection {
// public static void main (String[] args) {
// Scanner iScanner = new Scanner (System. in) ;
// System.out.printf ("name: ");
// String name = iScanner.nextLine () ;
//  System.out.printf ("Привет, %s!", name);
// iScanner. close () ;
// }
// }

// получение данных их терминала : некоторые примитивы

// import java.util.Scanner;

// public class lection{
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a: ");
//         int x = iScanner.nextInt();
//         System.out.printf("double a: ");
//         double y = iScanner.nextDouble();
//         System.out.printf("%d + %f = %f", x, y, x + y);
//         iScanner.close();
// }}

// получение данных их терминала : проверка на соответствие получаемого типа
// import java.util.Scanner;

// public class lection {
// public static void main(String[] args) {
// Scanner iScanner = new Scanner(System.in);
// System.out.printf("int a: ");
// boolean flag = iScanner.hasNextInt();
// System.out.println(flag);
// int i = iScanner.nextInt();
// System.out.println(i);
// iScanner.close();
// }}


//////////////////////////////////////////////////////////////////////////////////////////////////


// форматированный вывод 
// public class lection{
//     public static void main(String[] args) {
//         int a = 2,  b = 3;
//         int c = a + b;
//         String res = a + "+" + b + "=" + c;
//         System.out.println(res);

//     }
// }


// // форматированный вывод 
// public class lection{
//     public static void main(String[] args) {
//         int a = 2,  b = 3;
//         int c = a + b;
//         String res = String.format("&d +öd = id \n", a, b, c);
//         System.out.printf("%d + %d = %d \n", a, b, c);
//         System.out.println(res);
//      }
// }


//////////////////////////////////////////////////////////////////////////////////////////////////


// виды спецификаторов

// public class lection{
//     public static void main(String[] args) {
//         float pi = 3.1415f;
// System.out.printf("%f\n", pi);    // 3,141500
// System.out.printf("%.2f\n", pi);  // 3,14
// System.out.printf("%.3f\n", pi);  // 3,141
// System.out.printf("%e\n", pi);    // 3,141500e+00
// System.out.printf("%.2e\n", pi);  // 3,14e+00
// System.out.printf("%.3e\n", pi);   // // 3,141e+00

// } }


//////////////////////////////////////////////////////////////////////////////////////////////////


// область видимых переменных


// public class lection {
//     public static void main(String[] args) {
//  {
//  int i = 123;
//             System.out.println(i);
//         }
//         System.out.println(i);  // error: cannot find symbol
//     }
//  }


//////////////////////////////////////////////////////////////////////////////////////////////////


// Функции и методы

// public class lection {
//     static void sayHi() {
//         System.out.println("hi!");
//     }
//     static int sum(int a, int b) {
//         return a+b;
//     }
//     static double factor(int n) {
//         if(n==1)return 1;
//         return n * factor(n-1);
//     }
//     public static void main(String[] args) {
//         sayHi(); // hi!
//         System.out.println(sum(1, 3)); // 4
//         System.out.println(factor(5)); // 120.0
//     }}


//////////////////////////////////////////////////////////////////////////////////////////////////


// Управляющий конструкции

// условный оператор
// public class lection {
//     public static void main(String[] args) 
//     {
//         int a = 1;
//         int b = 2;
//         int c;
//         if (a > b) 
//         {
//         c = a; 
//         } 
//         else 
//         {
// c = b; }
//         System.out.println(c);
//         }
//     }


// условный оператор
// public class lection {
//         public static void main(String[] args) 
//         {
//             int a = 1;
//             int b = 2;
//             int c = 0;
//             if (a > b) c = a;
//             if (b > a) c = b;
//             System.out.println(c);
//         }
//     }


// // тернарный оператор
// public class lection
// {
//     public static void main(String[] args) 
//     {
//     int a = 1;
//     int b = 2;
//     int min = a < b ? a : b;
//     System.out.println(min);
//     } 
// }


//////////////////////////////////////////////////////////////////////////////////////////////////


// оператор выбора

// import java.util.Scanner;

// public class lection 
// {
//     public static void main(String[] args)
//     {
//         int mounth = value;
//         String text = "";
//         switch (mounth) 
//         {
//             case 1:
//             text = "Autumn";
//             break;
        
//             default:
//             text = "mistake";
//             break;
//         }
//             System.out.println(text);
//             iScanner.close();
//         } 
// }


//////////////////////////////////////////////////////////////////////////////////////////////////


// Циклы

// цикл while
// public class lection
// {
//     public static void main(String[] args) 
//     {
//         int value = 321;
//         int count = 0;
//         while (value != 0) 
//     {
//             value /= 10;
//             count++; 
//     }
//         System.out.println(count);
//     }
// }


// цикл do while
// public class lection
// {
//     public static void main(String[] args) 
//     {

//         int value = 321;
//         int count = 0;
//         do 
//     {
//         value /= 10;
//         count++;
//     }              
//         while (value != 0);
//         System.out.println(count);
//     } 
// }


// цикл for
// public class lection
// {
//     public static void main(String[] args) 
//     {
//         int s = 0;
//         for (int i = 1; i <= 10; i++) 
//     {
//         s += i; 
//     }
//         System.out.println(s);
//     }
// }


// вложенные циклы
// public class lection
// {
//     public static void main(String[] args) 
//     {

//         for (int i = 0; i < 5; i++) 
//         {
//             for (int j = 0; j < 5; j++) 
//             {
//                 System.out.print("* ");
//             }
//         }
//             System.out.println();
//     }   
// }


// for работает только для коллекций
// public class lection
// {
//     public static void main(String[] args) 
//     {
//         int arr[] = new int[10];
//         for (int item : arr) 
//         {
//             System.out.printf("%d ", item);
//         }
//         System.out.println();
//     }
// }


//////////////////////////////////////////////////////////////////////////////////////////////////


// Работа с файлами

// Создание и запись\ дозапись
// import java.io.FileWriter;
// import java.io.IOException;

//  public class lection
//  {
//      public static void main(String[] args) 
//      {
//          try (FileWriter fw = new FileWriter("file.txt", false)) 
//          {
//              fw.write("line 1");
//              fw.append('\n');
//              fw.append('2');
//              fw.append('\n');
//              fw.write("line 3");
//              fw.flush();
//          } 
//             catch (IOException ex) 
//             {
//                 System.out.println(ex.getMessage());
//             }
//         }
//  }      


// Чтение, вариант посимвольно
// import java.io.*;

//   public class lection 
//   {
//       public static void main(String[] args) throws Exception 
//       {
//         FileReader fr = new FileReader("file.txt");
//           int c;
          
//         while ((c = fr.read()) != -1)
//             {
//                 char ch = (char) c;
//                 if (ch == '\n') 
//             {
//                 System.out.print(ch);
//             } 
//             else 
//             {
//                 System.out.print(ch);
//             }
//             }
//       }
//   }


// Вариант посрочно
// import java.io.*;

//   public class lection 
//   {
//       public static void main(String[] args) throws Exception 
//       {
//           BufferedReader br = new BufferedReader(new FileReader("file.txt"));
//           String str;
//           while ((str = br.readLine()) != null) 
//             {
//                 System.out.printf("== %s ==\n", str);
//             }
//           br.close();
//       }
// }
