package com.darkorbit

interface SynthesisItemRequest : ProtocolPacket {
	var itemIds: MutableList<Long>
	var synthesisId: String
}
