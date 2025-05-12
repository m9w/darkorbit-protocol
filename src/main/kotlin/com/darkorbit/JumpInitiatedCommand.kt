package com.darkorbit

interface JumpInitiatedCommand : ProtocolPacket {
	var gateId: Int
	var mapId: Int
}
