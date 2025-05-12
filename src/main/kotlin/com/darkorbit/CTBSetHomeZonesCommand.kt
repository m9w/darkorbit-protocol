package com.darkorbit

interface CTBSetHomeZonesCommand : ProtocolPacket {
	var beaconId: Int
	var x: Int
	var y: Int
}
