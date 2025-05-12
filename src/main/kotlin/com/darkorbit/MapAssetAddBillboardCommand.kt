package com.darkorbit

interface MapAssetAddBillboardCommand : ProtocolPacket {
	var hash: String
	var partnerType: PartnerTypeModule
	var type: AssetTypeModule
	var uid: Int
	var x: Int
	var y: Int
}
