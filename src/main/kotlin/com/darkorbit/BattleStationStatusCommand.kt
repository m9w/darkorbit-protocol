package com.darkorbit

interface BattleStationStatusCommand : ProtocolPacket {
	var attackRating: Int
	var battleStationId: Int
	var battleStationName: String
	var damageBoosterRating: Int
	var defenceRating: Int
	var deflectorShieldActive: Boolean
	var deflectorShieldRate: Int
	var deflectorShieldSeconds: Int
	var deflectorShieldSecondsMax: Int
	var equipment: EquippedModulesModule
	var experienceBoosterRating: Int
	var honorBoosterRating: Int
	var isOreTradeAvailable: Boolean
	var mapAssetId: Int
	var repairPrice: Int
	var repairRating: Int
}
