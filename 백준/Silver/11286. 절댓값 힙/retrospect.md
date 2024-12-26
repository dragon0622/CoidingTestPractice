# 문제 회고

## 접근
stack, queue, deque 같은 자료구조는 비교적 많이 접해서 다른 자료구조에 대해 연습하기위해 문제를 선정했다.
실제로 해당 문제를 풀기위해 공부하면서 알게된점이 많다.

이 파일에서는 문제에 관련된 내용만 기술하고, 알게된 내용은 블로그에 기록한다.

### 시도
PriorityQueue 즉, 우선순위 큐를 사용하고 내부 정렬을 compare() 메소드를 오버라이드해서 구현한다.

```java
PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                if (Math.abs(o1) == Math.abs(o2)){
                    return o1 - o2;
                }
                else{
                    return Math.abs(o1) - Math.abs(o2);
                }
            }
        });
```

우선순위 큐를 해당 문제에 맞는 compare로 선언한다.

#### compare()
override 된 compare 메소드는 아래와 같이 동작한다.

1. 절대 값이 같을 경우 작은 수 먼저
2. 절대 값이 다를 경우 절대값이 작은 수 먼저

위와 같은 규칙으로 우선순위 큐가 내부적으로 정렬된다.

```java
for (int i = 0; i < n; i++) {
            int m = sc.nextInt();

            if (m == 0){
                if (queue.isEmpty()){
                    System.out.println(0);
                }
                else{
                    System.out.println(queue.poll());
                }
            }
            else{
                queue.add(m);
            }
        }
```

이후 문제에서 주어진 방법대로 입력을 처리해 그에 맞는 결과값을 제공한다.

compare 메소드를 오버라이드 하는 과정에 대한 공부 내용은 블로그에 기술한다.
