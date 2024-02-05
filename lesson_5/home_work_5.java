// package lesson_5;

/*
 * Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что один человек может иметь несколько телефонов.
 */

//  import java.util.ArrayList;
//  import java.util.Comparator;
//  import java.util.HashMap;

// public class home_work_5 
// {
//     public static void main(String[] args) 
//     {
//         Map<String, List<String>> phonBook = new HashMap<>();
//         phonBook.put("Abdulla", List.of("8 926 333 33 33", "8 926 222 22 99"));
//         phonBook.put("Miyasat", List.of("8 926 333 33 55", "8 926 222 22 00"));
//         phonBook.put("Zariyat", List.of("8 926 333 33 66", "8 926 222 22 44"));
//         phonBook.put("Aliya", List.of("8 926 333 33 77", "8 926 222 22 11"));
        
//         menu(phonBook);    
//     }

//     public static String scanner() 
//     {
//         Scanner scanner = new Scanner(System.in);
//         String scan = scanner.nextLine();
//         // scanner.close();
//         return scan;
//     }

//     public static void find(Map<String, List<String>> phonBook) 
//     {
//         System.out.println("Введите имя: ");
//         String name = scanner();
//         System.out.println(phonBook.get(name));
//     }

//     public static void allBook(Map<String, List<String>> phonBook) 
//     {
//         System.out.println(phonBook);
//     }

//     public static Map<String, List<String>> add(Map<String, List<String>> phonBook) 
//     {
//         System.out.println("Если хотите выйте хотите перестать вводить номера введите 'stop'");
//         System.out.println("Введите имя: ");
//         String name = scanner();
//         List<String> number = new ArrayList<>();
//         while (true) 
//         {
//             System.out.println("Введите номер: ");
//             String phon = scanner();
//             if (phon.equals("stop")) 
//             {
//                 break;
//             } else 
//             {
//                 number.add(phon);
//             }
//         }
//         phonBook.put(name, number);

//         return phonBook;
//     }

//     public static Map<String, List<String>> menu(Map<String, List<String>> phonBook) 
//     {
//         System.out.println(
//                 "Введите команду из списка: find - найти контакт, add - добавить контакт, all - показать всю телефонную книгу, exit - выйти");
//         while (true) 
//         {
//             String comands = scanner();
//             if (comands.equals("exit")) 
//             {
//                 break;
//             } 
//             else 
//             {
//                 switch (comands) 
//                 {
//                     case "find":
//                         find(phonBook);
//                         break;
//                     case "add":
//                         add(phonBook);
//                         break;
//                     case "all":
//                         allBook(phonBook);
//                         break;
//                     default:
//                         break;
//                 }
//             }
//         }
//         return phonBook;
//     }  
// }


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
 * Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. 
 * Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
 * Отсортировать по убыванию популярности.
 */

//  import java.util.LinkedHashMap;
//  import java.util.List;
//  import java.util.Map;
//  import java.util.Scanner;
//  import java.util.stream.Collectors;

// public class home_work_5 
// {
//     public static void main(String[] args) 
//     {
//         List<String> workers = List.of("Иван", "Пётр", "Пётр", "Антон", "Антон", "Иван", "Пётр", "Иван", "Пётр", "Иван",
//                 "Пётр", "Иван", "Пётр", "Антон", "Антон");
//         System.out.println(repeat(workers));
//     }

//     public static Map<String, Integer> repeat(List<String> workers) 
//     {
//         Map<String, Integer> repeatNameCount = new LinkedHashMap<>();

//         for (int i = 0; i < workers.size(); i++) 
//         {
//             if (repeatNameCount.containsKey(workers.get(i))) 
//             {
//                 repeatNameCount.put(workers.get(i), repeatNameCount.get(workers.get(i)) + 1);
//             } 
//             else 
//             {
//                 repeatNameCount.put(workers.get(i), 1);
//             }
//         }

//         Map<String, Integer> sortedMap = repeatNameCount.entrySet().stream()
//                 .sorted(Comparator.comparingInt(e -> -e.getValue()))
//                 .collect(Collectors.toMap(
//                         Map.Entry::getKey,
//                         Map.Entry::getValue,
//                         (a, b) -> 
//                         {
//                             throw new AssertionError();
//                         },
//                         LinkedHashMap::new));
//         return sortedMap;
//     }
// }






