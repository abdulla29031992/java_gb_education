package lesson_1;

// import java.util.Arrays;

// Задача №1
/* 
📌 В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
📌 "Доброе утро, <Имя>!", если время от 05:00 до 11:59
📌 "Добрый день, <Имя>!", если время от 12:00 до 17:59;
📌 "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
📌 "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
*/

// import java.time.LocalTime;
// import java.util.Scanner;

// public class seminar_1 
// {
   
//     public static void main(String[] args) 
//     {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("предствьтесь пожалуйста :  ");
//         String name = scanner.nextLine();                       // считывает объект пользователя

//         LocalTime time = LocalTime.now();      // LocalTime.now() покажет текузее время на компьютере
//         int hour = time.getHour();
//         if (hour >= 5 && hour < 12)
//         {
//             System.out.println("Доброе утро" + name + "!");   // конкотинация - складывание строк
// //          System.out.printf("Доброе утро, %s!", name);
//         }
//         else if (hour >= 12 && hour < 18)
//         {
//             System.out.println("Добрый день, " + name + "!");
//         }
//         else if (hour >= 18 && hour < 23)
//         {
//             System.out.println("Добрый вечер, " + name + "!");
//         }
//         else 
//         {
//             System.out.println("Добрый ночи, " + name + "!");
//         }
//     }
    
// }


//////////////////////////////////////////////////////////////////////////////////////////////////

// Задача №2
// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.

// public class seminar_1 
// {
//     public static void main(String[] args) 
//     {
//         int[] array = {1,1,0,1,1,1};
//         int max_count = 0;
//         int count = 0;
//         for (int i = 0; i < array.length; i++) 
//         {
//             if (array[i] == 1) 
//             {
//                 count ++;
//             } 
//                 if (count > max_count)
//                     {
//                         max_count = count; 
//                     }
//             else 
//             {
//                 count = 0;
//             }
//         }
//        System.out.println("Максимаоьное количество идуших подряд единиц =" + max_count);
//     }
     
// }


//////////////////////////////////////////////////////////////////////////////////////////////////


// Задача №3
// Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива
// должны быть отличны от заданного, а остальные - равны ему.

// public class seminar_1 
// {
//     public static void main(String[] args) 
//     {
//         int[] array = {3,2,2,3};
//         int val = 3;
//         int[] result = sort(array, val);
//         System.out.println(Arrays.toString(array));
//         System.out.println(Arrays.toString(result));
//     }

//     public static int[] sort(int[] arr, int val)
//     {
//         int[] arr_1 = new int[arr.length]; 
//         Arrays.fill(arr_1, val);
//         for (int i = 0, j = 0; i < arr.length; i++) 
//         {
//             if (arr[i] != val)
//             {
//                 arr_1[j++] = arr[i];
                
//             }
//         }
//         return arr_1;
//     }
//}


//////////////////////////////////////////////////////////////////////////////////////////////////

// Задача №5
// Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.

// public class seminar_1 
// {
//     public static void main(String[] args)
//     {
//         String s = "Добро пожаловать на курс по Java";
//         String[] arr_s = s.split(" ");
//         String new_s = " ";                    // новая строка куда помещаем новые переменные
//         for (int i = arr_s.length - 1; i >= 0; i--) 
//         {
//             new_s += arr_s[i] + " ";
//         }
//         System.out.println(new_s.trim());   // trim() удаляет лишние пробелы
//     }
    
// }





  
    
  






