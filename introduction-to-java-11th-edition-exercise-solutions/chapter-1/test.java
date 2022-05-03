// Java implementation of the above approach
import java.util.*;

class GFG{
	
static final int V = 3;

// Function to find the characteristic
// of the given graph
static int checkConnected(int graph[][], int n)
{
	
	// Check whether the graph is
	// strongly connected or not
	boolean strongly = true;

	// Traverse the path matrix
	for(int i = 0; i < n; i++)
	{
		for(int j = 0; j < n; j++)
		{
			
			// If all the elements are
			// not equal then the graph
			// is not strongly connected
			if (graph[i][j] != graph[j][i])
			{
				strongly = false;
				break;
			}
		}
		
		// Break out of the loop if false
		if (!strongly)
		{
			break;
		}
	}
	
	// If true then print strongly
	// connected and return
	if (strongly)
	{
		System.out.print("Strongly Connected");
		return 0;
	}

	// Check whether the graph is
	// Unilaterally connected by
	// checking Upper Triangle element
	boolean uppertri = true;

	// Traverse the path matrix
	for(int i = 0; i < n; i++)
	{
		for(int j = 0; j < n; j++)
		{
			
			// If uppertriangle elements
			// are 0 then break out of the
			// loop and check the elements
			// of lowertriangle matrix
			if (i > j && graph[i][j] == 0)
			{
				uppertri = false;
				break;
			}
		}

		// Break out of the loop if false
		if (!uppertri)
		{
			break;
		}
	}

	// If true then print unilaterally
	// connected and return
	if (uppertri)
	{
		System.out.print("Unilaterally Connected");
		return 0;
	}

	// Check lowertraingle elements
	boolean lowertri = true;

	// Traverse the path matrix
	for(int i = 0; i < n; i++)
	{
		for(int j = 0; j < n; j++)
		{
			
			// If lowertraingle elements
			// are 0 then break cause
			// 1's are expected
			if (i < j && graph[i][j] == 0)
			{
				lowertri = false;
				break;
			}
		}
		
		// Break out of the loop if false
		if (!lowertri)
		{
			break;
		}
	}

	// If true then print unilaterally
	// connected and return
	if (lowertri)
	{
		System.out.print("Unilaterally Connected");
		return 0;
	}

	// If elements are in random order
	// unsynchronized then print weakly
	// connected and return
	else
	{
		System.out.print("Weakly Connected");
	}
	return 0;
}

// Driver Code
public static void main(String[] args)
{
	
	// Number of nodes
	int n = 3;

	// Given Path Matrix
	int graph[][] = { { 0, 1, 1 },
					{ 0, 0, 1 },
					{ 0, 0, 0 } };
						
	// Function call
	checkConnected(graph, n);
}
}

// This code is contributed by 29AjayKumar
