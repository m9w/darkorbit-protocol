package com.darkorbit

interface SkylabMainViewCommand : ProtocolPacket {
	var listModule: MutableList<SkylabMainViewModuleCommand>
	var oreList: MutableList<SkylabStorageOreCommand>
}
