package com.darkorbit

interface MessageWildcardReplacementModule : ProtocolPacket {
	var replacement: String
	var replacementType: ReplacementTypeModule
	var wildcard: String
}
