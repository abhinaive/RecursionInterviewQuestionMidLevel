package com.non_weighted;

import java.util.Scanner;

public class NonWeightedAdjecencyMatrixGraphMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of adj matrix: ");
		AdjMatrixGraph g = new AdjMatrixGraph(sc.nextInt());
		g.acceptVertices(sc);
		g.displayGraph();
		g.bfsTraversal(0);
		

	}

}

/* 
6
7
0 1 
0 2  
0 3 
1 2 
1 4 
3 4 
3 5 
*/
