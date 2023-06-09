package Chapter3;

import java.util.Scanner;

public class Code3_4 {

    static int binSearch(int[] a, int n, int key) {
        int p1=0;
        int p2=n-1;

        do{
            int pc=(p1+p2)/2;
            if(a[pc]==key) return pc;
                else if(a[pc]>key) p2 = pc-1;
                else if(a[pc]<key) p1=pc+1;
        }while(p1<=p2);
        return -1;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = stdIn.nextInt();
        int[] x = new int[num];              // 요솟수가 num인 배열

        System.out.println("오름차순으로 입력하세요.");

        System.out.print("x[0]: ");        // 첫 요소 읽력받음
        x[0] = stdIn.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "]: ");
                x[i] = stdIn.nextInt();
            } while (x[i] < x[i - 1]);    // 바로 앞의 요소보다 작으면 다시 입력받음
        }

        System.out.print("검색할 값: ");       // 킷값을 읽어 들임
        int ky = stdIn.nextInt();

        int idx = binSearch(x, num, ky);    // 배열 x에서 값이 ky인 요소를 검색

        if (idx == -1)
            System.out.println("검색 값의 요소가 없습니다.");
        else
            System.out.println("검색 값은 x[" + idx + "]에 있습니다.");
    }
}
