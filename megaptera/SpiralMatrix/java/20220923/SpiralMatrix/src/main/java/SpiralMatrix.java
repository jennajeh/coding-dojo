public class SpiralMatrix {
    public static void main(String[] args) {
        SpiralMatrix application = new SpiralMatrix();

        int count = 5;

        int[][] spiralMatrix = application.spiralMatrix(count);

        for (int i = 0; i < count; i += 1) {
            for (int j = 0; j < count; j += 1) {
                System.out.print(spiralMatrix[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }

    private int[][] spiralMatrix(int count) {
        int[][] spiralMatrix = new int[count][count];

        int arrayLength = count;

        int i = -1;
        int j = 0;
        int value = -1;
        int increment = 1;

        for (int k = 0; k < arrayLength; k += 1) {
            i += 1;
            value += 1;
            spiralMatrix[j][i] = value;
        }

        arrayLength -= 1;

        while (arrayLength != 0) {
            for (int k = 0; k < arrayLength; k += 1) {
                value += 1;
                j += increment;
                spiralMatrix[j][i] = value;
            }

            for (int k = 0; k < arrayLength; k += 1) {
                value += 1;
                i -= increment;
                spiralMatrix[j][i] = value;
            }

            arrayLength -= 1;
            increment *= -1;
        }
        return spiralMatrix;
    }
}
