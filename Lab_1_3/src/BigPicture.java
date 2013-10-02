/**
 * @author Stas Frolov
 * Lab 1, part 3
 */
public class BigPicture {
	public static void main (String[] args){

		int[][] oldMatrix = {
				{1,2,3,4,5},
				{5,4,3,2,1},
				{1,2,3,4,5},
				{5,4,3,2,1},
				{1,2,3,4,5}
		};

		int m = oldMatrix.length;
		int n = m > 0 ? oldMatrix[0].length : 0;

		int[][] newMatrix = new int[2*m][2*n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++){
				int pixel = oldMatrix[i][j];				
				newMatrix[2*i][2*j] = pixel;
				newMatrix[2*i+1][2*j] = pixel;
				newMatrix[2*i][2*j+1] = pixel;
				newMatrix[2*i+1][2*j+1] = pixel;
			}
		}
		
		System.out.println("Old matrix:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++){
				System.out.print(oldMatrix[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("New matrix:");
		for (int i = 0; i < 2*m; i++) {
			for (int j = 0; j < 2*n; j++){
				System.out.print(newMatrix[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
