package com.darkorbit

interface EventPaymentActorCommand : ProtocolPacket {
	var bgImage: String
	var description: String
	var eventName: String
	var layerImage: String
	var secondsUntilEnd: Long
	var special: Boolean
}
