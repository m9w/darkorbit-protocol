package com.darkorbit

interface StarmapStationInfo : ProtocolPacket {
	var asteroidName: String
	var clanName: String
	var lastChangedTimestamp: Long
	var mapId: Int
	var owningFaction: FactionModule
	var status: StationStatus
	var xPositionPercentage: Int
	var yPositionPercentage: Int
}
