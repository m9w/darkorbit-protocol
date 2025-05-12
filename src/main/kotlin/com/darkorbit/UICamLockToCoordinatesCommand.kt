package com.darkorbit

interface UICamLockToCoordinatesCommand : ProtocolPacket {
	var duration: Float
	var x: Int
	var y: Int
}
