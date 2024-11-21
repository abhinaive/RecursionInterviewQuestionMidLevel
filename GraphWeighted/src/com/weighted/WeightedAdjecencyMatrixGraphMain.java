package com.weighted;

import java.util.Scanner;

public class WeightedAdjecencyMatrixGraphMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of adj matrix: ");
		AdjMatrixGraph g = new AdjMatrixGraph(sc.nextInt());
		g.acceptVertices(sc);
		g.displayGraph();
		
		

	}

}

/* 
6
7
0 1 7
0 2 4 
0 3 8
1 2 9
1 4 5
3 4 6
3 5 2
*/