package com.darkorbit

interface BattlePassKeyExchangeUpdateCommand : ProtocolPacket {
	var claimCount: Int
	var exchangeReward: String
	var lootId: String
	var numOfKeys: Int
	var spcId: Int
}
