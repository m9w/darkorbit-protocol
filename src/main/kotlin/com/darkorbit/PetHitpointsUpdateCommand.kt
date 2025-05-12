package com.darkorbit

interface PetHitpointsUpdateCommand : ProtocolPacket {
	var hitpointsMax: Int
	var hitpointsNow: Int
	var useRepairGear: Boolean
}
