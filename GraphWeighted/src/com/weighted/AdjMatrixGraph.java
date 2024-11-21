package com.weighted;

import java.util.Scanner;

                                      /*Non-Weighted & Un-Directed graph*/

public class AdjMatrixGraph {
   
   public static final int INF = 999; 	
   private int [][] mat ;
   private int vertexCount;
   private int edgeCount;   
   
   public AdjMatrixGraph(int size) {
	   vertexCount = size;
	   mat = new int[vertexCount][vertexCount];
	   
	   for(int i=0; i<vertexCount; i++ ) {
		   for(int j=0; j<vertexCount; j++)
			   mat[i][j] = INF;
	   }
   }
   
   public void acceptVertices(Scanner sc) {
	   System.out.print("Enter number of edges: ");
	   edgeCount = sc.nextInt();
	   
	   for(int i = 0; i<edgeCount; i++) {
		   System.out.print("Enter edge (src & dest & weight): ");
		   int src = sc.nextInt();
		   int dest = sc.nextInt();
		   int weight = sc.nextInt();
		   mat[src][dest] = weight;
		   mat[dest][src] = weight;  // remove it for directed graph
		   
	   }
	   
   }
   
   public void displayGraph() {
	   for(int i=0; i<vertexCount;i++) {
		   for(int j=0; j<vertexCount;j++) { 
			 if(mat[i][j] == INF)
			   System.out.print("\t#");
			 else
			   System.out.print("\t" + mat[i][j]);	 			   
		   }	   
		   System.out.println();
	   }
   }
   
   
}




