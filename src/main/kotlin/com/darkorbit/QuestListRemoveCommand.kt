package com.darkorbit

interface QuestListRemoveCommand : ProtocolPacket {
	var list: MutableList<Int>
}
