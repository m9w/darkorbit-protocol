package com.darkorbit

interface AvailableModulesCommand : ProtocolPacket {
	var modules: MutableList<StationModuleModule>
}
