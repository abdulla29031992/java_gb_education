/* 
1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. 
Распечатайте содержимое данного множества.
2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. 
Распечатайте содержимое данного множества.
3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. 
Распечатайте содержимое данного множества.
*/

// import java.util.Arrays;
// import java.util.HashSet;
// import java.util.LinkedHashSet;
// import java.util.Set;
// import java.util.TreeSet;

// public class seminar_6 
// {
//     public static void main(String[] args) 
//     {
//         Integer[] arr = {4, 7, 1, 2, 3, 2, 4, 5, 6, 3};
        
//         Set<Integer> set_1 = new HashSet<>(Arrays.asList(arr));
//         Set<Integer> set_2 = new LinkedHashSet<>(Arrays.asList(arr));
//         Set<Integer> set_3 = new TreeSet<>(Arrays.asList(arr));

//         System.out.println(set_1);
//         System.out.println(set_2);
//         System.out.println(set_3);
//     }
// }


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.

2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных значений 
в данном массиве и верните его в виде числа с плавающей запятой.

Для вычисления процента используйте формулу:
процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
*/

// import java.util.Arrays;
// import java.util.HashSet;
// import java.util.Random;
// import java.util.Set;

// public class seminar_6 
// {
//     public static void main(String[] args) 
//     {
//         Integer[] array = fill(1000, 0, 24);
//         double p = percent(array);
//         System.out.println(p);
//     }
    
//     static Integer[] fill(int count, int start, int end)
//     {
//         Integer[] arr = new Integer[count];
//         Random random = new Random();
//         for (int i = 0; i < count; i++) 
//         {
//             arr[i] = random.nextInt(start, end + 1);
//         }
        
//         return arr;
//     }

//     static double percent(Integer[] arr)
//     {
//         Set<Integer> set = new HashSet<>(Arrays.asList(arr));   // Arrays.asList(arr) из массива сделать коллекцию
//         return set.size() * 100.0 / arr.length;                 // set.size() колличество уникальных элементов
//         // return (double) (set.size() * 100 )/ arr.length;
//     }
// }
