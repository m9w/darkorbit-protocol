package com.darkorbit

interface LMDiscountInfoCommand : ProtocolPacket {
	var discountType: DiscountType
	var percentage: Long
	var priorityMode: LogMessengerPriorityModule
}
