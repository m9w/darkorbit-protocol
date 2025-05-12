package com.darkorbit

interface VisualModifierCommand : ProtocolPacket {
	var activated: Boolean
	var additionalAttribute: String
	var attribute: Int
	var count: Int
	var modifier: VisualModifier
	var userId: Int
}
