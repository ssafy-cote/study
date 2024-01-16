n = int(input())
nums = list(map(int, input().split()))
testNum = int(input())
result = 0

nums.sort()
l = 0
r = n-1

while l<r:
    tempSum = nums[l]+nums[r]
    if tempSum == testNum:
        result += 1
        l += 1
        r -= 1
    else:
        if tempSum < testNum:
            l += 1
        else:
            r -= 1
    
print(result)