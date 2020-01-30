package sort;

public class SelectionSort {

	/**
	 * —°‘Ò≈≈–Ú
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,9,4,5,2};
		int [] arr2=selectionSort(arr);
		for(int e:arr2) {
			
			System.out.println(e);
		}

	}
	public static int[] selectionSort(int[] arr) {
		if(arr==null||arr.length<2) {
			return arr;
		}else {
			for(int i=0;i<arr.length-1;i++) {
				int minIndex=i;
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]<arr[minIndex]) {
						minIndex=j;
					}
				}
				swap(arr,i,minIndex);
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
