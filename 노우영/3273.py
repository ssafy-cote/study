"""
n개 "서로 다른 양의 정수"

이중 for 문으로 풀면 안됨 - 했더니 시간초과

A + B = X (A < B)를 만족하는 숫자쌍 개수

===================================================
5 12 7 10 9 1 2 3 11
13

1. 빈 배열 하나 만들기

2. 숫자 하나씩 넣기
    
3. 넣은 뒤 방금 넣은 숫자와 더했을 때 X가 되는 숫자가 배열에 있는지 확인
    넣은 뒤 확인하는 이유: 방금 넣은 숫자 * 2 = X일 수도 있기 떄문

4. 있으면 카운트 증가

5. 없으면 다음 숫자 넣기

<실패>

n = int(input())
numbers = list(map(int,input().split()))
X = int(input())

count = 0


A = []
for currentNum in numbers:
    A.append(currentNum)
    if X-currentNum in A:
        count += 1
print(count)
"""
"""
풀이 2
A 5 12 7 10 9 1 2 3 11     - 입력받은 배열
B 7 1  6 3 4 12 11 10 2    - X-A값의 배열
C 7 12 10 1 2 3 11         - A와 B의 교집합 배열 -> 쌍의 개수니까 길이/2해야됨

13

입력받은 숫자 배열 A
A 만들면서 X-A 값을 담은 숫자배열 B 생성

A 교집합 B / 2가 정답
"""
n = int(input())
numbers = list(map(int,input().split()))
X = int(input())

count = 0


A = set()
B = set()

for currentNum in numbers:
    A.add(currentNum)
    B.add(X-currentNum)

C = A.intersection(B)
ans = int(len(C)/2)
print(ans)
