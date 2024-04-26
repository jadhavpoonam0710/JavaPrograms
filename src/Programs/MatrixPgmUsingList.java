package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatrixPgmUsingList {

	public static void main(String[] args) {

		

		Object[][] data = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 }};

		List<List<Object>> table = new ArrayList<List<Object>>();

		for (Object[] row : data)
		{
			table.add(Arrays.asList(row));
		}
		System.out.println(table);
		

	}

}
