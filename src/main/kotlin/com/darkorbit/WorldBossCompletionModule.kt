package com.darkorbit

interface WorldBossCompletionModule : ProtocolPacket {
	var completionFrom: Int
	var completionTo: Int
	var easyAmount: Int
	var lootId: String
	var normalAmount: Int
}
