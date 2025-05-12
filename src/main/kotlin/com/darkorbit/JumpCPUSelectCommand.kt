package com.darkorbit

interface JumpCPUSelectCommand : ProtocolPacket {
	var mapId: Int
	var price: Int
	var seletionAllowed: Boolean
}
