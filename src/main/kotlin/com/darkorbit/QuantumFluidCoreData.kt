package com.darkorbit

interface QuantumFluidCoreData : ProtocolPacket {
	var equipAttributes: MutableList<EquipAttributeModule>
	var itemId: Long
	var lootId: String
	var lv: Int
	var maxLv: Int
	var quality: Int
	var sellPrice: Int
	var shipIds: MutableList<String>
	var spendPrice: Int
	var unlock: Int
	var useLootId: String
}
