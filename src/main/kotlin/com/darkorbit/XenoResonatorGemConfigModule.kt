package com.darkorbit

interface XenoResonatorGemConfigModule : ProtocolPacket {
	var effects: MutableList<XenoResonatorEffectConfigModule>
	var levels: MutableList<XenoResonatorLevelConfigModule>
	var type: XenoResonatorSlotModuleType
}
