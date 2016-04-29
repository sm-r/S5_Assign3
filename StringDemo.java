import java.util.ArrayList;


public class String_demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String line = "Hadoop is open source frame work ,Hadoop is good framework for handling bigdata";
		
		String [] spArr;
		String line2;
		ArrayList<String> stringList = new ArrayList<String>() ;
		
		
		int hdcnt=0;
		line2 = line.replace(',', ' ');
		spArr = line2.split(" ");
		for (int i=0; i <spArr.length; i++)
		{
			System.out.println ("word"+i + spArr[i]);
			if (spArr[i].equals("Hadoop"))
			{
				hdcnt++;
			}
			else if (spArr[i].equals(","))
			{
				stringList.add(" ");
			}
			else
				stringList.add(spArr[i]);
		}
		for (int i=0; i < stringList.size(); i++)
		{
			System.out.println ("list item "+i+" : " + stringList.get(i));
		}
		
		System.out.println ("Hadoop count :"+ hdcnt);

	}

}
