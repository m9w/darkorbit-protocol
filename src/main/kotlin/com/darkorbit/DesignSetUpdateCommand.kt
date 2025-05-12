package com.darkorbit

interface DesignSetUpdateCommand : ProtocolPacket {
	var active: Boolean
	var name: String
	var userId: Int
}
