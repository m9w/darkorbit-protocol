package com.darkorbit

interface BattleStationOverviewInfoCommand : ProtocolPacket {
	var allModuleCount: Int
	var buildCompleted: Boolean
	var damageBonus: Float
	var defStatus: Boolean
	var deflectorDownTime: Int
	var deflectorIsActive: Boolean
	var deflectorTime: Int
	var hasDeflectorModul: Boolean
	var honourBonus: Float
	var mapName: String
	var maxAmountOfModule: Int
	var stationId: Int
	var stationName: String
	var timerCounter: Int
	var xpBonus: Float
}
