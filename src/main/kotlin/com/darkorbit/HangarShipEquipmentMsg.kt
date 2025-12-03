package com.darkorbit

interface HangarShipEquipmentMsg : ProtocolPacket {
	var QuantumFluidCore: MutableList<Int>
	var active: Boolean
	var cannon: MutableList<Int>
	var cannonShield: MutableList<Int>
	var extra: MutableList<Int>
	var generators: MutableList<Int>
	var laser: MutableList<Int>
	var rocket: MutableList<Int>
	var setId: Int
	var upgrades: MutableList<Int>
}
