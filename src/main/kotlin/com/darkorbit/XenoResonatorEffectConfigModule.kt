package com.darkorbit

interface XenoResonatorEffectConfigModule : ProtocolPacket {
	var effect: Effect
	var materialLootId: String
	var maxLv: Int
	var values: MutableList<Int>
	var weight: Int
}
