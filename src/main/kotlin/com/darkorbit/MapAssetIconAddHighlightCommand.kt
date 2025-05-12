package com.darkorbit

interface MapAssetIconAddHighlightCommand : ProtocolPacket {
	var mapAssetId: Int
	var soundModule: SoundTriggerModule
}
