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



////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
а) информационной системой ветеринарной клиники
б) архивом выставки котов
в) информационной системой Театра кошек Ю. Д. Куклачёва
Можно записать в текстовом виде, не обязательно реализовывать в java.
*/


/*
1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно использовать не все придуманные поля и методы. 
Создайте несколько экземпляров этого класса, выведите их в консоль.
2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, 
выводилась его кличка, цвет и возраст (или другие параметры на ваше усмотрение).
*/


/*
1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. 
Поместите в него некоторое количество объектов.
2. Создайте 2 или более котов с одинаковыми параметрами в полях. 
Поместите их во множество. Убедитесь, что все они сохранились во множество.
3. Создайте метод public boolean equals(Object o)
Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. 
То есть, метод должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
4. Создайте метод public int hashCode()
который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать Objects.hash(...))
5. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.
*/

// import java.util.HashSet;
// import java.util.Set;

// public class seminar_6 
// {
//     public static void main(String[] args) 
//     {
//         cat cat_1 = new cat();
//         cat_1.name = "Барсик";
//         cat_1.poroda = "Сфинкс";
//         cat_1.age = 10;
//         cat_1.owner = "Миясат";

//         cat cat_2 = new cat();
//         cat_2.name = "Мурка";
//         cat_2.poroda = "Вислоухий";
//         cat_2.age = 8;
//         cat_2.owner = "Зарият";

//         cat cat_3 = new cat();
//         cat_3.name = "Боцман";
//         cat_3.poroda = "Персидская";
//         cat_3.age = 9;
//         cat_3.owner = "Алия";

//         cat cat_4 = new cat();
//         cat_4.name = "Боцман";
//         cat_4.poroda = "Персидская";
//         cat_4.age = 9;
//         cat_4.owner = "Алия";
        
//         //System.out.println(cat_3);    // println вызывает toString в классе cat
        
//         Set<cat> cats = new HashSet<>();
//         cats.add(cat_1);
//         cats.add(cat_2);
//         cats.add(cat_3);
//         cats.add(cat_4);
        
//         System.out.println(cat_3.equals(cat_4));
        
//         printSet(filterAsAge(cats, 9));

//     }

//     static Set<cat> filterAsAge(Set<cat> cats, int age)
//     {
//         Set<cat> set = new HashSet<>();
//         for (cat cat: cats) 
//         {
//             if (cat.age == age)
//             {
//                 set.add(cat);
//             }
//         }
//         return set;
//     }

//     static void printSet(Set<cat> set)
//     {
//         for (cat cat: set)
//         {
//             System.out.println(cat);
//         }
//     } 
// }