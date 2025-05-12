package com.darkorbit

interface VIPMerchantExchangeBuyCommand : ProtocolPacket {
	var paymentLink: String
}
