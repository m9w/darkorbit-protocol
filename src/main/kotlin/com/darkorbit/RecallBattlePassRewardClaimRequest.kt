package com.darkorbit

interface RecallBattlePassRewardClaimRequest : ProtocolPacket {
	var level: Int
	var requestId: Int
	var specialId: Int
	var track: RecallBattlePassRewardTrackModule
}
