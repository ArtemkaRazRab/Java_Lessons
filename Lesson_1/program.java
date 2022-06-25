/**
 * program
 */
// public class program {
//     public static void main(String[] args) {
//         float f = 123.45f;
//         double d = 123.45d;
//         System.out.println(f);
//         System.out.println(d);
//        }
// }

// public class program {
//         public static void main(String[] args) {
//             char ch = '{';
//             System.out.println(ch);
//         }
// }

// public class program {
//     public static void main(String[] args) {
//         int a = 13;
//         double d =a;
//         System.out.println(d);
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         boolean f = true ^ false;
//         System.out.println(f);
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         var i = 123;
//         System.out.println(i);
//     }
// }


// С помощью этого кода можно узнать тип данных
// public class program {
//     public static void main(String[] args) {
//         var a = 123;
//         System.out.println(a);  // 123
//         var d = 123.456;
//         System.out.println(d);  // 123.456
//         System.out.println(getType(a));  // Integer
//         System.out.println(getType(d));  // Double
//         d = 1022;
//         System.out.println(d);  // 1022
//     } 
//     static String getType(Object o){
//         return o.getClass().getSimpleName();
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         int i = 23_123_34; // можно разделять на разряды для наглядности
//         System.out.println(Integer.MAX_VALUE);
//         System.out.println(Integer.MIN_VALUE);
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         boolean f = 123 > 234;
//         System.out.println(f);
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         int a = 5;
//         int b = 2;
//         System.out.println(a | b);
//         // 101
//         // 010
//         // 111
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         int a = 5;
//         int b = 2;
//         System.out.println(a & b);
//         // 101
//         // 010
//         // 000
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         int a = 5;
//         int b = 2;
//         System.out.println(a ^ b);
//         // 101
//         // 010
//         // 111
//     }
// }

// public class program {
//     public static void main(String[] args) {

//         int[] arr = new int[10];
//         System.out.println(arr.length); // 10

//         arr = new int[] { 1, 2, 3, 4, 5 };
//         System.out.println(arr.length); // 5

//     }
// }

// public class program {
//     public static void main(String[] args) {

//         int[] arr = new int[10];
//         System.out.println(arr [3]); // 0
//     }
// }

// public class program {
//     public static void main(String[] args) {

//         int[] arr = new int[10];
//         arr[3] = 13;
//         System.out.println(arr [3]); // 13
//     }
// }

// public class program {
//     public static void main(String[] args) {

//         int[] arr[] = new int[3][5];
//         for (int[] line : arr) {
//             for (int item : line) {
//                 System.out.printf("%d ", item);
//             }
//             System.out.println();
//         }
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         int i = 123; double d = i;
//         System.out.println(i);  // 123
//         System.out.println(d);  // 123.0
//         d = 3.1415; i = (int)d;
//         System.out.println(d);  // 3.1415
//         System.out.println(i);  // 3
//         d = 3.9415; i = (int)d;
//         System.out.println(d);  // 3.9415
//         System.out.println(i);  // 3
//         byte b = Byte.parseByte("123");
//         System.out.println(b);  // 123
//         b = Byte.parseByte("1234");
//         System.out.println(b);  // NumberFormatException: Value out of range
//     }
//  }

// Получение данных из терминала
//  import java.util.Scanner;
//  public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("name: ");
//         String name = iScanner.nextLine();
//         //System.out.printf("Привет, %s!", name);
//         System.out.printf("Привет, %s!\n", name);
//         iScanner.close();
//     }
//  }

// import java.util.Scanner;
// public class program {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a: ");
//         int x = iScanner.nextInt();
//         System.out.printf("double a: ");
//         double y = iScanner.nextDouble();
//         System.out.printf("%d + %f = %f", x, y, x + y);
//         iScanner.close();
// }}

// Проверка на соответствие получаемого типа
// import java.util.Scanner;
// public class program {
//    public static void main(String[] args) {
//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("int a: ");
//        boolean flag = iScanner.hasNextInt();
//        System.out.println(flag);       
//        int i = iScanner.nextInt();
//        System.out.println(i);       
//        iScanner.close();
//    } }

// Форматированный вывод

// public class program {
//     public static void main(String[] args) {
//         int a = 1, b = 2;
//         int c = a + b;
//         String res = a + " + " + b + " = " + c;
//         System.out.println(res);
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         int a = 1, b = 2;
//         int c = a + b;
//         String res = String.format("%d + %d = %d \n", a, b, c);
//         System.out.printf("%d + %d = %d \n", a, b, c);
//         System.out.println(res);
//     }
// }

// Функции и методы

// public class program {
//     static void sayHi() {
//         System.out.println("hi!");
//     }
//     static int sum(int a, int b) {
//         return a+b;
//     }  
//     static double factor(int n) {
//         if(n==1)return 1;
//         return n * factor(n-1);
//     }
//     public static void main(String[] args) {
//         sayHi(); // hi!
//         System.out.println(sum(1, 3)); // 4
//         System.out.println(factor(5)); // 120.0
//     }}

// Условный оператор
// public class program {
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int c;
//         if (a > b) {
//             c = a;
//         } else {
//             c = b;
//         }
//         System.out.println(c);
//     }
// }

// Цикл while

// public class program {
//     public static void main(String[] args) {
//         int value = 321;
//         int count = 0;

//         while (value != 0) {
//             value /= 10;
//             count++;
//         }
//         System.out.println(count);
//     }
// }

// Цикл do while

// public class program {
//     public static void main(String[] args) {
//         int value = 321;
//         int count = 0;

//         do {
//             value /= 10;
//             count++;
//         } while (value != 0);
//         System.out.println(count);
//     }
// }

// public class program {
//     public static void main(String[] args) {
//         for (int i = 0; i < 10; i++){
//             System.out.println(i);
//         }
//     }
// }

// Цикл for

// public class program {
//     public static void main(String[] args) {

//         int s = 0;
//         for (int i = 1; i <= 10; i++) {
//             s += i;
//         }
//         System.out.println(s);
//     }
// }

// Работа с файлами
// import java.io.FileWriter;
// import java.io.IOException;
// public class program {
//     public static void main(String[] args) {
//         try (FileWriter fw = new FileWriter("file.txt", false)) {
//             fw.write("line 1");
//             fw.append('\n');
//             fw.append('2');
//             fw.append('\n');
//             fw.write("line 3");
//             fw.flush();
//         } catch (IOException ex) {
//             System.out.println(ex.getMessage());
//         }
//     } }
