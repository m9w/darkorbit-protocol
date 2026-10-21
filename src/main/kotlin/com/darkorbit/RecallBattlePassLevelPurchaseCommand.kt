package com.darkorbit

interface RecallBattlePassLevelPurchaseCommand : ProtocolPacket {
	var amount: Int
	var currentPoints: Int
	var originalLevel: Int
	var quoteOnly: Boolean
	var requestId: Int
	var result: RecallBattlePassLevelPurchaseCommandResult
	var resultingPoints: Int
	var specialId: Int
	var success: Boolean
	var targetLevel: Int
	var uridiumCost: Int
}
