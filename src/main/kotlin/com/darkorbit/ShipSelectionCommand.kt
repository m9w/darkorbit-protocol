package com.darkorbit

interface ShipSelectionCommand : ProtocolPacket {
	var hitpoints: Long
	var hitpointsMax: Long
	var maxNanoHull: Int
	var nanoHull: Int
	var shield: Int
	var shieldMax: Int
	var shieldSkill: Boolean
	var shipType: Int
	var userId: Int
}
