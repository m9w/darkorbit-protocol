package com.darkorbit

interface BeaconCommand : ProtocolPacket {
	var inPeaceArea: Boolean
	var inRadiationZone: Boolean
	var inStation: Boolean
	var isAlarmEffectActive: Boolean
	var nearJumpGate: Boolean
	var positionAheadX: Int
	var positionAheadY: Int
	var positionX: Int
	var positionY: Int
	var repairBotSkilled: Boolean
	var repairRobotActive: Boolean
	var repairRobotLootId: String
}
