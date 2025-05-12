package com.darkorbit

interface UIItemAddHighlightCommand : ProtocolPacket {
	var highlightType: HighlightTypeModule
	var itemId: String
	var itemSource: UiItemSourceModule
	var soundModule: SoundTriggerModule
}
