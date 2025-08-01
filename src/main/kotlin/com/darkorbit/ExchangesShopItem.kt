package com.darkorbit

interface ExchangesShopItem : ProtocolPacket {
	var costs: MutableList<RewardModule>
	var eid: Int
	var isSpecial: Boolean
	var limit: Int
	var limitType: LimitType
	var maxLimit: Int
	var reward: RewardModule
}
