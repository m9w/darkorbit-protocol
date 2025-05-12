package com.darkorbit

interface DispatchRewardModule : RewardContentModule {
	var amount: Int
	var chance: Short
	var lootId: String
}
