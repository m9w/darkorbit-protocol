package com.darkorbit

interface VIPMerchantExchangeModule : ProtocolPacket {
	var claimCount: Int
	var claimLimit: Int
	var costs: MutableList<VIPMerchantExchangeItemModule>
	var isSpecial: Boolean
	var priority: Int
	var reward: VIPMerchantExchangeItemModule
}
