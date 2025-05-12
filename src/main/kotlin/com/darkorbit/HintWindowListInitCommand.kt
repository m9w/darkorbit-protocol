package com.darkorbit

interface HintWindowListInitCommand : ProtocolPacket {
	var windows: MutableList<HintWindowModule>
}
