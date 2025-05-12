package com.darkorbit

interface CTBBeaconPositionCommand : ProtocolPacket {
	var beaconId: Int
	var mapId: Int
}
