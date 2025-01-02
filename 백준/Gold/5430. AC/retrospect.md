# 문제 회고

## 접근

동작은 간단하게 두 동작

1. 배열에 있는 숫자 순서 뒤집기
2. 첫번째 숫자 버리기 (=pop)

### 첫번째 시도
처음 접근은 1차원적으로 문제에서 원하는 두가지 동작을 메소드화하여 구현하려 했다.

또 추가적인 고려사항으로 연속되는 R은 상태 변화가 없이 순서만 바꾸는 효율적이지 않은 동작을 하게 된다고 생각해 최소한의 R을 사용하려했다.

가령 연속되는 R의 개수는 짝수 or 홀수 의 차이로만 동작하지 반복하는 횟수에 대해 결과값의 차이는 존재하지 않는다.

1. reverse
   순서를 뒤집는 R의 경우 아래와 같이 구현했다.
```java
private static void reverseArray(int[] array){

  int n = array.length;
  for(int i = 0; i < n/2; i++){
    int temp = array[i];
    array[i] = array[n-1-i];
    array[n-1-i] = temp;
  }
}
```
2. 두번째 메소드인 delete 연산을 구현하는데 문제가 발생했다.

### 문제 발생
배열은 선언을 할때, 크기가 할당되어 고정된다.

값을 빼는 연산을 해야하는 지금 상황에 배열을 사용하는건 비효율적이라고 생각했다. reverse연산을 계속해서 반복해야할 수 있으니 ..

<hr>

### 두번째 시도
그래서 두번째로 생각한 방법은 deque을 이용한 방법이다.

다시 한번 문제의 핵심이라고 생각했던 부분을 상기해본다.

1. reverse 연산이 가능해야함
2. 반복되는 R에 대해 조금더 효율적이였으면 좋겠음

deque은 head, tail 두 방향 모두 입출력이 가능하다.

이 부분을 boolean 형태의 상태를 컨트롤하면서 reverse 연산처럼 동작하게 할 수 있다.

추가로 boolean의 상태변경만 하면 되므로 2번 고려사항이였던 효율성도 챙길 수 있다.

원래 배열을 직접 뒤바꿨다면, 이제는 pop을 하는 부분을 바꿔 지명하기만 하면 된다.

<br>

input이 친절하지 않고 정규화가 필요해서 위와 같은 작업을 input에 대해 선행해주었다.

정규화 이후 값을 deque에 넣는다.

```java
        arr = arr.replace("[", "").replace("]", "");

        String[] strNumbers = arr.split(",");
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < arrNum; i++) {
            if (!strNumbers[i].trim().isEmpty()) {
                deque.add(Integer.parseInt(strNumbers[i].trim()));
            }
        }
```
<br>

받은 method의 알파벳 별로 두가지의 동작을 준비한다.
1. reverse
2. delete

reverse 동작의 경우 isReversed 의 상태를 변경해준다.

이후 delete 연산이 들어왔을때, isReversed의 상태에 따라 last에서 뺄지, first에서 뺄지를 결정해 동작시킨다.

```java
        boolean isReversed = false;

        for (char c : method.toCharArray()) {
            if (c == 'R') {
                isReversed = !isReversed;
            } else if (c == 'D') {
                if (deque.isEmpty()) {
                    System.out.println("error");
                    return;
                }
                if (isReversed) {
                    deque.removeLast();
                } else {
                    deque.removeFirst();
                }
            }
        }
```
