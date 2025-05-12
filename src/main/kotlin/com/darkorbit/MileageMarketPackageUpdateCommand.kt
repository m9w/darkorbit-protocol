package com.darkorbit

interface MileageMarketPackageUpdateCommand : ProtocolPacket {
	var claimedDiscountSteps: Int
	var isBought: Boolean
	var packageID: String
}
