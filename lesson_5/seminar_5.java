// package lesson_5;

// Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
// 123456 Иванов 
// 321456 Васильев 
// 234561 Петрова 
// 234432 Иванов 
// 654321 Петрова 
// 345678 Иванов
// Вывести данные по сотрудникам с фамилией Иванов.


// public class seminar_5 
// {
//     public static void main(String[] args) 
//     {
//         pasports pasports = new pasports();
//         pasports.add("123456", "Иванов");
//         pasports.add("321456", "Васильев ");
//         pasports.add("234561", "Петрова ");
//         pasports.add("234432", "Иванов ");
//         pasports.add("654321", "Петрова ");
//         pasports.add("345678", "Иванов");

//         System.out.println(pasports);
//         System.out.println(pasports.Find_by_Name("Иванов"));
//     }
// }


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет. 
// Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом:
// 1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
// 2. буква может не меняться, а остаться такой же. (Например, note - code)
// Пример 1:
// Input: s = "foo", t = "bar" Output: false
// Пример 2:
// Input: s = "paper", t = "title" Output: true

// import java.util.HashMap;
// import java.util.Map;

// public class seminar_5 
// {
//     public static void main(String[] args) 
//     {
//         System.out.println(isIsomorphic("add", "egg"));
//         System.out.println(isIsomorphic("note", "code"));
//         System.out.println(isIsomorphic("paper", "title"));
//         System.out.println(isIsomorphic("foo", "bar"));
//         System.out.println(isIsomorphic("bar", "foo"));
//     }

//     static boolean isIsomorphic(String s_1, String s_2)
//     {
//         if (s_1.length() != s_2.length())
//         {
//             return false;
//         }

//         Map<Character, Character> map = new HashMap<>();
//         for (int i = 0; i < s_1.length(); i++) 
//         {
//             if (map.containsKey(s_1.charAt(i)))
//             {
//                 if (s_2.charAt(i) != map.get(s_1.charAt(i)))
//                 {
//                     return false;
//                 }
//             }
//             else
//             {
//                 if (map.containsValue(s_2.charAt(i)))
//                 {
//                     return false;
//                 }
//                 map.put(s_1.charAt(i), s_2.charAt(i));   // s_1-ключ  s_2-значение
//             }
//         }
//         return true;
//     }   
// }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

/* 
Написать программу, определяющую правильность расстановки скобок в выражении. Пример 1: a+(d*3) - истина
Пример 2: [a+(1*3) - ложь
Пример 3: [6+(3*3)] - истина
Пример 4: {a}[+]{(d*3)} - истина Пример 5: <{a}+{(d*3)}> - истина Пример 6: {a+]}{(d*3)} - ложь
*/

// import java.util.Stack;

// public class seminar_5 
// {
//     public static void main(String[] args) 
//     {
//         System.out.println(checkBrackets("[a+(1*3)"));
//         System.out.println(checkBrackets("[6+(3*3)]"));
//         System.out.println(checkBrackets("{a}[+]{(d*3)}"));
        
//     }

//     static boolean checkBrackets(String str)
//     {
//         Stack<Character> stack = new Stack<>();
//         for (Character s : str.toCharArray()) 
//         {
//             if (s == '(') 
//             {
//                 stack.add(s);
//             }
//             else if (s == ')')
//             {
//                 if (stack.pop() != '(')
//                 {
//                     return false;
//                 }
                
//             }
//         }
//         return true;
//     } 
// }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Взять набор строк, например,

// Мороз и солнце день чудесный
// Еще ты дремлешь друг прелестный
// Пора красавица проснись.

// Написать метод, который осортирует эти слова по длине с помощью ТееМар.
// Слова с одинаковой длиной не должны

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Map;
// import java.util.TreeMap;

// public class seminar_5 
// {
//     public static void main(String[] args) 
//     {
//         String s =  "Мороз и солнце день чудесный\n" +
//                     "Еще ты дремлешь друг прелестный\n" +
//                     "Пора красавица проснись."; 
        
//         sort_by_length(s);
//     }
    
//     static void sort_by_length(String s)
//     {
//         Map<Integer, List<String>> treeMap = new TreeMap<>();
        
//         s = s.replace(" . ", " ");
//         s = s.replace("\n", "");
//         String[] words = s.split(" ");

//         for (String word: words)
//         {
//             int len = word.length();
//             if (treeMap.containsKey(len))
//             {
//                 List<String> list = treeMap.get(len);
//                 list.add(word);
//             }
//             else
//             {
//                 List<String> list = new ArrayList<>();
//                 list.add(word);
//                 treeMap.put(len, list);
//             }
//         }
//         System.out.println(treeMap);
//     }
// }