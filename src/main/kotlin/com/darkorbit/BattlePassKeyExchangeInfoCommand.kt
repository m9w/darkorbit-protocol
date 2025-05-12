package com.darkorbit

interface BattlePassKeyExchangeInfoCommand : ProtocolPacket {
	var exchangeType: ExchangeType
	var numOfKeys: Int
	var rewardList: MutableList<BattlePassKeyExchangeRewardModule>
}
