package com.darkorbit

interface RecallBattlePassLevelPurchaseRequest : ProtocolPacket {
	var amount: Int
	var expectedPoints: Int
	var maxUridium: Int
	var quoteOnly: Boolean
	var requestId: Int
	var specialId: Int
}
