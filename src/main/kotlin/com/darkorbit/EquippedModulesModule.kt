package com.darkorbit

interface EquippedModulesModule : ProtocolPacket {
	var modules: MutableList<StationModuleModule>
}
