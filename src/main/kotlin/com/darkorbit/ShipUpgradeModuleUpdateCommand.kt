package com.darkorbit

interface ShipUpgradeModuleUpdateCommand : ProtocolPacket {
	var max: Int
	var moduleTypeIds: MutableList<Int>
	var uid: Int
}
