package com.pattern.strategy;

public class StrategyContext {
	public ISort sort;
	
	public StrategyContext(ISort sort){
		this.sort = sort;
	}
	
	public int[] contextSort(int[] src){
		return sort.sort(src);
	}
}
