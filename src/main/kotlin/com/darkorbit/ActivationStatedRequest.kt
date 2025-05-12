package com.darkorbit

interface ActivationStatedRequest : ProtocolPacket {
	var activationType: ActivationStatedRequestActivationType
	var active: Boolean
}
