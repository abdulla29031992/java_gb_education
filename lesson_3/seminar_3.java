// package lesson_3;

// Задача
//Даны следующие строки, сравнить их с помощью == и метода equals) класса
// Object
// String s1 = "hello";
// String s2 = "hello":
// String 53 = s1;
// String
// s4 = "h" + "e" + "1" + "2" + "o";
// String
// s5 = new String ("hello");
// sring s6 = new String(new charl'h', 'e', 'l', 'l', 'o'});


// public class seminar_3 
// {
//     public static void main(String[] args) 
//     {
//         String s1 = "hello";
//         String s2 = "hello";
//         String s3 = s1;
//         String s4 = "h" + "e" + "1" + "2" + "o";
//         String s5 = new String ("hello");
//         String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

//         System.out.println(s1 == s2);
//         System.out.println(s3 == s1);
//         System.out.println(s1 == s4);
//         System.out.println(s1 == s5);
//         System.out.println(s1 == s6);
//         System.out.println(s5 == s6);

//         System.out.println(s5.equals(s6));             // сравнивает по символьно, всегда будет true
//         System.out.println(s5.equalsIgnoreCase(s6));   // не обращает внимани на верхний и нижний регистр
//     }
    
// }


/////////////////////////////////////////////////////////////////////////////////////////////////////////////

// public class seminar_3 
// {
//     public static void main(String[] args) 
//     {
//         int a = 5;
//         List<Integer> list = new ArrayList<>();
//         String s ="hello";
//         test(a, list, s);

//         System.out.println(a);
//         System.out.println(list);
//         System.out.println(s);
//     }

//     static void test(int a, List<Integer>list1, String s)
//     {
//         a++;
//         list1.add(10);
//         s = "bye";
//     }
    
// }


/////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Задача
////Заполнить список десятью случайными числами.
// Отсортировать список методом sort() и вывести его на

// import java.util.ArrayList;
// import java.util.Comparator;
// import java.util.List;
// import java.util.Random;

// public class seminar_3 
// {
//     public static void main(String[] args) 
//     {
//         List<Integer> list = new ArrayList<>();
//         Random random = new Random();
//         for (int i = 0; i < 10; i++) 
//         {
//             list.add(random.nextInt(1, 5));
//         }
//         System.out.println(list);
//         list.sort(null);
//         System.out.println(list);              // сортировка по пустой ссылке
//         list.sort(Comparator.reverseOrder());
//         System.out.println(list);              // сортировка по обратному порядку
//     } 
// }


/////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Задача
// Создать список типа ArrayList
// Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.

// import java.util.ArrayList;
// import java.util.List;

// public class seminar_3 
// {
//     public static void main(String[] args) 
//     {
//         List<Object> list = new ArrayList<>();  
//         list.add(123);
//         list.add(456);
//         list.add("str");
//         list.add(null);
//         list.add(3.14);  

//         for (int i = 0; i < list.size(); i++) 
//         {
//             if (list.get(i) instanceof Integer)              // instanceof проверяет тип данных
//             {
//                 list.remove(i--);
//             }          
//         }
        
//        System.out.println(list);
//     }    
// }


/////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Задача
//Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>› так, 
//что на О-й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг.
// Напишите метод для заполнения данной структуры.

/* 
[ "Сказка","Золотой ключик", "Репка"],
[ "Роман","Мастер и Маргарита", "Война и Мир"],
["Фентези", "Гарри Поттер", "Ночной дозор"]
*/

// import java.util.ArrayList;
// import java.util.List;

// public class seminar_3 
// {
//     public static void main(String[] args) 
//     {
//         List<List<String>> shop_Book = new ArrayList<>();

//         add_book(shop_Book, "Сказка", "Золотой ключик", null, null);
//         add_book(shop_Book, "Роман", "Мастер и Маргарита", null, null);
//         add_book(shop_Book, "Сказка", "Репка", null, null);
//         add_book(shop_Book, "Фэнтези", "Гарри Поттер", null, null);
//         add_book(shop_Book, "Роман", "Война и Мир", null, null);
//         add_book(shop_Book, "Фэнтези", "Ночной дозор", null, null);

//         System.out.println(shop_Book);
//     }
//     private static void add_book (List<List<String>> shop_book, String genre, String name_book, String name_book2, String string)
//         {
//             for (int i = 0; i < shop_book.size(); i++) 
//             {
//                 List<String> bookshelf = shop_book.get(i);
//                 if (bookshelf.get(0).equals(genre))
//                 {
//                     bookshelf.add(name_book);
//                     return;
//                 }
//             }
//             List<String> new_bookshelf = new ArrayList<>();
//             new_bookshelf.add(genre);
//             new_bookshelf.add(name_book);
//             shop_book.add(new_bookshelf);

//         }    
// }





