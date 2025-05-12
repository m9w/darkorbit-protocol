package com.darkorbit

interface AttributeBoosterUpdateCommand : ProtocolPacket {
	var boostedAttributes: MutableList<BoosterUpdateModule>
	var boostedDetailsRemove: MutableList<BoosterDetailModule>
	var boostedDetailsUpdate: MutableList<BoosterDetailModule>
}
