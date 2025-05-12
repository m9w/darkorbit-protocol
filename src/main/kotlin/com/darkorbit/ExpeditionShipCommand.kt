package com.darkorbit

interface ExpeditionShipCommand : ProtocolPacket {
	var destroyed: Boolean
	var extras: Int
	var generators: Int
	var hangarId: Long
	var hp: Int
	var lasers: Int
	var lootId: String
	var maxHp: Int
	var maxNano: Int
	var maxShield: Int
	var modules: Int
	var nano: Int
	var rockets: Int
	var shield: Int
}
