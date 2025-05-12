package com.darkorbit

interface PetHeatUpdateCommand : ProtocolPacket {
	var heatLevel: Int
	var heatState: HeatState
	var petHeatAmount: Float
	var petHeatAmountMax: Float
}
