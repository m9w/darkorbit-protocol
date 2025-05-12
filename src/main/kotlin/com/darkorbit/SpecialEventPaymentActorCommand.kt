package com.darkorbit

interface SpecialEventPaymentActorCommand : ProtocolPacket {
	var command: EventPaymentActorCommand
	var eventType: String
}
