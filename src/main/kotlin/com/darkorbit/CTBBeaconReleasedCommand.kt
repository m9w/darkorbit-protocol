package com.darkorbit

interface CTBBeaconReleasedCommand : ProtocolPacket {
	var beaconId: Int
	var userId: Int
}
