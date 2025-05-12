package com.darkorbit

interface HintModule : ProtocolPacket {
	var messageKey: String
	var replacements: MutableList<ReplacementModule>
}
