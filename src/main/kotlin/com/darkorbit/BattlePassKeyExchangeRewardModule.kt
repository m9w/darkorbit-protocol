package com.darkorbit

interface BattlePassKeyExchangeRewardModule : ProtocolPacket {
	var claimCount: Int
	var cost: Int
	var exchangeReward: String
	var isSpecial: Boolean
	var limit: Int
	var listOfloot: MutableList<BattlePassKeyExchangeLootModule>
	var priority: Int
}
