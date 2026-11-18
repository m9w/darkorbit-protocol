package com.darkorbit

interface XenoResonatorLevelConfigModule : ProtocolPacket {
	var damageBasisPoints: Int
	var effectChanceBasisPoints: Int
	var level: Int
	var lootId: String
	var upgradeSuccessBasisPoints: Int
}
