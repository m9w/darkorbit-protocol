package com.darkorbit

interface AssetInfoCommand : ProtocolPacket {
	var assetId: Int
	var designId: Int
	var expansionStage: Int
	var hitpoints: Long
	var maxHitpoints: Long
	var maxShieldEnergy: Int
	var shieldEnergy: Int
	var shielded: Boolean
	var type: AssetTypeModule
}
