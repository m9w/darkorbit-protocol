package com.darkorbit

interface AutopilotInfoCommand : ProtocolPacket {
	var autopilotInfos: String
	var laserRange: Int
	var remainingSeconds: Long
	var result: Boolean
}
