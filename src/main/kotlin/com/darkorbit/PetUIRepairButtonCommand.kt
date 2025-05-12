package com.darkorbit

interface PetUIRepairButtonCommand : ProtocolPacket {
	var enabled: Boolean
	var repairCosts: Int
}
