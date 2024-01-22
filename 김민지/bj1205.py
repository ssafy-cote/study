n, s, p = map(int, input().split())
result = -1

if(n>0):
    scores = list(map(int, input().split()))
    scores.append(s) # append

    scores.sort(reverse=True) # 정렬

    if s in scores:
        temp = scores.index(s) # index 찾고
        temp_cnt = scores.count(s) # temp+temp_cnt-1까지 그 수임

        if((temp+temp_cnt-1)<p):
            result = temp+1
        else:
            result = -1

    else: result = -1
else:
    result = 1
print(result)