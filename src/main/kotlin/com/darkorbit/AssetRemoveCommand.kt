package com.darkorbit

interface AssetRemoveCommand : ProtocolPacket {
	var assetType: AssetTypeModule
	var uid: Int
}
