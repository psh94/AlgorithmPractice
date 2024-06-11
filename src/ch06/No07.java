package ch06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class No07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr.add(new Point(x, y));
        }
        Collections.sort(arr);
        for (Point o : arr) {
            System.out.println(o.x + " " + o.y);
        }

    }

    static class Point implements Comparable<Point> {
        public int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            // 오름차순
            if (this.x == o.x) {
                return this.y - o.y;
            } else {
                return this.x - o.x;
            }

            // 내림차순
            // if (this.x == o.x) {
            //     return o.y - this.y;
            // } else {
            //     return o.x - this.x;
            // }
        }
    }
}

/*
compareTo를 이용할때 리턴값이 음수이면 오름차순, 양수이면 내림차순으로 정렬된다.
그런데 왜 내림차순에서도 리턴값을 음수로 만들기 위해 o.y - this.y로 해야할까?

정렬 알고리즘의 한 예로 버블정렬 알고리즘을 보자.
---------------------------------------------------
public void bubbleSort(Person[] array) {
    int n = array.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (array[j].compareTo(array[j + 1]) > 0) { // 비교
                // 두 요소의 순서가 잘못되었으므로 교환
                Person temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
        }
    }
}
---------------------------------------------------
여기서 if (array[j].compareTo(array[j + 1]) > 0) 이 부분이 참일때만 버블정렬을 수행하게 할 것이다.
this를 array[j], o를 array[j + 1]로 생각하면 된다.

그런데 compareTo를 사용할때 리턴값이 양수이면 내림차순으로 정렬되므로
array[j].compareTo(array[j + 1]) > 0 이 부분이 참이 되려면 array[j]가 array[j + 1]보다 커야한다.
j번째가 j+1번째보다 더 크다는 것은 오름차순 정렬이 안되었단 의미이므로 교환을 해야한다.

i번째 > i+1번째 이면 내림차순 정렬이 되었다는 것이다.
i번째 < i+1번째 이면 오름차순 정렬이 되었다는 것이다.

즉,
i번째 - i+1번째 > 0 이면 내림차순 정렬이 되었다는 것이다.
i번째 - i+1번째 < 0 이면 오름차순 정렬이 되었다는 것이다.

그런데
오름차순은 앞의 것을 기준으로 뒤의 것을 비교하는 것이고
내림차순은 뒤의 것을 기준으로 앞의 것을 비교하는 것이다.

그래서 내림차순은 i번째 - i+1번째가 아닌 i+1번째 - i번째로 표현해야한다.
즉 o.y - this.y로 표현한 것이다.
 */

