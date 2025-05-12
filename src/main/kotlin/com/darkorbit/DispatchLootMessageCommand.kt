package com.darkorbit

interface DispatchLootMessageCommand : ProtocolPacket {
	var loots: MutableList<LootModule>
	var messageType: DispatchLootMessageCommandMessageType
}
