package sort;

public class InsetionSort {

	public static void main(String[] args) {
		int[] arr= {1,3,9,4,5,2};
		int [] arr2=insertionSort(arr);
		for(int e:arr2) {
			
			System.out.println(e);
		}

	}
	
	public static int[] insertionSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			//将当前位置的数插入前面的有序数组中，表现为交换操作
			for(int j=i-1;j>=0&&arr[j]>arr[j+1];j--) {
				swap(arr,j,j+1);
			}
		}
		return arr;
	}
	
	
	
	public static void swap(int[] arr,int i,int j) {
		int tmp=arr[i];
		arr[i]=arr[j];
		arr[j]=tmp;
	}

}
