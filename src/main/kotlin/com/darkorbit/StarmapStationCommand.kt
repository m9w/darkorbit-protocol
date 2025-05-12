package com.darkorbit

interface StarmapStationCommand : ProtocolPacket {
	var currentServerTimestamp: Long
	var stations: MutableList<StarmapStationInfo>
}
