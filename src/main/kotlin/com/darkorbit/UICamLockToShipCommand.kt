package com.darkorbit

interface UICamLockToShipCommand : ProtocolPacket {
	var duration: Float
	var userId: Int
	var zoomFactor: Float
}
