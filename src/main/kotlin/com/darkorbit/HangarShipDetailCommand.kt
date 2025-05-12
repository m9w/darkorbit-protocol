package com.darkorbit

interface HangarShipDetailCommand : ProtocolPacket {
	var curDesignLootId: String
	var designList: MutableList<String>
	var hp: Int
	var hull: Int
	var isActive: Boolean
	var isFavorite: Boolean
	var laserAmmo: Long
	var laserCount: Int
	var lootId: String
	var maxHp: Int
	var maxNano: Int
	var maxSpeed: Int
	var nano: Int
	var repairVouchers: Int
	var rockets: Int
	var shield: Int
	var shieldGenerators: Int
	var shipId: Long
	var speedGenerators: Int
	var upgradeModuleCount: Int
}
