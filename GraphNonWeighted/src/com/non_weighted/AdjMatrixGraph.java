package com.non_weighted;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

                                      /*Non-Weighted & Un-Directed graph*/

public class AdjMatrixGraph {
   private int [][] mat ;
   private int vertexCount;
   private int edgeCount;   
   public AdjMatrixGraph(int size) {
	   vertexCount = size;
	   mat = new int[vertexCount][vertexCount];
   }
   
   public void acceptVertices(Scanner sc) {
	   System.out.print("Enter number of edges: ");
	   edgeCount = sc.nextInt();
	   
	   for(int i = 0; i<edgeCount; i++) {
		   System.out.print("Enter edge (src & dest): ");
		   int src = sc.nextInt();
		   int dest = sc.nextInt();
		   mat[src][dest] = 1;
		   mat[dest][src] = 1;  // remove it for directed graph
	   }
	   
   }
   
   public void displayGraph() {
	   for(int i=0; i<vertexCount;i++) {
		   for(int j=0; j<vertexCount;j++) 
			   System.out.print("\t" + mat[i][j]);
			   System.out.println();
	   }
   }
   
   
   public void bfsTraversal(int start) {
	   
	   System.out.print("BFS: ");
	   boolean[] markedTrueWhenInsertedInQ = new boolean[vertexCount];  // by default false in java
	   
	   Queue<Integer> q = new LinkedList<>();
	   
	   q.offer(start);   // 1st element Q me dala
	   markedTrueWhenInsertedInQ[start] = true;   // 1st element ko true kiya array me
	   while(!q.isEmpty()) { //jabtak queue empty nhi ho jata
		   int trav = q.poll();  // pop one element  & [trav] represents a row
		   System.out.print(trav + ", "); // print/visit the popped element
		   
		   for(int dest = 0; dest < vertexCount; dest++) {
			   if(mat[trav][dest] != 0  && markedTrueWhenInsertedInQ[dest] == false ) {
				   q.offer(dest);
				   markedTrueWhenInsertedInQ[dest] = true;
			   }
		   }
		   
	   }// repeat until Q gets empty
	   System.out.println();
	   
   }
   
}








