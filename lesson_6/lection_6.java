package lesson_6;

// import java.util.HashSet;
// import java.util.Set;

// Set
// public class lection_6 
// {
//     public static void main(String[] args) 
//     {
//         Set< Integer> set = new HashSet<> ();
//         set.add (1); set.add (12); set.add (123) ; set.add (1234) ; set.add (1234) ;
//         System.out.println (set.contains (12)); // true set. add (null);
//         System.out.println(set.size ()); // 5
//         System.out.println(set); // [null, 1, 1234, 123, 121 set. remove (12) ;
//         for (var item: set) System.out.println(item); // null 1 1234 123 set.clear ();
//         System.out.println (set);    
//     }    
// }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// import java.util.Arrays;
// import java.util.HashSet;

// HashSet
// public class lection_6 
// {
//     public static void main(String[] args) 
//     {
//         var a = new HashSet<> (Arrays.asList (1,2,3,4,5, 6,7)) ;
//         var b = new HashSet<> (Arrays.asList (2,3, 5,7, 11,13,17)) ;
//         var u = new HashSet<Integer> (a); u.addAll (b);
//         var r = new HashSet<Integer> (a); r.retainAll (b);
//         var s = new HashSet<Integer>(a);  s.removeAll(b);
//         System.out.println(a); 
//         System.out.println(b); 
//         System.out.println (u);
//         System.out.println (r);
//         System.out.println (s) ;        
//     }    
// }


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// import java.util.Arrays;
// import java.util.HashSet;

// public class lection_6 
// {
//     public static void main(String[] args) 
//     {
//         worker w1 = new worker();
//         w1.first_name = "Имя_1";
//         w1.last_name = "Фамилия_1";
//         w1.salary = 100;
//         w1.id = 1000; 

//         worker w4 = new worker();
//         w4.first_name = "Имя_1";
//         w4.last_name = "Фамилия_1";
//         w4.salary = 100;
//         w4.id = 1000;

//         worker w2 = new worker();
//         w2.first_name = "Имя_2";
//         w2.last_name = "Фамилия_2";
//         w2.salary = 200;
//         w2.id = 2000;

//         worker w3 = new worker();
//         w3.first_name = "Имя_3";
//         w3.last_name = "Фамилия_3";
//         w3.salary = 300;
//         w3.id = 3000;


//         System.out.println(w1.toString());
//         System.out.println(w2);
//         System.out.println(w3);
//         System.out.println(w4);

//         System.out.println(w1 = w4);
//         System.out.println(w1.equals(w4));
//         var workers = new HashSet<worker>(Arrays.asList(w1, w2, w3));
//         System.out.println(workers.contains(w4));

//     }
    
// }