import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class SortingTest {

	Sorting sort = null;
	Sorting sort1 = null;
	Sorting sort2 = null;
	Sorting sorts[]={sort1,sort2};
	@Before
	public void setUp() throws Exception {
		sort = new Sorting();
	}

	@Test
	public void testInsertionSort() {
		int nums[]={10,2,9,3,4,8,7,6};
		sort.insertionSort(nums);
	}

	@Test
	public void testIsSorted1() {
		int nums[]={10,2,9,3,4,8,7,6};
		assertEquals(false,sort.isSorted(nums));
	}

	@Test
	public void testIsSorted2() {
		int nums[]={1,2,3,4};
		assertEquals(true,sort.isSorted(nums));
	}
	
	@Test
	public void testQuicksort1() {
		int nums[]={10,2,9,3,4,8,7,6};
		sort.quicksort(nums);
	}
	
	@Test
	public void testQuicksort2() {
		int nums[]={20,2,9,3,4,11,7,6,2,9,12,10};
		sort.quicksort(nums);
	}

	@Test
	public void testSwapReferences() {
		int nums[]={20,2,9,3,4,11,7,6,2,9,12,10};
		sort.swapReferences(sorts,0, 1);
	}
}
