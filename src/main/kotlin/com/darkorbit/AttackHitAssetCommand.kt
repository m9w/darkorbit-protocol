package com.darkorbit

interface AttackHitAssetCommand : ProtocolPacket {
	var assetId: Int
	var hitpointsMax: Long
	var hitpointsNow: Long
}
