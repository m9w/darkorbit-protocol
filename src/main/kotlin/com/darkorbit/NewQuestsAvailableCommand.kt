package com.darkorbit

interface NewQuestsAvailableCommand : ProtocolPacket {
	var newQuestIds: MutableList<Int>
}
