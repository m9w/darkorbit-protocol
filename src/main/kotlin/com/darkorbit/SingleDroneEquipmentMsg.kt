package com.darkorbit

interface SingleDroneEquipmentMsg : ProtocolPacket {
	var damage: Float
	var damageUpgradeLevel: Int
	var defaults: MutableList<Int>
	var design: MutableList<Int>
	var droneId: Int
	var level: Int
	var position: Int
	var repairType: String
	var repairValue: String
	var shieldBouns: Float
	var shieldEffect: Float
	var shieldUpgradeLevel: Int
	var visual: MutableList<Int>
	var weaponBouns: Float
	var weaponEffect: Float
}
