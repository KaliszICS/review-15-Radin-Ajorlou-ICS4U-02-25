public class PracticeProblem {

	public static void main(String args[]) {

	}




	public static int goodString (String line)
	{
		int rightSide = 0;
		int bigger=0;
		int current=100;
		boolean same=false;
		for (int leftSide = 0 ; leftSide<line.length() ; leftSide++)
		{

			char letter = line.charAt(leftSide);
			
			if(leftSide!=line.lastIndexOf(letter))
			{
				rightSide = line.length()-line.lastIndexOf(letter);
				current = line.length()-(leftSide+rightSide);
				if (current>=bigger)
				{
					bigger = current+1;
					same = true;
				}
	
			}
			
		}

		if (same==false)
		{
			return -1;
		}


		return line.length()-bigger;
	}

}
