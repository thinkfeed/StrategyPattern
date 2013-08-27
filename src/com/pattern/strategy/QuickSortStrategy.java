package com.pattern.strategy;

/**
 * 通过一趟排序将要排序的数据分割成独立的两部分，其中一部分的所有数据都比另外一部分的所有数据都要小，
 * 然后再按此方法对这两部分数据分别进行快速排序，整个排序过程可以递归进行，以此达到整个数据变成有序序列。
 * <li><a href="http://zh.wikipedia.org/wiki/%E5%BF%AB%E9%80%9F%E6%8E%92%E5%BA%8F">快速排序</a>
 * 
 */
public class QuickSortStrategy implements ISort {

	@Override
	public int[] sort(int[] src) {
		// TODO Auto-generated method stub

		return sort(src, 0, src.length - 1);
	}

	private int[] sort(int[] src, int left, int right) {
		if (left < right) {
			int middle = (left + right) / 2;
			int key = src[middle];
			int i = left - 1;
			int j = right + 1;
			while (true) {
				while (src[++i] < key);
				while (src[--j] > key);
				if (i >= j)
					break;
				swap(src, i, j);
			}

			sort(src, left, i - 1);
			sort(src, j + 1, right);
		}

		return src;
	}

	void swap(int[] src, int i, int j) {
		int temp = src[i];
		src[i] = src[j];
		src[j] = temp;
	}
}
