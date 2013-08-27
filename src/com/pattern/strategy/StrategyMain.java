package com.pattern.strategy;

public class StrategyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int src1[]={49,38,65,97,76,13,27,49,78,34}; 
		int src2[]={49,38,65,97,76,13,27,49,78,34}; 
		int src3[]={49,38,65,97,76,13,27,49,78,34}; 
		
		ISort bubbleSort = new BubbleSortStrategy();
		ISort quickSort = new QuickSortStrategy();
		ISort selectSort = new SelectSortStrategy();
		StrategyContext bubbleContext = new StrategyContext(bubbleSort);
		StrategyContext quickContext = new StrategyContext(quickSort);
		StrategyContext selectContext = new StrategyContext(selectSort);
		
		int[] destBubble = bubbleContext.contextSort(src1);
		int[] destQuick = quickContext.contextSort(src2);
		int[] destSelect = selectContext.contextSort(src3);
		
		System.out.println("Bubble sort:");
		for(int i=0;i<destBubble.length;i++){
			System.out.print(destBubble[i]+"\t");
		}
		System.out.println();
		System.out.println("Quick sort:");
		for(int i=0;i<destQuick.length;i++){
			System.out.print(destQuick[i]+"\t");
		}
		
		System.out.println();
		System.out.println("select sort:");
		for(int i=0;i<destSelect.length;i++){
			System.out.print(destSelect[i]+"\t");
		}
	}

}
