package com.darkorbit

interface HangarPetEquipmentMsg : ProtocolPacket {
	var active: Boolean
	var gear: MutableList<Int>
	var generator: MutableList<Int>
	var heat: MutableList<Int>
	var laser: MutableList<Int>
	var protocol: MutableList<Int>
	var setId: Int
	var visual: MutableList<Int>
}
