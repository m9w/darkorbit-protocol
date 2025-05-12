package com.darkorbit

interface QuestListCommand : ProtocolPacket {
	var list: MutableList<QuestSlimInfoModule>
	var maxEventQuests: Int
	var maxQuests: Int
	var onlyStarter: Boolean
}
