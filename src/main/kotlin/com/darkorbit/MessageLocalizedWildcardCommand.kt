package com.darkorbit

interface MessageLocalizedWildcardCommand : ProtocolPacket {
	var baseKey: String
	var baseKeyType: ReplacementTypeModule
	var wildCardReplacements: MutableList<MessageWildcardReplacementModule>
}
