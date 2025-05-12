package com.darkorbit

interface QuestListUpdateCommand : ProtocolPacket {
	var list: MutableList<QuestSlimInfoModule>
}
