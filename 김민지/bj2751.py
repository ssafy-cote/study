import sys

input = sys.stdin.readline

n = int(input())
nums = list(map(int, input().split()))


result_dp = [0]*n #나중에 max값 잡아줄 dp
result_dp[0] = nums[0]
for i in range(1, n):
    result_dp[i] = max(result_dp[i-1]+nums[i], nums[i])

print(max(result_dp))