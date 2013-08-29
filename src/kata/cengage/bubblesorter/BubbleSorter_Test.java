package kata.cengage.bubblesorter;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class BubbleSorter_Test {

	@Test
	public void submitted_With_Empty_As_An_Int_Argument() {
		BubbleSorter whatever = new BubbleSorter();
		int[] unsortedArray = null;
		String sortedArray = BubbleSorter.getSortedArray(unsortedArray);
		
		Assert.assertEquals("[ERROR] Invalid Object as Argument", sortedArray);
	}

	@Test
	public void submitted_With_Empty_As_String_Argument() {
		String[] unsortedArray = null;
		String sortedArray = BubbleSorter.getSortedArray(unsortedArray);
		
		Assert.assertEquals("[ERROR] Invalid Object as Argument", sortedArray);
	}

	@Test
	public void submitted_With_Empty_As_A_Float_Argument() {
		float[] unsortedArray = null;
		String sortedArray = BubbleSorter.getSortedArray(unsortedArray);
		
		Assert.assertEquals("[ERROR] Invalid Object as Argument", sortedArray);
	}
	
	@Test
	public void submitted_With_Single_Element_Integer_Array_As_Argument() {
		int[] unsortedArray = {1};
		String sortedArray = BubbleSorter.getSortedArray(unsortedArray);
		
		Assert.assertEquals("[1]", sortedArray);
	}
	
	@Test
	public void submitted_With_Single_Element_Float_Array_As_Argument() {
		float[] unsortedArray = {1.94f};
		String sortedArray = BubbleSorter.getSortedArray(unsortedArray);
		
		Assert.assertEquals("[1.94]", sortedArray);
	}

	@Test
	public void submitted_With_Single_Element_String_Array_As_Argument() {
		String[] unsortedArray = {"1"};
		String sortedArray = BubbleSorter.getSortedArray(unsortedArray);
		
		Assert.assertEquals("[1]", sortedArray);
	}
	
	@Test
	public void submitted_With_Pair_Of_Element_Sorted_String_Array_As_Argument() {
		String[] unsortedArray = {"1", "2"};
		String sortedArray = BubbleSorter.getSortedArray(unsortedArray);
		
		Assert.assertEquals("[1, 2]", sortedArray);
	}
	
	@Test
	public void submitted_With_Pair_Of_Elements_Sorted_Int_Array_As_Argument() {
		int[] unsortedArray = {1, 2};
		String sortedArray = BubbleSorter.getSortedArray(unsortedArray);
		
		Assert.assertEquals("[1, 2]", sortedArray);
	}

	@Test
	public void submitted_With_Pair_Of_Elements_Sorted_Float_Array_As_Argument() {
		float[] unsortedArray = {1.8232f, 2.855f};
		String sortedArray = BubbleSorter.getSortedArray(unsortedArray);
		
		Assert.assertEquals("[1.8232, 2.855]", sortedArray);
	}
	
	@Test
	public void submitted_With_Pair_Of_Element_Unsorted_Int_Array_As_Argument() {
		int[] unsortedArray = {2, 1};
		String sortedArray = BubbleSorter.getSortedArray(unsortedArray);
		
		Assert.assertEquals("[1, 2]", sortedArray);
	}
	
	@Test
	public void submitted_With_Pair_Of_Element_Unsorted_String_Array_As_Argument() {
		String[] unsortedArray = {"2", "1"};
		String sortedArray = BubbleSorter.getSortedArray(unsortedArray);
		
		Assert.assertEquals("[1, 2]", sortedArray);
	}

	@Test
	public void submitted_With_Grouop_Of_Element_Unsorted_Int_Array_As_Argument() {
		int[] unsortedArray = {2, 1, 17, 9, 6};
		String sortedArray = BubbleSorter.getSortedArray(unsortedArray);
		
		Assert.assertEquals("[1, 2, 6, 9, 17]", sortedArray);
	}
	
	@Test
	public void submitted_With_Group_Of_Element_Unsorted_String_Array_As_Argument() {
		String[] unsortedArray = {"2", "1", "17", "9", "6" };
		String sortedArray = BubbleSorter.getSortedArray(unsortedArray);
		
		Assert.assertEquals("[1, 2, 6, 9, 17]", sortedArray);
	}

	@Test
	public void submitted_With_Group_Of_Element_Unsorted_Float_Array_As_Argument() {
		float[] unsortedArray = {2.98f, 1.887f, 1.7f, 9f, 6.238f };
		String sortedArray = BubbleSorter.getSortedArray(unsortedArray);
		
		Assert.assertEquals("[1.7, 1.887, 2.98, 6.238, 9.0]", sortedArray);
	}
}
