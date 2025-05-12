package com.darkorbit

interface ShopLabelPrompt : ProtocolPacket {
	var category: String
	var promptType: PromptType
}
