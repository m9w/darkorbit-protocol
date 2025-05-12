package com.darkorbit

interface AmmunitionBuyCommand : ProtocolPacket {
	var ammunitionType: AmmunitionTypeModule
	var amount: Int
	var transactionStatus: TransactionStatus
}
