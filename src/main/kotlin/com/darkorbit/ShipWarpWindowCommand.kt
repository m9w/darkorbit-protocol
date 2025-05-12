package com.darkorbit

interface ShipWarpWindowCommand : ProtocolPacket {
	var isNearSpacestation: Boolean
	var jumpVoucherCount: Int
	var ships: MutableList<ShipWarpModule>
	var uridium: Int
}
