# Lotto 프로그램
Lotto를 구매하고 뽑은 번호를 출력하는 프로그램

# 요구 사항
- Lotto는 최대 1 ~ 10장 까지 구매가 가능하다.
- 각 Lotto 번호는 중복이 없어야 한다.
- Lotto 번호는 1~45 범위의 정수이다.
- Lotto 한장에 7개의 번호가 입력된다.
- 예외) Lotto 번호가 0인 경우 1~45 값을 자동으로 할당한다.
- Lotto 번호는 '/'로 구분한다.
- Lotto 번호를 다 뽑은 경우 순서대로 출력한다.
[ ] 선택사항) Lotto 번호를 오름차순으로 정렬해서 출력한다.

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

```
[1] Lotto 번호 입력: 3/7/15/32/33/43/45 
[2] Lotto 번호 입력: 1/2/3/10/20/30/40 
[3] Lotto 번호 입력: 5/15/20/25/30/35/45
[4] Lotto 번호 입력: 5/15/20/0/30/35/0
```

### 중복이 있는 경우
```
[1] Lotto 번호 입력: 5/5/10/11/22/23/43/45 
중복은 허용하지 않습니다.
[1] 로또 번호 입력: 
```

### 7개의 숫자가 아닌 경우
```
[1] Lotto 번호 입력: 5/5/10/11/22/23/
7개의 번호를 입력해주세요.
[1] Lotto 번호 입력: 
```

### 형식이 올바르지 않은 경우
```
[1] Lotto 번호 입력: a/123/34/51234/df
입력값이 올바르지 않습니다.
[1] Lotto 번호 입력: a/123@3ㅁㅁ,/!,@
입력값이 올바르지 않습니다.
[1 ]Lotto 번호 입력: 
```

### 로또 번호를 구매 순으로 출력로 출력
```
구매한 Lotto 리스트
[1] 3 7 15 32 33 43 45 
[2] 1 2 3 10 20 30 40 
[3] 5 15 20 25 30 35 45
[4] 5 15 20 7 30 35 13
```

### 로또 번호를 구매 순으로 출력 (오름차순)
```
구매한 Lotto 리스트
[1] 3 7 15 32 33 43 45 
[2] 1 2 3 10 20 30 40 
[3] 5 15 20 25 30 35 45
[4] 5 7 13 15 20 30 35
```


# 정상 출력 예시
```
구매할 Lotto 개수 입력: 4
[1] Lotto 번호 입력: 3/7/15/32/33/43/45 
[2] Lotto 번호 입력: 1/2/3/10/20/30/40 
[3] Lotto 번호 입력: 5/15/20/25/30/35/45
[4] Lotto 번호 입력: 5/15/20/0/30/35/0

구매한 Lotto 리스트
[1] 3 7 15 32 33 43 45 
[2] 1 2 3 10 20 30 40 
[3] 5 15 20 25 30 35 45
[4] 5 7 13 15 20 30 35
```