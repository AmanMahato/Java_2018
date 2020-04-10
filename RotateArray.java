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

}
