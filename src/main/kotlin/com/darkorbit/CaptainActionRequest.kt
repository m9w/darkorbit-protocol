package com.darkorbit

interface CaptainActionRequest : ProtocolPacket {
	var captainId: Int
	var command: String
	var perkId: Int
	var upgradeLevel: Int
}
