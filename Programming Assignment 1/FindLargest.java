package largestnumber;

/* 10���� �μ��� �Է��ϰ� ���� ���� ū ���� ��ȯ�Ѵ�. counter, number, largest ���� 
 * �ʱ�ȭ���ְ� ����ڰ� number ������ ���� �Է��ϸ� counter ������ ���� 1�� �����Ѵ�.
 * number ������ �Էµ� ����  ������ �Էµ� ���� ���Ͽ� ū ���� �����.
 * counter�� 10�� �ʰ��ϸ� ���������� number�� ���� ���� largest�� �̵���Ű�� ���� ��ȯ�Ѵ�.*/

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