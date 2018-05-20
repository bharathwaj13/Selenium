package week1day2hw;

public class ForEachLoopsInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] subjectMarks= {10,40,36,90,23,86,56,98,54,23};
		int pass=0;
		int fail=0;
		for(int mark:subjectMarks)
		{
			if(mark>=35)
			{
				pass++;
			}
			else
			{
				fail++;
			}
		}
		System.out.println("No. of Subjects Passed: "+pass);
		System.out.println("No. of Subjects Failed: "+fail);

	}

}
