package com.darkorbit

interface CTBBeaconCapturedCommand : ProtocolPacket {
	var beaconId: Int
	var userId: Int
}
