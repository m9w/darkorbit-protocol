package com.darkorbit

interface NameChangeCommand : ProtocolPacket {
	var newName: String
	var userId: Int
}
