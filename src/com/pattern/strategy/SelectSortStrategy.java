package com.pattern.strategy;
/**
 *选择排序(Selection sort)是一种简单直观的排序算法。它的工作原理如下。
 *首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，然后，
 *再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
 *以此类推，直到所有元素均排序完毕。
 *<li><a href="http://zh.wikipedia.org/wiki/%E9%80%89%E6%8B%A9%E6%8E%92%E5%BA%8F">选择排序</a>
 */
public class SelectSortStrategy implements ISort {

	@Override
	public int[] sort(int[] src) {
		// TODO Auto-generated method stub
		for(int i=0;i<src.length-1;i++){
			int k = i;
			int min = src[i];
			for(int j = i+1;j<src.length;j++){
				if(src[j] < min){
					k = j;
					min = src[j];
				}
			}
			if(k!=i){
				int temp = src[i];
				src[i] = src[k];
				src[k] = temp;
			}
		}
		return src;
	}

}
