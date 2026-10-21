package com.darkorbit

interface RecallBattlePassRewardClaimAllResultCommand : ProtocolPacket {
	var claimedCount: Int
	var requestId: Int
	var result: RecallBattlePassRewardClaimAllResultCommandResult
	var specialId: Int
}
