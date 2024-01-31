// package lesson_4;

// import java.util.ArrayDeque;
// import java.util.Arrays;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

// import java.util.ArrayDeque;

// public class home_work_4 
// {
//     public static ArrayDeque<Integer> getReversDeque(int count) {
//         ArrayDeque<Integer> deque = new ArrayDeque<>();
//         ArrayDeque<Integer> reverseDeque = new ArrayDeque<>();

//         for (int i = 0; i < count; i++) {
//             int rand = (int) (Math.random() * (100 - 1));
//             deque.addFirst(rand);
//         }
//         System.out.println(deque);

//         for (int i = 0; i < count; i++) {
//             reverseDeque.addFirst(deque.getFirst());
//             deque.removeFirst();
//         }
//         return reverseDeque;
//     }

//     public static void main(String[] args) {

//         System.out.println(getReversDeque(10));

//     }    
// }


/////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

// import java.util.ArrayDeque;

// public class home_work_4    

// {
//     public static ArrayDeque<Integer> enqueue(ArrayDeque<Integer> linkedList, int element) {
//         linkedList.addLast(element);

//         return linkedList;
//     }

//     public static int dequeue(ArrayDeque<Integer> linkedList) {
//         int firstElement = linkedList.getFirst();
//         linkedList.pollFirst();
//         System.out.println("Очередь после удаления элемента: " + linkedList);

//         return firstElement;
//     }

//     public static int first(ArrayDeque<Integer> linkedList) {
//         return linkedList.getFirst();
//     }

//     public static void main(String[] args) {
//         ArrayDeque<Integer> linkedList = new ArrayDeque<>();
//         for (int i = 0; i < 10; i++) {
//             linkedList.add((int) (Math.random() * (10 - 1)));
//         }
//         int element = 22;
//         System.out.println("Очередь: " + linkedList);
//         System.out.println("Очередь после добавления элемента: " + enqueue(linkedList, element) + "\n"
//                 + "Добавляемый элемент " + element);
//         System.out.println("Удаляемый элемент: " + dequeue(linkedList));
//         System.out.println("Первый элемент: " + first(linkedList));
//     }
    
// }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////

//   Напишите постфиксный калькулятор. 
// Пользователь вводит данные и операции в обратной польской записи. 
// Калькулятор вычисляет результат и проверяет, что в стэке получилось единственное число.

// public class home_work_4 
// {
//     private static boolean isDigit(String s) throws NumberFormatException {
//         try {
//             Integer.parseInt(s);
//             return true;
//         } catch (NumberFormatException e) {
//             return false;
//         }
//     }

//     public static void calculator(String str) {
//         ArrayDeque<Integer> stack = new ArrayDeque<>();
//         String[] newStr = str.split(" ");
//         System.out.println(Arrays.toString(newStr));
//         int result = 0;

//         for (int i = 0; i < newStr.length; i++) {
//             if (isDigit(newStr[i])) {
//                 stack.push(Integer.parseInt(newStr[i]));
//             } else {
//                 switch (newStr[i]) {
//                     case "+":
//                         result = stack.pop() + stack.pop();
//                         stack.push(result);
//                         break;
//                     case "-":
//                         result = stack.pop() - stack.pop();
//                         stack.push(result);
//                         break;
//                     case "*":
//                         result = stack.pop() * stack.pop();
//                         stack.push(result);
//                         break;
//                     case "/":
//                         result = stack.pop() / stack.pop();
//                         stack.push(result);
//                         break;
//                     default:
//                         break;
//                 }
//             }
//         }
//         System.out.println(stack);
//     }

//     public static void main(String[] args) {
//         String str = "1 2 3 * 4 * +";

//         calculator(str);
//     }
    
// }