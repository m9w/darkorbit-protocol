package com.darkorbit

interface EventModule : ProtocolPacket {
	var id: Long
	var lang: String
	var timeLeft: Int
	var type: String
}
