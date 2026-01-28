package com.darkorbit

interface TrinityTrialsGateWindowCommand : ProtocolPacket {
	var attributeType: Int
	var curLootAmount: Int
	var isFree: Boolean
	var lootId: String
	var openAttributes: MutableList<TupleTwoModule>
	var openDifficulty: Int
}
