package com.darkorbit

interface CommandCenterNewsModule : ProtocolPacket {
	var clickCount: Int
	var eventId: Long
	var newsId: String
}
