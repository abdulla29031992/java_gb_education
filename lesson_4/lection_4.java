// package lesson_4;

// PriorutyQueue

// import java.util.PriorityQueue;
// public class lection_4 
// {
//     public static void main(String[] args) 
//     {
//         PriorityQueue<Integer> pq = new PriorityQueue<>();
//         pq.add(123);
//         pq.add(13);
//         pq.add(1);
        
//         System.out.println(pq);
//     }
// }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Deque

// import java.util.ArrayDeque;
// import java.util.Deque;

// public class lection_4 
// {
//     public static void main(String[] args) 
//     { 
//         Deque<Integer> deque = new ArrayDeque<>();
//         deque.addFirst(1);   deque.addLast(2);
//         deque.removeLast();  deque.removeLast();
//         deque.offerFirst(1); deque.offerLast(2);
//         deque.pollFirst();   deque.pollLast();
//         deque.getFirst();    deque.getLast();
//         deque.peekFirst();   deque.peekLast();    
//     }
    
// }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Stack

// import java.util.Stack;

// public class lection_4 
// {
//     public static void main(String[] args) 
//     {
//         var exp = "1 2 3 * +".split(" ");
//         int res = 0;
//         System.out.println(exp);
        
//         Stack<Integer> st = new Stack<>();
//         for (int i = 0; i < exp.length; i++) 
//         {
//             if (isDigit(exp[i]))     // isDigit(exp[i]) если текущий элемнет является числом, то добовляем в stack
//             {
//                 st.push(Integer.parseInt(exp[i]));
//             }
//             else
//             {
//                 switch (exp[i]) 
//                 {
//                     case "+":
//                         res = st.pop() + st.pop();
//                         st.push(res);
//                         break;
//                     case "-":
//                         res = -st.pop() + st.pop();
//                         st.push(res);
//                         break;
//                     case "*":
//                         res = st.pop() * st.pop();
//                         st.push(res);
//                         break;
//                     case "/":
//                         res = st.pop() / st.pop();
//                         st.push(res);
//                         break;
//                     default:
//                         break;
//                 }
//             }
//         }
//         System.out.printf("%d\n", st.pop());
//     }

//     private static boolean isDigit(String string) 
//     {
//        return string.matches("\\d");
//     }
  
// }