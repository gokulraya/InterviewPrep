
public class matrixRotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
	
	for(int i=0;i<mat.length;i++)
	{
		for(int j=i;j<mat.length;j++)
		{
			int temp=mat[i][j];
			mat[i][j]=mat[j][i];
			mat[j][i]=temp;
		}
	}
	
	//System.out.println(mat[0][mat.length-1]);
	for(int i=0,j=mat.length-1;j<mat[0].length;i++,j--)
	{
		//for(int j=mat.length-1;j<mat[0].length;j--)
		{
			if(i!=j)
			{
				int temp=mat[i][j];
				mat[i][j]=mat[i][i];
				mat[i][i]=temp;
				
			}
			else
				break;
			
		}
	}
	for(int i=0;i<mat.length;i++)
	{
		for(int j=0;j<mat.length;j++)
		{
			System.out.print(mat[i][j]);
		}
		System.out.println();

	}
	//System.out.println(mat);	
	}

}
