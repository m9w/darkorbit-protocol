package com.darkorbit

interface CommandCenterNewsClickedRequest : ProtocolPacket {
	var eventId: Long
	var newsId: String
}
