package com.darkorbit

interface HallOfFameDataCommand : ProtocolPacket {
	var rank: Int
	var time: String
	var userId: Long
	var userName: String
	var value: Long
}
