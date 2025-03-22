public class PracticeProblem {

	public static void main(String args[]) {

	}




	public static int goodString (String line)
	{
		int rightSide = 0;
		int bigger=0;
		int current=100;
		for (int leftSide = 0 ; leftSide<line.length() ; leftSide++)
		{

			char letter = line.charAt(leftSide);
			rightSide = line.length()-line.lastIndexOf(letter);
			current = line.length()-(leftSide+rightSide);
			if (current>=bigger)
			{
				bigger = current;
			}
	
		}

		if (bigger>=line.length())
		{
			return -1;
		}


		return bigger;
	}

}
