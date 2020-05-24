import java.util.Arrays;

interface MyMatrix {
    void populate();
    void toConsole();
}

class BellMatrix implements MyMatrix {
    private Integer[][] matrix;
    private Integer row;

    BellMatrix(Integer row) {
        this.row = row;
        matrix = new Integer[row][row];
        this.populate();
    }

    @Override
    public void populate() {
        for(int i = 0; i < this.row; i++)
            for(int j = 0; j < this.row; j++)
                this.matrix[i][j] = 0;
        this.matrix[0][0] = this.matrix[1][0] = 1;
        for(int i = 1; i < this.row; i++) {
            this.matrix[i][0] = this.matrix[i - 1][i - 1];
            for (int j = 0; j < i; j++)
                this.matrix[i][j + 1] = this.matrix[i][j] + this.matrix[i - 1][j];
        }
    }

    @Override
    public void toConsole() {
        for(Integer[] row : this.matrix)
            System.out.println(Arrays.toString(row));
    }


}
