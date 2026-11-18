package com.darkorbit

interface XenoResonatorEffectResult : ProtocolPacket {
	var effect: Effect
	var effectLevel: Int
	var itemId: Long
	var operation: Operation
	var status: XenoResonatorEffectResultStatus
}
