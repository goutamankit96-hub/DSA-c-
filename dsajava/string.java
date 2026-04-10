// public class Main
// {
//     public static void main(String[] args){
//         String str1 = "hello";
//         String str2 = new String("hi");
//         System.out.println(str1);
//         System.out.println(str2);
//         System.out.println(str1.length());
//         System.out.println(str1.subString(0,2));
//         System.out.println(str1.replace('1','2'));
//             System.out.println(str1.toUppercase());
//             System.out.println(str1.toLowercase());
//             System.out.println(str1.charAt(2));
//             System.out.println(str1.equals(str2));
//             System.out.println(str1.contains("world"));
//             String rev = "";
//             for(int i =str1.length()-1;i>=0;i--)
//     {
//         rev rev + str1.charAt(i);
//     }
//     System.out.println(rev);
//     if(str1.equals(rev))
//     { 
//         System.out.println("palindrame");
//     }
//     else{
//         System.out.println("not palindrome");
//     }

     
//     }
// }
// import java.util.Array;
// public class Main
// {
//     public static void main(String[] args){
//         String str1 = "silent";
//         String str2 = "listen";
//         char[] a = str1.toCharArray();
//         char[] b = str2.toCharArray();

//         Arrays.sort(a);
//         Arrays.sort(b);

//         if(Arrays.equals(a,b))
//         {
//             System.out.println("Anagram");
//         }
//         else{
//             System.out.println("not Anagram");
//         }

//     }
// }        
// public class string
// {
//     public static void main(String[] args){
//         String str1 = "abc";
//         int count = 0;
//         for (int i=0; i<str1.length(); i++){
//             for (int j=i; j<str1.length(); j++){
//                 if(str1.charAt(i) == str1.charAt(j)){
//                     count++;
//                 }
//             }
//         }
//         System.out.println(count);


        
//     }
// }
// public class recursion
// {
//     public static void main(String[] args){
//         String str1 = "abc";
//         char remove ='a';
//         String result ="";
//         for(int i = 0; i<str1.length(); i++){
//             if(str1.charAt(i) != remove)
//             {
//                 result += str1.charAt(i);
//             }
//         }
//         System.out.println(result);
//     }
// }
// public class recursion
// {
//     public static void main(String[] args){
//         String str1 = "a3bb4c9d1e6";
//         char max = '0';
//         for(int i=0; i<str1.length(); i++){
//             char ch =str1.charAt(i);
//             if(ch >= '0' && ch<= '9' && ch > max){
//                 max = ch;
//             }
//         }
//         System.out.println(max);
//     }
// }
// public class recursion
// {
//     public static void main(String[] args){
//         String str1 = "aabbbccdaaeff";
//         String result = "";
//         result += str1.charat(0);
//         for(int i=0; i<str1.length(); i++){
//             if(str1.charAt(i) != str1.charAt(i-1)){
//                 result += str1.charAt(i);
//             }
//         }
//         System.out.println(result);
//     }
// }
// public class recursion
// {
//     public static void main(String[] args){
//         String str1 = "12";
//         String str2 ="3";
//         int num1 = 0;
//         int num2 = 0;
//         for(int i=0; i<str1.length(); i++){
//             num1 = num1 * 10 + (str1.charAt(i) - '0');
//         }  
//         for (int i=0; i< str2.length(); i++){
//             num2 = num2 * 10 + (str2.charAt(i) - '0');
//         }
//         System.out.println(num1 * num2);


//     }
// }
// public class recursion
// {
//     public static void main(String[] args){
//         String str1 = "129879";
//         boolean isNum = "true";
//         for(int i=0; i<str1.length(); i++){
//             if(str1.charAt(i) < '0' || str1.charAt(i) > '9'){
//                 isNum = false;
//             }
//         }
//         System.out.println(isNum);

//     }
// }
            
