package com.darkorbit

interface HangarShipEquipmentCommand : ProtocolPacket {
	var currentConfigId: Int
	var droneConfigs: MutableList<HangarDroneEquipmentMsg>
	var extrasSlotsSize1: Int
	var extrasSlotsSize2: Int
	var hangarId: Long
	var lootId: String
	var petConfigs: MutableList<HangarPetEquipmentMsg>
	var shipConfigs: MutableList<HangarShipEquipmentMsg>
	var shipId: Long
}
