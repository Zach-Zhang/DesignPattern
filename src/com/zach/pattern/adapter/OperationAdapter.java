package com.zach.pattern.adapter;

//操作适配器:适配器
public class OperationAdapter implements ScoreOperation {
	
	private QuickSort sortObj;  //定义适配者QuickSort对象
	private BinarySearch searchObj;  //定义适配者binarySearch对象
	
	
	public OperationAdapter() {
		sortObj = new QuickSort();
		searchObj = new BinarySearch();
	}

	public OperationAdapter(QuickSort sortObj, BinarySearch searchObj) {
		this.sortObj = sortObj;
		this.searchObj = searchObj;
	}

	@Override
	public int[] sort(int[] array) {
		
		return sortObj.quickSort(array);
	}

	@Override
	public int search(int[] array, int key) {
		// TODO Auto-generated method stub
		return searchObj.binarySearch(array, key);  //调用适配者类BinarySearch的查找方法
	}

}
