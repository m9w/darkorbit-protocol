package com.darkorbit

interface BalanceInfoCommand : ProtocolPacket {
	var amount: Long
	var amountType: String
	var description: String
	var infoText: Int
	var insertDate: String
	var internalInfo: String
	var userId: Int
}
