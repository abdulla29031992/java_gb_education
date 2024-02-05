// package lesson_5;

// import java.util.HashMap;
// import java.util.Map;

// public class pasports 
// {
//     Map<String, String> map = new HashMap<>();
    
//     void add(String pass_number, String last_name)
//     {
//         map.put(pass_number, last_name);
//     }

   
//     public String toString() 
//     {
//         StringBuilder stringBuilder = new StringBuilder();
//         for (String element : map.keySet())
//         {
//             stringBuilder.append(element);
//             stringBuilder.append(" : ");
//             stringBuilder.append(map.get(element));
//             stringBuilder.append("\n");
//         }
//         return stringBuilder.toString();
//     }

//     String Find_by_Name(String last_name)
//     {
//         StringBuilder stringBuilder = new StringBuilder();
//         for (String element : map.keySet())
//         {
//             if (map.get(element) .equals(last_name))
//             {
//                 stringBuilder.append(element);
//                 stringBuilder.append(" : ");
//                 stringBuilder.append(map.get(element));
//                 stringBuilder.append("\n");
//             }
//         }
//         return stringBuilder.toString();
//     }
// }

