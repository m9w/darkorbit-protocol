package com.darkorbit

interface ClanNameTagInfoCommand : ProtocolPacket {
	var id: Int
	var name: String
	var tag: String
}
