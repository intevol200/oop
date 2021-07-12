package largestnumber;

/* 10개의 인수를 입력하고 그중 가장 큰 값을 반환한다. counter, number, largest 값을 
 * 초기화해주고 사용자가 number 변수에 값을 입력하면 counter 변수에 값이 1씩 증가한다.
 * number 변수에 입력된 값은  기존에 입력된 값과 비교하여 큰 수를 남긴다.
 * counter가 10을 초과하면 최종적으로 number에 남은 값을 largest에 이동시키고 값을 반환한다.*/

import java.util.Scanner;

public class FindLargest {
 
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int counter = 1;
        int number;
        int largest = 0;
         
        while (counter <= 10) {
            System.out.printf("Insert number %d: ", counter);
            number = input.nextInt();
                if (number > largest) {
                    largest = number;
                }
            counter++;
        }
         
        System.out.printf("The largest number is: %d\n", largest);
    }
}