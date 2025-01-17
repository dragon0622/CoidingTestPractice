# 문제 회고

## 접근
슬라이딩 윈도우 방식으로 풀어야되는 문제라고 알고 있었다.

하지만 정확한 내용을 모른체 그냥 미닫이 문처럼 옆으로 넘어가면서 더하면되지 않을까? 하고 접근했다.

### 첫번째 시도
```java
private static void solution(int[] arr, int x) {

        int max = 0;
        int numbers = 0;
        int sum = 0;

        int start = 0;
        int end = x;

        while(end <=arr.length){
            sum = 0;
            for (int i = start; i < end; i++) {
                sum += arr[i];
            }

            if (sum > max){
                max = sum;
                numbers = 1;
            }
            else if(sum == max){
                numbers++;
            }

            start++;
            end++;
        }

```
위와 같이 매개변수로 받는 x값을 유지한채 반복되는 시작점, 끝점을 한칸씩 늘려가며 sum에 더하고 최고값을 새로 갱신하는 방법을 사용했다.

생각보다 수월하게 문제가 풀렸고, numbers 변수를 사용해서 최고점에서 중복되는 값의 개수를 카운트 해주었다. 만약 최고값이 바뀐다면 numbers를 초기화 하면서 풀어봤다.

```java
        if (sum == 0){
            System.out.println("SAD");
        }
        else{
            System.out.println(max + "\n" + numbers);
        }

    }
```
이후 문제의 추가 조건에 따라 조회수가 0일경우 "sad"를 출력, 아니라면 최대값 sum과 중복되는 값인 numbers를 출력했다. 

### 실패
![image](https://github.com/user-attachments/assets/b7dc171c-5310-47b8-bcc8-fb713643730b)

역시 수월하게 풀려서그런지 내가 생각하지못한 시간초과에서 걸려버렸다.

질문 게시판을 찾아봤는데, 여기서 힌트를 얻게 되었다.

> 조회수를 더하는 과정에서 시간을 아낄 수 있는 방법이 있다!

그래서 슬라이딩 윈도우에 대해 더 공부하고 두번째 시도를 하게 되었다!

### 두번째 시도

![image](https://github.com/user-attachments/assets/2d7f279b-6056-480e-9d2f-ed89d4d8e298)


그림에서 볼 수 있듯

덧셈을 하는 과정에서 중복이 일어난다.

예를들어 1부터 10까지 있는 배열에서 9개를 더하는 과정을 수행한다고 하면, 첫번째 1부터 9까지 더할때는 문제가 없지만

start, end를 한칸씩 미뤄서 2부터 10까지 더하는 과정에서 2부터 9까지 더해져있는 값을 또 다시 처음부터 더하는 불필요한 과정이 있었다.

그래서 dump라는 변수에 값을 저장해놓고 배열의 가장 앞값을 빼고 가장 뒷값만 더하는 방법을 생각했다.

이렇게되면 배열의 크기가 엄청 커지더라도 가장 처음 dump를 만드는 과정을 제외하고 모든 구간에서 덧셈한번, 뺄셈한번으로 값을 구할 수 있게된다!

### 성공
```java
while(end < arr.length){

            if (start == 0){
                sum = dump;
            }
            else{
                dump = dump-arr[start-1] + arr[end];
                sum = dump;
            }

            if (sum > max){
                max = sum;
                numbers = 1;
            }
            else if(sum == max){
                numbers++;
            }

            start++;
            end++;
        }
```

dump를 처음 만드는 과정은 start가 0일때만 일어나기때문에 조건을 다음과 같이 주고 문제를 해결했다.

### 추가고민
문제를 해결하고 추가로 시간이나 메모리를 절약할 수 있는 방법에대해 고민해봤다.

while문은 배열을 모두 돌때까지 반복되는데, 이때 start라는 값이 0 인지를 매번 확인하고 else문에 들어가게된다.

start는 맨 처음에만 0이 되는게 보장되기 때문에 조건을 확인하는 이 과정이 두번째 루프부터는 불필요하다고 생각해서 while문 전에 이 과정을 처리하게했고, 마지막 결과를 얻게되었다.

```java
int sum = 0;
        for (int i = 0; i < x; i++) {
            sum += arr[i];
        }

        int start = 0;
        int end = x - 1;

        while (end < arr.length) {
            if (sum > max) {
                max = sum;
                numbers = 1;
            } else if (sum == max) {
                numbers++;
            }

            start++;
            end++;
            if (end < arr.length) {
                sum = sum - arr[start - 1] + arr[end];
            }
        }
```

![image](https://github.com/user-attachments/assets/48b48a0f-f03d-4a2b-b40b-752850702ae2)

결과적으로 모두 정답이지만 성능적으로 더 나은 답안을 제출할 수 있게 되었다.



### 흔적..
![image](https://github.com/user-attachments/assets/87fe5c86-06ab-4ffc-b3c6-9a6d5fe6107d)
