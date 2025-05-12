package com.darkorbit

interface NpcUndockCommand : ProtocolPacket {
	var minionId: Int
	var motherShipId: Int
}
