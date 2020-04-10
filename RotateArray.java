
public class RotateArray{

public static void main(String[] args){
    int[] testInput1 = new int[]{1,2,3,4,5,6,7};
    System.out.println("Before Rotation");
    printArray(testInput1);
    rotateArray(testInput1,4);
    System.out.println("After Rotation");
    printArray(testInput1);

    int[] testInput2 = new int[]{1,2,3,4,5,6,7,8};
    System.out.println("Before Rotation");
    printArray(testInput2);
    rotateArray(testInput2,4);
    System.out.println("After Rotation");
    printArray(testInput2);
  }

public static void rotateArray(int[] inputArray, int shiftBy) {
	if(inputArray == null || inputArray.length==0 || shiftBy < 0) return;
	if(shiftBy > inputArray.length){
		shiftBy = shiftBy % inputArray.length;
	}
	int firstWindow = inputArray.length - shiftBy;
	reverse(inputArray, 0, firstWindow-1);
	reverse(inputArray, firstWindow, inputArray.length-1);
	reverse(inputArray, 0, inputArray.length-1);
}

public static void reverse(int[] inputArray, int i, int j){
	if(inputArray == null || inputArray.length == 1) return;
	while(i < j){
		int temp = inputArray[i];
		inputArray[i] = inputArray[j];
		inputArray[j] = temp;
		i++;
		j--;
	}
}

public static void printArray(int[] input){
  for(Integer i:input){
    System.out.println(i);
  }
}

class RotateArray {
    /*Function to left rotate arr[] of siz n by d*/
    void leftRotate(int arr[], int d, int n) ...,3,12
    {
        int i, j, k, temp;
        int g_c_d = gcd(d, n);
        for (i = 0; i < g_c_d; i++) {
            /* move i-th values of blocks */
            temp = arr[i];
            j = i;
            while (true) {
                k = j + d;
                if (k >= n)
                    k = k - n;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }

    void rightRotate(int[] array. int d, int n){
      //TODO
    }

    /*UTILITY FUNCTIONS*/

    /* function to print an array */
    void printArray(int arr[], int size)
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }

    /*Fuction to get gcd of a and b*/
    int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    // Driver program to test above functions
    public static void main(String[] args)
    {
        RotateArray rotate = new RotateArray();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        rotate.leftRotate(arr, 2, 7);
        rotate.printArray(arr, 7);
    }
}
