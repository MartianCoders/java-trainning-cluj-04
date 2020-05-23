import java.util.Arrays;

public class MyMatrix {
    private Integer[][] matrix;
    private Integer row;
    private Integer column;

    MyMatrix(int row, int column) {
        if(column % 2 !=0) {
            matrix = new Integer[row][column];
            this.row = row;
            this.column = column;
            this.border();
        }
        else
            System.out.println("Wrong input");
    }

    private void border() {
        for(int i = 0; i < this.row; i++)
            for(int j = 0; j < this.column; j ++)
                this.matrix[i][j] = 0;

        int start = this.column / 2;
        for (int i = 0; i < this.row; i++) {
            this.matrix[i][start - i] = 1;
            this.matrix[i][start + i] = 1;
        }
        this.addSums();
    }

    private void addSums() {
        int start = this.column / 2;
        int counter = 0;
        for(int i = 1; i < this.row; i++)
            for (int j = start - counter; j < start + i; j++){
                this.matrix[i][j] = this.matrix[i - 1][j] + this.matrix[i][j - 1];
                counter++;
        }

    }

    public void toConsole() {
       for(Integer[] row : this.matrix)
           System.out.println(Arrays.toString(row));
    }

}
