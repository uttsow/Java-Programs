package lab04;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice{

	private static ArrayList<Integer> arrList = new ArrayList<>();

	public static int intRemoveAll(int e){
	int num = 0;
	int index = 0;
	for(int l : arrList){
		if(index == e){
			arrList.remove(index);
			num += 1;
			}

		}
	return num;
	}

	public static boolean isEqual(ArrayList<Integer> other){


	if(arrList.size() == other.size()){
		return false;
			}
	else{
		for(int i=0; i<arrList.size(); i++){
			if(arrList.get(i) != other.get(i)){
				return false;
		}else{
			continue;
		}

		}
	return true;
	}
	}

	public static void appendArray(int[] arr){

	for(int i = 0; i < arr.length; i++){
		if(arr == null){
			throw new IllegalArgumentException("Array is null and cant append");
		}else{
			arrList.add(arr[i]);
		}
	}
}

	public static ArrayList<Integer> sumElementWise(ArrayList<Integer> other){
		ArrayList<Integer> arrList2 = new ArrayList<>();
		if(other == null){
			throw new IllegalArgumentException("Null Array");
		}
		if(arrList.size() > other.size()){
			for(int i = 0; i< other.size(); i++){
				arrList2.add(arrList.get(i) + other.get(i));
				}
			for(int i = other.size() +1; i< arrList.size(); i++){
				arrList2.add(arrList.get(i));
				}
		}

		else if(arrList.size() < other.size()){
			for(int i = 0; i< arrList.size(); i++){
				arrList2.add(arrList.get(i) + other.get(i));
				}
			for(int i = arrList.size() +1; i< other.size(); i++){
				arrList2.add(other.get(i));
				}
		}
		else if(arrList.size() == other.size()){
			for(int i = 0; i< arrList.size(); i++){
				arrList2.add(arrList.get(i) + other.get(i));
				}
		}

		return arrList2;
	}


	public ArrayList<Integer> getArrList(){
		return arrList;
	}


//TESTING
/**
	public static void main(String[] args){

		int[] array = {2, 4, 6};
		arrList.add(1);
		arrList.add(2);
		arrList.add(2);
		arrList.add(4);


		ArrayList<Integer> equalList = new ArrayList<>(Arrays.asList(1, 4));
		ArrayList<Integer> otherList = new ArrayList<>(Arrays.asList(2, 3, 4, 5));
		ArrayList<Integer> otherList2 = new ArrayList<>(Arrays.asList(2, 2, 1));
		ArrayList<Integer> sum1 = new ArrayList<>(Arrays.asList(3, 5, 10, 9));
		ArrayList<Integer> sum2 = new ArrayList<>(Arrays.asList(3, 4, 4, 3));

		System.out.println("arrList before intRemoveAll: " + arrList);
		System.out.println("Expected numer of elements removed after intRemoveAll(2): 2");
		System.out.println("Elements removed: " + intRemoveAll(2));
		System.out.println("Expected array list after intRemoveAll(2): " + equalList);
		System.out.println("arrList after intRemoveAll(2):" + arrList);
		System.out.println("-------------------------------------------------------------");

		System.out.println("Expected result for isEqual(equalList): true");
		System.out.println("Result for isEqual(equalList): " + isEqual(equalList));
		System.out.println("Expected result for isEqual(otherList): false");
		System.out.println("Result for isEqual(otherList): " + isEqual(otherList));
		System.out.println("-------------------------------------------------------------");

		appendArray(array);
		System.out.println("Expected arrList after appendArray with [2,4,6]: [1, 4,2,4,6]");
		System.out.println("arrList after appendArray with [2,4,6]: " + arrList);
		System.out.println("--------------------------------------------------------------");

		System.out.println("Expected sumElementWise arrList with otherList [2, 3,4, 5]:" + sum1) ;
		System.out.println("sumElementWise arrList with otherList [2, 3,4,5]: " + sumElementWise(otherList));
		System.out.println("Expected sumElementWise arrList with otherList2 [2, 2, 1]:" + sum2) ;
		System.out.println("sumElementWise arrList with otherList2 [2, 2, 1]: " + sumElementWise(otherList2));

}

}
**/
}
