package com.darkorbit

interface CameraLockToCoordinatesCommand : ProtocolPacket {
	var duration: Float
	var x: Int
	var y: Int
}
