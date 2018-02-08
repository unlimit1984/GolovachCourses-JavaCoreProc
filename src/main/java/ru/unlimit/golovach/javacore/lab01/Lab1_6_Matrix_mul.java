package ru.unlimit.golovach.javacore.lab01;

import java.util.Arrays;

public class Lab1_6_Matrix_mul {

	public static void main(String[] args) {
		
		int[][] a = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		int[][] b = {{1,2,3,4},{4,5,6,7},{7,8,9,10}};
		
		System.out.println(Arrays.deepToString(a));
		System.out.println(Arrays.deepToString(b));

		int[][] c = matrix_mul(a,b);
		
		System.out.println(Arrays.deepToString(c));

	}

	private static int[][] matrix_mul(int[][] a, int[][] b) {
		
		int[][] r = new int[b.length][a.length];
		
		for(int i=0; i<r.length; i++){

			for(int j=0; j<r.length; j++){

				int tmp=0;
				for(int k=0; k<b.length; k++){
					tmp+=a[i][k]*b[k][j];
				}
				r[i][j]=tmp;
			}
		}
		return r;
	}

}
