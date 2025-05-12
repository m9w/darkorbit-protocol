package com.darkorbit

interface SectorControlSectorStateCommand : ProtocolPacket {
	var actionType: SectorControlSectorStateCommandActionType
	var captureProgress: Int
	var invaders: MutableList<FactionModule>
	var progressOwner: FactionModule
	var sectorId: String
	var timeTillUnlock: Long
}
