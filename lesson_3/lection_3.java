package lesson_3;

// // тип данных
// public class lection_3 
// {
//     public static void main(String[] args) 
//     {
//         Object o = 1; GetType(o);    // java.lang.Integer
//         o = 1.2; GetType(o);         // java.lang.Double
//     }
//     static void GetType(Object obj) 
//     {

//         System.out.println(obj.getClass().getName());
//     }
// }

//////////////////////////////////////////////////////////////////////////////////////////////////

// сложение 
// public class lection_3 
// {
//     public static void main(String[] args) 
//     {
//         System.out.println(Sum(1, 2));
//         System.out.println(Sum(1.0, 2)); System.out.println(Sum(1, 2.0));
//         System.out.println(Sum(1.2, 2.1));
//     }
//         static Object Sum(Object a, Object b) 
//         {
//         if (a instanceof Double && b instanceof Double) 
//         {
//         return (Object)((Double) a + (Double) b);
//         } 
//         else if(a instanceof Integer && b instanceof Integer) 
//         {
//         return (Object)((Integer) a + (Integer) b);
//         } 
//         else return 0;
//     } 
    
// }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////

// массивы
// public class lection_3 
// {
//     public static void main(String[] args) 
//     {
//         int[] a = new int[] { 1, 9 };
//         int[] b = new int[3]; System.arraycopy(a, 0, b, 0, a.length);  //копирование из массива a в b
//         for (int i : a) { System.out.printf("%d ", i);}  // 1 9
//         for (int j : b) { System.out.printf("%d ", j);} 
//     }
// }


// public class lection_3 
// {
//     static int[] AddItem(int[] array, int item) 
//     {
//         int length = array.length;
//         int[] temp = new int[length + 1];
//         System.arraycopy(array, 0, temp, 0, length);
//         temp[length] = item;
//         return temp;
//     }
//         public static void main(String[] args) 
//         {
//         int[] a = new int[] { 0, 9 };
//         for (int i : a) { System.out.printf("%d ", i); }
//         a = AddItem(a, 2); a = AddItem(a, 3);
//         for (int j : a) { System.out.printf("%d ", j); }
//         }
// }


/////////////////////////////////////////////////////////////////////////////////////////////////////////////

// коллекции

// import java.util.ArrayList;
// import java.util.List;

// public class lection_3 
// {
//     public static void main(String[] args) 
//     {
//         List list = new ArrayList();
//         list.add(2809);
//         list.add("string line");
//         for (Object o : list) 
//         {
//             System.out.println(o);
//         }        
//     }
// }    


// row type

// import java.util.ArrayList;
// import java.util.List;

// public class lection_3 
// {
//     public static void main(String[] args)
//     {
//         List list = new ArrayList();
//         list.add(2809);
//         list.add("string line");   
//         for (Object o : list)
//         {
//             System.out.println(o);
//         } 
//     }
// }


// save type

// import java.util.ArrayList;
// import java.util.List;

// public class lection_3 
// {
//     public static void main(String[] args) 
//     {
//         List<Integer> list = new ArrayList<Integer>();
//         list.add(1);
//         list.add(123);  
//         for (Object o : list)
//         {
//             System.out.println(o);
//         }    
//     }
// }


// коллекция фунционал

// import java.util.Arrays;
// import java.util.List;

// public class lection_3
// {
//     public static void main(String[] args) 
//     {
//         int day = 29;
//         int month = 3;
//         int year = 1992;    
//         Integer[] date = { day, month, year };
//         List<Integer> d = Arrays.asList(date);
//         System.out.println(d);
//     }
    
// }


// import java.util.Arrays;
// import java.util.List;

// public class lection_3
// {
//     public static void main(String[] args) 
//     {
//         StringBuilder day = new StringBuilder("29");
//         StringBuilder month = new StringBuilder("3");
//         StringBuilder year = new StringBuilder("1992");
//         StringBuilder[] date = { day, month, year };
//         List<StringBuilder> d = Arrays.asList(date);
//         System.out.println(d);    
//     }
    
// }