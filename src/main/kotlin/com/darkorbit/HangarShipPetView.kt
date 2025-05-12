package com.darkorbit

interface HangarShipPetView : ProtocolPacket {
	var damageDistribution: Int
	var exp: Long
	var expNextLevel: Long
	var fuel: Int
	var hitPoints: Int
	var lasers: Int
	var level: Int
	var maxDamageDistribution: Int
	var maxFuel: Int
	var maxGearSlots: Int
	var maxGeneratorSlots: Int
	var maxHeatSlots: Int
	var maxHitPoints: Int
	var maxLaserSlots: Int
	var maxLasers: Int
	var maxProtocolSlots: Int
	var name: String
	var petGearsSlotPrice: Int
	var petGeneratorsSlotPrice: Int
	var petHeatSlotPrice: Int
	var petLasersSlotPrice: Int
	var petProtocolsSlotPrice: Int
	var petRenamePrice: Int
	var rootId: String
	var shieldGenerators: Int
}
