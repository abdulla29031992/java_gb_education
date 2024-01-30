package lesson_4;

// Замерьте время, за которое в ArrayList добавятся 10000 элементов.
// Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.

// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.List;

// public class seminar_4 
// {
//     public static void main(String[] args) 
//     {
//         List<Integer> list1 = new ArrayList<>();
//         List<Integer> list2 = new LinkedList<>();

//         test(list1);
//         test(list2);

//         test2(list1);
//         test2(list2);
//     }

//     private static void test(List<Integer> list) 
//     {
//         long timeStart = System.currentTimeMillis();
//         for (int i = 0; i < 10000000; i++) 
//         {
//             list.add(i);
//         }
//         long timeFinish = System.currentTimeMillis();
//         System.out.println(list.getClass().getSimpleName() + ": " + (timeFinish - timeStart));
//     }

//     static void test2(List<Integer> list)
//     {
//         long sum = 0;
//         long timeStart = System.currentTimeMillis();
//         for (Integer integer : list) {
//             sum += integer;
//         }
//         long timeFinish = System.currentTimeMillis();
//         System.out.println(list.getClass().getSimpleName() + ": " + (timeFinish - timeStart));
//     }
// }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Принимает от пользователя строку вида text~num
// Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
// Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.

// import java.util.LinkedList;
// import java.util.List;
// import java.util.Scanner;


// public class seminar_4 
// {
//     public static void main(String[] args) 
    //{
    //     Scanner scanner = new Scanner(System.in);
    //     List<String> list = new LinkedList<>();
    //     boolean work = true;

    //     while (work) 
    //     {
    //         System.out.println("Введите строку вида print~num"); 
    //         String line = scanner.nextLine();
    //         String[] arr  = line.split("~");
    //         String text = arr[0];
    //         int num = Integer.parseInt(arr[1]);
            
    //         switch (text) 
    //         {
    //             case "print":
    //             System.out.println(list.remove(num));
    //                 break;
    //             case "end":
    //                 work = false;
    //                 break;
    //             default:
    //                 list.add(num, text);
    //         }
    //     }
    // }
    
// }


/////////////////////////////////////////////////////////////////////////////////////////////////////////////

// реализовать консольное приложение, котрое:
// принимпет от пользователя и запоминает строки
// если введено print, выводит строки так, чтобы последняя введеная была первой в списке, а первая - последней
// если введено revent, удаляет предыдущую введеную строку из памяти

// import java.util.LinkedList;
// import java.util.Scanner;

// public class seminar_4 
// {
//     public static void main(String[] args) 
//     {
//         Scanner scanner = new Scanner(System.in);
//         LinkedList<String> list = new LinkedList<>();
//         boolean flag = true;

//         while (flag)
         
//         {
//             String text = scanner.nextLine();
            
//             switch (text) {
//                 case "print":
//                     for (int i = list.size() - 1; i >= 0; i--) 
//                     {
//                         System.out.println(list.get(i));    
//                     }
//                     break;
//                 case "revent":
//                     list.remove(list.size() - 1);
//                     break;
//                 case "end":
//                     flag = false;
//                     break;
//                 default:
//                     list.add(text);
//                     break;
//             }
//         }
//     }
    
// }