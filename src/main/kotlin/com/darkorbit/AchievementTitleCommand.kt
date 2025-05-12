package com.darkorbit

interface AchievementTitleCommand : ProtocolPacket {
	var id: Int
	var key: String
}
