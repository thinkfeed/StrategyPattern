package com.pattern.strategy;
/**
 *重复地走访过要排序的数列，一次比较两个元素，如果他们的顺序错误就把他们交换过来。
 *走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。 
 *<li><a href="http://zh.wikipedia.org/zh-cn/%E5%86%92%E6%B3%A1%E6%8E%92%E5%BA%8F">冒泡排序</a>
 */
public class BubbleSortStrategy implements ISort{

	@Override
	public int[] sort(int[] src) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		int length = src.length;
		boolean changed = true;
		for(int i=0;i<length-1 && changed;i++){
			for(int j=0;j<length-1-i;j++){
				changed = false;
				if(src[j]>src[j+1]){
					int temp = src[j];
					src[j] = src[j+1];
					src[j+1] = temp;
					changed = true;
				}
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
		return src;
	}

}
