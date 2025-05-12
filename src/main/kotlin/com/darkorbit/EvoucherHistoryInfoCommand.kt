package com.darkorbit

interface EvoucherHistoryInfoCommand : ProtocolPacket {
	var amount: Int
	var code: String
	var description: String
	var itemType: String
	var redeemDate: String
}
