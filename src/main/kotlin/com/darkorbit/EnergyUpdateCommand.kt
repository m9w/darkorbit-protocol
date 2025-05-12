package com.darkorbit

interface EnergyUpdateCommand : ProtocolPacket {
	var captainEnergyDrain: Int
	var currentCaptainEnergy: Int
	var maxCaptainEnergy: Int
}
