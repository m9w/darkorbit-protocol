package com.darkorbit

interface RecallBattlePassMissionRefreshRequest : ProtocolPacket {
	var maxUridium: Int
	var periodStart: Long
	var questId: Int
	var refreshSequence: Int
	var requestId: Int
	var specialId: Int
	var useUridium: Boolean
}
