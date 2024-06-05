package Percobaan2;

public class GraphMatriks27 {
    int vertex;
    int [][] matriks;

    public GraphMatriks27(int v){
        vertex = v;
        matriks = new int [v] [v];
    }

    public void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = 0;
    }

    public void printGraph() {
        for (int i=0; i < vertex; i++) {
                System.out.print("Gedung " + (char) ('A' + i) + ": ");
                for (int j= 0; j < vertex; j++) {
                    if (matriks [i] [j] != -1){
                    System.out.print("Gedung " + (char) ('A' + j) + " (" + matriks[i][j] + "m), "); 
                }
                }
                System.out.println();
            }
        }

    public int inDegree(int vertex) {
        int inDegree = 0;
        for (int i = 0; i < this.vertex; i++) {
            if (matriks[i][vertex] != 0) { // Cek apakah ada tepi masuk ke vertex
                inDegree++;
            }
        }
            return inDegree;
        }

    public int outDegree(int vertex) {
        int outDegree = 0;
        for (int j = 0; j < this.vertex; j++) {
            if (matriks[vertex][j] != 0) { // Cek apakah ada tepi keluar dari vertex
                outDegree++;
            }
        }
            return outDegree;
        }

    public int degree(int vertex){
        return outDegree(vertex) + inDegree(vertex);

    }

}

