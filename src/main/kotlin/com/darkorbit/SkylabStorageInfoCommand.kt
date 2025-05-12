package com.darkorbit

interface SkylabStorageInfoCommand : ProtocolPacket {
	var efficiency: Int
	var infoOreList: MutableList<SkylabStorageOreCommand>
}
