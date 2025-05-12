package com.darkorbit

interface AchievementValueCommand : ProtocolPacket {
	var key: String
	var value: Long
}
