
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					
		
		
		System.out.println("insertion ");
		
		int row = 3;
		int col = 3;
		int count=1;
		
		int arr[][]= new int[row][col];
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				arr[i][j]= count;
				count++;
			}
		}
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(arr[i][j]);
			}
			System.out.println("");
		}
		
		System.out.println("reverse array ");

		int reverseArr[][] = new int[row][col];
		
		for(int j=0;j<col;j++){
			for(int i=0;i<row;i++){
				reverseArr[j][i]=arr[i][j];
			}
		}
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(reverseArr[i][j]);
			}
			System.out.println("");
		}
		
		
		
	}

}
