package com.darkorbit

interface ShipWarpModule : ProtocolPacket {
	var hangarId: Int
	var hangarName: String
	var mapId: Int
	var shipDesignName: String
	var shipId: Int
	var typeId: String
	var uridiumPrice: Int
	var voucherPrice: Int
}
