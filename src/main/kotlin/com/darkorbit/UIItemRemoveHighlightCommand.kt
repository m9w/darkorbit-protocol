package com.darkorbit

interface UIItemRemoveHighlightCommand : ProtocolPacket {
	var highlightType: HighlightTypeModule
	var itemId: String
	var itemSource: UiItemSourceModule
}
