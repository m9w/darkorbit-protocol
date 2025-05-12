package com.darkorbit

interface HangarShipRepairDroneRequest : ProtocolPacket {
	var droneId: Int
	var shipId: Long
}
