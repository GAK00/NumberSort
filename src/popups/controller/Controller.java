package popups.controller;

import java.text.DecimalFormat;

import popups.view.PopupViewer;

public class Controller
{
	private PopupViewer display;
	private DecimalFormat df;

	public Controller()
	{
		display = new PopupViewer();
		df = new DecimalFormat("#.000");
	}

	public void start()
	{
		boolean Go = true;
		while (Go)
		{
			if (display.collectUserOption("Do you want to sort numbers?") == 0)
			{

				String rawdata = display.collectResponse("enter numbers to sort seperated by a coma with no spaces");
				if (rawdata != null)
				{

					String sorted = CompileStringFromArray(SortArray(CleanArray(AssignValuesAndCatchInvalidCharecters(rawdata.split(",")))));

					if (sorted == "")
					{
						sorted = "You did not enter anything valid";
					}
					display.displayMessage(sorted);
					if (display.collectUserOption("would you like to collect statistics on this data set") == 0)
					{
					}
					else
					{
					}
				}
			}

			else
			{
				int option = display.collectUserOption("Are you sure you wish to leave?");
				if (option == 0)
				{
					Go = false;
				}
				if (option == 1)
				{
				}
				if (option == 2)
				{
				}
				if (option == -1)
				{
					System.exit(0);
				}
			}
		}
	}

	/**
	 * Takes an string array and sets all non doubles to NaN and all doubles to
	 * correct value
	 * 
	 * @param split
	 *            String array to sort through
	 * @return Returns double array
	 */
	private double[] AssignValuesAndCatchInvalidCharecters(String[] split)
	{
		double[] numb = new double[split.length];
		int length = split.length;
		for (int count = 0; count < length; count++)
		{
			try
			{
				numb[count] = Double.parseDouble(split[count]);
			} catch (NumberFormatException e)
			{
				numb[count] = Double.NaN;
			}

		}
		return numb;
	}

	/**
	 * Sorts a double array by value least to greatest
	 * 
	 * @param Messyarray
	 *            the array to sort
	 * @return a sorted array
	 */
	private double[] SortArray(double[] Messyarray)
	{
		double[] numb = Messyarray;
		int length = numb.length;
		for (int pos = 0; pos < (length - 1); pos++)
		{

			for (int pos2 = 0; pos2 < (length - 1); pos2++)
			{
				
				else if (numb[pos2] > numb[pos2 + 1])
				{

					double tempStore = numb[pos2 + 1];
					numb[pos2 + 1] = numb[pos2];
					numb[pos2] = tempStore;
				}
			}

		}
		return numb;
	}

	/**
	 * Takes a double array and remove all NaN values
	 * 
	 * @param uncleaned
	 *            The array to clean
	 * @return A cleaned array
	 */
	private double[] CleanArray(double[] uncleaned)
	{
		int cleanedLength = 0;
		for (double value : uncleaned)
		{
			if (Double.compare(value, Double.NaN) == 0)
			{
			} else
			{
				cleanedLength++;
			}
		}

		double[] CleanedAndSorted = new double[cleanedLength];

		int arrayPos = 0;
		for (double Loop : uncleaned)
		{
			if (Double.compare(Loop, Double.NaN) == 0)
			{
			} else
			{

				CleanedAndSorted[arrayPos] = Loop;
				arrayPos++;
			}

		}
		return CleanedAndSorted;
	}

	/**
	 * takes a double array and turns it into a string
	 * 
	 * @param numb
	 *            array to be turned into a string
	 * @return the string
	 */
	private String CompileStringFromArray(double[] numb)
	{
		String CompiledString = "";
		for (double Value : numb)
		{
			if (Double.compare(Value, numb[0]) == 0)
			{
				CompiledString = new String(CompiledString + df.format(Value));
			} else
			{

				CompiledString = new String(CompiledString + " ," + df.format(Value));
			}
		}
		return CompiledString;
	}
	/**
	 * Finds the mean of a dataset
	 * @param Dataset the dataset to find the mean of
	 * @return the mean
	 */
	private double getMean(double[] Dataset){
		double mean = 0;
		double totalvalue=0;
		for(double currentValue : Dataset){
			totalvalue = currentValue+totalvalue;
		}
		mean = totalvalue/Dataset.length;
		return mean;
	}
	private double getMedian(double[] Dataset){
		double median = 0;
		if(Dataset.length%2==0){
			median = Dataset[Dataset.length/2];
		}
		else
		{
			double length = Dataset.length;
			length = length/2;
			Double[] MedianValues = 
			median = getmean()
		}
		return median;
	}
}
