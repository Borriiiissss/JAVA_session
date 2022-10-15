/* Написать программу вычисления n-ого треугольного числа. */

// import java.util.Scanner; 
// public class Program {  
//     public static void main(String[] args) {           
//         Scanner in = new Scanner(System.in);          // ввод числа 
//         System.out.print("Input a number: ");
//         int num = in.nextInt();          
//         System.out.printf("Your number: %d \n", num);
//         in.close();  
//         double result = (double) 0.5 * num * (num + 1); // подсчёт по формуле
//         System.out.println((int)result);                   
//     }
// }

/* Реализовать алгоритм пирамидальной сортировки (HeapSort) */ 

// public class Program 
// {  
//     public static void main(String[] args) 
//     {
//         // создаём и заполняем рандомно массив
//         int arr [] = new int [10];                   
//         for (int m = 0; m < arr.length; m++) 
//         {
//             arr[m] = (int) (Math.random() * 100);
//         }
//         for (int j = 0; j < arr.length; j++) 
//         {
//             System.out.print(arr[j] + " ");
//         }
//         // создаём дерево
//         int n = arr.length;
//         for (int i = n / 2 - 1; i >= 0; i--) 
//         {
//             sortirovka (arr, i, n);            
//         }
//         for (int i = n - 1; i >= 0; i--) 
//         {
//             int tmp = arr[i];
//             arr [i] = arr [0];
//             arr [0] = tmp;
//             sortirovka (arr, 0, i);            
//         }
//         System.out.println();
//         for (int j = 0; j < arr.length; j++) 
//         {
//             System.out.print(arr[j] + " ");
//         }
//     }
//     // функция выбора максимального элемента из трех (среди родителя и потомков) 
//     private static void sortirovka (int [] arr, int i, int n)
//     {
//         int largest_element = i;
//         int left_element = i * 2 +1;
//         int right_element = i * 2 + 2;
        
//         if (left_element < n && arr[left_element] > arr[largest_element])
//             largest_element = left_element;
//         if (right_element < n && arr[right_element] > arr[largest_element])
//             largest_element = right_element;
//         if (i != largest_element)
//         {
//             int temp = arr[i];
//             arr [i] = arr [largest_element];
//             arr [largest_element] = temp;
//             sortirovka(arr, largest_element, n);
//         }
//     }
// }
