package com.darkorbit

interface AttributeOreCountUpdateCommand : ProtocolPacket {
	var oreCountList: MutableList<OreCountModule>
}
