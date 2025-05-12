package com.darkorbit

interface POIVisualModifierCommand : ProtocolPacket {
	var poiId: String
	var visualModifier: VisualModifierCommand
}
