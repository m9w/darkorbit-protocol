package com.darkorbit

interface RecallBattlePassViewCommand : ProtocolPacket {
	var claimsEnabled: Boolean
	var heroState: HeroState
	var inviteCount: Int
	var levelPurchaseCap: Int
	var levelPurchaseEnabled: Boolean
	var levels: MutableList<RecallBattlePassLevelModule>
	var pointsCost: MutableList<Int>
	var requestId: Int
	var returnEligible: Boolean
	var specialId: Int
	var timeToEventEnd: Long
	var uridiumCost: MutableList<Int>
	var vipOwned: Boolean
	var vipPurchaseEnabled: Boolean
}
