
// public class cat 
// {
//     String name;
//     String poroda;
//     String owner;
//     int age;
 
//     @Override   // переопределение метода
//     public String toString() 
//     {
//         return "name: " + name + ", poroda: " + poroda + ", age: " + age + ", owner: " + owner;
//     }

//     @Override
//     public boolean equals(Object obj) 
//     {
//         if (this == obj)
//         {
//             return true;
//         }

//         if (!(obj instanceof cat))           // instanceof - проверяет тип данных
//         {
//             return false;
//         } 
//         cat cat = (cat) obj;
//         return name.equals(cat.name) && poroda.equals(cat.poroda) && owner.equals(cat.owner) && age == cat.age;        
//     }

//     @Override
//     public int hashCode() 
//     {
//         return name.hashCode() + 7 * poroda.hashCode() + 13 * owner.hashCode() + 17 * age;
//     }
  
// }
