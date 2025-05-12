package com.darkorbit

interface LMCollectResourcesCommand : ProtocolPacket {
	var contentList: MutableList<OreCountModule>
	var priorityMode: LogMessengerPriorityModule
}
