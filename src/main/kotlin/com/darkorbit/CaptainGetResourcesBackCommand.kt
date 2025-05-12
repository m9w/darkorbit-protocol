package com.darkorbit

interface CaptainGetResourcesBackCommand : ProtocolPacket {
	var amount: Long
	var lootId: String
}
