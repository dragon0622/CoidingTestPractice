# 문제 회고

## 접근
문제는 간단했다. 주어진 숫자의 집합에서 나올 수 있는 6가지의 조합을 모두 출력하면 된다.

개수만 구하는 문제였을 경우 더 간단하지만 모든 수를 출력하는게 핵심이였다.

문제에서는 무조건 6개의 숫자를 출력하는게 목적이므로, 간단하지만,,, 불편하게 for 반복문 6번을 사용해서 코드를 작성했다.

### 시도

```java
for (int i = 0; i < arr.length - 5; i++) {
                for (int j = i + 1; j < arr.length - 4; j++) {
                    for (int k = j + 1; k < arr.length - 3; k++) {
                        for (int l = k + 1; l < arr.length - 2; l++) {
                            for (int m = l + 1; m < arr.length - 1; m++) {
                                for (int n = m + 1; n < arr.length; n++) {
                                    combinations.add(new int[]{arr[i], arr[j], arr[k], arr[l], arr[m], arr[n]});
                                }
                            }
                        }
                    }
                }
            }
```

combinations 라는 배열형태의 List를 사용해서 경우의 수들을 배열로 저장하고, 반복문이 끝나면 출력한다.

### 두번째 접근
for문을 여러번 반복하기 싫다면 재귀를 사용하면 된다.

두번재 자바 파일에는 재귀를 통해 푼 과정을 기록해놨다.

```java
private static void generateCombinations(int[] arr, int r, int index, int[] current, int start, List<int[]> combinations) {
        if (index == r) {
            combinations.add(current.clone());
            return;
        }

        for (int i = start; i < arr.length; i++) {
            current[index] = arr[i];
            generateCombinations(arr, r, index + 1, current, i + 1, combinations); // 다음 값 선택
        }
    }
```

두번째 코드파일의 메소드 부분이다. 해당 메소드를 반복하면서 재귀를 통해 값을 combinations에 저장한다.

### 뭐가 더 나은 방법인지?
성능차이가 뚜렷하지는 않았다.

코드 길이가 짧아서 메모리는 재귀가 더 성능이 좋았지만, 속도 측면에서는 for문을 도는게 더 빨랐다.

장단이 확실한 것 같은데, for의 경우 재귀보다는 코드레벨에서 알아보기가 더 편하다는 장점이 있다.

반대로 6개의 숫자를 고른다는 가정없이 가변적인 개수의 값을 뽑아야할 경우 재귀함수가 훨씬 간편하다.

for문은 뽑아야하는 개수만큼 for를 따로 수정하는 과정이 필요하므로 재귀함수가 더 성능이 좋은것 같다.
