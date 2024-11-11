package com.devbrat2k.lambdas;

import com.devbrat2k.domain.Trade;

public class TradeMerger {

	/**
	 * Functional interface for merging trades
	 * @author mkonda
	 *
	 */
	interface Merger {
		Trade merge(Trade t1, Trade t2);
	}

	public static void main(String[] args) {

	}
}
