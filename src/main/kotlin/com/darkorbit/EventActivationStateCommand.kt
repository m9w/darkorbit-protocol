package com.darkorbit

interface EventActivationStateCommand : ProtocolPacket {
	var active: Boolean
	var attributes: MutableList<EventActivationAttributeModule>
	var type: EventActivationStateCommandEventType
}
