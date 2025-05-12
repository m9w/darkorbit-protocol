package com.darkorbit

interface ShipBoostEventInfoCommand : ProtocolPacket {
	var boostUpdateInfo: ShipBoostEventUpdateInfoCommand
	var shipBoostSlots: MutableList<ShipBoostEventModule>
}
