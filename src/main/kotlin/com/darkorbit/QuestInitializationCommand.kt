package com.darkorbit

interface QuestInitializationCommand : ProtocolPacket {
	var quest: QuestDefinitionModule
}
