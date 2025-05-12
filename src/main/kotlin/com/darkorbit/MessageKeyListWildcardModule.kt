package com.darkorbit

interface MessageKeyListWildcardModule : ProtocolPacket {
	var baseKey: String
	var baseKeyType: ReplacementTypeModule
	var textStyle: TextStyle
	var wildCardReplacements: MutableList<MessageWildcardReplacementModule>
}
