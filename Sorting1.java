package Collections;



	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.List;

	class sortNumber  implements Comparator<Integer> {
		

		//ob1 & ob2	  
		//ob1<ob2 ===> -1	
		//ob1>ob2 ===>+1
		//ob1==ob2 ===>0
		@Override
		public int compare(Integer ob1,Integer ob2) {
			/*if(ob1<ob2) {
				return 1;
			}
			else if(ob1>ob2) {
				return -1;
			}
			else {
				return 0;
			}*/
		
			return (ob1<ob2)?1:(ob1>ob2)?-1:0;
			
		}

	}
	
	public class Sorting1 {

		
		public static void main(String[] args) {
			
			List<Integer> l1=new ArrayList<>();
			
			l1.add(20);
			l1.add(70);
			l1.add(35);
			l1.add(12);
			l1.add(98);
			l1.add(52);
			
			System.out.println("Before Sorting"+l1);
			//Collections.sort(l1,new sortNumber());
			Collections.sort(l1);
			System.out.println("After Sorting"+l1);
			Collections.sort(l1,new sortNumber());
			
			System.out.println("After Sorting"+l1);
			
		}
	}
	


