package com.darkorbit

interface UserMessageLootCommand : ProtocolPacket {
	var ids: MutableList<Long>
}
