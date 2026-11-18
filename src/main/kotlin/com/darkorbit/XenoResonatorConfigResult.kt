package com.darkorbit

interface XenoResonatorConfigResult : ProtocolPacket {
	var gems: MutableList<XenoResonatorGemConfigModule>
	var status: XenoResonatorConfigResultStatus
}
