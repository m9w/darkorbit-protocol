package com.darkorbit

interface UserMessageLootRequest : ProtocolPacket {
	var ids: MutableList<Long>
}
