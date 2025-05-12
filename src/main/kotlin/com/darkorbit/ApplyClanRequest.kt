package com.darkorbit

interface ApplyClanRequest : ProtocolPacket {
	var clanId: Int
	var message: String
}
