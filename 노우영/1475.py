"""
6,9 혼용 가능
0 1 2 3 4 5 6 7 8 9 - 1세트에 숫자 10개
0 1 2 3 4 5 6(2) 7 8 // 9제거

방 번호에서 가장 많이 나온 숫자만큼 세트 필요

숫자 10개 담을 배열 생성

방 번호 앞에서부터 하나씩 꺼내서 숫자 담는 배열 인덱스에 갯수 저장

6은 홀수 개만큼 나오면 하나 더 필요
짝수 개만큼 나오면 나누기 2한 만큼

숫자들 중 최댓값이 정답
"""
roomNo = list(map(int,input()))


numbers = [0] * 10

for num in roomNo:
    numbers[num] += 1;

numbers[6] += numbers[9]
numbers[9] = 0

if numbers[6] % 2 == 0:
    numbers[6] = numbers[6] / 2
else:
    numbers[6] = int(numbers[6]/2) + 1

print(int(max(numbers)))


