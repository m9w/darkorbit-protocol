package com.darkorbit

interface HangarShipChangeShipModelRequest : ProtocolPacket {
	var lootId: String
	var shipId: Long
}
