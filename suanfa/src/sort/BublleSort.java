package sort;

/**
 * √∞≈›≈≈–Ú µœ÷
 * @author sunpeihe
 *
 */
public class BublleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,9,4,5,2};
		int [] arr2=bubbleSort(arr);
		for(int e:arr2) {
			
			System.out.println(e);
		}

	}
	
	public static int[] bubbleSort(int[] arr) {
		if(arr==null||arr.length<2) {
			return arr;
		}else {
			for(int end=arr.length-1;end>0;end--) {
				for(int i=0;i<end;i++) {
					if(arr[i]>arr[i+1]) {
						swap(arr,i,i+1);
					}
				}
			}
			
			return arr;
		}
		
		
		
	}
	
	
	public static void swap(int[] arr,int i,int j) {
		int tmp=arr[i];
		arr[i]=arr[j];
		arr[j]=tmp;
	}

}
