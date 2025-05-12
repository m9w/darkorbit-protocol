package com.darkorbit

interface MileageMarketPackageModule : ProtocolPacket {
	var claimedDiscountSteps: Int
	var discountPerStep: Float
	var imageKey: String
	var isBought: Boolean
	var maxDiscountSteps: Int
	var packageId: String
	var packagePrice: String
	var priority: Int
}
