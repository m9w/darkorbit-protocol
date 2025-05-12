package com.darkorbit

interface HangarDroneEquipmentMsg : ProtocolPacket {
	var active: Boolean
	var position: Int
	var setDroneEquipment: MutableList<SingleDroneEquipmentMsg>
	var setId: Int
}
