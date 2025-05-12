package com.darkorbit

interface MileageMarketExchangeRequest : ProtocolPacket {
	var claimedDiscountSteps: Int
	var packageId: String
}
