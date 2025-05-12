package com.darkorbit

interface AchievementInfoCommand : ProtocolPacket {
	var achievementId: String
	var lastUpdate: String
	var level: Int
	var score: Long
}
