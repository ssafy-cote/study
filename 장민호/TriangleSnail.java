import java.util.Arrays;

public class TriangleSnail {
    public void solution ( int N ) {
        int currStepLine = N;
        int howManyNextLine = N - 1;
        int movementCheck = 0;
        int arrayLength = (N * N+1) / 2;
        double[][] movements = new double[][] {{-0.5, -1},   //left down
                                        {0.5, 0}, // right
                                        {-0.5, 1}};  // left up

        double[][] coordArray = new double[arrayLength][2];
        coordArray[0] = new double[]{0, 0};

        for ( int i = 1; i < coordArray.length; i++ ) {
            if ( currStepLine > i ) {
                for ( int j = 0; j < 2; j++ ) {
                    coordArray[i][j] = coordArray[i - 1][j] + movements[movementCheck % 3][j];
                }
            } else if ( currStepLine == i) {
                movementCheck++;
                currStepLine += howManyNextLine--;
                for ( int j = 0; j < 2; j++ ) {
                    coordArray[i][j] = coordArray[i - 1][j] + movements[movementCheck % 3][j];
                }
            }
        }

        
    }
    

}