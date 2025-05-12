package com.darkorbit

interface CameraLockToShipCommand : ProtocolPacket {
	var duration: Float
	var lockedShipUserID: Int
	var zoomFactor: Float
}
