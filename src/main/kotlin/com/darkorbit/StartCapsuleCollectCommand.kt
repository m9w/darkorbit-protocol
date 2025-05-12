package com.darkorbit

interface StartCapsuleCollectCommand : ProtocolPacket {
	var assetId: Int
	var collectorId: Int
	var timer: Int
}
