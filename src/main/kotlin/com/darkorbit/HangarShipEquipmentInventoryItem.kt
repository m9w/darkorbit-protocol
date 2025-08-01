package com.darkorbit

interface HangarShipEquipmentInventoryItem : ProtocolPacket {
	var UpgradeLevel: MutableList<String>
	var asteroidId: Int
	var attachedAmmo: String
	var charges: Int
	var currentHitPoints: Int
	var hangarId: Long
	var isUnstableShipUpgrade: Boolean
	var itemCount: Long
	var itemid: Long
	var level: Int
	var lootId: String
	var lootType: String
	var maxHitPoints: Int
	var modifier: String
	var modifiers: String
	var moduleRepairCosts: Double
	var setBonus: Boolean
	var setBonusActiveConfig1: Boolean
	var setBonusActiveConfig2: Boolean
	var setBonusAmt: Int
	var setBonusInfo: MutableList<String>
	var ships: String
}
