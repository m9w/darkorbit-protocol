package com.darkorbit

interface HangarShipDroneView : ProtocolPacket {
	var damage: Float
	var droneId: Int
	var droneTypeId: Int
	var level: Int
	var lootId: String
	var nextLevel: Int
	var points: Int
	var position: Int
}
