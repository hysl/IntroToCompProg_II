/**
 ******************************************************************************
 *                        BINGO
 ******************************************************************************
 *
 * The standard bingo game.
 *
 *
 *
 *
 * Name:         Helen Li
 *
 * Date:		     May 13, 2019
 *
 ******************************************************************************/


import java.util.*;
import java.io.*;

public class Bingo
{
	private Random rand = new Random();
	private int[][] card;       //Bingo card configuration
	private int[] stream;       //list of 75 integers
	private boolean[][] marks;  //simulates placing chips on a Bingo card

	public Bingo()
	{
		card   = new int[5][5];
		stream = new int[75];
		marks  = new boolean[5][5];
	}

 /**
   * This method writes a random Bingo card configuration and a stream of random
   * number between 1 and 75 to the output file.
   *
   * The first column in the table contains only integers between 1 and 15,
   * the second column numbers are all between 16 and 30, the third are 31 to 45,
   * the fourth 46-60, and the fifth 61-75.
   *
   * There are no duplicate numbers on a Bingo card.
   */
	/*
   public void write(String outputFile)  throws IOException
	{
		throw new RuntimeException ("You need to implement this method");
			
	}
   */

 /**
   *  Shuffles the list of numbers
   */
   public void shuffle(ArrayList<Integer> list)
   {
		//swaps k-th index with a random index
		for(int i = 0; i < list.size(); i++)
      {
        	int num1 = rand.nextInt(list.size());
        	int num2 = rand.nextInt(list.size());
      
        	if(num1 != num2)
        	{
            int temp = list.get(num2);
            list.set(num2, list.get(num1));
            list.set(num1, temp);
         }
      }
   }


 /**
   * This method reads a given inputFile that contains a Bingo card configuration and
   * a stream of numbers between 1 and 75.
   * .
   * A Bingo card configuration is stored in the card array.
   * A list of 75 integers is stored in the stream array.
   */
   public void read(String inputFile) throws IOException
   {
   	File filename = new File(inputFile);
      Scanner file = new Scanner(filename);

      while(file.hasNext())
      {
        	int counter = 0;

        	while(counter < 25)
         {
         	for(int i = 0; i < card[0].length; i++)
         	{
         		for(int j = 0; j < card[0].length; j++)
         		{
         			card[i][j] = file.nextInt();
         			counter++;
         		}
         	}
         }

         for(int k = 0; k < stream.length; k++)
         {
         	stream[k] = file.nextInt();
         }
      }

      file.close();
	}


 /**
   * This method returns the first integer from the stream array that
   * gives you the earliest winning condition.
   *
   * - all the spots in a column are marked
   * - all the spots in a row are marked
   * - all the spots in either of the two diagonals are marked
   * - all four corner squares are marked
   */
   public int playGame()
   {
   	int[][] newCard = new int[5][5];

   	for(int i = 0; i < newCard[0].length; i++)
   	{
   		for(int j = 0; j < newCard[0].length; j++)
   		{
   			if(i == (newCard[0].length / 2) && j == (newCard[0].length / 2))
   			{
   				newCard[i][j] = 1;
   			}
   			else
   				newCard[i][j] = 0;
   		}
   	}

   	boolean win = false;
   	int index = 0;
   	int num = 0;

   	while(win == false)
   	{
   		num = stream[index];
   			
   		for(int a = 0; a < card[0].length; a++)
   		{
   			for(int b = 0; b < card[0].length; b++)
   			{
   				if(card[a][b] == num)
   				{
   					newCard[a][b] = 1;
   				}
   			}
   		}

   		index++;

   		for(int c = 0; c < newCard[0].length; c++)
   		{
   			int sum = 0;

   			for(int d = 0; d < newCard[0].length; d++)
   			{
   				sum += newCard[c][d];
   			}

   			if(sum == newCard[0].length)
   			{
   				win = true;
   				break;
   			}
   		}

   		for(int e = 0; e < newCard[0].length; e++)
   		{
   			int sum = 0;

   			for(int f = 0; f < newCard[0].length; f++)
   			{
   				sum += newCard[f][e];
   			}

   			if(sum == newCard[0].length)
   			{
   				win = true;
   				break;
   			}
   		}

   		int sum1 = 0;
   		for(int g = 0; g < newCard[0].length; g++)
   		{
   			sum1 += newCard[g][g];
   		}

   		if(sum1 == newCard[0].length)
   		{
   			win = true;
   			break;
   		}

   		int sum2 = 0;
   		for(int h = 0; h < newCard[0].length; h++)
   		{
   			sum2 += newCard[h][newCard[0].length - h - 1];
   		}

   		if(sum2 == newCard[0].length)
   		{
   			win = true;
   			break;
   		}

   		int sum3 = newCard[0][0] + newCard[0][newCard[0].length - 1] +
   			newCard[newCard[0].length - 1][0] + 
   			newCard[newCard[0].length - 1][newCard[0].length - 1];

   		if(sum3 == newCard[0].length)
   		{
   			win = true;
   			break;
   		}
   	}

   	return num;
   }
}
