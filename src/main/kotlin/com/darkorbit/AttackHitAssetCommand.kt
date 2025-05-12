package com.darkorbit

interface AttackHitAssetCommand : ProtocolPacket {
	var assetId: Int
	var hitpointsMax: Int
	var hitpointsNow: Int
}
