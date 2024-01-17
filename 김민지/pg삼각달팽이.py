def solution(n):
    answer = []
    grid = [[0]*n for _ in range(n)]
    cnt = 1 # 들어가는 수
    r, c = 0, 0 # 현재 위치
    temp = n # for문 횟수 잡아주는 변수
    
    while temp>0:
        # down
        for i in range(temp):
            grid[r][c] = cnt
            cnt += 1
            r+=1
            
        r-=1
        c+=1
        temp -= 1

        # right
        for i in range(temp):
            grid[r][c] = cnt
            cnt += 1
            c+=1
        temp -= 1
        r-=1
        c-=2
        
        # cross
        for i in range(temp):
            grid[r][c] = cnt
            cnt += 1
            r-=1
            c-=1
        r+=2
        c+=1
        temp -= 1
    for elem in grid:
        for e in elem:
            if e!=0:
                answer.append(e)
    return answer