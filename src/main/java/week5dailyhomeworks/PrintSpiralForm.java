package week5dailyhomeworks;

public class PrintSpiralForm {

	public static void main(String[] args) {
		int[][] givenMatrix=new int[4][4];
		int counter=0;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				givenMatrix[i][j]=++counter;
			}
		}
		int i,startCol=0,startRow=0,colCount=3,rowCount=3;
		while(startCol<colCount && startRow<rowCount)
		{
			for(i=startCol;i<=colCount;i++)
			{
				System.out.print(givenMatrix[startRow][i]+" ");
			}
			startRow++;
			for(i=startRow;i<=rowCount;i++)
			{
				System.out.print(givenMatrix[i][colCount]+" ");
			}
			colCount--;
			for(i=colCount;i>=startCol;i--)
			{
				System.out.print(givenMatrix[rowCount][i]+" ");
			}
			rowCount--;
			for(i=rowCount;i>=startRow;i--)
			{
				System.out.print(givenMatrix[i][startCol]+" ");
			}
			startCol++;
		}
	}

}
