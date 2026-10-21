package com.darkorbit

interface RecallBattlePassRewardClaimResultCommand : ProtocolPacket {
	var level: Int
	var requestId: Int
	var result: RecallBattlePassRewardClaimResultCommandResult
	var specialId: Int
	var track: RecallBattlePassRewardTrackModule
}
