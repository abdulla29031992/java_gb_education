// Дано четное число N (>0) и символы с1 и с2.
//Написать метод, который вернет строку длины N, которая состоит из чередующихся символов с1 и с2, начиная с с1.
// Ответ: с1с2с1..с2 (всего N

// public class seminar_2 
// {
//     public static void main(String[] args) 
//     {
//         int length = 10;
//         char c_1 = 'a';
//         char c_2 = 'b';
//         System.out.println(Builder(length, c_1, c_2));

//     }
//     static String Builder(int length, char c_1, char c_2)
//     {
//         StringBuilder result = new StringBuilder();
//         for (int i = 0; i < length; i++) 
//         {
//             if (i % 2 == 0)
//             {
//                 result.append(c_1);
//             }
//             else 
//             {
//                 result.append(c_2);
//             }
//         }
//         return result.toString();
//     }
// }


//////////////////////////////////////////////////////////////////////////////////////////////////////////////


//Напишите метод, который сжимает строку.
//Пример: вход aaaabbbcdd.
//Результат: a4b3cd2

// public class seminar_2 
// {
//     public static void main(String[] args) 
//     {
//         String s = "aaaabbbcdd";
//         System.out.println(zip(s));   
//     }
//     static String zip(String s) 
//     {
//         StringBuilder result = new StringBuilder();
//         int count = 1;
//         for (int i = 1; i < s.length(); i++) 
//         {
//             if (s.charAt(i) == s.charAt(i-1))         // charAt - возвращает символ по индексу
//             {
//                 count++;
//             }
//             else
//             {   
//                 result.append(s.charAt(i - 1));
//                 if (count > 1)
//                 {
//                     result.append(count);
//                 }
//                 count = 1;
//             }                      
//         }
//         result.append(s.charAt(s.length() - 1));
//         if (count > 1)
//         {
//             result.append(count);
//         }
//         return result.toString();

//     }
// }


//////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом
// (возвращает boolean значение).

// public class seminar_2 
// {
//     public static void main(String[] args) 
//     {
//         String str = "А роза упала на лапу Азора";
//         System.out.println(polindrom(str));
//     }

//     static boolean polindrom(String s)
//     {
//         s = s.toLowerCase();
//         s = s.replace(" ", "");
//         for (int i = 0; i < s.length() / 2; i++) 
//         {
//              if (s.charAt(i) != s.charAt(s.length() - 1 - i))
//              {
//                 return false;
//              }
//         }
//         return true;
//     }
    
// }


//////////////////////////////////////////////////////////////////////////////////////////////////////////////


// Напишите метод который составит строку, состоящую из 100 повторений слова TEST
// и метод, который запишет эту строку в простой текстовый файл, обработайте исключения.

// import java.io.File;
// import java.io.FileWriter;
// import java.io.IOException;
// import java.util.Scanner;
// import java.util.logging.FileHandler;
// import java.util.logging.Handler;
// import java.util.logging.Logger;
// import java.util.logging.SimpleFormatter;


// public class seminar_2 {
//     static Logger logger = Logger.getAnonymousLogger();

//     public static void main(String[] args) {
//         String s = "test";
//         String filePath = "lesson_2/test.txt";
//         String logPath = "lesson_2/log.txt";
//         int n = 10;

//         createLogger(logPath);

//         String s1 = repeat(s, n);
//         writeToFile(s1, filePath);
//         System.out.println("конец программы");

//         closeLogger();
//     }

//     static void createLogger(String logPath){
//         try {
//             FileHandler fh = new FileHandler(logPath, true);
//             SimpleFormatter simpleFormatter = new SimpleFormatter();
//             fh.setFormatter(simpleFormatter);
//             logger.addHandler(fh);
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }

//     static void closeLogger(){
//         Handler[] handlers = logger.getHandlers();
//         for (Handler handler: handlers){
//             handler.close();
//         }
//     }

//     static void writeToFile(String s, String filePath) {
//         try (FileWriter fileWriter = new FileWriter(filePath, true)){
//             fileWriter.write(s);
//             fileWriter.write("\n");
//             logger.info("запись файла прошла успешна");
//         } catch (IOException e) {
//             logger.warning("не удалось призвести запись файла");
//             e.printStackTrace();
//         }
//     }

//     static String readFile(String filePath){
//         StringBuilder stringBuilder = new StringBuilder();
//         File file = new File(filePath);
//         try (Scanner scanner = new Scanner(file)){
//             while (scanner.hasNext()){
//                 stringBuilder.append(scanner.nextLine());
//             }
//         } catch (IOException e){
//             e.printStackTrace();
//         }
//         return stringBuilder.toString();
//     }

//     static String repeat(String s, int n){
//         StringBuilder sb = new StringBuilder();
//         for (int i = 0; i < n; i++) {
//             sb.append(s);
//             sb.append(" ");
//         }
//         return sb.toString();
//     }
// }


