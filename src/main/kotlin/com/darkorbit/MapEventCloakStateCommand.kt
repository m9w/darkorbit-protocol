package com.darkorbit

interface MapEventCloakStateCommand : ProtocolPacket {
	var shipId: Int
	var visible: Boolean
}
