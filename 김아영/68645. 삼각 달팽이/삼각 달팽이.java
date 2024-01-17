class Solution {
    public int[] solution(int N) {
       
        int triangleMax = 0;
        for(int i = 1; i < N + 1; i++){
            triangleMax += i;
        }
        
        int[][] nums = new int[N][N];
        int flag = 0, row = 0, col = 0, input = 1;

        int[][] delta = {{1, 0}, {0, 1}, {-1, -1}};
        
        for(int i = 0; i < N; i++){
            for(int j = N - 1 - flag; j > -1; j--){
                nums[row][col] = input++;
                
                if(j == 0) flag++;
                row += delta[flag % 3][0];
                col += delta[flag % 3][1];
            }
            
        }
        
        input = 0;
        int[] answer = new int[triangleMax];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(nums[i][j] == 0) break;
                answer[input] = nums[i][j];
                input ++;
            }
        }
        return answer;
    }
}