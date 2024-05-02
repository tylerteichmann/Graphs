import java.util.ArrayList;

public class MatrixGraph<T> {

    ArrayList<T> nodes;
    private int[][] matrix;
    boolean isDirected;

    public MatrixGraph(int size, boolean isDirected) {
        this.matrix = new int[size][size];
        this.isDirected = isDirected;
        nodes = new ArrayList<>(size);
    }

    public void addEdge(T src, T dest) {
        this.matrix[nodes.indexOf(src)][nodes.indexOf(dest)] = 1;

        if (!isDirected) {
            matrix[nodes.indexOf(dest)][nodes.indexOf(src)] = 1;
        }
    }

    public void addNode(T data) {
        nodes.add(data);
    }

    public boolean connection(T src, T dest) {
        return matrix[nodes.indexOf(src)][nodes.indexOf(dest)] == 1;
    }

    public void print() {

        System.out.print("+");
        for (int i = 0; i < matrix.length * 2 + 3; i++) {
            System.out.print("-");
        }
        System.out.println("+");

        System.out.print("| \\ ");
        for (var node : nodes) {
            System.out.print(node + " ");
        }
        System.out.println("|");


        for (int i = 0; i < matrix.length; i++) {
            System.out.print("| " + nodes.get(i) + " ");
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    System.out.print("  ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println("|");
        }

        System.out.print("+");
        for (int i = 0; i < matrix.length * 2 + 3; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}