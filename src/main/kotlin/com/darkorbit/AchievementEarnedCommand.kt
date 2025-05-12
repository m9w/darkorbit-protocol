package com.darkorbit

interface AchievementEarnedCommand : ProtocolPacket {
	var achievementId: Int
	var done: Boolean
	var state: BargainState
}
