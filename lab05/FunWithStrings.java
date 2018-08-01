package lab05;
import java.util.ArrayList;
public class FunWithStrings{



	public static void swapMaxes(ArrayList<String> list1, ArrayList<String> list2){
		int maxValue1 = 0;
		int maxValue2 = 0;
		int indexHolder1 = 0;
		int indexHolder2 = 0;

		for(int i = 0; i < list1.size(); i++){
			if(list1.get(i) == null){
				continue;
			}
			if(list1.get(i).length() > maxValue1){
				maxValue1 = list1.get(i).length();
				indexHolder1 = i;
			}
		}

		for(int i = 0; i < list2.size(); i++){
			if(list2.get(i) == null){
				continue;
			}
			if(list2.get(i).length() > maxValue2){
				maxValue2 = list2.get(i).length();
				indexHolder2 = i;
			}
		}

//Copies array to a holder array
		ArrayList<String> holder = new ArrayList<String>();
		holder.addAll(list1);
		//System.out.println(holder);
//Swaps;
		list1.set(indexHolder1, list2.get(indexHolder2));
		list2.set(indexHolder2, holder.get(indexHolder1));

		//System.out.println(list1);
		//System.out.println(list2);


}




}
