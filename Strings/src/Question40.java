/*

Author : Ananthanarayanan R
Batch: Uttara B107
Question: 40

Description:

Implement a function that returns the top K most frequent words in
a given text.
*/

public class Question40
{	
	public static int wordInArray(String s, String[] arr)
	{			
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i] != null)
				if(arr[i].equals(s))
					return i;
		}
		return -1;
	}

	public static String[][] topWordOccurances(String s, int k)
	{
		String[][] temp = new String[2][1];
		if(s==null || s.isEmpty())
		{
			temp[0][0] = "null/empty";
			temp[1][0] = "-";
			return temp;
		}
		
		//Extract the words
		String[] sa = s.split(" ");
		String[] finalSa = new String[sa.length];
		int[] count = new int[sa.length];
		int index = 0;
		
		//Modify k Value
		if(sa.length<k)
			k = k -sa.length;
		
		//Gettings each word from the string array
		for(int i = 0;i<sa.length;i++)
		{
			if(wordInArray(sa[i],finalSa)<0)
			{
				finalSa[index] = sa[i];
				count[index] = 1;
				index++;
			}
			else
			{
				count[wordInArray(sa[i],finalSa)]++;
			}
		}
		
		//Sortign the count array and mirroring the finalSa array
		for(int i = 0;i<index;i++)
		{
			for(int j = 0;j<index-1-i;j++)
			{
				if(count[j]<count[j+1])
				{
					int tempi = count[j];
					count[j] = count[j+1];
					count[j+1] = tempi;
					
					String temps = finalSa[j];
					finalSa[j] = finalSa[j+1];
					finalSa[j+1] = temps;
				}
			}
		}		
		
		//Storing the extracted data in a 2D String array - result
		String[][] result = new String[2][k];
		for(int i = 0;i<k;i++)
		{
			result[0][i] = finalSa[i];
			result[1][i] = String.valueOf(count[i]);
		}
		return result;
	}
	
	public static void main(String[] args)
	{
		System.out.println();		
		String s = "The tiger (Panthera tigris) is the largest living cat species and a member of the genus Panthera. It is most recognisable for its dark vertical stripes on orange fur with a white underside. An apex predator, it primarily preys on ungulates, such as deer and wild boar. It is territorial and generally a solitary but social predator, requiring large contiguous areas of habitat to support its requirements for prey and rearing of its offspring. Tiger cubs stay with their mother for about two years and then become independent, leaving their mother's home range to establish their own. The tiger was first scientifically described in 1758. It once ranged widely from the Eastern Anatolia Region in the west to the Amur River basin in the east, and in the south from the foothills of the Himalayas to Bali in the Sunda Islands. Since the early 20th century, tiger populations have lost at least 93% of their historic range and have been extirpated from Western and Central Asia, the islands of Java and Bali, and in large areas of Southeast and South Asia and China. What remains of the range where tigers still roam free is fragmented, stretching in spots from Siberian temperate forests to subtropical and tropical forests on the Indian subcontinent, Indochina and a single Indonesian island, Sumatra.";
		System.out.println("The paragrpah is : "+s);
		int k = 70;
		String[][] arr = topWordOccurances(s,k);
		
		//Displaying the result
		System.out.println("word : frequency");
		for(int i = 0;i<k;i++)
		{
			System.out.println(arr[0][i]+" : "+arr[1][i]);
		}
	}
}