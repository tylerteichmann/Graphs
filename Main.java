public class Main {
    public static void main(String[] args) {
        MatrixGraph<Character> matrixGraph = new MatrixGraph<Character>(10, false);

        for (int i = 0; i < 10; i++) {
            char newChar = 'a';
            matrixGraph.addNode(newChar+=i);
        }

        matrixGraph.addEdge('a', 'b');
        matrixGraph.addEdge('a', 'c');
        matrixGraph.addEdge('b', 'c');
        matrixGraph.addEdge('b', 'd');
        matrixGraph.addEdge('c', 'e');
        matrixGraph.addEdge('d', 'e');
        matrixGraph.addEdge('e', 'f');
        matrixGraph.addEdge('f', 'g');
        matrixGraph.addEdge('h', 'j');
        matrixGraph.addEdge('i', 'j');

        matrixGraph.print();

        ListGraph listGraph = new ListGraph(10, false);
        listGraph.addEdge(0, 1);
        listGraph.addEdge(0, 2);
        listGraph.addEdge(1, 2);
        listGraph.addEdge(1, 3);
        listGraph.addEdge(2, 4);
        listGraph.addEdge(3, 4);
        listGraph.addEdge(4, 5);
        listGraph.addEdge(5, 6);
        listGraph.addEdge(7, 9);
        listGraph.addEdge(8, 9);

        listGraph.print();

        MatrixGraph<Integer> directedMatrixGraph = new MatrixGraph<Integer>(8, true);

        for (int i = 0; i < 8; i++) {
            directedMatrixGraph.addNode(i);
        }

        directedMatrixGraph.addEdge(0, 1);
        directedMatrixGraph.addEdge(0, 2);
        directedMatrixGraph.addEdge(1, 2);
        directedMatrixGraph.addEdge(1, 3);
        directedMatrixGraph.addEdge(2, 3);
        directedMatrixGraph.addEdge(2, 5);
        directedMatrixGraph.addEdge(3, 4);
        directedMatrixGraph.addEdge(7, 6);

        directedMatrixGraph.print();
    }
}