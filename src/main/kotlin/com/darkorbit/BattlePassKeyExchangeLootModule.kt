package com.darkorbit

interface BattlePassKeyExchangeLootModule : ProtocolPacket {
	var amount: Int
	var lootId: String
}
