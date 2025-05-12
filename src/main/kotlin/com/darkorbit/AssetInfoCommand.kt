package com.darkorbit

interface AssetInfoCommand : ProtocolPacket {
	var assetId: Int
	var designId: Int
	var expansionStage: Int
	var hitpoints: Int
	var maxHitpoints: Int
	var maxShieldEnergy: Int
	var shieldEnergy: Int
	var shielded: Boolean
	var type: AssetTypeModule
}
