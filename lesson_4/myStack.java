// package lesson_4;

// public class myStack 
// {
//     private int[] arr = new int[10];
//     private int size = 0;                 //переменная говорит о том сколько элемнтов находится в stack 
    
//     int size()
//     {
//         return size;
//     }

//     boolean empty()                     // показывет является-ли пустой коллекция
//     {
//         return size == 0;
//     }

//     void push(int element)              // позволяет добавлять элементы в stack       
//     {
//         if (size >= arr.length)
//         {
//             int[] arr_2 = new int[arr.length * 2];
//             System.arraycopy(arr, 0, arr_2, 0, arr.length);   // перезаписать элементы из массива arr
//             arr = arr_2;                                                     // в массив arr_2
//         }                                                                    
//         arr[size++] = element;
//     }

//     int peek()                           // позволяет посмотреть элемент на вершине stack, но не удаляеть его
//     {
//         return arr[size - 1];
//     }

//     int pop()                           // позволяет удалить элемент из верхушки stack, и возвращает его
//     {
//         return arr[--size];
//     }                                
// }
