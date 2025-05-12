package com.darkorbit

interface HangarShipRepairDroneCommand : ProtocolPacket {
	var damage: Float
	var droneId: Long
	var drones: MutableList<HangarShipDroneView>
	var errorMessage: BaseStackCommand
	var level: Int
	var resultId: Int
	var shildEffect: Float
	var weaponEffect: Float
}
