TASK 1:

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many numbers? ");
        int n = scan.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Reversed array:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        scann.close();
    }
}


TASK 2:


String name="Shanjitha";
        int n =name.length();
        int count1=0;
        int count2=0;
         for(int i=0;i<n;i++)
         {
                System.out.println(name.charAt(i));
                 if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o' ||name.charAt(i)=='u' ){
                     count1++;
                 }
                  if(name.charAt(i)!='a' && name.charAt(i)!='e'&& name.charAt(i)!='i'&& name.charAt(i)!='o'&& name.charAt(i)!='u' )
                 {
                    count2++;
                 }
         }
         System.out.println("COUNTS:" + count1);
          System.out.println("COUNTS:" + count2);        
    }
}


TASK 3:

class Main {
    public static void main(String[] args) {
     String str ="I love Zoho";
     String str1[] =str.split(" ");
     System.out.println(str1[2]);  
    }
}

     
