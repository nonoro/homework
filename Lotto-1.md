# Lotto 프로그램 (난이도 조절)
Lotto를 구매하고 뽑은 번호를 출력하는 프로그램

# 요구 사항
- Lotto는 최대 1 ~ 10장 까지 구매가 가능하다.
- Lotto 번호는 1~45 범위의 정수이다.
- Lotto는 모두 자동이다.
- Lotto 번호를 다 뽑은 경우 순서대로 출력한다.

# 출력 예시

```
구매할 Lotto 개수 입력: 4
```
### 0이하인 경우
```
구매할 Lotto 개수 입력: 0
1 이상 10 이하의 정수를 입력해주세요.
구매할 Lotto 개수 입력:
```

### 10장 초과인 경우
```
구매할 Lotto 개수 입력: 123
1 이상 10 이하의 정수를 입력해주세요.
구매할 Lotto 개수 입력:
```

### 숫자가 아닌 경우
```
구매할 Lotto 개수 입력: A
1 이상 10 이하의 정수를 입력해주세요.
구매할 Lotto 개수 입력: @
1 이상 10 이하의 정수를 입력해주세요.
구매할 Lotto 개수 입력: ㅁㄴㅇ
1 이상 10 이하의 정수를 입력해주세요.
```



### 로또 번호를 구매 순으로 출력로 출력
* 1~45의 숫자로 구성된 로또가 자동으로 출력된다.
```
구매한 Lotto 리스트
[1] 3 7 15 32 33 43 45 
[2] 1 2 3 10 20 30 40 
[3] 5 15 20 25 30 35 45
[4] 5 15 20 7 30 35 13
```


# 정상 출력 예시
```
구매할 Lotto 개수 입력: 4

구매한 Lotto 리스트
[1] 3 7 15 32 33 43 45 
[2] 1 2 3 10 20 30 40 
[3] 5 15 20 25 30 35 45
[4] 5 7 13 15 20 30 35
```